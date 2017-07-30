package com.development.id.ns.leddit.features.news

import com.development.id.ns.leddit.api.RestAPI
import com.development.id.ns.leddit.commons.RedditNewsItem
import rx.Observable

/**
 * Created by Drago on 7/30/2017.
 */

/**
 * News Manager allows you to request more news from Reddit.
 *
 */
class NewsManager(private val api: RestAPI = RestAPI()) {

    fun getNews(limit: String = "10"): Observable<List<RedditNewsItem>> {
        return Observable.create {
            subscriber ->
            val callResponse = api.getNews("", limit)
            val response = callResponse.execute()

            if (response.isSuccessful) {
                val news = response.body().data.children.map {
                    val item = it.data
                    RedditNewsItem(item.author, item.title, item.num_comments,
                            item.created, item.thumbnail, item.url)
                }
                subscriber.onNext(news)
                subscriber.onCompleted()
            } else {
                subscriber.onError(Throwable(response.message()))
            }
        }
    }
}