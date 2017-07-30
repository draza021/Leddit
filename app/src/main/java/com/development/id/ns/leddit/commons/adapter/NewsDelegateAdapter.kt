package com.development.id.ns.leddit.commons.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.development.id.ns.leddit.R
import com.development.id.ns.leddit.commons.RedditNewsItem
import com.development.id.ns.leddit.commons.extensions.getFriendlyTime
import com.development.id.ns.leddit.commons.extensions.inflate
import com.development.id.ns.leddit.commons.extensions.loadImg
import kotlinx.android.synthetic.main.news_item.view.*

/**
 * Created by Drago on 7/30/2017.
 */

class NewsDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return TurnsViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as TurnsViewHolder
        holder.bind(item as RedditNewsItem)
    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item)) {

        fun bind(item: RedditNewsItem) = with(itemView) {
            //Picasso.with(itemView.context).load(item.thumbnail).into(img_thumbnail)
            img_thumbnail.loadImg(item.thumbnail)
            description.text = item.title
            author.text = item.author
            comments.text = "${item.numComments} comments"
            time.text = item.created.getFriendlyTime()
        }
    }
}