/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerejercicio9;

/**
 *
 * @author Ivan Andres
 */
public class Datos {
    String nombre;
    int codigo;
    Asignatura asignatura=new Asignatura();
    public void estudiante(){
        System.out.println("la informacion del estudiantte es: ");
        System.out.println("nombre: "+nombre+" codigo: "+codigo);
        asignatura.asignatura();
    }
}
