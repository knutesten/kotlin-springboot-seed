package com.example

import org.h2.tools.Server
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Application

fun main(args: Array<String>) {
    val server = Server.createTcpServer().start()
    println("H2 tcp server started: " + server.url)

    SpringApplication.run(Application::class.java, *args)
}