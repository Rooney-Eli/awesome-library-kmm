package com.example.awesomelibrary

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}