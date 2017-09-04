package com.mobilemonkeysoftware.recycler.adapter

import android.support.v7.widget.RecyclerView
import io.reactivex.subjects.PublishSubject
import io.reactivex.subjects.Subject

/**
 * Created by AR on 04/09/2017.
 */
abstract class ListAdapter<I : ListItem, VH : ViewHolder<out I>>(val items: MutableList<I>) : RecyclerView.Adapter<VH>() {

    val onItemClickSubject: Subject<I> = PublishSubject.create<I>()
    val onEmptySubject: Subject<Boolean> = PublishSubject.create<Boolean>()

    private val adapterDataObserver = object : RecyclerView.AdapterDataObserver() {
        override fun onChanged() {
            super.onChanged()

            onEmptySubject.onNext(items.isEmpty())
        }
    }

    fun registerAdapterDataObserver() {
        registerAdapterDataObserver(adapterDataObserver)
    }

    fun unregisterAdapterDataObserver() {
        unregisterAdapterDataObserver(adapterDataObserver)
    }

    override fun getItemCount(): Int = items.size

    open fun add(item: I) {

        items.add(item)
        notifyDataSetChanged()
    }

    open fun addAll(items: MutableList<I>) {

        items.addAll(items)
        notifyDataSetChanged()
    }

    open fun removeAll() {

        items.clear()
        notifyDataSetChanged()
    }

    open fun get(index: Int): I {
        return items[index]
    }

}