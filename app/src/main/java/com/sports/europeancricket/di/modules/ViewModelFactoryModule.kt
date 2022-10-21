package com.sports.europeancricket.di.modules

import androidx.lifecycle.ViewModelProvider
import com.sports.europeancricket.ui.base.ViewModelProviderFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {

    @Binds
    abstract fun bindViewModelFactory(viewModeFactory: ViewModelProviderFactory): ViewModelProvider.Factory
}