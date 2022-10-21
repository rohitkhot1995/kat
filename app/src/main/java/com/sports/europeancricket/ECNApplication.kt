package com.sports.europeancricket

import android.content.Context
import android.net.ConnectivityManager
import android.net.Network
import android.os.Build
import androidx.annotation.RequiresApi
import com.google.firebase.FirebaseApp
import com.sports.europeancricket.di.components.DaggerAppComponent
import com.sports.europeancricket.utils.NETWORK_CONNECTED
import com.sports.europeancricket.utils.NETWORK_DISCONNECTED
import com.sports.europeancricket.utils.NETWORK_UNAVAILABLE
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject

class ECNApplication : DaggerApplication() {

    private val networkChangeObservable = PublishSubject.create<Int>()

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent
            .builder()
            .application(this).build()
    }

    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)
    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun monitorNetworkChanges(): Observable<Int> {
        val connectivityManager =
            this.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        connectivityManager?.let {
            it.registerDefaultNetworkCallback(object : ConnectivityManager.NetworkCallback() {
                override fun onAvailable(network: Network) {
                    networkChangeObservable.onNext(NETWORK_CONNECTED)
                }

                override fun onLost(network: Network) {
                    networkChangeObservable.onNext(NETWORK_DISCONNECTED)
                }

                override fun onUnavailable() {
                    networkChangeObservable.onNext(NETWORK_UNAVAILABLE)
                }
            })
        }
        return networkChangeObservable
    }

    fun isInternetAvailable(): Boolean {
        val connectivityManager =
            this.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = connectivityManager.activeNetworkInfo
        return networkInfo != null && networkInfo.isConnected
    }
}