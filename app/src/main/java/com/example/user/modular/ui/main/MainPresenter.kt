package com.example.user.modular.ui.main

import com.example.user.modular.interactor.SampleUseCase
import com.example.user.modular.ui.base.BaseMviPresenter
import com.example.user.modular.ui.main.MainView.StateChanges.GetBooleanSuccess
import com.example.user.modular.ui.main.MainView.State
import io.reactivex.Observable
import io.reactivex.Observable.just
import io.reactivex.schedulers.Schedulers

class MainPresenter(
    private val sampleUseCase: SampleUseCase
) : BaseMviPresenter<MainView, MainView.State>() {
    override fun intentStream(): Observable<out Any> =
        intent { it.sampleIntent() }
            .switchMap {
                sampleUseCase.getBoolean()
                    .flatMap { _ -> just(GetBooleanSuccess) }
                    .subscribeOn(Schedulers.io())
            }


    override fun initialState(): State = State()

    override fun reduceState(state: State, changes: Any): State =
        when (changes) {

            is GetBooleanSuccess -> state.copy(state = true)

            else -> state
        }
}
