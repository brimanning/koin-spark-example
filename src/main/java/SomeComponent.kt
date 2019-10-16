package com.brimanning.koinsparkexample

import org.koin.core.KoinComponent
import org.koin.core.inject

class SomeComponent : KoinComponent {

    val service by inject<SomeService>()
}