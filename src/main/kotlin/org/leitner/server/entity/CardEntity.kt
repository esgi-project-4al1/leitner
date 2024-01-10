package org.leitner.server.entity

import org.leitner.domain.dto.Category
import org.springframework.data.mongodb.core.mapping.Document
import java.util.UUID

@Document("card")
data class CardEntity(
    val id: UUID,
    val category: Category,
    val question: String,
    val answer: String,
    val tags: String,
)
