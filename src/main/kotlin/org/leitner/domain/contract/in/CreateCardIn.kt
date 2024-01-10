package org.leitner.domain.contract.`in`

import org.leitner.domain.dto.Card
import org.leitner.domain.dto.CardUserData

interface CreateCardIn {

    fun createCard(cardUserData: CardUserData): Card
}