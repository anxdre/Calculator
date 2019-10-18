package com.andresetiawana09.calculator

import android.widget.TextView
import androidx.lifecycle.ViewModel
import org.mariuszgromada.math.mxparser.Expression


class MainViewModel : ViewModel() {
    fun calculate(mMath: String): Double = Expression(mMath).calculate()

    fun getLastLine(display: TextView): String {
        val lines =
            display.text.toString().split("\\r?\\n".toRegex()).dropLastWhile { it.isEmpty() }
                .toTypedArray()
        return lines[lines.size - 1]
    }
}