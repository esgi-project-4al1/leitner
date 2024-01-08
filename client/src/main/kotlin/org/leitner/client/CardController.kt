package org.leitner.client

import org.leitner.client.dto.CardDto
import org.leitner.client.dto.CreateCardDto
import org.leitner.client.service.CreateCard
import org.leitner.client.service.FindCards
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/cards")
class CardController(
    private val findCards: FindCards,
    private val createCard: CreateCard,
) {

    @GetMapping()
    fun findCards(
        @RequestParam tags: List<String>,
    ): List<CardDto> {
        return findCards.findCards(tags)
    }

    @PostMapping()
    fun createCard(
        @RequestParam createCardDto: CreateCardDto,
    ): CardDto {
        return createCard.createCard(createCardDto)
    }
}