package com.mobilemonkeysoftware.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.mobilemonkeysoftware.recycler.adapter.ListAdapter
import com.mobilemonkeysoftware.recycler.adapter.ListItem
import com.mobilemonkeysoftware.recycler.adapter.ViewHolder
import kotlinx.android.synthetic.main.adapter_data00_list_item.view.*
import kotlinx.android.synthetic.main.adapter_data01_list_item.view.*
import kotlinx.android.synthetic.main.adapter_data02_list_item.view.*
import kotlinx.android.synthetic.main.adapter_data03_list_item.view.*
import kotlinx.android.synthetic.main.adapter_data04_list_item.view.*
import kotlinx.android.synthetic.main.adapter_data05_list_item.view.*
import kotlinx.android.synthetic.main.adapter_data06_list_item.view.*
import kotlinx.android.synthetic.main.adapter_data07_list_item.view.*
import kotlinx.android.synthetic.main.adapter_data08_list_item.view.*
import kotlinx.android.synthetic.main.adapter_data09_list_item.view.*
import kotlinx.android.synthetic.main.adapter_data10_list_item.view.*

/**
 * Created by AR on 04/09/2017.
 */
class MainAdapter(items: MutableList<ListItem>) : ListAdapter<ListItem, MainAdapter.ListViewHolder>(items) {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ListViewHolder {
        return when (viewType) {
            VIEW_TYPE_00 -> ListViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.adapter_data00_list_item, parent, false))
            VIEW_TYPE_01 -> ListViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.adapter_data01_list_item, parent, false))
            VIEW_TYPE_02 -> ListViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.adapter_data02_list_item, parent, false))
            VIEW_TYPE_03 -> ListViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.adapter_data03_list_item, parent, false))
            VIEW_TYPE_04 -> ListViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.adapter_data04_list_item, parent, false))
            VIEW_TYPE_05 -> ListViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.adapter_data05_list_item, parent, false))
            VIEW_TYPE_06 -> ListViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.adapter_data06_list_item, parent, false))
            VIEW_TYPE_07 -> ListViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.adapter_data07_list_item, parent, false))
            VIEW_TYPE_08 -> ListViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.adapter_data08_list_item, parent, false))
            VIEW_TYPE_09 -> ListViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.adapter_data09_list_item, parent, false))
            VIEW_TYPE_10 -> ListViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.adapter_data10_list_item, parent, false))
            else -> ListViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.adapter_data10_list_item, parent, false))
        }
    }

    override fun onBindViewHolder(holder: ListViewHolder?, position: Int) {
        holder?.bindItem(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun getItemViewType(position: Int): Int {
        return items[position].viewType
    }

    class ListViewHolder(itemView: View) : ViewHolder<ListItem>(itemView) {

        override fun bindItem(item: ListItem) {
            super.bindItem(item)

            itemView.tag = item

            with(itemView) {
                when (item.viewType) {
                    VIEW_TYPE_00 -> {
                        itemView.item00.text000.text = (item.value as Data00).text0
                    }
                    VIEW_TYPE_01 -> {
                        itemView.item01.text010.text = (item.value as Data01).text0
                        itemView.item01.text011.text = (item.value as Data01).text1
                        itemView.item01.check010.isChecked = (item.value as Data01).check
                    }
                    VIEW_TYPE_02 -> {
                        itemView.item02.text020.text = (item.value as Data02).text0
                        itemView.item02.check020.isChecked = (item.value as Data02).check
                        itemView.item02.action020.text = (item.value as Data02).action
                    }
                    VIEW_TYPE_03 -> {
                        itemView.item03.text030.text = (item.value as Data03).text0
                        itemView.item03.check030.isChecked = (item.value as Data03).check
                        itemView.item03.action030.text = (item.value as Data03).action
                        itemView.item03.progress030.isIndeterminate = (item.value as Data03).progress
                    }
                    VIEW_TYPE_04 -> {
                        itemView.item04.text040.text = (item.value as Data04).text0
                        Glide.with(itemView).load((item.value as Data04).link0).into(itemView.item04.image040)
                    }
                    VIEW_TYPE_05 -> {
                        itemView.item05.text050.text = (item.value as Data05).text0
                        Glide.with(itemView).load((item.value as Data05).link0).into(itemView.item05.image050)
                        Glide.with(itemView).load((item.value as Data05).link1).into(itemView.item05.image051)
                    }
                    VIEW_TYPE_06-> {
                        itemView.item06.text060.text = (item.value as Data06).text0
                        Glide.with(itemView).load((item.value as Data06).link0).into(itemView.item06.image060)
                        Glide.with(itemView).load((item.value as Data06).link1).into(itemView.item06.image061)
                        Glide.with(itemView).load((item.value as Data06).link2).into(itemView.item06.image062)
                        Glide.with(itemView).load((item.value as Data06).link3).into(itemView.item06.image063)
                    }
                    VIEW_TYPE_07 -> {
                        itemView.item07.text070.text = (item.value as Data07).text0
                        itemView.item07.text071.text = (item.value as Data07).text1
                    }
                    VIEW_TYPE_08 -> {
                        itemView.item08.text080.text = (item.value as Data08).text0
                        itemView.item08.text081.text = (item.value as Data08).text1
                        Glide.with(itemView).load((item.value as Data08).link0).into(itemView.item08.image080)
                    }
                    VIEW_TYPE_09 -> {
                        itemView.item09.text090.text = (item.value as Data09).text0
                        Glide.with(itemView).load((item.value as Data09).link0).into(itemView.item09.image090)
                        Glide.with(itemView).load((item.value as Data09).link1).into(itemView.item09.image091)
                    }
                    VIEW_TYPE_10 -> {
                        itemView.item10.text100.text = (item.value as Data10).text0
                        itemView.item10.check100.isChecked = (item.value as Data10).check
                    }
                    else -> {
                    }
                }
            }
        }
    }
}