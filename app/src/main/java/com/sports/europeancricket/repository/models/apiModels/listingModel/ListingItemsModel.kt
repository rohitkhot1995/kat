package com.sports.europeancricket.repository.models.apiModels.listingModel

import com.google.gson.annotations.SerializedName

data class ListingItemsModel(

    @field:SerializedName("asset_id")
    val assetId: Long? = null,

    @field:SerializedName("video_url")
    val videoUrl: String? = null,

    @field:SerializedName("image_path")
    val imagePath: String? = null,

    @field:SerializedName("short_desc")
    val shortDesc: String? = null,

    @field:SerializedName("updated_by")
    val updatedBy: Int? = null,

    @field:SerializedName("asset_title")
    val assetTitle: String? = null,

    @field:SerializedName("title_alias")
    val titleAlias: String? = null,

    @field:SerializedName("total_assets")
    val totalAssets: Int? = null,

    @field:SerializedName("asset_type_id")
    val assetTypeId: Int? = null,

    @field:SerializedName("published_date")
    val publishedDate: String? = null,

    @field:SerializedName("image_file_name")
    val imageFileName: String? = null,

    @field:SerializedName("published_version_number")
    val publishedVersionNumber: Int? = null
)