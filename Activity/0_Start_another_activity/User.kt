package com.example.androidstudio

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User (
    val name: String,
    val email: String
) : Parcelable