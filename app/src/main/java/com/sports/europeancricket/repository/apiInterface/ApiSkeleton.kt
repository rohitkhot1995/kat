package com.sports.europeancricket.repository.apiInterface

import com.sports.europeancricket.repository.models.apiModels.listingModel.ListingResponseModel
import com.sports.europeancricket.repository.models.apiModels.newsDetailsModel.NewsDetailsResponse
import com.sports.europeancricket.repository.models.apiModels.photoDetailsModel.PhotoDetailsResponse
import com.sports.europeancricket.repository.models.apiModels.videoDetailsModel.VideoDetailsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiSkeleton {

    @GET
    fun getLatestContentListing(@Url latestContentListingUrl: String): Call<ListingResponseModel>

    @GET
    fun getNewsListing(@Url newsListingUrl: String): Call<ListingResponseModel>

    @GET
    fun getPhotosListing(@Url photoListingUrl: String): Call<ListingResponseModel>

    @GET
    fun getVideosListing(@Url videosListingUrl: String): Call<ListingResponseModel>

    @GET
    fun getNewsDetailsListing(@Url newsDetailsListingUrl: String): Call<NewsDetailsResponse>

    @GET
    fun getPhotoDetailsListing(@Url photoDetailsListingUrl: String): Call<PhotoDetailsResponse>

    @GET
    fun getVideoDetailsListing(@Url videoDetailsListingUrl: String): Call<VideoDetailsResponse>
}