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
public class Ejercicio20 {
    public static void ejercicio20(){
    Scanner sc=new Scanner(System.in);
    int a,l;
    int car []=new int[25];
    //llenar
        for (int i = 0; i < 25; i++) {
            System.out.println("digite un numero para la casilla "+(i+1));
            a=sc.nextInt();
            car[i]=a;
        }//buscar
        System.out.println("digite un numero para buscar");
        l=sc.nextInt();
        //buscando numero:
        for (int i = 0; i < 25; i++) {
            if (l==car[i]) {
                System.out.println("se encontro en la casilla "+(i+1));
            }
        }
        
}
}
/*Buscar un número dentro de un arreglo de 25 posiciones.

Mostrar:

Si existe.
En qué posición se encuentra.*/