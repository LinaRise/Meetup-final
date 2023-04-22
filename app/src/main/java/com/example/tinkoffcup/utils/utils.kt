package com.example.tinkoffcup.utils

import android.content.res.Resources
import android.util.DisplayMetrics
import android.view.View
import android.widget.LinearLayout

fun View.updatePadding(
    left: Int = paddingLeft,
    top: Int = paddingTop,
    right: Int = paddingRight,
    bottom: Int = paddingBottom
) {
    setPadding(left, top, right, bottom)
}

fun View.updateMargin(
    left: Int = paddingLeft,
    top: Int = paddingTop,
    right: Int = paddingRight,
    bottom: Int = paddingBottom
) {
    val params = LinearLayout.LayoutParams(
        LinearLayout.LayoutParams.WRAP_CONTENT,
        LinearLayout.LayoutParams.WRAP_CONTENT
    )
    params.setMargins(left, top, right, bottom);
    layoutParams = params
}

fun Int.dpToPx(res: Resources): Int =
    (this.toFloat() * (res.displayMetrics.densityDpi.toFloat() / DisplayMetrics.DENSITY_DEFAULT)).toInt()

fun Float.dpToPx(res: Resources): Int =
    (this.toFloat() * (res.displayMetrics.densityDpi.toFloat() / DisplayMetrics.DENSITY_DEFAULT)).toInt()

fun Int.pxToDp(res: Resources): Int =
    (this.toFloat() / (res.displayMetrics.densityDpi.toFloat() / DisplayMetrics.DENSITY_DEFAULT)).toInt()

fun Float.pxToDp(res: Resources): Int =
    (this / (res.displayMetrics.densityDpi.toFloat() / DisplayMetrics.DENSITY_DEFAULT)).toInt()