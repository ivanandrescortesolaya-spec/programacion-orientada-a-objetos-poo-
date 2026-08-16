/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerejercicio7;

/**
 *
 * @author Ivan Andres
 */
public class Datos {
    String nombre;
    String especie;
    int edad;
    double peso;
    String nombrepp;
    int consultas=0;
    public Datos(String nombre, String especie, int edad, double peso, String nombrepp) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.nombrepp = nombrepp;
    }
    public void getdata(){
        System.out.println("nombre: "+this.nombre+" especie: "+this.especie+" edad:"+this.edad+" peso: "+this.peso+" nombre del propetario: "+this.nombrepp+" cuantas consultas lleva: "+this.consultas);
    }
}
/*Ejercicio 7. Mascota (Validaciones sencillas) 

Una clínica veterinaria registra las mascotas de sus clientes. 
De cada mascota almacena el nombre, la especie, la edad, el peso y el nombre del propietario. 
El sistema debe permitir mostrar la información y registrar consultas médicas. Una mascota no puede tener un peso negativo ni una edad menor que cero. 

Reto: Agregar validaciones básicas en los métodos o constructor. */