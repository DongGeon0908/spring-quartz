package com.goofy.springquartz.entity

import java.time.ZonedDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table(name = "quarts_management")
class QuartsManagement(
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = -1,

    @Column(name = "title")
    val title: String,

    @Column(name = "content")
    val content: String,

    @Column(name = "start_at")
    val startAt: ZonedDateTime,

    @Column(name = "end_at")
    val endAt: ZonedDateTime,

    @Column(name = "extra")
    val extra: String? = null
) : BaseEntity()
