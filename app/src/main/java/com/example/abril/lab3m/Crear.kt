package com.example.abril.lab3m

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast.*

class Crear : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear)
    }

    //boton para regresar a la pantalla principal
    fun home(view: View) {
        val intent = Intent(this, Contactos::class.java)
        startActivity(intent)
    }

    //boton para crear contacto nuevo
    fun nuevo(view: View) {
        val nombre = findViewById<TextView>(R.id.Nombre)
        val telefono = findViewById<TextView>(R.id.Numero)
        val correo = findViewById<TextView>(R.id.Correo)
        val nom = nombre.text.toString()
        val num = telefono.text.toString()
        val cor = correo.text.toString()
        val nuevocont = Contacto(nom, cor, num)
        val context: MyAplication =applicationContext as MyAplication
        context.add(nuevocont)
        val text = "¡Exitoso!"
        val duration = LENGTH_SHORT
        val mensaje = makeText(applicationContext, text, duration)
        mensaje.show()
    }
    }





