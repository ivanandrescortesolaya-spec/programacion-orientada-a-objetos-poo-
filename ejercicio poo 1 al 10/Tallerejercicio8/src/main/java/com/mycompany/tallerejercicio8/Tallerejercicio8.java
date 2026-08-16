/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tallerejercicio8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ivan Andres
 */
public class Tallerejercicio8 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //definition of the variable type
        int op=0;
        //create list
        ArrayList<Datos>ListDatos=new ArrayList<>();        
        do {
            //take action
            System.out.println("digite accion ");
            System.out.println("1.registrar pedido ");
            System.out.println("2,mostrar pedido");
            System.out.println("3.salir");
            op=sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    //add of the list
                    System.out.println("digite numero de pedido");
                    int numero=sc.nextInt();
                    sc.nextLine();
                    System.out.println("digite fecha del pedido");
                    String fecha=sc.nextLine();
                    System.out.println("digite nombre del cliente");
                    String cliente=sc.nextLine();
                    System.out.println("digite nombre del plato");
                    String nombre=sc.nextLine();
                    System.out.println("digite precio");
                    Double precio=sc.nextDouble();
                    Plato plato=new Plato(nombre,precio);
                    Datos pedido=new Datos(numero,fecha,cliente,plato);
                    ListDatos.add(pedido);
                    break;
                case 2:
                    // show list
                    for (int i = 0; i < ListDatos.size(); i++) {
                        ListDatos.get(i).pedido();
                    }
                    break;
                default:
            }
        } while (op!=3);
    }
}
/*Ejercicio 8. Restaurante (Dos clases relacionadas) 

Un restaurante necesita registrar sus pedidos. 
Cada pedido tiene un número, una fecha y un cliente. 
Además, cada pedido corresponde a un plato, del cual se conoce el nombre y el precio. 
El sistema debe mostrar toda la información del pedido junto con los datos del plato. 

Reto: Identificar que existen dos clases relacionadas. */