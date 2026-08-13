/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerejercicio4;

/**
 *
 * @author Ivan Andres
 */
public class Datos {

    
    int nocuenta;
    String nomtitular;
    int saldo;
    int deposito;
    public Datos(int nocuenta, String nomtitular, int saldo) {
        this.nocuenta = nocuenta;
        this.nomtitular = nomtitular;
        this.saldo = saldo;
        this.deposito = deposito;
    }
    public void getdata(){
        System.out.println("la informacion de la cuenta es: ");
        System.out.println("numero de cuenta: "+this.nocuenta+" nombre del titular: "+this.nomtitular+" saldo: "+this.saldo);
    }
}
