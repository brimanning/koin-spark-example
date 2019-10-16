package com.brimanning.koinsparkexample

import org.koin.core.KoinComponent
import org.koin.core.context.startKoin
import org.koin.core.inject
import org.koin.dsl.module
import spark.Spark.get

fun main(args: Array<String>) {
    startKoin {
        printLogger()
        modules(
            module {
                single { SomeService() }
            }
        )
    }

    get("/") { _, _ -> SparkApplication().service.helloMessage() }
}

class SparkApplication : KoinComponent {
    val service by inject<SomeService>()
}