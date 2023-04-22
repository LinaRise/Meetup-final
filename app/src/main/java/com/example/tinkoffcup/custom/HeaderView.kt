package com.example.tinkoffcup.custom

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.widget.LinearLayout
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
        subHeader.text =
            styledAttr.getText(com.example.tinkoffcup.R.styleable.HeaderView_subHeaderText)
        header.setTextColor(
            styledAttr.getColor(com.example.tinkoffcup.R.styleable.HeaderView_headerColor, 0)
        )
        subHeader.setTextColor(
            styledAttr.getColor(com.example.tinkoffcup.R.styleable.HeaderView_subHeaderColor, 0))
    }

    /*  private lateinit var _headerTextView: TextView
      private lateinit var _subHeaderTextView: TextView
      private lateinit var _iconBackground: View
      private lateinit var _icon: View

      init {
          this.orientation = VERTICAL
          if (!::_headerTextView.isInitialized) {
              initHeaderTextView()
          }
          if (!::_subHeaderTextView.isInitialized) {
              initSubHeaderTextView()
          }
      }

      private fun initHeaderTextView() {
          _headerTextView = TextView(context, null, 0, R.style.headertext)
          _headerTextView
          _headerTextView.apply {
              updateMargin(top = 16.pxToDp(resources), left = 20.pxToDp(resources))
          }

          addView(_headerTextView, 0)
      }

      fun setHeaderText(text: String) {
          _headerTextView.text = text
          if (text != "") {
              _headerTextView.visibility = VISIBLE
              _headerTextView.text = text
          } else {
              _headerTextView.visibility = GONE
          }

      }

      fun setSubHeaderText(text: String) {
          _subHeaderTextView = TextView(context, null, 0, R.style.subheadertext)
          if (text != "") {
              _subHeaderTextView.visibility = VISIBLE
              _subHeaderTextView.text = text
          } else {
              _subHeaderTextView.visibility = GONE
          }
      }

      private fun initSubHeaderTextView() {
          _subHeaderTextView = TextView(context)
          _subHeaderTextView
          _subHeaderTextView.apply {
              updateMargin(top = 16.pxToDp(resources), left = 20.pxToDp(resources))
          }
          addView(_subHeaderTextView, 0)
      }
  */
}