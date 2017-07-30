package com.development.id.ns.leddit.features.news

/**
 * Created by Drago on 7/29/2017.
 */

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.development.id.ns.leddit.R
import com.development.id.ns.leddit.commons.RedditNewsItem
import com.development.id.ns.leddit.commons.adapter.NewsAdapter
import com.development.id.ns.leddit.commons.extensions.inflate
import kotlinx.android.synthetic.main.news_fragment.*


class NewsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //val view = inflater.inflate(R.layout.news_fragment, container, false)
        return container?.inflate(R.layout.news_fragment)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        news_list.setHasFixedSize(true)
        news_list.layoutManager = LinearLayoutManager(context)
        initAdapter()

        if (savedInstanceState == null) {
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
            (news_list.adapter as NewsAdapter).addNews(news)
        }
    }

    private fun initAdapter() {
        if (news_list.adapter == null) {
            news_list.adapter = NewsAdapter()
        }
    }
}
