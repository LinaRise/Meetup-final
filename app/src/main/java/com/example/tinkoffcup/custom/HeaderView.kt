package com.example.tinkoffcup.custom

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView


class HeaderView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : CardView(context, attrs, defStyleAttr) {
    init {
        inflate(context, com.example.tinkoffcup.R.layout.header_sub_view, this)

        val header = findViewById<TextView>(com.example.tinkoffcup.R.id.header)
        val subHeader = findViewById<TextView>(com.example.tinkoffcup.R.id.subHeader)

        val styledAttr: TypedArray = context.theme.obtainStyledAttributes(
            attrs,
            com.example.tinkoffcup.R.styleable.HeaderView, 0, 0
        )
        header.text =
            styledAttr.getText(com.example.tinkoffcup.R.styleable.HeaderView_headerText)
        val subHeaderText =
            styledAttr.getText(com.example.tinkoffcup.R.styleable.HeaderView_subHeaderText)

        if (!subHeaderText.isNullOrEmpty())
            subHeader.text = subHeaderText
        else subHeader.visibility = View.GONE
        subHeader.setTextColor(
            styledAttr.getColor(com.example.tinkoffcup.R.styleable.HeaderView_subHeaderColor, 0)
        )
    }

}