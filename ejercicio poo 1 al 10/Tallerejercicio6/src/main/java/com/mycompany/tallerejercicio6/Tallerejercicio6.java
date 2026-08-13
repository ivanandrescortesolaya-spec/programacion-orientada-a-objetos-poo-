/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tallerejercicio6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ivan Andres
 */
public class Tallerejercicio6 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //definition of the variable type
        int op=0;
        String id;
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
                    
                    System.out.println("digite nombre del empleado ");
                    String nombre=sc.nextLine();
                    System.out.println("digite cargo ");
                    String cargo=sc.nextLine();
                    System.out.println("digie salario base ");
                    int salario=sc.nextInt();
                    System.out.println("digite las horas extras del mes ");
                    int horasex=sc.nextInt();
                    System.out.println("digite precio por hora extra ");
                    int precioxhr=sc.nextInt();
                    int salariofn=(horasex*precioxhr)+salario;
                    Datos empleado =new Datos(nombre,cargo,salario,horasex,precioxhr,salariofn);
                    ListDatos.add(empleado);
                    break;
                case 2:
                    //show list
                    for (int i = 0; i < ListDatos.size(); i++) {
                        ListDatos.get(i).getdata();
                    }
                    break;
                default:
            }
        } while (op!=3);
    }
}
/*Ejercicio 6. Empleado (Más atributos y cálculos) 

Una empresa registra a sus empleados. De cada uno almacena el nombre, el cargo, 
el salario base y la cantidad de horas extras trabajadas durante el mes. 
El sistema debe permitir mostrar la información y calcular el salario final considerando el pago de las horas extras. 

Reto: Más atributos y un método de cálculo. */