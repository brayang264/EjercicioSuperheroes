/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import Control.Validate;

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
    private Validate validate = new Validate();
    public WarMechanics(){
    }

    
    
    

    public WarMechanics(ArrayList<Hero> heroes1, ArrayList<Alfis> alfis) {
        this.heroes1 = heroes1;
        this.alfis = alfis;
    }
    // Inicializa los vectores en 10 posiciones de sus respectivas arrayLists
    // hace uso de los arrays state1 y state 2 para visualizar un estado del personaje, y establece la vida de cada uno 
    private ArrayList<Integer> SepareSquads(){
        int rEnd = 11;
        ArrayList<Integer> positions = new ArrayList();
        positions.add(0);
        positions.add(10);
        int squad2Start = 10;
        int squad2End = 20;
        for (int i=11; i < 21; i++) {
            if ((heroes1.get(i).getNumOfChild() > 0) || (heroes1.get(i).isSingle() == false)) {
                if (squad2Start == 10) {
                    squad2Start = i;
                }
                squad2End = i;
            }
        }
        positions.add(squad2Start);
        positions.add(squad2Start + 10);
        positions.add(heroes1.size());
        return positions;
    }
    public void fillPositions (){
        
    
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
        System.out.println(SepareSquads());
    
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
    public void attackAction(Hero atacante, Alfis defensor){
        Random random = new Random();
        Double probabilities = random.nextDouble();
        if (probabilities > 0.1 && atacante.getHealth() > 0){
            defensor.setHealth((int)((defensor.getHealth()- atacante.getForce()/100) > 0 ? (defensor.getHealth()- atacante.getForce()/100) : 0));
        }
        
    }
    // polimorfismo usado para cuando el alfi ataca a un superhumanos, se tiene es cuenta si el superhumano posee
    // habilidades de vuelo e invisibilidad
    public void attackAction(Alfis atacante, Hero defensor){
        Random random = new Random();
        Double probabilities = random.nextDouble();
        if (defensor.inFly() && probabilities > 0.1 && atacante.getHealth() > 0){
            defensor.setHealth((int)((defensor.getHealth()- atacante.getsuperStrenght()/100) > 0 ? (defensor.getHealth()- atacante.getsuperStrenght()/100) : 0));
        }
        else if (defensor.isInvisible() && probabilities > 0.95 && atacante.getHealth() > 0){
            defensor.setHealth((int)((defensor.getHealth()- atacante.getsuperStrenght()/100) > 0 ? (defensor.getHealth()- atacante.getsuperStrenght()/100) : 0));
        }
        else if (atacante.getHealth() > 0){
            defensor.setHealth((int)((defensor.getHealth()- atacante.getsuperStrenght()/100) > 0 ? (defensor.getHealth()- atacante.getsuperStrenght()/100) : 0));
        }
            
            
    }
    // evento que se genera cuando en la combox se elige la opción de usar artefacto
    // contiene condicionales para activar las debilidades de los alfis, según el atributo "weaken" del artefacto
    public void deviceAction(Hero atacante, Alfis defensor){
        if ("Rayos UV".equals(atacante.getDevice().getWeaken())){
            defensor.setultraViolVul(true);
        }
        else if ("Vinagre".equals(atacante.getDevice().getWeaken())){
            defensor.setvinagerVul(true);
        }
        else if ("Rayos Gamma".equals(atacante.getDevice().getWeaken())){
            defensor.setgammaRVul(true);
        }
        else if ("H&S".equals(atacante.getDevice().getWeaken())){
            defensor.sethSVul(true);
        }
    }
    // método que cuando se activa genera un efecto si se ha activado la vulnerabilidad del alfi
    public void applyVulnerabilities(ArrayList<Alfis> alfis){
        for(Alfis elements: alfis){
            if (elements.isgammaRVul()){
                elements.setHealth(elements.getHealth() - 100 > 0 ? elements.getHealth() - 100 : 0 );
                elements.setgammaRVul(false);
            }
            else if(elements.isultraViolVul()){
                elements.setsuperStrenght(elements.getsuperStrenght()/5);
                elements.setultraViolVul(false);
            }
            else if(elements.isvinagerVul()){
                elements.setHealth((int) (elements.getHealth() - 15 > 0 ? elements.getHealth() - 15 : 0 ));
            }
            else if(elements.ishSVul()){
                elements.setHealth(elements.getHealth() - 100 > 0 ? elements.getHealth() - 100 : 0);
                elements.sethSVul(false);
            }
        }
    }
    // Método que permite rellenar las posiciones cuando se cuenta con un escuadrón de más de 10 Super Humanos
    public void replace(){
       Iterator<Hero> it = reinforcements1.iterator();
       int count = 0;
        if (it.hasNext() && !endFight()) {
            for (Hero elements : heroSide) {
            if ((elements.getHealth() <= 0) &&(alfiSide.get(heroSide.indexOf(elements)).getHealth() > 0)) {
                count = heroSide.indexOf(elements);
                break;
            }
        }
            heroSide.set(heroSide.indexOf(heroSide.get(count)), it.next());
            it.remove();
        }
    }
    // Método para identificar cuando todos los combatientes de uno u otro bando están muertos, y así terminar la ronda
    public boolean endFight(){
        boolean end = true;
            for(Hero elements: heroSide){
                if((elements.getHealth() > 0) || (alfiSide.get(heroSide.indexOf(elements)).getHealth() > 0)){
                    end = false;
                    return end;
                }
            }
        return end;
    }
    
    public ArrayList<String> CombatDeaths(){
        for (Hero elements : heroes1) {
            if (elements.getHealth() == 0) {
                deadHero.add(elements.getSuperName());
            }
        }
        return deadHero;
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
  
    
    
  
