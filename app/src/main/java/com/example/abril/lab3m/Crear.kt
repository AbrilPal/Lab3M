package com.example.abril.lab3m

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.*
import java.util.ArrayList

class Crear : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear)

        val cont= (this.application as MyAplication).contactos

        val regresar= this.findViewById<Button>(R.id.Regresar)
        regresar.setOnClickListener { val intent = Intent(this,Contactos::class.java)
            startActivity(intent)}

        val nombre = findViewById<TextView>(R.id.Nombre)
        val telefono = findViewById<TextView>(R.id.Numero)
        val correo = findViewById<TextView>(R.id.Correo)

        val cnuevo = this.findViewById<Button>(R.id.Agregar)
        cnuevo.setOnClickListener {
            val nom = nombre.text.toString()
            val num = telefono.text.toString()
            val cor = correo.text.toString()
            val contacto1 = Contacto(nom, cor, num)
            cont.add(contacto1)
            val text = "¡Exitoso!"
            val duration = LENGTH_SHORT
            val mensaje = makeText(applicationContext, text, duration)
            mensaje.show()
        }
    }
}




