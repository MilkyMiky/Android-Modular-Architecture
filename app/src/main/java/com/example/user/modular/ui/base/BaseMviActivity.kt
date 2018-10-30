package com.example.user.modular.ui.base

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import com.hannesdorfmann.mosby3.mvi.MviActivity

abstract class BaseMviActivity<DB : ViewDataBinding,
        in VS,
        V : BaseMviView<VS>,
        P : BaseMviPresenter<V, in VS>> : MviActivity<V, P>() {

    protected lateinit var viewBinding: DB

    abstract fun resLayoutId(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = DataBindingUtil.setContentView(this, resLayoutId())
    }
}