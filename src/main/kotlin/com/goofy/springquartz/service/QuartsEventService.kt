package com.goofy.springquartz.service

import com.goofy.springquartz.repository.QuartsEventRepository
import org.springframework.stereotype.Service

@Service
class QuartsEventService(
    private val quartsEventRepository: QuartsEventRepository
) {
}
