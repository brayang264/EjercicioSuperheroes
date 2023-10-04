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
    private int weaken;
//metodos getter and setter
    public Device() {
    }

    public Device(String description, int addSee, int addForce, int damage, int weaken) {
        this.description = description;
        this.addSee = addSee;
        this.addForce = addForce;
        this.damage = damage;
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getWeaken() {
        return weaken;
    }

    public void setWeaken(int weaken) {
        this.weaken = weaken;
    }
    
}
