package com.sports.europeancricket.utils

import android.content.Context
import android.graphics.Color
import android.os.Build
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.google.android.material.snackbar.Snackbar


fun showSnackBar(view: View, message: String) {
    Snackbar.make(view, message, Snackbar.LENGTH_SHORT).show()
}

fun showToastMessage(context: Context, message: String) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}

fun logDebug(logTag: String, logValue: String) {
    Log.d(logTag, logValue)
}

fun SpannableString.boldPartOfString(startIndex: Int, endIndex: Int, textView: TextView) {
    this.setSpan(
        ForegroundColorSpan(Color.WHITE),
        startIndex, endIndex,
        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
    )
    textView.text = this
}

fun ImageView.loadMedia(url: String) {
    val options = RequestOptions()
        .fitCenter()
    //   .placeholder(R.drawable.placeholder)
    //   .error(R.drawable.placeholder)
    Glide.with(this.context).load(url).apply(options).into(this)
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        this.clipToOutline = true
    }
}