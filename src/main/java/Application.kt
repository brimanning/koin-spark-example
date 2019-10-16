package com.brimanning.koinsparkexample

import org.koin.core.context.startKoin
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

    get("/") { _, _ -> SomeComponent().service.helloMessage() }
}