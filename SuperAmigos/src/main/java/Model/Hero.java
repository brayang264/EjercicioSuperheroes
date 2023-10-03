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
    private String superName;
    private int force;
    private int see;
    private String device;
    private boolean canFly;
    private boolean canBeInvisible;
    private boolean fly;
    private boolean invisible;
    private boolean canTeleport;
    private Point position;
    private int health;
    
        public String getSuperName() {
        return superName;
    }

    public void setSuperName(String superName) {
        this.superName = superName;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getSee() {
        return see;
    }

    public void setSee(int see) {
        this.see = see;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
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
    public void see(String device, int see) {
        if(!device.isEmpty()){
            this.see += see;
        }
    }

    @Override
    public void force(String device, int force) {
        if(!device.isEmpty()){
            this.force += force;
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
    @Override
    public String getName(){
        return "No es posible revelar la identidad de los super humanos ";
    }
    
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
    public String teleportWithPerson(Person person, Point currentPoint){
        if(!this.canTeleport){
            return this.superName+" no puedo ayudar a "+person.getName()+" a escapar del peligro";
        }else{
            this.position = currentPoint;
            return this.superName+" a llevado a "+person.getName()+" a un lugar seguro";
        }
    }
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
    public String killHero(){
        return this.superName+" a muerto en combate";
    }

}
