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
public class ejercicio1 {
    public static void ejercicio1(){
    Scanner sc=new Scanner(System.in);
    int b,h;
    double r1,r2;
        System.out.println("digite valor de la base");
        b=sc.nextInt();
        System.out.println("digite valor de la altura");
        h=sc.nextInt();
    //solucion:
    r1=b*h;
    r2=(b*2)+(h*2);
    //respuestas:
        System.out.println("el valor de el area es: "+r1);
        System.out.println("el valor de el perimetro es: "+r2);
}
}
/*Ejercicio 1

Diseñe un programa que solicite la base y la altura de un rectángulo y calcule:

Área
Perímetro*/