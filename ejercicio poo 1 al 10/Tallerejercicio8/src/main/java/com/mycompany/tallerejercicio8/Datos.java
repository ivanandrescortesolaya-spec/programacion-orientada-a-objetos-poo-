/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerejercicio8;

/**
 *
 * @author Ivan Andres
 */
public class Datos {
    int numero;
    String fecha;
    String cliente;
    Plato plato;
    public Datos(int numero, String fecha, String cliente,Plato plato) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.plato=plato;
    }
    
    public void pedido(){
        System.out.println("informacion de pedido");
        System.out.println("numero: "+numero+" fecha: "+fecha+" cliente: "+cliente);
        plato.mostrarplato();
        
    }
}
/*Ejercicio 8. Restaurante (Dos clases relacionadas) 

Un restaurante necesita registrar sus pedidos. 
Cada pedido tiene un número, una fecha y un cliente. 
Además, cada pedido corresponde a un plato, del cual se conoce el nombre y el precio. 
El sistema debe mostrar toda la información del pedido junto con los datos del plato. 

Reto: Identificar que existen dos clases relacionadas. */