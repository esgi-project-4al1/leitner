package org.leitner.exception

import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus
class ExceptionCard(message: String) : Exception(message)