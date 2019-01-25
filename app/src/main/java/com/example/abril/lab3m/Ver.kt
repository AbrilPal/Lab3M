package com.example.abril.lab3m

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Ver : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ver)

        val regresar= this.findViewById<Button>(R.id.Regresar1)
        regresar.setOnClickListener { val intent = Intent(this,Contactos::class.java)
            startActivity(intent)}
    }
}
