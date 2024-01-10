package org.leitner.server.service

import org.leitner.domain.contract.`in`.FindCardsIn
import org.leitner.domain.dto.Card
import org.leitner.server.mapper.MapperCardEntity
import org.leitner.server.repository.CardRepository
import org.springframework.stereotype.Service

@Service
class FindCardsServer(
    private val mapper: MapperCardEntity,
    private val repository: CardRepository,
) : FindCardsIn {
    override fun findCards(listTag: List<String>?): List<Card> {
        return if (listTag == null) {
            repository.findAll().map { mapper.mapCardEntityToCard(it) }
        } else {
            findCardsByTag(listTag)
        }
    }

    private fun findCardsByTag(listTag: List<String>): List<Card> {
        return listTag.asSequence()
            .map {
                repository.findByTags(it)

            }
            .flatten()
            .map { mapper.mapCardEntityToCard(it) }
            .toList()
    }
}