package com.example.extremesports.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class sports(
    @StringRes val nameResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    @StringRes val descResourceId: Int
)