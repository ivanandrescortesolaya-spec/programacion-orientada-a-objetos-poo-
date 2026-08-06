/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerejercicio6;

/**
 *
 * @author Ivan Andres
 */
public class Datos {
    String nombre;
    String cargo;
    int salario;
    int horasex; 
    int salariofn;
    int precioxhr;
    public void getdata(){
        System.out.println("la informacion del empledo es: ");
        System.out.println("el nombre es: "+this.nombre+" cargo: "+this.cargo+" salario: "+this.salario+" horas trabajadas en el mes: "+this.horasex+" el salario final es: "+this.salariofn);
    }
}
