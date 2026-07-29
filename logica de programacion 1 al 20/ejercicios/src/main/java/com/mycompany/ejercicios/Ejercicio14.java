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
public class Ejercicio14 {
    public static void ejercicio14(){
    Scanner sc=new Scanner(System.in);
    int s=0;
    double r;
    //solucion:
        for (int i = 0; i < 10; i++) {
            s=s+(i+1);
        }r=s/10;
        System.out.println("la suma es: "+s);
        System.out.println("el promedio es: "+r);
    }
}
/*Solicitar diez números y calcular:

Suma
Promedio*/