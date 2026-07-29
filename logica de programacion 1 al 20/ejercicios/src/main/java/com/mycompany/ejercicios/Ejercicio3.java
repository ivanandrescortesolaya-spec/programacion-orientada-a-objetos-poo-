/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios;

import java.util.Scanner;

/**
 *
 * @author Aprendiz
 */
public class Ejercicio3 {
    public static void ejercicio3(){
    Scanner sc=new Scanner(System.in);  
    double nt,p1=3.4,p2=4.3,pf=5.0;
    //solucion:
    nt=(p1*0.30)+(p2*0.30)+(pf*0.40);
    //respuesta:
        System.out.println("la nota definitiva es: "+nt);
    }
}
/*Ejercicio 3

Un estudiante obtiene las siguientes notas:

Parcial 1 (30%)
Parcial 2 (30%)
Proyecto Final (40%)

Calcule la nota definitiva.*/