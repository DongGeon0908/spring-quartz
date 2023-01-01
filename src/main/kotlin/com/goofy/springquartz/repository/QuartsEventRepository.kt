package com.goofy.springquartz.repository

import com.goofy.springquartz.entity.QuartsEvent
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface QuartsEventRepository : JpaRepository<QuartsEvent, Long>
