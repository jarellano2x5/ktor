package com.tutorial.routes

import com.tutorial.models.Cfestatus
import com.tutorial.repositories.CfestatusRepository
import io.ktor.application.call
import io.ktor.http.HttpStatusCode
import io.ktor.http.Parameters
import io.ktor.locations.KtorExperimentalLocationsAPI
import io.ktor.locations.Location
import io.ktor.locations.get
import io.ktor.locations.post
import io.ktor.request.receive
import io.ktor.response.respond
import io.ktor.routing.Route

@KtorExperimentalLocationsAPI
@Location("/cfestatus")
class CfestatusRouter {
}

@KtorExperimentalLocationsAPI
fun Route.cfestatus(db: CfestatusRepository) {
    get<CfestatusRouter> {
        try {
            val ls = db.find("")
            call.respond(ls)
        } catch (e: Throwable) {
            call.respond(HttpStatusCode.BadRequest, "Error, revisalo")
        }
    }
    post<CfestatusRouter> {
        val param = call.receive<Cfestatus>()
        try {
            val idreg = db.create(param)
            call.respond(HttpStatusCode.OK, idreg)
        } catch (e: Throwable) {
            call.respond(HttpStatusCode.BadRequest, "Error, revisalod")
        }
    }
}