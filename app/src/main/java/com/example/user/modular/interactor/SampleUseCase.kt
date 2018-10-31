package com.example.user.modular.interactor

import com.example.core.repo.SampleRepository
import io.reactivex.Observable

/**
 * Created by Mikhail Lysyansky on 26.10.18.
 */
class SampleUseCase(private val sampleRepository: SampleRepository) {

    fun getBoolean(): Observable<Boolean> = sampleRepository.getBoolean()
}