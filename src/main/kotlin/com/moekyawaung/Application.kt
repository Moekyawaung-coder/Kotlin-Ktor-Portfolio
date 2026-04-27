package com.moekyawaung

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.http.*
import com.moekyawaung.routes.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        module()
    }.start(wait = true)
}

fun Application.module() {
    routing {
        get("/") {
            call.respondText("Welcome to Moe Kyaw Aung's Portfolio", ContentType.Text.Html)
        }
        aboutRoutes()
        projectsRoutes()
        contactRoutes()
        staticResources()
    }
}
