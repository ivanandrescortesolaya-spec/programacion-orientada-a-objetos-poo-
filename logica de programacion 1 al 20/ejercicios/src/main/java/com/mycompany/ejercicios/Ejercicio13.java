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
public class Ejercicio13 {
    public static void ejercicio13(){
    Scanner sc=new Scanner(System.in);
    int s=0;
    //solucion:
        for (int i = 0; i < 100; i++) {       
        s=s+(i+1);
        }System.out.println("la suam es: "+s);
    }
}
/*Calcular la suma de los primeros 100 números naturales.*/