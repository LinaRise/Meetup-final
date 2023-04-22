package com.example.tinkoffcup.custom

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.Gravity
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.view.children


class ButtonView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {


    init {
        orientation = VERTICAL
        val params = LayoutParams(
            LayoutParams.MATCH_PARENT,
            LayoutParams.WRAP_CONTENT
        )
        this.layoutParams = params
        inflate(context, com.example.tinkoffcup.R.layout.buttonview, this)

        val label = findViewById<TextView>(com.example.tinkoffcup.R.id.label)
        val styledAttr: TypedArray = context.theme.obtainStyledAttributes(
            attrs,
            com.example.tinkoffcup.R.styleable.IndicatorButton, 0, 0
        )
        label.text =
            styledAttr.getText(com.example.tinkoffcup.R.styleable.IndicatorButton_android_text)

        label.setTextColor(
            styledAttr.getColor(
                com.example.tinkoffcup.R.styleable.IndicatorButton_android_textColor,
                0
            )
        )
        label.textAlignment =
            styledAttr.getInt(
                com.example.tinkoffcup.R.styleable.IndicatorButton_android_textAlignment,
                0
            )

        this.gravity =
            styledAttr.getInt(
                com.example.tinkoffcup.R.styleable.IndicatorButton_gravity,
                Gravity.CENTER
            )

        background = AppCompatResources.getDrawable(
            this.context,
            com.example.tinkoffcup.R.drawable.background_selector
        )


        isClickable = true
        isFocusable = true
        styledAttr.recycle();
    }

    fun setText(text: String) {

    }

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        children.forEach { it.isEnabled = enabled }
    }
}