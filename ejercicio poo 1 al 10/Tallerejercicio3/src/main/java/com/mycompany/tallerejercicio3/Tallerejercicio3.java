/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tallerejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ivan Andres
 */
public class Tallerejercicio3 {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         //definition the variable type
         int op;
         int id;
         //create list
         ArrayList<Datos>ListDatos= new ArrayList<>();
         do {
             //take action
            System.out.println("digite accion");
            System.out.println("1.Registrar");
            System.out.println("2.mostrar inventario");
            System.out.println("3.valor total del inventario");
            System.out.println("4.salir");
            op=sc.nextInt();
            sc.nextLine();
             switch (op) {
                 case 1:
                     //add of the list
                     Datos material=new Datos(); 
                     System.out.println("registrar en el inventario ");
                     System.out.println("nombre ");
                     material.nombre=sc.nextLine();
                     System.out.println("precio");
                     material.precio=sc.nextInt();
                     System.out.println("cantidad ");
                     material.cantidad=sc.nextInt();
                     ListDatos.add(material);
                     break;
                 case 2:
                     //show list
                     for (int i = 0; i < ListDatos.size(); i++) {
                         ListDatos.get(i).getdata();
                     }
                     break;
                 case 3:
                     //show total inventory value
                     for (int i = 0; i < ListDatos.size(); i++) {
                         ListDatos.get(i).getvalor();
                     }
                     break;
                 default:
                     
             }
         }while (op!=3);
    }
}
/*Ejercicio 3. Producto (Métodos con lógica simple) 

Un supermercado desea administrar sus productos. 
De cada producto necesita registrar el nombre, el precio y la cantidad disponible en inventario. 
Además de mostrar la información, el sistema debe permitir calcular el valor total del inventario 
de ese producto (precio × cantidad). 

Reto: Identificar un método que realiza un cálculo. */