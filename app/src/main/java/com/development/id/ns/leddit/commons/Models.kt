package com.development.id.ns.leddit.commons

import com.development.id.ns.leddit.commons.adapter.AdapterConstants
import com.development.id.ns.leddit.commons.adapter.ViewType

/**
 * Created by Drago on 7/30/2017.
 */

data class RedditNews(
        val after: String,
        val before: String,
        val news: List<RedditNewsItem>)

data class RedditNewsItem(
        val author: String,
        val title: String,
        val numComments: Int,
        val created: Long,
        val thumbnail: String,
        val url: String
) : ViewType {
    override fun getViewType() = AdapterConstants.NEWS
}