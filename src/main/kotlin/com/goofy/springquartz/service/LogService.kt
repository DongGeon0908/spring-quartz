package com.goofy.springquartz.service

import mu.KotlinLogging
import org.springframework.stereotype.Service
import java.time.ZonedDateTime

/**
 * 테스트 서비스
 * - 정기적으로 특정 비즈니스 로직을 실행
 **/
@Service
class LogService {
    private val logger = KotlinLogging.logger {}

    fun execute() {
        val now = ZonedDateTime.now()
        logger.info { "this time is $now" }
    }
}
