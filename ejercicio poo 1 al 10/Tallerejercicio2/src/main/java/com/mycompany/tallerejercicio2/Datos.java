/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerejercicio2;

/**
 *
 * @author Ivan Andres
 */
public class Datos {

    String nombre;
    int edad;
    int grado;
    
public Datos(String nombre, int edad, int grado) {
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
    }

public void getdata(){
    System.out.println("la informacion del estudiante es: ");
    System.out.println("Nombre: "+this.nombre+" edad: "+this.edad+" grado: "+this.grado);
}
}