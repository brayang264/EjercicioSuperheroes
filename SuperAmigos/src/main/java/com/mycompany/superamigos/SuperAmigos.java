/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.superamigos;

import Model.Person;

/**
 *
 * @author Jhomar Arrieta
 * 
 * Los superamigos comparten la parte humana del cuerpo de una persona
 * Pero tienen comportamientos diferentes como volar, fuerza, visionx, telepatia
 * Realice una productora de superheroes
 * 
 * 
 */
public class SuperAmigos {
private Person person = new Person();
    public void main(String[] args) {
        person.setNombre("brayan");
        person.setPais("narnia");
        System.out.println(person.toString());
    }
}
