package com.goofy.springquartz

import mu.KotlinLogging
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.boot.runApplication
import org.springframework.context.ApplicationListener
import org.springframework.core.env.Environment
import java.time.ZoneId
import java.util.*

@SpringBootApplication
class SpringQuartzApplication(
    private val environment: Environment
) : ApplicationListener<ApplicationReadyEvent> {
    private val logger = KotlinLogging.logger { }

    override fun onApplicationEvent(event: ApplicationReadyEvent) {
        logger.info { "applicationReady status ${environment.activeProfiles.contentToString()}" }
    }
}

fun main(args: Array<String>) {
    init()
    runApplication<SpringQuartzApplication>(*args)
}

fun init() {
    TimeZone.setDefault(TimeZone.getTimeZone(ZoneId.of("Asia/Seoul")))
    System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "100")
}
