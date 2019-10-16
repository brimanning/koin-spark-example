package com.brimanning.koinsparkexample

import spark.Spark.get

fun main(args: Array<String>) {
    get("/") { _, _ -> "Hello World" }
}