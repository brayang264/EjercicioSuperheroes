/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Device {
    //Compos de la clase
    private String description;
    private int addSee;
    private int addForce;
    private int damage;
    private String weaken;
//Metodos constructores
    public Device() {
    }
//metodos getter and setter
    public Device(String description, int addSee, int addForce, int damage, String weaken) {
        this.description = description;
        this.addSee = addSee;
        this.addForce = addForce;
        this.weaken = weaken;
    }
    
    public Device(String weaken){
    this.weaken = weaken;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAddSee() {
        return addSee;
    }

    public void setAddSee(int addSee) {
        this.addSee = addSee;
    }

    public int getAddForce() {
        return addForce;
    }

    public void setAddForce(int addForce) {
        this.addForce = addForce;
    }

    public String getWeaken() {
        return weaken;
    }

    public void setWeaken(String weaken) {
        this.weaken = weaken;
    }
    //Metodos de la clase
    
}
