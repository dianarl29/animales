package com.example.animales

import AnimalesVO

class AnimalOrganizer {
    var listaAnimales = listOf <AnimalesVO>()

    constructor(){
        listaAnimales = listOf(
            AnimalesVO("Abeja","Insecto"),
            AnimalesVO(""),
            AnimalesVO(""),
            AnimalesVO(""),
            AnimalesVO(""),
            AnimalesVO(""),
            AnimalesVO("")

        )
    }

    //crear método que nos permite retornar una colección del tipo
    public fun obtenerAnimalesPorTipo (tipo: String) : ArrayList<AnimalesVO>{

        var result = arrayListOf<AnimalesVO>()

        //pelicula va almacenar todo de listaAnimales
        for(animal in listaAnimales){
            if(animal.tipo.equals(tipo)){
                result.add(animal)
                }
        }
        return result
    }
}