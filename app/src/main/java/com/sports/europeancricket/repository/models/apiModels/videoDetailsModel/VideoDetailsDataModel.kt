package com.sports.europeancricket.repository.models.apiModels.videoDetailsModel

import com.google.gson.annotations.SerializedName

data class VideoDetailsDataModel(

    @SerializedName("video_id")
    val videoId: String? = null,

    @SerializedName("video_url")
    val videoUrl: String? = null,

    @SerializedName("content_source_id")
    val contentSourceId: Int? = null
)