package com.example

import org.glassfish.jersey.server.ResourceConfig
import org.h2.tools.Server
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@SpringBootApplication
open class SpringBootStarter

@Component
class JerseyConfig : ResourceConfig() {
    @PostConstruct
    fun setup() {
        packages("com.example")
    }
}

fun main(args: Array<String>) {
    val server = Server.createTcpServer().start()
    println("H2 tcp server started: " + server.url)

    SpringApplication.run(SpringBootStarter::class.java, *args)
}