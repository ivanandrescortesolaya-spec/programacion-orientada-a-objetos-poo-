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
public class Ejercicio12 {
    public static void ejercicio12(){
        Scanner sc=new Scanner(System.in);
        //solucion:
        for (int i = 0; i < 200; i++) {
            if (i%2==0) {
                System.out.println(i+2);
            }else{System.out.println();}
        }
    }
}
/*Mostrar únicamente los números pares entre 1 y 200.*/