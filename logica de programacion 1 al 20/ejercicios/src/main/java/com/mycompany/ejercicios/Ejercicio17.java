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
public class Ejercicio17 {
    public static void ejercicio17(){
    Scanner sc=new Scanner(System.in);
    int a;
    int car[]=new int [16];
    //llenarlo:
        for (int i = 0; i < 15; i++) {
            System.out.println("digite un numero para la casilla "+(i+1));
            a=sc.nextInt();
            car[i]=a;
        }
        //ordenar:
        for (int i = 0; i < 15; i++) {
                if (car[i]>car[i+1]) {
                    int buffer=car[i];
                    car[i]=car[i+1];
                    car[i+1]=buffer;
                }
            }
        //mostrar:
        System.out.println("el mayor es: "+car[15]);
        System.out.println("el menor es: "+car[0]);
        
        }
}

/*Con un arreglo de 15 números determine:

Mayor
Menor*/