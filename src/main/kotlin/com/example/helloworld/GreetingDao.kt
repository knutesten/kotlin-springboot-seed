package com.example.helloworld

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Component

@Component
class GreetingDao(private val jdbcTemplate: JdbcTemplate) {
    fun all(): List<Greeting> {
        return jdbcTemplate.query(
                "SELECT * FROM greeting"
        ) { rs, _ ->
            Greeting(
                    rs.getInt("id"),
                    rs.getString("greeting"))
        }
    }
}
