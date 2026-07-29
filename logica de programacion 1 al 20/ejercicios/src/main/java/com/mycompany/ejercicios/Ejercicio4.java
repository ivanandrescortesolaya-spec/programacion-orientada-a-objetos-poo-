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
public class Ejercicio4 {
    public static void ejercicio4(){
    Scanner sc=new Scanner(System.in);  
    int ht,vh;
    double sb,ds,dp,sn;
        System.out.println("digite horas trabajadas: ");
        ht=sc.nextInt();
        System.out.println("digite valor de las horas: ");
        vh=sc.nextInt();
    //soluciones:
    sb=ht*vh;
    ds=sb*0.04;
    dp=sb*0.04;
    sn=sb-ds-dp;
    //respuesta:
        System.out.println("el salario bruto es: "+sb);
        System.out.println("el descuento de salud es: "+ds);
        System.out.println("el descuento de pension es: "+dp);
        System.out.println("el salario neto es: "+sn);
    }
}
/*Ejercicio 4

Solicite:

Horas trabajadas
Valor por hora

Calcule:

Salario bruto
Descuento salud (4%)
Descuento pensión (4%)
Salario neto*/
