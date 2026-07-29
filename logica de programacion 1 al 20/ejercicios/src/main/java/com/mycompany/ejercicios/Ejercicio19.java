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
public class Ejercicio19 {
    public static void ejercicio19(){
    Scanner sc=new Scanner(System.in);
    int nt,ntm,ntmn,p,aprobados=0,reprobados=0,s=0;
    int stu[]=new int[31];
    //llenarlo
        for (int i = 0; i < 30; i++) {
            System.out.println("digite nota para el estudiante "+(i+1));
            nt=sc.nextInt();
            stu[i]=nt;
            s=s+stu[i];
        }p=s/30;
        //ordenarlo
        for (int i = 0; i < 30; i++) {
            if (stu[i]>stu[i+1]) {
                int buffer=stu[i];
                stu[i]=stu[i+1];
                stu[i+1]=buffer;
            }
        }
        for (int i = 0; i < 30; i++) {
            if (stu[i]>=5) {
                aprobados++;
            }else reprobados++;
        }
        //mostrar:
        System.out.println("nota mayor es: "+stu[30]);
        System.out.println("nota menor es: "+stu[0]);
        System.out.println("el promedio es: "+p);
        System.out.println("cantidad de aprobados es: "+aprobados);
        System.out.println("cantidad de reprobados es: "+reprobados);
}
}
/*Almacene las notas de 30 estudiantes y determine:

Nota mayor
Nota menor
Promedio
Cantidad de aprobados
Cantidad de reprobados*/