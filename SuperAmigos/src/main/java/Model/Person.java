/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Brayan Gómez
 * 
 * @version 1.0
 * 
 */
public class Person {
    //Class fields
    private String name;
    private String country;
    private float age;
    private boolean availability;
    private boolean single;
    private String address;
    private float scaleOfEvil;
    private float weight;
    private float height;
    private boolean physicalProblems;
    private boolean mentalProblems;
    //constructor
    //se puede crear con todos o con cada uno

    public Person(String name, String country, float age, boolean availability, boolean single, String address, float scaleOfEvil, float weight, float height, boolean physicalProblems, boolean mentalProblems) {
        this.name = name;
        this.country = country;
        this.age = age;
        this.availability = availability;
        this.single = single;
        this.address = address;
        this.scaleOfEvil = scaleOfEvil;
        this.weight = weight;
        this.height = height;
        this.physicalProblems = physicalProblems;
        this.mentalProblems = mentalProblems;
    }

    //Constructor vacio o predeterminado
    public Person() {
    }
    
//para encapsular getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public float getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public boolean isSingle() {
        return single;
    }

    public void setSingle(boolean single) {
        this.single = single;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public float getScaleOfEvil(){
        return scaleOfEvil;
    }
    public void setScaleOfEvil(int scaleOfEvil){
        this.scaleOfEvil = scaleOfEvil;
    }
    public float getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public float getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public boolean getPhysicalProblems(){
        return physicalProblems;
    }
    public void setPhysicalProblems(boolean physicalProblems){
        this.physicalProblems = physicalProblems;
    }
    public boolean getMentalProblems(){
        return mentalProblems;
    }
    private void setMentalProblems(boolean mentalProblems){
        this.mentalProblems = mentalProblems;
    }
    //Metodo toString para obtener datos del objeto
    @Override //Object -> utilizar este string y no del papá
    public String toString() {
        return "Person{" + "nombre: " + name+" " + "\nPais: " + country +"\nEdad: "+age+"\nDirección de residencia: "+
                address+((single)?"\nSoltero":"\nComprometido")+((availability)?"\nDisponible":"\nNo disponible")+ '}';
    }
    
}
