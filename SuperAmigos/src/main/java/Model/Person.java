/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Jhomar Arrieta
 * 
 * Esto es un bean
 * 
 */
public class Person {
    private String nombre;
    String pais;
    int edad;
    boolean disponibilidad;
    boolean soltero;

    //constructor
    //se puede crear con todos o con cada uno
    public Person(String nombre, String superNombre, String pais, int edad, boolean disponibilidad,
        boolean soltero) {
        this.nombre = nombre;
        this.pais = pais;
        this.disponibilidad = disponibilidad;
        this.edad = edad;
        this.soltero = soltero;
    }
    public Person(){
        
    }
    
//para encapsular getter and setter
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override //Object -> utilizar este string y no del papá
    public String toString() {
        return "Person{" + "nombre=" + nombre + ", superNombre=" +  ", pais=" + pais + '}';
    }
    
}
