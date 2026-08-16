/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tallerejercicio9;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ivan Andres
 */
public class Tallerejercicio9 {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        //defintion of the variable type
        int op=0;
        //create list
        ArrayList<Datos>ListDatos=new ArrayList<>();
        do {
            //take action
            System.out.println("digite accion");
            System.out.println("1.registrar");
            System.out.println("2.mostrar informacion");
            System.out.println("3.salir");
            op=sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    //add of the list                   
                    System.out.println("digite nombre del estudiante: ");
                    String nombre=sc.nextLine();
                    System.out.println("digite codigo del estudiante: ");
                    int codigo=sc.nextInt();
                    sc.nextLine();
                    System.out.println("digite nombre de la asignatura: ");
                    String nombre2=sc.nextLine();
                    System.out.println("digite cantidad de creditos: ");
                    int credito=sc.nextInt();
                    Asignatura asignatura=new Asignatura(nombre2,credito);
                    Datos estudiante=new Datos(nombre,codigo,asignatura);
                    ListDatos.add(estudiante);
                    break;
                case 2:
                    //show list
                    for (int i = 0; i < ListDatos.size(); i++) {
                        ListDatos.get(i).estudiante();
                    }
                    break;
                default:
            }
        } while (op!=3);
    }
}
/*Ejercicio 9. Universidad (Tres clases relacionadas) 

Una universidad necesita registrar la inscripción de sus estudiantes. 
Cada inscripción relaciona un estudiante con una asignatura. 
Del estudiante se conoce el nombre y el código. 
De la asignatura se conoce el nombre y la cantidad de créditos. 
El sistema debe mostrar toda la información de la inscripción. 

Reto: Identificar tres clases y su relación. */