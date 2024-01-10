package org.leitner.client

import org.leitner.client.dto.CardDto
import org.leitner.client.dto.CreateCardDto
import org.leitner.client.service.CreateCardClient
import org.leitner.client.service.FindCardsClient
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/cards")
class CardController(
    private val findCards: FindCardsClient,
    private val createCard: CreateCardClient,
) {

    @GetMapping()
    fun findCards(
        @RequestParam tags: List<String>?,
    ): List<CardDto> {
        return findCards.findCards(tags)
    }

    @PostMapping(
        consumes = [MediaType.APPLICATION_JSON_VALUE],
        produces = [MediaType.APPLICATION_JSON_VALUE],
    )
    fun createCard(
        @RequestBody createCardDto: CreateCardDto,
    ): CardDto {
        return createCard.createCard(createCardDto)
    }
}