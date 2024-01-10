package org.leitner.server.service

import org.leitner.domain.contract.out.RegisterCardOut
import org.leitner.domain.dto.Card
import org.leitner.server.mapper.MapperCardEntity
import org.leitner.server.repository.CardRepository
import org.springframework.stereotype.Service

@Service
class RegisterCardServer(
    private val repository: CardRepository,
    private val mapper: MapperCardEntity,
): RegisterCardOut {



    override fun registerCard(card: Card): Card {
        return mapper.mapCardEntityToCard(
            repository.save(
                mapper.mapCardToCardEntity(card)
            )
        )
    }
}