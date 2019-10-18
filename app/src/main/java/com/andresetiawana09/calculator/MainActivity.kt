package com.andresetiawana09.calculator

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.math.BigDecimal


class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        val viewModel = MainViewModel()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_number_0.setOnClickListener {
            tv_main_number.append("0")
        }
        tv_number_1.setOnClickListener {
            tv_main_number.append("1")
        }
        tv_number_2.setOnClickListener {
            tv_main_number.append("2")
        }
        tv_number_3.setOnClickListener {
            tv_main_number.append("3")
        }
        tv_number_4.setOnClickListener {
            tv_main_number.append("4")
        }
        tv_number_5.setOnClickListener {
            tv_main_number.append("5")
        }
        tv_number_6.setOnClickListener {
            tv_main_number.append("6")
        }
        tv_number_7.setOnClickListener {
            tv_main_number.append("7")
        }
        tv_number_8.setOnClickListener {
            tv_main_number.append("8")
        }
        tv_number_9.setOnClickListener {
            tv_main_number.append("9")
        }
        tv_number_divide.setOnClickListener {
            tv_main_number.append("/")
        }
        tv_number_plus.setOnClickListener {
            tv_main_number.append("+")
        }
        tv_number_minus.setOnClickListener {
            tv_main_number.append("-")
        }
        tv_number_multiple.setOnClickListener {
            tv_main_number.append("*")
        }
        tv_number_equals.setOnClickListener {
            if (viewModel.getLastLine(tv_main_number).isNotBlank()) {
                tv_main_number.text = "${tv_main_number.text}\n\n${BigDecimal(
                    viewModel.calculate(
                        viewModel.getLastLine(
                            tv_main_number
                        )
                    )
                )}"
            } else {
                tv_main_number.text = "${tv_main_number.text}\n\n${BigDecimal(viewModel.calculate(tv_main_number.text.toString()))}"

            }
        }
        tv_number_delete.setOnClickListener { tv_main_number.text = "" }
    }
}
