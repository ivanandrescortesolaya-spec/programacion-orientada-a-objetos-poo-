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
public class Ejercicio16 {
    public static void ejercicio16(){
    Scanner sc=new Scanner(System.in);
    int a;
    int car[]=new int[10];
    //llenar
        for (int i = 0; i < 10; i++) {
            System.out.println("digite un numero para la casilla "+(i+1));
            a=sc.nextInt();
            car[i]=a;
        }//mostrar:
        for (int i = 0; i < 10; i++) {
            System.out.println("en la casilla "+(i+1)+" esta: "+car[i]);
        }
    }
}
/*Almacene 10 números enteros en un arreglo y muéstrelos.*/