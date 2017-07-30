package com.development.id.ns.leddit.features.news

import com.development.id.ns.leddit.commons.RedditNewsItem
import rx.Observable

/**
 * Created by Drago on 7/30/2017.
 */

/**
 * News Manager allows you to request more news from Reddit.
 *
 * @author juancho
 */
class NewsManager() {

    fun getNews(): Observable<List<RedditNewsItem>> {
        return Observable.create {
            subscriber ->

            val news = mutableListOf<RedditNewsItem>()
            for (i in 1..10) {
                news.add(RedditNewsItem(
                        "author$i",
                        "Title $i",
                        i, // number of comments
                        1457207701L - i * 200, // time
                        "http://lorempixel.com/200/200/technics/$i", // image url
                        "url"
                ))
            }
            subscriber.onNext(news)
        }
    }
}