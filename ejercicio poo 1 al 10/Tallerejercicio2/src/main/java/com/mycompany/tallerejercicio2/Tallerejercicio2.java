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
        Scanner sc = new Scanner(System.in);

        int op = 0;

        ArrayList<Datos> listaDatos = new ArrayList<>();

        do {

            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Mostrar información");
            System.out.println("3. Salir");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {

                case 1:

                    System.out.println("\nDigite la información del estudiante");

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Edad: ");
                    int edad = sc.nextInt();

                    System.out.print("Grado: ");
                    int grado = sc.nextInt();
                    sc.nextLine();

                    Datos estudiante = new Datos(nombre, edad, grado);

                    listaDatos.add(estudiante);

                    System.out.println("Estudiante registrado correctamente.");

                    break;

                case 2:

                    if (listaDatos.isEmpty()) {

                        System.out.println("No hay estudiantes registrados.");

                    } else {

                        for (int i = 0; i < listaDatos.size(); i++) {
                            listaDatos.get(i).getdata();
                        }
                    }

                    break;

                case 3:

                    System.out.println("Programa finalizado.");

                    break;

                default:

                    System.out.println("Opción no válida.");
            }

        } while (op != 3);

        sc.close();
    }
}
/*Ejercicio 2. Estudiante (Constructor) 

Un colegio necesita registrar la información de sus estudiantes. De cada estudiante 
se conoce el nombre, la edad y el grado que cursa. Al momento de crear un estudiante, 
toda esta información debe quedar registrada y el sistema debe permitir mostrarla posteriormente. 

Reto: Descubrir que conviene utilizar un constructor además del método para mostrar la información. */