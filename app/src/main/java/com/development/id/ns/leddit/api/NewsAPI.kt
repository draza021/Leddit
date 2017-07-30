package com.development.id.ns.leddit.api

import retrofit2.Call

/**
 * Created by Drago on 7/30/2017.
 */

interface NewsAPI {
    fun getNews(after: String, limit: String): Call<RedditNewsResponse>
}