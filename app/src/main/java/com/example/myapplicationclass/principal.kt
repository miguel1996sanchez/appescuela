package com.example.myapplicationclass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.util.Calendar
import java.util.TimeZone
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class principal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
        val formato = SimpleDateFormat("d MMM YYYY")
        val d = formato.format(Calendar.getInstance().time)
        val fecha = findViewById<TextView>(R.id.fechaHora).apply { text=d.toString() }



    }
    fun iraDatospersonales(view: View) {
        val intent = Intent(this@principal, datospersonales::class.java)
        startActivity(intent)
    }
    fun iraInformaciondelainstitucion(view: View) {
        val intent = Intent(this@principal, informaciondelainstitucion::class.java)
        startActivity(intent)
    }
    fun iraAsignaturasencurso(view: View) {
        val intent = Intent(this@principal, asignaturasencurso::class.java)
        startActivity(intent)
    }













}