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
        int op,id,numero,cantidad;
        String nombre,correo,fecha,nombreproducto;
        double precio;
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
                    Cliente cliente = new Cliente();
                    System.out.println("nombre: ");
                    nombre = sc.nextLine();
                    System.out.println("correo: ");
                    correo = sc.nextLine();
                    System.out.println("identificacion: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    cliente.registrar(nombre, correo, id);
                    System.out.println("numero de compra: ");
                    numero = sc.nextInt();
                    sc.nextLine();
                    System.out.println("fecha: ");
                    fecha = sc.nextLine();
                    cliente.compra.registrar(numero, fecha);
                    System.out.println("nombre del producto: ");
                    String nombreProducto = sc.nextLine();
                    System.out.println("precio: ");
                    precio = sc.nextDouble();
                    System.out.println("cantidad: ");
                    cantidad = sc.nextInt();
                    sc.nextLine();
                    cliente.compra.producto.registrar(nombreProducto, precio, cantidad);
                    ListClientes.add(cliente);
                    break;
                case 2:
                    //show list
                    if (ListClientes.isEmpty()) {
                        System.out.println("no hay compras registradas.");
                    } else {
                        for (int i = 0; i < ListClientes.size(); i++) {                      
                            ListClientes.get(i).mostrar();
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