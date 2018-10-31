package com.example.repository.repository

import com.example.core.repo.SampleRepository
import io.reactivex.Observable
import io.reactivex.Observable.just


/**
 * Created by Mikhail Lysyansky on 26.10.18.
 */
class SampleRepositoryImpl : SampleRepository {

    override fun getBoolean(): Observable<Boolean> = just(true)

    companion object {
        fun create(): SampleRepository = SampleRepositoryImpl()
    }

}