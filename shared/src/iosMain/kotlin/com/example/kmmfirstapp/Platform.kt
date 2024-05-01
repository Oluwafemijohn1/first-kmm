package com.example.kmmfirstapp

import io.ktor.client.*
import io.ktor.client.engine.darwin.*
import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun getPlatform(): Platform = IOSPlatform()

actual fun httpClient2(config: HttpClientConfig<*>.()-> Unit)= HttpClient(Darwin){
    config(this)
    engine{
        configureRequest{
            setAllowsCellularAccess(true)
        }
    }
}