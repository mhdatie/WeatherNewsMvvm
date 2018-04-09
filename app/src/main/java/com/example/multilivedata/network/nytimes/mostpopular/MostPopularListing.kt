package com.example.multilivedata.network.nytimes.mostpopular

import com.google.gson.annotations.SerializedName

data class Metadata(
        val url: String,
        val format: String,
        val height: Int,
        val width: Int
)

data class MediaEntity(
        val type: String,
        val caption: String,
        @SerializedName("media-metadata") val metadata: List<Metadata>
)

data class MostPopularEntity(
        val url: String,
        val title: String,
        val media: List<MediaEntity>
)

data class MostPopularListing(
    val results: List<MostPopularEntity>
)