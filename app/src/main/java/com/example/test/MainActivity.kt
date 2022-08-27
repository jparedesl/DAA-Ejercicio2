package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun convertCurrency(view: View) {

        val dolar: EditText =findViewById(R.id.textdolar)
        var peso: TextView =findViewById(R.id.textpeso)

        if (dolar.text.isNotEmpty()) {
            val dollarValue = dolar.text.toString().toFloat()

            val pesoValue = dollarValue * 880


            val dec = DecimalFormat("#,###.00")
            dec.format(pesoValue)

            peso.setText(dec.format(pesoValue))

            //           peso.setText(dec.toString())

            //        peso.setText(pesoValue.toString())
        } else {
            peso.setText(getString(R.string.no_value_string))
        }
    }
}