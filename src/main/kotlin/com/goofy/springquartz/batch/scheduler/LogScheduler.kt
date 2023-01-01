package com.goofy.springquartz.batch.scheduler

import com.goofy.springquartz.batch.job.LogJob
import org.quartz.JobDetail
import org.quartz.SimpleTrigger
import org.quartz.Trigger
import org.springframework.context.annotation.Bean
import org.springframework.core.io.ClassPathResource
import org.springframework.scheduling.quartz.JobDetailFactoryBean
import org.springframework.scheduling.quartz.SchedulerFactoryBean
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean
import org.springframework.stereotype.Component


@Component
class LogScheduler(
    private val goofyJob: GoofyJob
) {

    @Bean
    fun logTestScheduler(trigger: Trigger, job: JobDetail): SchedulerFactoryBean? {
        val schedulerFactory = SchedulerFactoryBean()
        schedulerFactory.setConfigLocation(ClassPathResource("application.yml"))
        schedulerFactory.setJobFactory(goofyJob.springBeanJobFactory())
        schedulerFactory.setJobDetails(job)
        schedulerFactory.setTriggers(trigger)
        return schedulerFactory
    }

    @Bean
    fun logJobTrigger(job: JobDetail): SimpleTriggerFactoryBean {
        return SimpleTriggerFactoryBean().apply {
            this.setJobDetail(job)
            this.setRepeatInterval(3600000)
            this.setRepeatCount(SimpleTrigger.REPEAT_INDEFINITELY)
        }
    }

    @Bean
    fun logJobDetail(): JobDetailFactoryBean {
        return JobDetailFactoryBean()
            .apply {
                this.setJobClass(LogJob::class.java)
                this.setDescription("invoke Log Job service...")
                this.setDurability(true)
            }
    }
}
