package com.example.repository.service

import com.example.core.service.SampleService

/**
 * Created by Mikhail Lysyansky on 26.10.18.
 */
class SampleServiceImpl : SampleService {

    companion object {
        fun create() : SampleService  = SampleServiceImpl()
    }

}