package com.moekyawaung.routes

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.http.*

fun Routing.aboutRoutes() {
    get("/about") {
        call.respondText("""
            <h1>About Me</h1>
            <p>Hello, I'm Moe Kyaw Aung, Android Developer and Web Enthusiast. I build premium, modern, and responsive portfolios and applications.</p>
        """.trimIndent(), ContentType.Text.Html)
    }
}
