package org.leitner.server.entity

import org.leitner.domain.dto.Category
import java.util.UUID

data class CardEntity(
    val id: UUID,
    val category: Category,
    val question: String,
    val answer: String,
    val tags: String,
)
