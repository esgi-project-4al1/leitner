package org.leitner.client.service

import org.leitner.client.dto.CardDto
import org.leitner.client.dto.CreateCardDto
import org.leitner.client.mapper.MapperCardDto
import org.leitner.client.mapper.MapperCreateCardDto
import org.leitner.domain.contract.`in`.CreateCardIn
import org.springframework.stereotype.Service

@Service
class CreateCard(
    private val cardCreate: CreateCardIn,
    private val mapperIn: MapperCreateCardDto,
    private val mapperOut: MapperCardDto,
) {

    fun createCard(
        createCarteDto: CreateCardDto,
    ): CardDto {
        val card = mapperIn.mapCreateCardDtoToCardDto(createCarteDto)
        return cardCreate.createCard(card).let { mapperOut.mapCardToCardDto(it) }
    }
}