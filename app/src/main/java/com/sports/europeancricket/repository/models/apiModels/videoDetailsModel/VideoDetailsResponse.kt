package com.sports.europeancricket.repository.models.apiModels.videoDetailsModel

import com.google.gson.annotations.SerializedName

data class VideoDetailsResponse(

    @SerializedName("status")
    val status: Int? = null,

    @field:SerializedName("content")
    val content: VideoDetailsContentModel? = null
)