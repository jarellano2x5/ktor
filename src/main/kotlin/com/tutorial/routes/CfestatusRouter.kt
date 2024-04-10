package com.tutorial.routes

import com.tutorial.models.Cfestatus
import com.tutorial.repositories.CfestatusRepository
import io.ktor.server.application.call
import io.ktor.http.HttpStatusCode
import io.ktor.server.request.receive
import io.ktor.server.response.respond
import io.ktor.server.routing.*
import kotlinx.coroutines.async

fun Route.cfestatus(db: CfestatusRepository) {
    route("/cfestatus") {
        get {
            try {
                val ls = db.find("")
                call.respond(ls)
            } catch (e: Throwable) {
                call.respond(HttpStatusCode.BadRequest, "Error, revisalo")
            }
        }
        post {
            val param = call.receive<Cfestatus>()
            try {
                val idreg = async { db.create(param) }
                call.respond(HttpStatusCode.OK, idreg)
            } catch (e: Throwable) {
                call.respond(HttpStatusCode.BadRequest, "Error, revisalod")
            }
        }
    }
}