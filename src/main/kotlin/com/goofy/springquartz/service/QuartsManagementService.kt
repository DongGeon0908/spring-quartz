package com.goofy.springquartz.service

import com.goofy.springquartz.repository.QuartsManagementRepository
import org.springframework.stereotype.Service

@Service
class QuartsManagementService(
    private val quartsManagementRepository: QuartsManagementRepository
) {
}
