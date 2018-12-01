package com.example.helloworld

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingRest(private val greetingService: GreetingService) {
    @GetMapping("/hello")
    fun hello(): ResponseEntity<Greeting> {
        return ResponseEntity.ok(greetingService.randomGreeting())
    }
}
