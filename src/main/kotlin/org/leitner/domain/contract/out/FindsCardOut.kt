package org.leitner.domain.contract.out

import org.leitner.domain.dto.Card

interface FindsCardOut {

    fun findAllCards(): List<Card>

    fun findCardsByTag(listTag: List<String>?): List<Card>
}