package org.leitner.client.mapper

import org.leitner.client.dto.CardDto
import org.leitner.domain.dto.Card
import org.leitner.domain.dto.CardId
import org.leitner.domain.dto.CardUserData
import org.springframework.stereotype.Service

@Service
class MapperCardDto {
    fun mapCardToCardDto(
        card: Card,
    ): CardDto {
        return CardDto(
            id = card.id.id,
            category = card.category,
            question = card.question,
            answer = card.answer,
            tag = card.tag
        )
    }


    fun mapCardDtoToCard(
        cardDto: CardDto,
    ): Card {
        return Card(
            id = CardId(cardDto.id),
            category = cardDto.category,
            question = cardDto.question,
            answer = cardDto.answer,
            tag = cardDto.tag
        )
    }


    fun mapCardToCardUserData(
        cardDto: CardDto,
    ): CardUserData{
        return CardUserData(
            question = cardDto.question,
            answer = cardDto.answer,
            tag = cardDto.tag
        )
    }
}