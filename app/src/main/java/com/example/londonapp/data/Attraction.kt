package com.example.londonapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Attraction(
    @StringRes val name: Int,
    @DrawableRes val image: Int,
    val rating: Int,
    val category: Categories
    )
