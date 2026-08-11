/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tallerejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ivan Andres
 */
public class Tallerejercicio5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //definition of the variable type
        int op=0,id=0,d=0,kilometros;
        //create list
        ArrayList<Datos>ListDatos=new ArrayList<>();
        do {
            //take action
            System.out.println("digite accion");
            System.out.println("1.registrar carro");
            System.out.println("2.registrar recorrido del carro en km ");
            System.out.println("3.mostrar lista ");
            System.out.println("4.salir");
            op=sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    //add of the list
                    Datos carro =new Datos();
                    System.out.println("registre el carro");
                    System.out.println("placa: ");
                    carro.placa=sc.nextInt();
                    sc.nextLine();
                    System.out.println("marca: ");
                    carro.marca=sc.nextLine();
                    System.out.println("modelo: ");
                    carro.modelo=sc.nextLine();
                    System.out.println("cantidad de combustible: ");
                    carro.concombustible=sc.nextInt();
                    sc.nextLine();
                    System.out.println("digite como se encuentra el carro on o off ");
                    carro.on=sc.nextLine();
                    ListDatos.add(carro);
                    break;
                case 2:
                    //search the list
                    System.out.println("digite la placa del carro");
                    id=sc.nextInt();
                    System.out.println("digite cantidad de ckm recorrido");
                    d=sc.nextInt();
                    for (int i = 0; i < ListDatos.size(); i++) {
                        if (ListDatos.get(i).placa==id) {
                           ListDatos.get(i).concombustible-=(d*2);
                        System.out.println("la distancia recorida es de: "+d);
                        System.out.println("el combustible que que es de: "+ListDatos.get(i).concombustible);
                        break;
                        }
                    }
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
/*Ejercicio 5. Vehículo (Cambio de estado) 

Una empresa de alquiler de vehículos registra cada automóvil con su placa, marca, modelo y cantidad de combustible. 
El sistema debe permitir mostrar la información del vehículo, encenderlo, apagarlo y 
registrar recorridos que disminuyan el combustible disponible. 

Reto: Manejar estados del objeto y actualizar atributos*/