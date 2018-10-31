package com.example.user.modular.ui.main

import com.example.user.modular.ui.base.BaseMviView
import com.example.user.modular.ui.main.MainView.Event.GetBooleanEvent
import io.reactivex.Observable

interface MainView : BaseMviView<MainView.State> {

    fun sampleIntent(): Observable<GetBooleanEvent>

    data class State(
        val state: Boolean = false
    )

    sealed class Event {
        object GetBooleanEvent : Event()
    }

    sealed class StateChanges {
        object GetBooleanSuccess : StateChanges()
    }
}