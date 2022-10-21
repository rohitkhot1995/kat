package com.sports.europeancricket.repository.repoUtils.rx

import io.reactivex.Scheduler

interface SchedulerSkeleton {

    fun computation(): Scheduler

    fun io(): Scheduler

    fun ui(): Scheduler
}