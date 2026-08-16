/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerejercicio8;

/**
 *
 * @author Ivan Andres
 */
public class Plato {
    String nombre;
    double precio;
    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public void mostrarplato(){
        System.out.println("plato: "+nombre+" precio: "+precio);
    }
}
