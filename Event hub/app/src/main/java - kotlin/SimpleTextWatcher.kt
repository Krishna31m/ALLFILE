package com.example.events

import android.text.Editable
import android.text.TextWatcher

class SimpleTextWatcher(val afterChanged: () -> Unit) : TextWatcher {
    override fun afterTextChanged(s: Editable?) = afterChanged()
    override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
    override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
}
