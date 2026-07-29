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
public class Ejercicio2 {
    public static void ejercicio2(){
    Scanner sc=new Scanner(System.in);
    int a;
    double p,ps,pc,pp;
        System.out.println("digite el precio del producto 1 ");
        a=sc.nextInt();
    //solucion:
    p=a*0.19;
    ps=a-p;
    //respuesta:
        System.out.println("el valor del producto sin iva es: "+ps);
        System.out.println("el valor del iva es: "+p);
        System.out.println("el valor total es: "+a);
    }
}
/*Ejercicio 2

Una tienda vende un producto con IVA del 19%.

Solicite el valor del producto y calcule:

Valor antes del IVA
Valor del IVA
Valor total*/