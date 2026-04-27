package com.moekyawaung.routes

import io.ktor.server.routing.*
import io.ktor.server.http.content.*

fun Routing.staticResources() {
    static("/static") {
        resources("static")
    }
}
