package com.sports.europeancricket.ui.base

import android.app.Application
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleObserver
import com.sports.europeancricket.ECNApplication
import com.sports.europeancricket.repository.repoUtils.NetworkCallback
import com.sports.europeancricket.utils.*
import dagger.android.support.AndroidSupportInjection
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

abstract class BaseFragment : Fragment(), NetworkCallback, BaseView {

    @LayoutRes
    abstract fun getLayoutId(): Int

    @Inject
    lateinit var app: Application

    private val networkCheckDisposable by lazy { CompositeDisposable() }

    private var lastNetworkStatus = NETWORK_UNKNOWN

    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (!(app as ECNApplication).isInternetAvailable()) {
            onNotifyError(NO_INTERNET_CONNECTION_MESSAGE)
            lastNetworkStatus = NETWORK_DISCONNECTED
        }
        return inflater.inflate(getLayoutId(), container, false)
    }

    override fun onResume() {
        super.onResume()
        lifecycle.addObserver(getLifeCycleObserver())
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            observeNetworkConnection()
        } else {
            if (!(app as ECNApplication).isInternetAvailable()) {
                onNotifyError(NO_INTERNET_CONNECTION_MESSAGE)
            }
        }
    }

    override fun onPause() {
        super.onPause()
        lifecycle.removeObserver(getLifeCycleObserver())
        networkCheckDisposable.clear()
    }

    abstract fun getLifeCycleObserver(): LifecycleObserver

    @RequiresApi(Build.VERSION_CODES.N)
    fun observeNetworkConnection() {
        networkCheckDisposable.add(
            (app as ECNApplication).monitorNetworkChanges()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ networkStatusNow ->
                    if (lastNetworkStatus == NETWORK_UNKNOWN && networkStatusNow == NETWORK_DISCONNECTED) {
                        onNotifyError(NETWORK_DISCONNECTED_MESSAGE)
                    } else if (lastNetworkStatus == NETWORK_DISCONNECTED && networkStatusNow == NETWORK_CONNECTED) {
                        onNotifyError(NETWORK_CONNECTED_MESSAGE)
                    } else if (lastNetworkStatus == NETWORK_CONNECTED && networkStatusNow == NETWORK_DISCONNECTED) {
                        onNotifyError(NETWORK_DISCONNECTED_MESSAGE)
                    } else {
                        onNotifyError(NO_INTERNET_CONNECTION_MESSAGE)
                    }
                    lastNetworkStatus = networkStatusNow
                }, { throwableError ->
                    throwableError.message?.let { it -> logDebug("NetworkError: ", it) }
                })
        )
    }
}
