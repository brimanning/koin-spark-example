package com.brimanning.koinsparkexample

import java.util.Calendar

class SomeService {
    fun helloMessage() = "Hi from Spark! The current time in millis is: ${Calendar.getInstance().timeInMillis}"
}