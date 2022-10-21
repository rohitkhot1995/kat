package com.sports.europeancricket.repository

interface DataManagerSkeleton {

    fun getBottomMenuValues(): String
    fun getMoreMenuValues(): String
    fun getAndroidLiveAppVersionValue(): String
    fun getUpdateDialogTypeValue(): String
    fun getUpdateDialogTitleValue(): String
    fun getUpdateDialogSubTitleValue(): String
    fun getUpdateDialogYesOptionValue(): String
    fun getUpdateDialogNoOptionValue(): String
    fun getAndroidPlayStoreUrlValue(): String
    fun getHomeScreenFixturesValue(): String
    fun getRefreshIntervalValue():String
    fun getLiveFixturesValue(): String
    fun getLatestContentListingValue(): String
    fun getNewsListValue(): String
    fun getPhotosListValue(): String
    fun getVideosListValue(): String
    fun getTeamLogoValue(): String
    fun getThumbnailImagePathValue(): String
    fun getThumbnailImagePathFourByThreeRatioValue(): String
    fun getContentPageCountValue(): String
    fun getVideoDetailValue(): String
    fun getPhotosDetailValue(): String
    fun getNewsDetailValue(): String
    fun getVideoSharingUrlValue(): String
    fun getPhotosSharingUrlValue(): String
    fun getNewsSharingUrlValue(): String
    fun getYouTubeDeveloperKeyValue(): String
    fun getNewsShareTitleTextValue(): String
    fun getPhotosShareTitleTextValue(): String
    fun getVideosShareTitleTextValue(): String
    fun getAdBannerVisibilityValue(): String
    fun getAdBannerImageUrlValue(): String
}