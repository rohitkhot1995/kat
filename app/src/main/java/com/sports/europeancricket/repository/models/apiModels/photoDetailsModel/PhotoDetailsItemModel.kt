package com.sports.europeancricket.repository.models.apiModels.photoDetailsModel

import com.google.gson.annotations.SerializedName

data class PhotoDetailsItemModel(

    @SerializedName("image_id")
    val imageId: String? = null,

    @SerializedName("image_desc")
    val imageDescription: String? = null,

    @SerializedName("image_path")
    val imagePath: String? = null,

    @SerializedName("image_file_name")
    val imageFileName: String? = null
)