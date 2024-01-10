package org.leitner.server.repository

import org.leitner.server.entity.CardEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface CardRepository: MongoRepository<CardEntity, UUID> {

    fun findByTags(tags: String): List<CardEntity>
}