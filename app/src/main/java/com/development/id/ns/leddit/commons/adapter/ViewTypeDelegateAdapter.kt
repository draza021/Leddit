package com.development.id.ns.leddit.commons.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

/**
 * Created by Drago on 7/30/2017.
 */

interface ViewTypeDelegateAdapter {

    fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder

    fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType)
}