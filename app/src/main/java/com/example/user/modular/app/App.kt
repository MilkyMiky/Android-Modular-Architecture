package com.example.user.modular.app

import android.app.Application
import com.example.user.modular.di.appModule
import com.example.user.modular.di.coreModule
import com.example.user.modular.di.networkModule
import com.example.user.modular.di.repositoryModule
import org.koin.android.ext.android.startKoin

/**
 * Created by Mikhail Lysyansky on 26.10.18.
 */
class App : Application() {

  override fun onCreate() {
    super.onCreate()

    startKoin(
      this, listOf(
        appModule,
        repositoryModule,
        coreModule,
        networkModule
      )
    )
  }
}