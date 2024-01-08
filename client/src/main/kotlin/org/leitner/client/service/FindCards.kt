package org.leitner.client.service

import org.leitner.client.dto.CardDto
import org.leitner.client.mapper.MapperCardDto
import org.leitner.domain.contract.`in`.FindCardsIn
import org.springframework.stereotype.Service

@Service
class FindCards(
    private val mapper: MapperCardDto,
    private val findCardsIn: FindCardsIn,
) {

    fun findCards(
        listTags: List<String>?,
    ): List<CardDto> {
        return findCardsIn.findCards(listTags).map { mapper.mapCardToCardDto(it) }
    }
}