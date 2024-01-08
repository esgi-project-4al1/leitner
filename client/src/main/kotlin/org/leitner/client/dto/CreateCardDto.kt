package org.leitner.client.dto

data class CreateCardDto(
    val question: String,
    val answer: String,
    val tag: String
)
