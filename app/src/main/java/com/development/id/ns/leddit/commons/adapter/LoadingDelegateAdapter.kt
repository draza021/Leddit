package com.development.id.ns.leddit.commons.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.development.id.ns.leddit.R
import com.development.id.ns.leddit.commons.extensions.inflate

/**
 * Created by Drago on 7/30/2017.
 */

class LoadingDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup) = TurnsViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item_loading)) {
    }
}