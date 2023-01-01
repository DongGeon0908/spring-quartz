package com.goofy.springquartz.repository

import com.goofy.springquartz.entity.QuartsManagement
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface QuartsManagementRepository : JpaRepository<QuartsManagement, Long>
