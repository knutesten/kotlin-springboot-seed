package com.example.helloworld

import org.springframework.stereotype.Component

@Component
class GreetingService(private val greetingDao: GreetingDao) {
    fun randomGreeting(): Greeting {
        val greetings = greetingDao.all()
        return greetings[Math.floor(Math.random() * greetings.size).toInt()]
    }
}
