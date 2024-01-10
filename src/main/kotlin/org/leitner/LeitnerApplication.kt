package org.leitner

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@EnableMongoRepositories("org.leitner.server.repository")
@SpringBootApplication
class LeitnerApplication

fun main(args: Array<String>) {
    runApplication<LeitnerApplication>(*args)
}
