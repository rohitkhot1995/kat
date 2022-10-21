package com.sports.europeancricket.ui.base

import android.view.View
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<T>(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var itemClickCallback: ItemClickedCallbackWithData<T>? = null
    var itemClickCallbackWithPosition: ItemClickedCallbackWithPosition? = null
    var itemClickCallbackWithPosAndData: ItemClickedCallbackWithPositionAndData<T>? = null

    abstract fun loadData(receivedData: T)

    interface ItemClickedCallbackWithData<T> {
        fun onItemClicked(data: T)
    }

    interface ItemClickedCallbackWithPosition {
        fun onItemClickedWithPosition(position: Int)
    }

    interface ItemClickedCallbackWithPositionAndData<T> {
        fun onItemClickedWithPositionAndData(position: Int, data: T)
    }
}