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
public class Ejercicio6 {
    public static void ejercicio6(){
    Scanner sc=new Scanner(System.in);
    int a,b=0;
        System.out.println("digite un numero");
        a=sc.nextInt();
        //solucion:
        if (a>b) {
            System.out.println("el numero es positivo");
        }else if(a<b){
                   System.out.println("el numero es negativo");
            }else{
                    System.out.println("el numero es cero");}
    
                    }
}

/*Solicite un número e indique si es:

Positivo
Negativo
Cero*/