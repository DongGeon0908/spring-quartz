package com.goofy.springquartz.batch.scheduler

import org.springframework.context.annotation.Bean
import org.springframework.context.support.AbstractApplicationContext
import org.springframework.scheduling.quartz.SpringBeanJobFactory
import org.springframework.stereotype.Component

@Component
class GoofyJob(
    private val applicationContext: AbstractApplicationContext
) {
    @Bean
    fun springBeanJobFactory(): SpringBeanJobFactory {
        val jobFactory = AutoWiringSpringBeanJobFactory()
        jobFactory.setApplicationContext(applicationContext)
        return jobFactory
    }
}
