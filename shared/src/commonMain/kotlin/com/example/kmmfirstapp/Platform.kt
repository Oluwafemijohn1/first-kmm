package com.example.kmmfirstapp

import io.ktor.client.*

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform

expect fun  httpClient2(config: HttpClientConfig<*>.()-> Unit={}): HttpClient