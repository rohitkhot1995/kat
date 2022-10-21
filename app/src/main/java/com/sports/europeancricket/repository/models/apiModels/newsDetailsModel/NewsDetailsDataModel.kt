package com.sports.europeancricket.repository.models.apiModels.newsDetailsModel

import com.google.gson.annotations.SerializedName

data class NewsDetailsDataModel(

    @SerializedName("title")
    val newsTitle: String? = null,

    @SerializedName("full_text")
    val newsBodyFullText: String? = null,

    @SerializedName("image_path")
    val imagePath: String? = null,

    @SerializedName("image_file_name")
    val imageFileName: String? = null,

    @SerializedName("published_date")
    val newsDateTimeStamp: String? = null
)