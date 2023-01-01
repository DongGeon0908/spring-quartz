package com.goofy.springquartz.batch.job

import com.goofy.springquartz.service.LogService
import org.quartz.Job
import org.quartz.JobExecutionContext
import org.springframework.stereotype.Component

/**
 * 정기적으로 실행할 Job
 **/
@Component
class LogJob(
    private val logService: LogService
) : Job {
    override fun execute(context: JobExecutionContext) {
        logService.execute()
    }
}
