package com.sports.europeancricket.repository.repoUtils

import com.sports.europeancricket.utils.NO_INTERNET_CONNECTION_MESSAGE

/** This Exception class is made for handling the network call interceptor in "No Internet" condition */
class NoInternetAvailableException : Exception() {

    override val message: String?
        get() = NO_INTERNET_CONNECTION_MESSAGE
}