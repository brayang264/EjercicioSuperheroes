/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Control.Poderes;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author brayan.gomez1
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
    private boolean canTeleport;
    private Point position;
    private int health;

    //Constructores
    
    public Hero(String superName, float force, int see, Device device,
            boolean canFly, boolean canBeInvisible, boolean fly, boolean invisible, 
            boolean canTeleport, Point position, int health) {
        this.superName = superName;
        this.force = force;
        this.see = see;
        this.device = device;
        this.canFly = canFly;
        this.canBeInvisible = canBeInvisible;
        this.fly = fly;
        this.invisible = invisible;
        this.canTeleport = canTeleport;
        this.position = position;
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

    public boolean isCanTeleport() {
        return canTeleport;
    }

    public void setCanTeleport(boolean canTeleport) {
        this.canTeleport = canTeleport;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
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
    public String teleport(Point currentPoint) {
        if(!this.canTeleport){
            return "El super humano actual no tiene la capacidad para teletransportarse";
        }else{
            this.position = currentPoint;
            return this.superName+" se ha teletransportado a "+currentPoint;
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
        return "Super nombre: "+superName+"\nFuerza: "+force+"\nvisión: "+see+ "\nArtefacto: " +device;
    }
    //Metodo para teletransportarse con otro super humano
    private String teleportWithFriend(Hero hero, Point currentPoint){
        if(!this.canTeleport){
            return this.superName+" no tiene la capacidad para teletransportarse";
        }else{
            this.setPosition(currentPoint);
            hero.setPosition(currentPoint);
            return this.superName+" se ha teletransportado con "+hero.getSuperName()+" a las coordenadas "+
                    currentPoint;
        }
    }
    //metodo para teletranspotarse con una persona 
    public String teleportWithPerson(Person person, Point currentPoint){
        if(!this.canTeleport){
            return this.superName+" no puedo ayudar a "+person.getName()+" a escapar del peligro";
        }else{
            this.position = currentPoint;
            return this.superName+" a llevado a "+person.getName()+" a un lugar seguro";
        }
    }
    //Metodo que le quita vida al super humano
    public void removeHealth(int damage){
        this.health -= damage;
    }
    public void regainHealth(int health){
        if((this.health +=health) > 100){
            this.health = 100;
        }else{
            this.health += health;
        }
    }
    //metodo que imprime que el super humano ha caido en conbate 
    public String killHero(){
        return this.superName+" a muerto en combate";
    }

}
