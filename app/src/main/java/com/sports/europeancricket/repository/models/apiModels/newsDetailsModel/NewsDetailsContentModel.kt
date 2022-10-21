package com.sports.europeancricket.repository.models.apiModels.newsDetailsModel

import com.google.gson.annotations.SerializedName

data class NewsDetailsContentModel(

    @SerializedName("data")
    val newsData: NewsDetailsDataModel? = null
)