package com.sports.europeancricket.di.components

import android.app.Application
import com.sports.europeancricket.ECNApplication
import com.sports.europeancricket.di.ActivityBuilderModule
import com.sports.europeancricket.di.modules.AppModule
import com.sports.europeancricket.di.modules.RetrofitModule
import com.sports.europeancricket.di.modules.ViewModelFactoryModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AndroidSupportInjectionModule::class,
        ActivityBuilderModule::class, AppModule::class, RetrofitModule::class, ViewModelFactoryModule::class]
)
interface AppComponent : AndroidInjector<ECNApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(app: Application): Builder

        fun build(): AppComponent
    }
}