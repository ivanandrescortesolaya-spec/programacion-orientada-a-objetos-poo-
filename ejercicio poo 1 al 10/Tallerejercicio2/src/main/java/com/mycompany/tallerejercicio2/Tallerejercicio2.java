/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tallerejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ivan Andres
 */
public class Tallerejercicio2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int op=0;
        int id=0;
        ArrayList<Datos>ListDatos=new ArrayList<>();
        do {
            System.out.println("elegir accion ");
            System.out.println("1.registrar estudiante");
            System.out.println("2.mostrar informacion");
            System.out.println("3.salir");
            op=sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    Datos estudiante =new Datos();
                    System.out.println("digite la informacion ");
                    System.out.println("Nombre: ");
                    estudiante.nombre=sc.nextLine();
                    System.out.println("edad: ");
                    estudiante.edad=sc.nextLine();
                    System.out.println("grado ");
                    estudiante.grado=sc.nextInt();
                    ListDatos.add(estudiante);
                    break;
                case 2:
                    for (int i = 0; i < ListDatos.size(); i++) {
                        ListDatos.get(id).getdata();
                    }
                    break;
                default:
                    
            }
        } while (op!=3);
    }
}
/*Ejercicio 2. Estudiante (Constructor) 

Un colegio necesita registrar la información de sus estudiantes. De cada estudiante 
se conoce el nombre, la edad y el grado que cursa. Al momento de crear un estudiante, 
toda esta información debe quedar registrada y el sistema debe permitir mostrarla posteriormente. 

Reto: Descubrir que conviene utilizar un constructor además del método para mostrar la información. */