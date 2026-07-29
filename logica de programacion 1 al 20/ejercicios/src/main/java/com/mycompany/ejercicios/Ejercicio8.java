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
public class Ejercicio8 {
    public static void ejercicio8(){
    Scanner sc=new Scanner(System.in);
    int a;
    double d,r;
        System.out.println("digite valor de la compra");
        a=sc.nextInt();
        if (a>200000) {
           d=a*0.90;
           r=a-d;
            System.out.println("el precio es: "+d);
        }else{
            System.out.println("no aplica sigue siendo el mismo precio: "+a);
        }
}
}
/*Una tienda realiza un descuento del 10% cuando la compra supera los $200.000.

Calcule el valor a pagar.*/