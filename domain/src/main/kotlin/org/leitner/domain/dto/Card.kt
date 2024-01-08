package org.leitner.domain.dto

data class Card(
    val id: CardId,
    val category: Category,
    val question: String,
    val answer: String,
    val tag: String
)
