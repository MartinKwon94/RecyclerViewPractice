package com.example.recyclerviewpractice

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Item(
    val Image: Int,
    val Item1: String,
    val Item2: String
) : Parcelable