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
public class Ejercicio18 {
    public static void ejercicio18(){
    Scanner sc=new Scanner(System.in);
    int a,p,s=0,par=0,impar=0;
    int car[]=new int[20];
    //llenar:
        for (int i = 0; i < 20; i++) {
            System.out.println("digite un numero para la casilla "+(i+1));
            a=sc.nextInt();
            car[i]=a;
            s=s+car[i];
        }p=s/20;
        for (int i = 0; i < 20; i++) {
            if (car[i]%2==0) {
                par++;
            }else
            impar++;
            
        }//mostrar
        System.out.println("promedio: "+p);
        System.out.println("cantidad de pares: "+par);
        System.out.println("cantidad de impares: "+impar);
}
}
/*Con un arreglo de 20 números calcule:

Promedio
Cantidad de pares
Cantidad de impares*/