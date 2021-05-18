package com.loguito.selectores

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Toast.makeText(this, "Esto es una prueba", Toast.LENGTH_LONG).show()
        Snackbar.make(textView, "Esto es una prueba", Snackbar.LENGTH_LONG)
            .setAnchorView(textView)
            .show()
    }
}