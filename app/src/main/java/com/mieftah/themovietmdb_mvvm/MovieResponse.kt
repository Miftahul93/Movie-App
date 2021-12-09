package com.mieftah.themovietmdb_mvvm

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class MovieResponse(

    @field:SerializedName("overview")
    val overview: String,

    @field:SerializedName("original_title")
    val originalTitle: String,

    @field:SerializedName("id")
    val id: Int,

    @field:SerializedName("poster_path")
    val posterPath: String
) : Parcelable {
    // baseUrl buat manggil image
    val baseUrl: String get() = "https://image.tmdb.org/t/p/w500/"
}
