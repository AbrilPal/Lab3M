package com.example.abril.lab3m

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import java.util.ArrayList

class Contactos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contactos)

        val nuevo= this.findViewById<Button>(R.id.nuevocont)
        nuevo.setOnClickListener { val intent = Intent(this,Crear::class.java)
        startActivity(intent)}

        val cont= (this.application as MyAplication).contactos

        val lista:ListView = this.findViewById(R.id.listac)
        val adapter = ArrayAdapter<Contacto>(this, android.R.layout.simple_list_item_1,cont)
        lista.adapter = adapter
    }

}
