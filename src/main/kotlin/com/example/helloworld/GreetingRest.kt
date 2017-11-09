package com.example.helloworld

import org.springframework.stereotype.Component
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType.APPLICATION_JSON
import javax.ws.rs.core.Response

@Path("greeting")
@Produces(APPLICATION_JSON)
@Component
open class GreetingRest(private val greetingService: GreetingService) {
    @GET
    fun hello(): Response {
        return Response.ok(greetingService.randomGreeting()).build()
    }
}
