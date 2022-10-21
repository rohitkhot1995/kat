package com.sports.europeancricket.repository.models.apiModels.videoDetailsModel

import com.google.gson.annotations.SerializedName

data class VideoDetailsContentModel(

    @SerializedName("data")
    val videoData: VideoDetailsDataModel? = null
)