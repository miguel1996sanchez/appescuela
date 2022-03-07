package com.example.myapplicationclass

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class informaciondelainstitucion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informaciondelainstitucion)
    }

    fun llamada (view: View){
      val call = Intent(Intent.ACTION_CALL, Uri.parse("tel:2313114000"))
        startActivity(call)
    }

    fun iraAvisos(view: View) {
        val intent = Intent(this@informaciondelainstitucion, avisos::class.java)
        startActivity(intent)
    }
    fun iraDetallesdelaapp(view: View) {
        val intent = Intent(this@informaciondelainstitucion, detalles::class.java)
        startActivity(intent)
    }

    fun irCompartir(view: View){
        val sendIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, "This is my text to send.")
            type = "text/plain"
        }
        val shareIntent = Intent.createChooser(sendIntent, null)
        startActivity(shareIntent)
    }



}