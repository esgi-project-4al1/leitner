package org.leitner.domain.validation

import io.konform.validation.Validation
import io.konform.validation.ValidationResult
import io.konform.validation.jsonschema.maxLength
import io.konform.validation.jsonschema.minLength
import org.leitner.domain.dto.Card
import org.leitner.domain.dto.CardUserData
import org.springframework.stereotype.Service

@Service
class ValidationCard {


    fun verifyValidationOfCard(card: CardUserData): ValidationResult<CardUserData> {
        val validateCardUserData = Validation<CardUserData> {
            CardUserData::tag {
                minLength(2)
                maxLength(30)
            }
            CardUserData::answer {
                minLength(2)
                maxLength(100)
            }
            CardUserData::question {
                minLength(2)
                maxLength(300)
            }


        }
        return validateCardUserData(card)
    }
}