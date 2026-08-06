/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerejercicio10;

/**
 *
 * @author Ivan Andres
 */
public class Producto {
      String nombre;
    double precio;
    int cantidad;

    public void registrar(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public double calcularSubtotal() {
        return precio * cantidad;
    }
    public void mostrar() {
        System.out.println("informacion de producto");
        System.out.println("nombre: " + nombre+" precio: " + precio+" cantidad: " + cantidad+" subtotal: $" + calcularSubtotal());
    }
}
