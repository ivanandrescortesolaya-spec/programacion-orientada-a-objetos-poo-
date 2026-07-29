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
public class Ejercicio7 {
    public static void ejercicio7(){
    Scanner sc=new Scanner(System.in);
    int ed;
        System.out.println("digite edad");
        ed=sc.nextInt();
        //solucion
        if (ed<18&&ed>0) {
            System.out.println("es un nino");
        }else if (ed==18){
            System.out.println("adolescente");
        }else if (ed>18 && ed<50){
            System.out.println("adulto");
        }else if (ed>=50){
            System.out.println("adulto mayor");
        }else{
            System.out.println("edad invalidad");
        }
}
}
/*Ejercicio 7

Solicite la edad de una persona y clasifíquela como:

Niño
Adolescente
Adulto
Adulto mayor*/