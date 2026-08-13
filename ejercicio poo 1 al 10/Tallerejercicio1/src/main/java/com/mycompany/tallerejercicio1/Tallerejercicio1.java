/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tallerejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ivan Andres
 */
public class Tallerejercicio1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //definition of the variable type
        int op=0;
        int index=0;
        //create list
        ArrayList<clase> Listclase=new ArrayList<>();
        do{
        //take action
        System.out.println("digite que quiere hacer");
        System.out.println("1.registrar libros");
        System.out.println("2.mostrar libros");
        System.out.println("3.salir");
        op=sc.nextInt();
        sc.nextLine();
        switch (op) {
            case 1:
                //add to the list
                System.out.println("registre la informacion");
                System.out.println("titulo: ");
                String titulo=sc.nextLine();
                System.out.println("autor: ");
                String autor=sc.nextLine();
                System.out.println("No de paginas: ");
                int npaginas=sc.nextInt();
                clase clase=new clase(titulo,autor,npaginas);
                Listclase.add(clase);              
                break;
            case 2:
                //show list
                for (int i = 0; i < Listclase.size(); i++) {
                    Listclase.get(i).getdata();                  
                }
                break;              
            default:
        }
    }while(op != 3);
}
}
/*Ejercicio 1. Libro (Muy básico) 

Una biblioteca desea registrar los libros disponibles para préstamo. De cada libro necesita 
conocer el título, el autor y el número de páginas. El sistema deberá permitir mostrar 
la información del libro en consola. 

Reto: Identificar una clase, pocos atributos y un método para mostrar la información. */