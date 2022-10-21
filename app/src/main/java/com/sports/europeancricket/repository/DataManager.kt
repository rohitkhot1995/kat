package com.sports.europeancricket.repository

import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.sports.europeancricket.repository.apiInterface.ApiSkeleton
import javax.inject.Inject

class DataManager @Inject constructor(
    private val apiSkeleton: ApiSkeleton,
    private val firebaseRemoteConfig: FirebaseRemoteConfig
) : DataManagerSkeleton {

    override fun getBottomMenuValues(): String {
        return firebaseRemoteConfig.getString("bottom_menu")
    }

    override fun getMoreMenuValues(): String {
        return firebaseRemoteConfig.getString("more_menu")
    }

    override fun getAndroidLiveAppVersionValue(): String {
        return firebaseRemoteConfig.getString("android_live_app_version")
    }

    override fun getUpdateDialogTypeValue(): String {
        return firebaseRemoteConfig.getString("update_popup_type")
    }

    override fun getUpdateDialogTitleValue(): String {
        return firebaseRemoteConfig.getString("update_popup_title")
    }

    override fun getUpdateDialogSubTitleValue(): String {
        return firebaseRemoteConfig.getString("update_popup_text")
    }

    override fun getUpdateDialogYesOptionValue(): String {
        return firebaseRemoteConfig.getString("update_popup_yes")
    }

    override fun getUpdateDialogNoOptionValue(): String {
        return firebaseRemoteConfig.getString("update_popup_no")
    }

    override fun getAndroidPlayStoreUrlValue(): String {
        return firebaseRemoteConfig.getString("android_play_store_url")
    }

    override fun getHomeScreenFixturesValue(): String {
        return firebaseRemoteConfig.getString("bottom_menu")
    }

    override fun getRefreshIntervalValue(): String {
        return firebaseRemoteConfig.getString("bottom_menu")
    }

    override fun getLiveFixturesValue(): String {
        return firebaseRemoteConfig.getString("bottom_menu")
    }

    override fun getLatestContentListingValue(): String {
        return firebaseRemoteConfig.getString("latest_content_listing")
    }

    override fun getNewsListValue(): String {
        return firebaseRemoteConfig.getString("news_listing")
    }

    override fun getPhotosListValue(): String {
        return firebaseRemoteConfig.getString("photos_listing")
    }

    override fun getVideosListValue(): String {
        return firebaseRemoteConfig.getString("videos_listing")
    }

    override fun getTeamLogoValue(): String {
        return firebaseRemoteConfig.getString("bottom_menu")
    }

    override fun getThumbnailImagePathValue(): String {
        return firebaseRemoteConfig.getString("thumbnail_image_path")
    }

    override fun getThumbnailImagePathFourByThreeRatioValue(): String {
        return firebaseRemoteConfig.getString("thumbnail_image_four_by_three")
    }

    override fun getContentPageCountValue(): String {
        return firebaseRemoteConfig.getString("content_page_count")
    }

    override fun getVideoDetailValue(): String {
        return firebaseRemoteConfig.getString("videos_detail")
    }

    override fun getPhotosDetailValue(): String {
        return firebaseRemoteConfig.getString("photos_detail")
    }

    override fun getNewsDetailValue(): String {
        return firebaseRemoteConfig.getString("news_detail")
    }

    override fun getVideoSharingUrlValue(): String {
        return firebaseRemoteConfig.getString("videos_sharing_url")
    }

    override fun getPhotosSharingUrlValue(): String {
        return firebaseRemoteConfig.getString("photos_sharing_url")
    }

    override fun getNewsSharingUrlValue(): String {
        return firebaseRemoteConfig.getString("news_sharing_url")
    }

    override fun getYouTubeDeveloperKeyValue(): String {
        return firebaseRemoteConfig.getString("bottom_menu")
    }

    override fun getNewsShareTitleTextValue(): String {
        return firebaseRemoteConfig.getString("bottom_menu")
    }

    override fun getPhotosShareTitleTextValue(): String {
        return firebaseRemoteConfig.getString("bottom_menu")
    }

    override fun getVideosShareTitleTextValue(): String {
        return firebaseRemoteConfig.getString("bottom_menu")
    }

    override fun getAdBannerVisibilityValue(): String {
        return firebaseRemoteConfig.getString("bottom_menu")
    }

    override fun getAdBannerImageUrlValue(): String {
        return firebaseRemoteConfig.getString("bottom_menu")
    }
}