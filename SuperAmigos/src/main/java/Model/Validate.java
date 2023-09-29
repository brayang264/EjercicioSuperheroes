/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Validate {
    //Convierte el string a float, en caso de que no se pueda convertir devuleve un 0
    public float convertToFloat(String number){
        return (!isANumber(number))?-1: Float.parseFloat(number);
    }
    //Se comprueba si se pude convertir al string a float.
    public boolean isANumber(String number){
        try{
            Float.parseFloat(number);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
}
