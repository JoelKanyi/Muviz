package com.kanyideveloper.muviz.data.remote.responses

import com.google.gson.annotations.SerializedName
import com.kanyideveloper.muviz.model.Movie

data class MoviesResponse(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val searches: List<Movie>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)