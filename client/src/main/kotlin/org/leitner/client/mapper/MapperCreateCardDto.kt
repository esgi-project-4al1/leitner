package org.leitner.client.mapper

import org.leitner.client.dto.CreateCardDto
import org.leitner.domain.dto.CardUserData

object MapperCreateCardDto {


    fun mapCreateCardDtoToCardDto(
        createCardDto: CreateCardDto,
    ): CardUserData {
        return CardUserData(
            question = createCardDto.question,
            answer = createCardDto.answer,
            tag = createCardDto.tag
        )
    }
}