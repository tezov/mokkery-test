package com.tezov.mokkery.agp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform