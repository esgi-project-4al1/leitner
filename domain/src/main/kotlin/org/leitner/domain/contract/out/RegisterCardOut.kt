package org.leitner.domain.contract.out

import org.leitner.domain.dto.Card

interface RegisterCardOut {

    fun registerCard(card: Card): Card
}