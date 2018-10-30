package com.example.user.modular.ui.base

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hannesdorfmann.mosby3.mvi.MviFragment
import com.hannesdorfmann.mosby3.mvi.MviPresenter

abstract class BaseMviFragment<
        DB : ViewDataBinding,
        in VS, V : BaseMviView<VS>,
        P : MviPresenter<V, in VS>>
    : MviFragment<V, P>() {

    protected var viewBinding: DB? = null

    abstract fun resLayoutId(): Int

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        viewBinding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            resLayoutId(),
            container,
            false
        )
        return viewBinding!!.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        viewBinding = null
    }
}