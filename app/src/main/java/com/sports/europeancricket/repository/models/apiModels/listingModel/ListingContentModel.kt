package com.sports.europeancricket.repository.models.apiModels.listingModel

import com.google.gson.annotations.SerializedName

data class ListingContentModel(

    @field:SerializedName("items")
    val items: ArrayList<ListingItemsModel>? = null
)