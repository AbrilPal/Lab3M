package com.example.abril.lab3m

import java.util.ArrayList

class MyAplication(){
    val contactos:ArrayList<Contacto> = arrayListOf(Contacto("Abril Palencia", "pal18198@uvg.edu.gt", "42017807"))
    private var opc: Int = 0

  fun add(persona: Contacto){
      contactos.add(persona)
  }

    fun select(opcion: Int){
        this.opc = opcion
    }

    fun getNombre():String{
        var persona: Contacto = contactos.get(opc)
        var nombre: String = persona.toString()
        return nombre
    }

    fun getNumero():String{
        var persona: Contacto = contactos.get(opc)
        var telefono: String = persona.toStringn()
        return telefono
    }

    fun getCorreo():String{
        var persona: Contacto = contactos.get(opc)
        var correo: String = persona.toStringc()
        return correo
    }

}
