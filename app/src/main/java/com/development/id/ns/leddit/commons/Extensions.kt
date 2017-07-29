@file:JvmName("ExtensionsUtils")

package com.development.id.ns.leddit.commons

/**
 * Created by Drago on 7/29/2017.
 */
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}