package com.example.myapplicationclass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun login(view: View) {
        val usuario = findViewById<EditText>(R.id.txtUsuario).text.toString().trim()

        val pass = findViewById<EditText>(R.id.txtContraseña).text.toString()

        if (usuario == "miguel" && pass == "1234") {
            val intent = Intent(this, principal::class.java)
            startActivity(intent)

            val toast = Toast.makeText(applicationContext, "Usuario y Contraseña correctas", Toast.LENGTH_SHORT)
            toast.show()
            val m = Toast.makeText(applicationContext, "Alumno Activo", Toast.LENGTH_LONG)
            m.show()
        } else {
            val toast = Toast.makeText(applicationContext, "Verifique usurio o contraseña", Toast.LENGTH_SHORT)
            toast.show()
        }

    }
}





















