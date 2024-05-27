package com.example.footballtriviaapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform