package org.example.app_ism

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform