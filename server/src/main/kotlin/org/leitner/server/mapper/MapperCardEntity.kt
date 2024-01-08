package org.leitner.server.mapper

import org.leitner.domain.dto.Card
import org.leitner.domain.dto.CardId
import org.leitner.server.entity.CardEntity

object MapperCardEntity {

    fun mapCardEntityToCard(cardEntity: CardEntity): Card {
        return Card(
            id = CardId(cardEntity.id),
            category = cardEntity.category,
            question = cardEntity.question,
            answer = cardEntity.answer,
            tag = cardEntity.tags,
        )
    }

    fun mapCardToCardEntity(card: Card): CardEntity {
        return CardEntity(
            id = card.id.id,
            category = card.category,
            question = card.question,
            answer = card.answer,
            tags = card.tag,
        )
    }
}