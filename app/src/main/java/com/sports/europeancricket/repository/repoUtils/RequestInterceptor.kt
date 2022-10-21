package com.sports.europeancricket.repository.repoUtils

import android.app.Application
import com.sports.europeancricket.ECNApplication
import okhttp3.Interceptor
import okhttp3.Response

class RequestInterceptor(private val app: Application) : Interceptor {

    /** Check Network connect check here only */
    @Throws(NoInternetAvailableException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        if (!(app as ECNApplication).isInternetAvailable()) {
            throw NoInternetAvailableException()
        }
        val response = chain.proceed(chain.request())
        return response
    }


}