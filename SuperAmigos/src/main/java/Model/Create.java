/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Create {
    //Se crea un singleton para tener una unica instancia de la clase 
    private static Create instance;
    //El constructor es privado para que solo pueda acceder a través del metodo getInstace y asi solo crear una instancas de la clase
    private Create(){
        
    }
    
    private ArrayList<Person> personList = new ArrayList<Person>();
    //Se crea la persona y se agrega a la lista
    public void createPerson(String name, String country, float age, boolean availability, boolean single,
            String address, float scaleOfEvil, float weight, float height, boolean physicalProblems,
            boolean mentalProblems){
        Person person = new Person(name,country, age, availability, single, address, scaleOfEvil, weight,
        height, physicalProblems, mentalProblems);
        personList.add(person);
        
    }
    public String printPersons(){
        String result="";
        result+= "-------------------------------\n";
        for(Person person: personList){
            result+= person.toString();
            result+= "-------------------------------\n";
        }
       return result;
    }
    //Metdoo para obetenr la lista de personas que se han registrado
    public ArrayList<Person> getArray(){
        return personList;
    }
    //Metodo para obtener y crear (de ser necesario) la unica instancia de la clase
    public static Create getInstance(){
        if(instance == null){
            instance = new Create();
        }
        return instance;
    }
}
