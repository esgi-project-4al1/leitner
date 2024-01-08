package org.leitner.domain.mapper

import org.leitner.domain.dto.Card
import org.leitner.domain.dto.CardId
import org.leitner.domain.dto.CardUserData
import org.leitner.domain.dto.Category
import java.util.UUID

object MapperCard {

    fun mapFirstUserCardToCard(cardUserData: CardUserData): Card {
        return Card(
            id = CardId(
                id = UUID.randomUUID(),
            ),
            category = Category.FIRST,
            question = cardUserData.question,
            answer = cardUserData.answer,
            tag = cardUserData.tag,
        )
    }
}