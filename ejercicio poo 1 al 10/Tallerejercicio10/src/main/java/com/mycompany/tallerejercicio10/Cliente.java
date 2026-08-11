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
    Compra compra = new Compra();
    

    public void registrar(String nombre, String correo, int id) {
        this.nombre = nombre;
        this.correo = correo;
        this.id = id;
    }

    public void mostrar() {
        System.out.println("informacion de cliente: ");
        System.out.println("nombre: " + nombre+" correo: " + correo+" identificacion: " + id);
        compra.mostrar();
    }
}
