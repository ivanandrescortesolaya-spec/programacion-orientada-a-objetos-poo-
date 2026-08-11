/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tallerejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ivan Andres
 */
public class Tallerejercicio4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //definition of the variable type
        int op=0;
        int id=0;
        int dp=0,rt=0;
        //create list
        ArrayList<Datos>ListDatos=new ArrayList<>();
        do {
            //take action
            System.out.println("digite accion");
            System.out.println("1.registrar");
            System.out.println("2.depositar");
            System.out.println("3.retiros");
            System.out.println("4.mostrar saldo");
            System.out.println("5.salir");
            op=sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    //add of the list
                    Datos datos =new Datos();
                    System.out.println("registrar cuenta");
                    System.out.println("digite numero de cuenta: ");
                    datos.nocuenta=sc.nextInt();
                    sc.nextLine();
                    System.out.println("digite nombre del titular: ");
                    datos.nomtitular=sc.nextLine();
                    System.out.println("digite saldo de la cuenta: ");
                    datos.saldo=sc.nextInt();
                    ListDatos.add(datos);
                    break;
                case 2:
                    
                    //account balance update
                    System.out.println("digite id de cuenta a depositar: ");
                    id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("digite cantidad a depositar: ");
                    dp=sc.nextInt(); 
                    for (int i=0;i<ListDatos.size();i++) {
                        if (ListDatos.get(i).nocuenta==id) {
                            ListDatos.get(i).saldo+=dp;
                            System.out.println("deposito realizado de: "+dp);
                            System.out.println("el saldo actual en la cuenta es :"+ListDatos.get(i).saldo); 
                            break;
                        }    
                    }
                    sc.nextLine();
                    break;
                case 3:
                    //withdraw the account balance
                    System.out.println("digite id de cuenta a retirar: ");
                    id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("digite cantidad a retirar: ");
                    rt=sc.nextInt();
                    for (int i = 0; i < ListDatos.size(); i++) {
                        if (ListDatos.get(i).nocuenta==id) {
                           ListDatos.get(i).saldo-=rt;    
                        }
                        System.out.println("el retiro realizado es de: "+rt);
                        System.out.println("el nuevo saldo de la cuenta es: "+ListDatos.get(i).saldo);
                    }
                    break;
                case 4:
                    //show list
                    for (int i = 0; i < ListDatos.size(); i++) {
                        ListDatos.get(i).getdata();
                    }
                    break;
                default:
                    
            }
        } while (op!=5);
    }
}
/*Ejercicio 4. Cuenta Bancaria (Modificar atributos) 

Un banco necesita registrar las cuentas de sus clientes.
De cada cuenta debe almacenar el número de cuenta, el nombre del titular y el saldo actual.
El sistema debe permitir mostrar la información de la cuenta, realizar depósitos y retiros, actualizando el saldo después de cada operación. 

Reto: Métodos que modifican el estado del objeto. */