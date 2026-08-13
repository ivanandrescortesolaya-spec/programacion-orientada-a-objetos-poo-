/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerejercicio3;

/**
 *
 * @author Ivan Andres
 */
public class Datos {

    public Datos(String nombre, int precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    String nombre; 
    int precio;
    int cantidad;

public void getdata(){
    System.out.println("la informacion del producto es: ");
    System.out.println("nombre: "+this.nombre+" precio "+this.precio+" cantidad "+this.cantidad);
}
public void getvalor(){
    System.out.println("el valor total del inventario es: ");
    System.out.println("valor total: "+(precio*cantidad));
}
}