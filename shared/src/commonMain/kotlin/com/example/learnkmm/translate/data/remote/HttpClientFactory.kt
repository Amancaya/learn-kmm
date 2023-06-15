package com.example.learnkmm.translate.data.remote

import io.ktor.client.*

//Expect works as an abstract class
expect class HttpClientFactory {
    fun create(): HttpClient
}