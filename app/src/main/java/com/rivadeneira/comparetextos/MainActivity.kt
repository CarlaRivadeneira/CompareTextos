package com.rivadeneira.comparetextos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider // Añade esta línea
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        compar1eButton.setOnClickListener {
            val text1 = editText1.text.toString()
            val text2 = editText2.text.toString()
            val result = viewModel.compareTexts(text1, text2)
            resultTextView.text = result
        }
    }
}


class MainViewModel : ViewModel() {
    fun compareTexts(text1: String, text2: String): String {
        return if (text1 == text2) "Ambos textos son iguales" else "Los textos son diferentes"
    }
}
