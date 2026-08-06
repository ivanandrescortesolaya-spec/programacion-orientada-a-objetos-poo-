/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerejercicio10;

/**
 *
 * @author Ivan Andres
 */
public class Compra {
    int numero;
    String fecha;

    Producto producto = new Producto();

    public void registrar(int numero, String fecha) {
        this.numero = numero;
        this.fecha = fecha;
    }

    public double calcularTotal() {
        return producto.calcularSubtotal();
    }

    public void mostrar() {

        System.out.println("informacion compra");
        System.out.println("numero: " + numero+" fecha: "+fecha);
        producto.mostrar();
        System.out.println("total a pagar: " + calcularTotal());
    }
}
