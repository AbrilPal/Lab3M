package com.example.abril.lab3m

import java.util.ArrayList

class MyAplication(){
    val contactos:ArrayList<Contacto> = ArrayList()

    lateinit var currentContacto: Contacto

    fun getContacto():ArrayList<Contacto>{
        return this.contactos
    }
    fun getCurrentContactos(): Contacto{
        return this.currentContacto
    }

    fun createAndAddContact(nombre: String, telefono:String, correo:String){
        val contacto = Contacto(nombre, correo, telefono)
        contactos.add(contacto)
    }
}