package com.example.user.modular.ui.main

import android.os.Bundle
import com.example.user.modular.R
import com.example.user.modular.databinding.ActivityMainBinding
import com.example.user.modular.ui.base.BaseMviActivity
import com.example.user.modular.utils.logd
import com.example.user.modular.ui.main.MainView.Event.GetBooleanEvent
import io.reactivex.Observable
import org.koin.android.ext.android.get

class MainActivity :
    BaseMviActivity<ActivityMainBinding, MainView.State, MainView, MainPresenter>(), MainView {


    override fun resLayoutId(): Int = R.layout.activity_main

    override fun createPresenter(): MainPresenter = get()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun sampleIntent(): Observable<GetBooleanEvent> = Observable.just(GetBooleanEvent)

    override fun render(viewState: MainView.State) {
        logd("render State ${viewState.state } ${viewState::class.java}")
    }
}
