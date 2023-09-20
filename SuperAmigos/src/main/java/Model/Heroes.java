/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Control.Poderes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author brayan.gomez1
 */
public class Heroes extends Person implements Poderes{
    private int see;
    private String artefacto;
    private int force;
    List<Heroes> listaDeHeroes = new ArrayList<>();

    public Heroes(int see, String artefacto, int force, String superNombre, String nombre,String pais, int edad, boolean disponibilidad, boolean soltero) {
        super(nombre, superNombre, pais, edad, disponibilidad, soltero);
        this.see = see;
        this.artefacto = artefacto;
        this.force = force;
        this.superNombre = superNombre;
    }
    

    
    public Heroes(){
        
    }
    
    private String superNombre;

    public String getSuperNombre() {
        return superNombre;
    }

    public void setSuperNombre(String superNombre) {
        this.superNombre = superNombre;
    }

    public int getSee() {
        return see;
    }

    public void setSee(int see) {
        this.see = see;
    }

    public String getArtefacto() {
        return artefacto;
    }

    public void setArtefacto(String artefacto) {
        this.artefacto = artefacto;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public List<Heroes> getListaDeHeroes() {
        return listaDeHeroes;
    }
    @Override
    public String toString(){
        return "Super nombre "+superNombre+" edad: "+edad+" pais: "+pais+" dispnibilidad: "+disponibilidad+" soltero: "+soltero;
    }

    @Override
    public void see(String artefacto, int see) {
        if(!artefacto.isEmpty()){
            this.see += see;
        }
    }

    @Override
    public void force(String artefacto, int force) {
        if(!artefacto.isEmpty()){
            this.force +=force;
        }
    }
    
}
