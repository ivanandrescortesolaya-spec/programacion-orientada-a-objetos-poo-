/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerejercicio5;

/**
 *
 * @author Ivan Andres
 */
public class Datos {
    
    String marca;
    String modelo;
    String accion;
    String on;
    int ctcombustible;
    int concombustible; 
    int kilometros;
    int placa;
    public void getdata(){
        System.out.println("la informacion del automovil es: ");
        System.out.println("placa: "+this.placa+" marca: "+this.marca+" modelo: "+this.modelo+" cantidad de combustible: "+this.concombustible+" el carro se encuenta "+this.on);
    }
}
