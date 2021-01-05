package com.kkk.sharedbase.viewmodel

//import android.arch.lifecycle.ViewModel
//import androidx.lifecycle.ViewModel
//import io.reactivex.disposables.CompositeDisposable
//import io.reactivex.disposables.Disposable
//
//abstract class BaseViewModel : ViewModel() {
//
//    private val disposable = CompositeDisposable()
//
//    fun launch(observable: () -> Disposable) {
//        disposable.add(observable())
//    }
//
//    override fun onCleared() {
//        super.onCleared()
//        disposable.clear()
//    }
//}