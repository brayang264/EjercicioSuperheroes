/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author PC
 */
public class WarMechanics {
    private ArrayList<Hero> heroes1;
    private ArrayList<Hero> reinforcements1 = new ArrayList();
    private ArrayList<Alfis> alfis;
    private ArrayList<String> state1 = new ArrayList();
    private ArrayList<String> state2 = new ArrayList();
    private ArrayList<Hero>  heroSide = new ArrayList();
    private ArrayList<Alfis> alfiSide = new ArrayList();
    private ArrayList<String> deadHero = new ArrayList();
    
    public WarMechanics(){
    }

    
    
    

    public WarMechanics(ArrayList<Hero> heroes1, ArrayList<Alfis> alfis) {
        this.heroes1 = heroes1;
        this.alfis = alfis;
    }
    // Inicializa los vectores en 10 posiciones de sus respectivas arrayLists
    // hace uso de los arrays state1 y state 2 para visualizar un estado del personaje, y establece la vida de cada uno 
    public void FillPositions (){
        
        for(int i = 0; i < 10; i++){
            heroSide.add(heroes1.get(i));
            alfiSide.add(alfis.get(i));
            state1.add("☺");
            state2.add("☺");
            heroSide.get(i).setHealth(100);
            alfiSide.get(i).setHealth(100);
            
            
        }
        
        for (int i = 10; i < heroes1.size(); i++) {
            reinforcements1.add(heroes1.get(i));
        }
    
    }
    // Método que crea un nuevo vector de String que contenga los nombres de cada Alfi
    public ArrayList<String> alfisToString(){
        ArrayList<String> labelAlfi = new ArrayList();
        for(int i = 0; i < 10; i++){
            labelAlfi.add(String.valueOf(alfiSide.get(i).getName())+"["+String.valueOf(alfiSide.get(i).getHealth())+"]"+"\t"+state2.get(i));
            if(alfiSide.get(i).getHealth() <= 0){
                state2.set(i, "😔");
            }
            else{
            state1.set(i, "☺");
        }
        }
        
        return labelAlfi ;
    }
    // Método que crea un nuevo vector de String que contenga los nombres de cada SuperHumano
    public ArrayList<String> heroToString(){
        ArrayList<String> labelHero = new ArrayList();
        for(int i = 0; i < 10; i++){
            labelHero.add(String.valueOf(heroSide.get(i).getSuperName())+"["+String.valueOf(heroSide.get(i).getHealth())+"]"+"\t"+state1.get(i));
        if(heroSide.get(i).getHealth() <= 0){
                state1.set(i, "😔");
            }
        else{
            state1.set(i, "☺");
        }
        }
        return labelHero ;
    }
    // genera el evento del ataque, el cual está condicionado a fallar en un 10% contra enemigos voladores
    public void AttackAction(Hero atacante, Alfis defensor){
        Random random = new Random();
        Double probabilities = random.nextDouble();
        if (probabilities > 0.1 && atacante.getHealth() > 0){
            defensor.setHealth((int)((defensor.getHealth()- atacante.getForce()/100) > 0 ? (defensor.getHealth()- atacante.getForce()/100) : 0));
        }
        
    }
    // polimorfismo usado para cuando el alfi ataca a un superhumanos, se tiene es cuenta si el superhumano posee
    // habilidades de vuelo e invisibilidad
    public void AttackAction(Alfis atacante, Hero defensor){
        Random random = new Random();
        Double probabilities = random.nextDouble();
        if (defensor.inFly() && probabilities > 0.1 && atacante.getHealth() > 0){
            defensor.setHealth((int)((defensor.getHealth()- atacante.getSUPERSTRENGHT()/100) > 0 ? (defensor.getHealth()- atacante.getSUPERSTRENGHT()/100) : 0));
        }
        else if (defensor.isInvisible() && probabilities > 0.95 && atacante.getHealth() > 0){
            defensor.setHealth((int)((defensor.getHealth()- atacante.getSUPERSTRENGHT()/100) > 0 ? (defensor.getHealth()- atacante.getSUPERSTRENGHT()/100) : 0));
        }
        else if (atacante.getHealth() > 0){
            defensor.setHealth((int)((defensor.getHealth()- atacante.getSUPERSTRENGHT()/100) > 0 ? (defensor.getHealth()- atacante.getSUPERSTRENGHT()/100) : 0));
        }
            
            
    }
    // evento que se genera cuando en la combox se elige la opción de usar artefacto
    // contiene condicionales para activar las debilidades de los alfis, según el atributo "weaken" del artefacto
    public void DeviceAction(Hero atacante, Alfis defensor){
        if ("Rayos UV".equals(atacante.getDevice().getWeaken())){
            defensor.setUVR_VUL(true);
        }
        else if ("Vinagre".equals(atacante.getDevice().getWeaken())){
            defensor.setVG_VUL(true);
        }
        else if ("Rayos Gamma".equals(atacante.getDevice().getWeaken())){
            defensor.setGR_VUL(true);
        }
        else if ("H&S".equals(atacante.getDevice().getWeaken())){
            defensor.setHS_VUL(true);
        }
    }
    // método que cuando se activa genera un efecto si se ha activado la vulnerabilidad del alfi
    public void ApplyVulnerabilities(ArrayList<Alfis> alfis){
        for(Alfis elements: alfis){
            if (elements.isGR_VUL()){
                elements.setHealth(elements.getHealth() - 100 > 0 ? elements.getHealth() - 100 : 0 );
                elements.setGR_VUL(false);
            }
            else if(elements.isUVR_VUL()){
                elements.setSUPERSTRENGHT(elements.getSUPERSTRENGHT()/5);
                elements.setUVR_VUL(false);
            }
            else if(elements.isVG_VUL()){
                elements.setHealth((int) (elements.getHealth() - 15 > 0 ? elements.getHealth() - 15 : 0 ));
            }
            else if(elements.isHS_VUL()){
                elements.setHealth(elements.getHealth() - 100 > 0 ? elements.getHealth() - 100 : 0);
                elements.setHS_VUL(false);
            }
        }
    }
    // Método que permite rellenar las posiciones cuando se cuenta con un escuadrón de más de 10 Super Humanos
    public void Replace(){
       Iterator<Hero> it = reinforcements1.iterator();
       int count = 0;
        if (it.hasNext()) {
            for (Hero elements : heroSide) {
            if ((elements.getHealth() <= 0) &&(alfiSide.get(heroSide.indexOf(elements)).getHealth() > 0)) {
                count = heroSide.indexOf(elements);
                break;
            }
        }
            deadHero.add(heroSide.get(count).getSuperName());
            heroSide.set(heroSide.indexOf(heroSide.get(count)), it.next());
            it.remove();
        }
        else if (!it.hasNext() && !EndofFight()) {
            for (Hero elements : heroSide) {
                if ((elements.getHealth() <= 0) &&(alfiSide.get(heroSide.indexOf(elements)).getHealth() > 0)) {
                    count = heroSide.indexOf(elements);
                }
            }
            deadHero.add(heroSide.get(count).getSuperName());
        }
        System.out.println(reinforcements1.size());
       System.out.println(deadHero);
    }
    // Método para identificar cuando todos los combatientes de uno u otro bando están muertos, y así terminar la ronda
    public boolean EndofFight(){
        boolean end = true;
            for(Hero elements: heroSide){
                if((elements.getHealth() > 0) || (alfiSide.get(heroSide.indexOf(elements)).getHealth() > 0)){
                    end = false;
                    return end;
                }
            }
        return end;
    }
    
    
    public Boolean isdead(Hero hero){
    return hero.getHealth() <= 0;
    }
    
    public Boolean isdead(Alfis alfi){
    return alfi.getHealth() <= 0;
    }

    public ArrayList<Hero> getHeroSide() {
        return heroSide;
    }

    public ArrayList<Alfis> getAlfiSide() {
        return alfiSide;
    }
    
    }
  
    
    
  
