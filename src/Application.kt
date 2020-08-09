package com.tutorial

import com.tutorial.data.DataFactory
import com.tutorial.repositories.CfestatusRepository
import com.tutorial.routes.cfestatus
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.gson.*
import io.ktor.features.*
import io.ktor.locations.Locations

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {
    install(ContentNegotiation) {
        gson {
        }
    }
    install(Locations)

    DataFactory.init()
    val db = CfestatusRepository()

    routing {
        cfestatus(db)
    }
}

