package com.alexdg.countries.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

import com.alexdg.countries.model.Country

class ListViewModel: ViewModel() {

    val countries = MutableLiveData<List<Country>>()
    var countryLoadError = MutableLiveData<Boolean>()
    var loading = MutableLiveData<Boolean>()

    fun refresh() {
        fetchCountries()
    }

    private fun fetchCountries() {
        val mockData :List<Country> = listOf(Country("CountryA"),
            Country("CountryB"),
            Country("CountryC"),
            Country("CountryD"),
            Country("CountryE"),
            Country("CountryF"),
            Country("CountryG"),
            Country("CountryH"),
            Country("CountryI"),
            Country("CountryJ")
        )

        countryLoadError.value = false
        loading.value = false
        countries.value = mockData
    }

}