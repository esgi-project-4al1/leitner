package org.leitner.domain.service

import org.leitner.domain.contract.`in`.CreateCardIn
import org.leitner.domain.contract.out.RegisterCardOut
import org.leitner.domain.dto.Card
import org.leitner.domain.dto.CardUserData
import org.leitner.domain.mapper.MapperCard
import org.leitner.domain.utils.concat
import org.leitner.domain.validation.ValidationCard
import org.leitner.exception.ExceptionCard
import org.springframework.stereotype.Service

@Service
class CreateCard(
    private val validation: ValidationCard,
    private val registerCardOut: RegisterCardOut,
    private val mapper : MapperCard
): CreateCardIn {

    override fun createCard(cardUserData: CardUserData): Card {
        val cardUserDataValidation = validation.verifyValidationOfCard(cardUserData)
        if (cardUserDataValidation.errors.isNotEmpty()){
            throw ExceptionCard(cardUserDataValidation.errors.concat())
        }
        val card = mapper.mapFirstUserCardToCard(cardUserData)
        return registerCardOut.registerCard(card)
    }

}