package com.testing.demo.exceptions


import java.lang.Exception

internal class TaskException(override val message: String?) : Exception(message) {
}