package com.alexdg.countries.model

import com.google.gson.annotations.SerializedName

data class Country(
    @SerializedName("name")
    val countryName: String?,
    @SerializedName("capital")
    val captial: String?,
    @SerializedName("flagPNG")
    val falg: String?
)