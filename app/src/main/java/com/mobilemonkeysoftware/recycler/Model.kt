package com.mobilemonkeysoftware.recycler

import com.mobilemonkeysoftware.recycler.adapter.ListItem
import java.io.Serializable

/**
 * Created by AR on 04/09/2017.
 */

const val VIEW_TYPE_00 = 0
const val VIEW_TYPE_01 = 1
const val VIEW_TYPE_02 = 2
const val VIEW_TYPE_03 = 3
const val VIEW_TYPE_04 = 4
const val VIEW_TYPE_05 = 5
const val VIEW_TYPE_06 = 6
const val VIEW_TYPE_07 = 7
const val VIEW_TYPE_08 = 8
const val VIEW_TYPE_09 = 9
const val VIEW_TYPE_10 = 10

data class Data00(val text0: String) : Serializable
data class Item00(override val value: Data00, override val viewType: Int = VIEW_TYPE_00) : ListItem

data class Data01(val text0: String, val text1: String, val check: Boolean) : Serializable
data class Item01(override val value: Data01, override val viewType: Int = VIEW_TYPE_01) : ListItem

data class Data02(val text0: String, val check: Boolean, val action: String) : Serializable
data class Item02(override val value: Data02, override val viewType: Int = VIEW_TYPE_02) : ListItem

data class Data03(val text0: String, val check: Boolean, val action: String, val progress: Boolean) : Serializable
data class Item03(override val value: Data03, override val viewType: Int = VIEW_TYPE_03) : ListItem

data class Data04(val text0: String, val link0: String) : Serializable
data class Item04(override val value: Data04, override val viewType: Int = VIEW_TYPE_04) : ListItem

data class Data05(val text0: String, val link0: String, val link1: String) : Serializable
data class Item05(override val value: Data05, override val viewType: Int = VIEW_TYPE_05) : ListItem

data class Data06(val text0: String, val link0: String, val link1: String, val link2: String, val link3: String) : Serializable
data class Item06(override val value: Data06, override val viewType: Int = VIEW_TYPE_06) : ListItem

data class Data07(val text0: String, val text1: String) : Serializable
data class Item07(override val value: Data07, override val viewType: Int = VIEW_TYPE_07) : ListItem

data class Data08(val text0: String, val text1: String, val link0: String) : Serializable
data class Item08(override val value: Data08, override val viewType: Int = VIEW_TYPE_08) : ListItem

data class Data09(val text0: String, val link0: String, val link1: String) : Serializable
data class Item09(override val value: Data09, override val viewType: Int = VIEW_TYPE_09) : ListItem

data class Data10(val text0: String, val check: Boolean) : Serializable
data class Item10(override val value: Data10, override val viewType: Int = VIEW_TYPE_10) : ListItem
