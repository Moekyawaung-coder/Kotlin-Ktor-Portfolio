package com.moekyawaung.routes

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*
import io.ktor.http.*

data class Project(val name: String, val description: String, val github: String)

fun Routing.projectsRoutes() {
    val projects = listOf(
        Project("E-Commerce App", "Full-featured Android & Flutter app with payment integration", "https://github.com/Moe-KyawAung/ecommerce"),
        Project("Analytics Dashboard", "AI-powered dashboard with real-time data visualization", "https://github.com/Moe-KyawAung/analytics-dashboard")
    )

    get("/projects") {
        val projectHtml = projects.joinToString("") { project ->
            """
            <div>
                <h3>${project.name}</h3>
                <p>${project.description}</p>
                <a href="${project.github}" target="_blank">GitHub</a>
            </div>
            """.trimIndent()
        }
        call.respondText("<h1>Projects</h1>$projectHtml", ContentType.Text.Html)
    }
}
