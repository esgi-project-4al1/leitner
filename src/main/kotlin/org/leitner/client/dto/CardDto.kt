package org.leitner.client.dto

import org.leitner.domain.dto.Category
import java.util.UUID

data class CardDto(
    val id: UUID,
    val category: Category,
    val question: String,
    val answer: String,
    val tag: String
)
