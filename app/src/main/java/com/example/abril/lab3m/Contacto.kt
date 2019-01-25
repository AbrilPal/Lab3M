package com.example.abril.lab3m

class Contacto(val nombre: String, val correo: String, val telefono: String){
    override fun toString(): String {
        return nombre
    }

     fun toStringn():String {
        return telefono
    }

    fun toStringc():String{
        return correo
    }


}
