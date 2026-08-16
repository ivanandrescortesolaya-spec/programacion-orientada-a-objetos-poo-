/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerejercicio10;

/**
 *
 * @author Ivan Andres
 */
public class Cliente {
    String nombre;
    String correo;
    int id;
    Compra compra;
    Producto producto;
     public Cliente(String nombre, String correo, int id,Compra compra,Producto producto) {
        this.nombre = nombre;
        this.correo = correo;
        this.id = id;
        this.compra=compra;
        this.producto=producto;
    }
    public void mostrarcliente() {
        System.out.println("informacion de cliente: ");
        System.out.println("nombre: " + nombre+" correo: " + correo+" identificacion: " + id);
        compra.mostrarcompra();
        producto.mostrarproducto();
        
    }
}
