package com.sports.europeancricket.ui.base

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

class BaseViewModel : ViewModel() {

    val compositeDisposable: CompositeDisposable by lazy { CompositeDisposable() }

    override fun onCleared() {
        compositeDisposable.clear()
        super.onCleared()
    }
}