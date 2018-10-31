package com.example.core.repo

import io.reactivex.Observable

/**
 * Created by Mikhail Lysyansky on 26.10.18.
 */
interface SampleRepository {
    fun getBoolean() : Observable<Boolean>
}