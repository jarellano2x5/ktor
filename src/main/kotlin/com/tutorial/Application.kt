package com.tutorial

import com.tutorial.data.DataFactory
import com.tutorial.repositories.CfestatusRepository
import com.tutorial.routes.cfestatus
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.routing.*
import io.ktor.serialization.gson.*
import io.ktor.server.plugins.contentnegotiation.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

@Suppress("unused")
fun Application.module(testing: Boolean = false) {
    install(ContentNegotiation) {
        gson()
    }
    //install(Resources)

    DataFactory.init()
    val db = CfestatusRepository()

    routing {
        cfestatus(db)
    }
}

