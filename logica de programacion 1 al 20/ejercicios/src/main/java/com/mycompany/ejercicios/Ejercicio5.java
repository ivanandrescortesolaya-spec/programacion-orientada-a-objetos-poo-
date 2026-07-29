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
public class Ejercicio5 {
    public static void ejercicio5(){
    Scanner sc=new Scanner(System.in);
    int c;
    double f,k;
        System.out.println("digite valor de grados celcius");
        c=sc.nextInt();
    //solucion:
    f=(c*9/5)+32;
    k=c+273.15;
    //respuesta:
        System.out.println("el valor de los grados celcius en Fahrenheit es: "+f);
        System.out.println("el valor de los grados celcius en Kelvin es: "+k);
}
}
/*Solicite la temperatura en grados Celsius y conviértala a grados Fahrenheit y Kelvin.
*/