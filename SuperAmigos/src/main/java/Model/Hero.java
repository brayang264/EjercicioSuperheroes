/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Control.Poderes;
import java.awt.Point;
/**
 *
 * @author brayan.gomez1
 * 
 */
public class Hero extends Person implements Poderes{
    //Campos de la clase
    private String superName;
    private float force;
    private int see;
    private Device device;
    private boolean canFly;
    private boolean canBeInvisible;
    private boolean fly;
    private boolean invisible;
    private int health;
    //Constructores
    
    public Hero(String superName, float force, int see, Device device,
            boolean canFly, boolean canBeInvisible, boolean fly, boolean invisible, 
            boolean canTeleport, Point position, int health,Person person) {
        super(person.getName(),person.getCountry(),person.getAge(),person.isAvailability(),person.isSingle()
        ,person.getAddress(),person.getScaleOfEvil(),person.getHeight(),person.getWeight(),person.getPhysicalProblems(),
        person.getMentalProblems(),person.getNumOfChild());
        this.superName = superName;
        this.force = force;
        this.see = see;
        this.device = device;
        this.canFly = canFly;
        this.canBeInvisible = canBeInvisible;
        this.fly = fly;
        this.invisible = invisible;
        this.health = health;
    }

    public Hero() {
    }
    //metodos getter and setter
    public String getSuperName() {
        return superName;
    }  
    public void setSuperName(String superName) {
        this.superName = superName;
    }

    public float getForce() {
        return force;
    }

    public void setForce(float force) {
        this.force = force;
    }

    public int getSee() {
        return see;
    }

    public void setSee(int see) {
        this.see = see;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    
    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean isCanBeInvisible() {
        return canBeInvisible;
    }

    public void setCanBeInvisible(boolean canBeInvisible) {
        this.canBeInvisible = canBeInvisible;
    }

    public boolean isFly() {
        return fly;
    }

    public void setFly(boolean fly) {
        this.fly = fly;
    }
    
    @Override
    public void see(Device device) {
        if(device!=null){
            this.see += device.getAddSee();
        }
    }
    @Override
    public void force(Device device) {
        if(device!=null){
            this.force += device.getAddForce();
        }
    }

    @Override
    public boolean inFly() {
        if(!this.canFly){
            return false;
        }
        else{
            this.fly = !this.fly;
            return this.fly;
        }
    }

    @Override
    public boolean isInvisible() {
        if(!this.canBeInvisible){
            return false;
        }else{
            this.invisible = !this.invisible;
            return this.invisible;
        }
    }
    //Se sobreescribe el metodo para ocultar la identidad del super humano
    @Override
    public String getName(){
        return "No es posible revelar la identidad de los super humanos ";
    }
    @Override
    public int mentalControl() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //Metodo toString de la clase
    @Override
    public String toString(){
        return "Super nombre: "+superName+"\nFuerza: "+force+"\nvisión: "+see+ "\nArtefacto: " +device.getDescription()
                +"\nSoltero: "+this.isSingle()+"\nCant Hijos: "+this.getNumOfChild()+"\nNivel de maldad: "+this.getScaleOfEvil();
    }
    //Metodo para teletransportarse con otro super humano

}
