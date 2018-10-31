package com.example.user.modular.di

import com.example.user.modular.interactor.SampleUseCase
import com.example.user.modular.ui.main.MainPresenter
import org.koin.dsl.module.module

/**
 * Created by Mikhail Lysyansky on 26.10.18.
 */

val appModule = module {

    factory { SampleUseCase(get()) }

    factory { MainPresenter(get()) }

}