package org.leitner.domain.utils

import io.konform.validation.Validation
import io.konform.validation.ValidationErrors

fun ValidationErrors.toString(nameClass: String): String {
    return "$nameClass ${this.stream().map { "${it.dataPath} = ${it.message} " }}"
}

