/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerejercicio9;

/**
 *
 * @author Ivan Andres
 */
public class Asignatura {
    String nombre2;
    double credito;
    public Asignatura(String nombre2, double credito) {
        this.nombre2 = nombre2;
        this.credito = credito;
    }
    public void mostrarasignatura(){
        System.out.println("la informacion de la asignatura es: ");
        System.out.println("nombre: "+nombre2+" credito: "+credito);
    }
}
