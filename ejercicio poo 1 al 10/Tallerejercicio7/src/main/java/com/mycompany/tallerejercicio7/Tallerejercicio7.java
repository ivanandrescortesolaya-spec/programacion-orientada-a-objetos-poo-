/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tallerejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ivan Andres
 */
public class Tallerejercicio7 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //dafinition of the variable type
        int op=0,id=0;
        String consulta;
        //create list
        ArrayList<Datos>ListDatos=new ArrayList<>();
        do {
            //take list
            System.out.println("digite accion");
            System.out.println("1.registrar mascota");
            System.out.println("2.mostrar cuantas consultas hechas hoy");
            System.out.println("3.mostrar informacion");
            System.out.println("4.salir");
            op=sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    //add of the list
                    Datos mascota=new Datos();
                    sc.nextLine();
                    System.out.println("digite nombre");
                    mascota.nombre=sc.nextLine();   
                    System.out.println("digite especie");
                    mascota.especie=sc.nextLine();
                    do {
                    System.out.println("digite edad");
                    mascota.edad=sc.nextInt();
                    } while (mascota.edad<0);
                    do {
                    System.out.println("digite peso");
                    mascota.peso=sc.nextInt();  
                    } while (mascota.peso<0);   
                    sc.nextLine();
                    System.out.println("digite el nombre del propetario");
                    mascota.nombrepp=sc.nextLine();  
                    System.out.println("consulta registrada ");
                    mascota.consultas++;
                    ListDatos.add(mascota);
                    break;
                case 2:
                    //show total number of citations
                        System.out.println("el total de consultas de la mascota: "+ListDatos.get(0).consultas);   
                       
                    break;
                case 3:
                    //show list
                        for (int i = 0; i < ListDatos.size(); i++) {
                        ListDatos.get(i).getdata();
                    }
                    break;
                default:
            }
        } while (op!=4);
    }
}
/*Ejercicio 7. Mascota (Validaciones sencillas) 

Una clínica veterinaria registra las mascotas de sus clientes. 
De cada mascota almacena el nombre, la especie, la edad, el peso y el nombre del propietario. 
El sistema debe permitir mostrar la información y registrar consultas médicas. Una mascota no puede tener un peso negativo ni una edad menor que cero. 

Reto: Agregar validaciones básicas en los métodos o constructor. */