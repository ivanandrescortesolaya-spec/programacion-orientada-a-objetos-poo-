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
public class Ejercicio9 {
    public static void ejercicio9(){
    Scanner sc=new Scanner(System.in);
    int a,b,r;
        System.out.println("digite primer numero");
        a=sc.nextInt();
        System.out.println("digite segundo numero");
        b=sc.nextInt();
        //solucion:
        if (a>b) {
            System.out.println("el numero mayor es: "+a);
            System.out.println("el numero menor es: "+b);
        }else if (b>a) {
            System.out.println("el numero mayor es: "+b);
            System.out.println("el numero menor es: "+a);            
        }else
            System.out.println("los numeros son iguales: "+"el primero es: "+a+" el segundo es: "+b);
    }
}
/*Solicite dos números y determine:

Mayor
Menor
O si son iguales.*/