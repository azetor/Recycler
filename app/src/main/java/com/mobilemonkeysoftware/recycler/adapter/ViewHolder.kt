package com.mobilemonkeysoftware.recycler.adapter

import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by AR on 04/09/2017.
 */
open class ViewHolder<I : ListItem>(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var item: I? = null

    open fun bindItem(item: I) {
        this.item = item
    }

}
