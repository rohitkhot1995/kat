package com.sports.europeancricket.repository.models.apiModels.photoDetailsModel

import com.google.gson.annotations.SerializedName

data class PhotoDetailsResponse(

    @field:SerializedName("status")
    val status: Int? = null,

    @field:SerializedName("ImagesData")
    val imagesData: PhotoDetailsImagesDataModel? = null
)