package org.leitner.domain.contract.`in`

import org.leitner.domain.dto.Card

interface FindCardsIn {

    fun findCards(listTag: List<String>?): List<Card>
}