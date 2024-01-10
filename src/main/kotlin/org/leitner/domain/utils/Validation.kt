package org.leitner.domain.utils

import io.konform.validation.Validation
import io.konform.validation.ValidationErrors

fun ValidationErrors.concat(): String = this.stream().map { "${it.dataPath}=${it.message}" }.reduce { acc, s -> "$acc, $s" }.orElse("")

