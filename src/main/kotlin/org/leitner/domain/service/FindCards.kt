package org.leitner.domain.service

import org.leitner.domain.contract.`in`.FindCardsIn
import org.leitner.domain.contract.out.FindsCardOut
import org.leitner.domain.dto.Card

class FindCards(
    private val findCardsOut: FindsCardOut
) : FindCardsIn {
    override fun findCards(listTag: List<String>?): List<Card> {
        return if (listTag == null) {
            findCardsOut.findAllCards()
        } else {
            findCardsOut.findCardsByTag(listTag)
        }
    }

}