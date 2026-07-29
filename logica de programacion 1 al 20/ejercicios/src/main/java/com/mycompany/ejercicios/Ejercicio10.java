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
public class Ejercicio10 {
    public static void ejercicio10(){
    Scanner sc=new Scanner(System.in);
    int a;
    //solucion:
        System.out.println("digte un año");
        a=sc.nextInt();
        if (a%4==0) {
            System.out.println("el año es bisiesto");
        }else {
            System.out.println("el año no es bisiesto");
        }
}
}
/*Solicite un año y determine si es bisiesto.*/