package com.sports.europeancricket.repository.models.apiModels.listingModel

import com.google.gson.annotations.SerializedName

data class ListingResponseModel(

    @SerializedName("status")
    val status: Int? = null,

    @field:SerializedName("content")
    val content: ListingContentModel? = null,

    @field:SerializedName("ImagesData")
    val imagesData: Any? = null,

    @field:SerializedName("message")
    val message: Any? = null
)