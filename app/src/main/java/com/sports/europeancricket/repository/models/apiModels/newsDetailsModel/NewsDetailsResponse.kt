package com.sports.europeancricket.repository.models.apiModels.newsDetailsModel

import com.google.gson.annotations.SerializedName

data class NewsDetailsResponse(

    @SerializedName("status")
    val status: Int? = null,

    @SerializedName("content")
    val content: NewsDetailsContentModel? = null
)