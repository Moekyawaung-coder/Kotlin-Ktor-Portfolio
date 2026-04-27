package com.moekyawaung.routes

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.http.*

fun Routing.contactRoutes() {
    get("/contact") {
        call.respondText("""
            <h1>Contact Me</h1>
            <p>Email: moekyawaung@engineer.com</p>
            <p>Phone: +959889000889</p>
            <p>LinkedIn: <a href="https://www.linkedin.com/in/moe-kyaw-aung-2653093a1" target="_blank">Profile</a></p>
            <p>GitHub: <a href="https://github.com/Moe-KyawAung" target="_blank">Profile</a></p>
        """.trimIndent(), ContentType.Text.Html)
    }
}
