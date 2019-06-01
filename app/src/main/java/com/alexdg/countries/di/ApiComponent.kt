package com.alexdg.countries.di

import com.alexdg.countries.model.CountriesService
import com.alexdg.countries.viewmodel.ListViewModel
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service: CountriesService)

    fun inject(viewModule: ListViewModel)
}