package org.leitner.server.service

import org.leitner.domain.contract.`in`.FindCardsIn
import org.leitner.domain.dto.Card
import org.leitner.server.mapper.MapperCardEntity
import org.leitner.server.repository.CardRepository

class FindCards(
    private val mapper: MapperCardEntity,
    private val repository: CardRepository,
): FindCardsIn {
    override fun findCards(listTag: List<String>?): List<Card> {
        val listCard = if (listTag == null) {
            repository.findAll()
        } else {
            repository.findByTagsContaining(listTag)
        }

        return listCard.map { mapper.mapCardEntityToCard(it) }
    }
}