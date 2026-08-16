/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tallerejercicio10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ivan Andres
 */
public class Tallerejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //create list
        ArrayList<Cliente> ListClientes = new ArrayList<>();
        //definition of the variable type
        int op;
        do {
            //take action
            System.out.println("digite accion");
            System.out.println("1.registrar");
            System.out.println("2.mostrar");
            System.out.println("3.salir");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    //add to the list
                    System.out.println("nombre: ");
                    String nombre = sc.nextLine();
                    System.out.println("correo: ");
                    String correo = sc.nextLine();
                    System.out.println("identificacion: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("numero de compra: ");
                    int numero = sc.nextInt();
                    sc.nextLine();
                    System.out.println("fecha: ");
                    String fecha = sc.nextLine();
                    System.out.println("nombre del producto: ");
                    String nombre2 = sc.nextLine();
                    System.out.println("precio: ");
                    double precio = sc.nextDouble();
                    System.out.println("cantidad: ");
                    int cantidad = sc.nextInt();
                    sc.nextLine();
                    Compra compra=new Compra(numero,fecha);
                    Producto producto=new Producto(nombre2,precio,cantidad);
                    Cliente cliente = new Cliente(nombre,correo,id,compra,producto);
                    ListClientes.add(cliente);
                    break;
                case 2:
                    //show list
                    if (ListClientes.isEmpty()) {
                        System.out.println("no hay compras registradas.");
                    } else {
                        for (int i = 0; i < ListClientes.size(); i++) {                      
                            ListClientes.get(i).mostrarcliente();
                        }
                    }
                    break;
                case 3:
                    System.out.println("programa finalizado.");
                    break;
                default:
            }
        } while (op != 3);
    }
}
/*Ejercicio 10. Tienda en línea (Proyecto integrador) 

Una tienda virtual necesita registrar las compras realizadas por sus clientes. 
Cada cliente tiene un nombre, un correo electrónico y un número de identificación. 
Cada compra posee un número, una fecha y una lista de productos.
De cada producto se conoce el nombre, el precio y la cantidad comprada. 
El sistema debe permitir mostrar toda la información de la compra y calcular el valor total que debe pagar el cliente. 

Reto: Integrar varias clases, relaciones entre objetos, métodos de cálculo y recorrido de una colección de productos. */