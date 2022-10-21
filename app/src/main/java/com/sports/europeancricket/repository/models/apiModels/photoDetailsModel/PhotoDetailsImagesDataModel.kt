package com.sports.europeancricket.repository.models.apiModels.photoDetailsModel

import com.google.gson.annotations.SerializedName

data class PhotoDetailsImagesDataModel(

    @SerializedName("items")
    val items: ArrayList<PhotoDetailsItemModel>? = null
)