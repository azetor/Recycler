package com.mobilemonkeysoftware.recycler.adapter

import java.io.Serializable

/**
 * Created by AR on 04/09/2017.
 */
interface ListItem : Serializable {

    val value: Serializable

    val viewType: Int
}