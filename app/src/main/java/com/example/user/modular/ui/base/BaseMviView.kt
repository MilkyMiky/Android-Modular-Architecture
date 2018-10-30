package com.example.user.modular.ui.base

import com.hannesdorfmann.mosby3.mvp.MvpView

interface BaseMviView<in VS> : MvpView {
    fun render(viewState: VS)
}