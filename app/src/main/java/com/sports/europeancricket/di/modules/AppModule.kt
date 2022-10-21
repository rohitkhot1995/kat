package com.sports.europeancricket.di.modules

import android.app.Application
import android.content.Context
import com.google.firebase.remoteconfig.BuildConfig
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings
import com.sports.europeancricket.repository.DataManager
import com.sports.europeancricket.repository.DataManagerSkeleton
import com.sports.europeancricket.repository.repoUtils.rx.AppSchedulerProvider
import com.sports.europeancricket.repository.repoUtils.rx.SchedulerSkeleton
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideApplicationContext(context: Application): Context = context

    @Provides
    @Singleton
    fun provideDataManager(appDataManager: DataManager): DataManagerSkeleton {
        return appDataManager
    }

    @Provides
    @Singleton
    fun provideSchedulerProvider(): SchedulerSkeleton = AppSchedulerProvider()

    @Provides
    @Singleton
    fun provideFireBaseRemoteConfig(): FirebaseRemoteConfig = FirebaseRemoteConfig.getInstance()

    @Provides
    @Singleton
    fun provideFireBaseSettings(): FirebaseRemoteConfigSettings {
        return FirebaseRemoteConfigSettings.Builder()
            .setDeveloperModeEnabled(BuildConfig.DEBUG)
            .setFetchTimeoutInSeconds(4200)
            .build()
    }

}