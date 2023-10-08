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
    private ArrayList<String> combatStatus = new ArrayList();
    public WarMechanics(){
    }

    
    
    

    public WarMechanics(ArrayList<Hero> heroes1, ArrayList<Alfis> alfis) {
        this.heroes1 = heroes1;
        this.alfis = alfis;
    }
    // Inicializa los vectores en 10 posiciones de sus respectivas arrayLists
    // hace uso de los arrays state1 y state 2 para visualizar un estado del personaje, y establece la vida de cada uno 
    private ArrayList<Integer> separeSquads(){
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
        positions.add((squad2Start + 9) > heroes1.size() ? heroes1.size() : squad2Start + 9 );
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
        for (int i = 10; i < separeSquads().get(2); i++) {
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
    public void attackAction(Hero atacante, Alfis defensor){
        Random random = new Random();
        Double probabilities = random.nextDouble();
        if (probabilities > 0.1 && atacante.getHealth() > 0){
            defensor.setHealth((int)((defensor.getHealth()- atacante.getForce()/100) > 0 ? (defensor.getHealth()- atacante.getForce()/100) : 0));
            reportActions(atacante.getSuperName(), defensor.getName(), "golpe", (int)(atacante.getForce()/100) );
        }
        
    }
    // polimorfismo usado para cuando el alfi ataca a un superhumanos, se tiene es cuenta si el superhumano posee
    // habilidades de vuelo e invisibilidad
    public void attackAction(Alfis atacante, Hero defensor){
        Random random = new Random();
        Double probabilities = random.nextDouble();
        if (defensor.inFly() && probabilities > 0.1 && atacante.getHealth() > 0){
            defensor.setHealth((int)((defensor.getHealth()- atacante.getsuperStrenght()/100) > 0 ? (defensor.getHealth()- atacante.getsuperStrenght()/100) : 0));
            reportActions(atacante.getName(), defensor.getSuperName(), "golpe", (int)(atacante.getsuperStrenght()/100));
        }
        else if (defensor.isInvisible() && probabilities > 0.95 && atacante.getHealth() > 0){
            defensor.setHealth((int)((defensor.getHealth()- atacante.getsuperStrenght()/100) > 0 ? (defensor.getHealth()- atacante.getsuperStrenght()/100) : 0));
            reportActions(atacante.getName(), defensor.getSuperName(), "golpe", (int)(atacante.getsuperStrenght()/100));
        }
        else if (atacante.getHealth() > 0){
            defensor.setHealth((int)((defensor.getHealth()- atacante.getsuperStrenght()/100) > 0 ? (defensor.getHealth()- atacante.getsuperStrenght()/100) : 0));
            reportActions(atacante.getName(), defensor.getSuperName(), "golpe", (int)(atacante.getsuperStrenght()/100));
        }
            
            
    }
    // evento que se genera cuando en la combox se elige la opción de usar artefacto
    // contiene condicionales para activar las debilidades de los alfis, según el atributo "weaken" del artefacto
    public void deviceAction(Hero atacante, Alfis defensor){
        if ("Rayos UV".equals(atacante.getDevice().getWeaken())){
            defensor.setultraViolVul(true);
            reportActions(atacante.getSuperName(), defensor.getName(),atacante.getDevice().getDescription(), atacante.getDevice().getWeaken()+" (divide su fuerza en 5 unidades)");
        }
        else if ("Vinagre".equals(atacante.getDevice().getWeaken())){
            defensor.setvinagerVul(true);
            reportActions(atacante.getSuperName(), defensor.getName(),atacante.getDevice().getDescription(), atacante.getDevice().getWeaken()+" (resta 15 de salud cada turno)");
        }
        else if ("Rayos Gamma".equals(atacante.getDevice().getWeaken())){
            defensor.setgammaRVul(true);
            reportActions(atacante.getSuperName(), defensor.getName(),atacante.getDevice().getDescription(), atacante.getDevice().getWeaken()+"El Alfi muere");
        }
        else if ("H&S".equals(atacante.getDevice().getWeaken())){
            defensor.sethSVul(true);
            reportActions(atacante.getSuperName(), defensor.getName(),atacante.getDevice().getDescription(), atacante.getDevice().getWeaken()+"(El Alfi muere)");
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
        boolean end = false;
            int numDthA = 0;
        int numDthS = 0;
        for(Hero elements : heroSide){
            if (elements.getHealth() == 0) {
                numDthS += 1;
            }
        }
        for(Alfis elements : alfiSide){
            if (elements.getHealth() == 0) {
                numDthA += 1;
            }
        }
        if (numDthA+numDthS == 10 && reinforcements1.size() == 0) {
            end = true;
        }
        return end;
    }
   
    public String informCombatWinner(){
        int numDthA = 0;
        int numDthS = 0;
        for(Hero elements : heroSide){
            if (elements.getHealth() == 0) {
                numDthS += 1;
            }
        }
        for(Alfis elements : alfiSide){
            if (elements.getHealth() == 0) {
                numDthA += 1;
            }
        }
        if (((numDthA == 10))) {
            return "Los Super Humanos han ganado el combate";
        }
        else if (((numDthS == 10) || (numDthS >= numDthA )) && (reinforcements1.size() == 0)) {
            return "Los Alfis han ganado la ronda";
        }
        else if (((numDthS == 10) || (numDthS >= numDthA )) && (reinforcements1.size() == 0) && endFight()) {
            return "Los alfis han ganado el combate";
        }
        return "El combate no ha terminado, sigue luchando!!";
    }
    
    public void fillNewRound(){
        System.out.println(heroes1.size());
        for(int i = 0; i < 10; i++){
            heroSide.add(heroes1.get(separeSquads().get(2)+ i));
            state1.add("☺");
            heroSide.get(i).setHealth(100);
        }
        for (int i = separeSquads().get(3); i < separeSquads().get(4); i++) {
            reinforcements1.add(heroes1.get(i));
        }  
    }
    public ArrayList<String> combatDeaths(){
        for (Hero elements : heroes1) {
            if (elements.getHealth() == 0) {
                deadHero.add(elements.getSuperName());
            }
        }
        return deadHero;
    }
    
    public ArrayList<String> reportActions(String atacante, String defensor, String action, Integer damage){
        combatStatus.add(atacante+" con un "+action+" le resta un total de "+damage.toString()+" puntos de salud a "+defensor);
        combatStatus.add("\n---------------------------------------------------------------------------------------------------------------------");
        return combatStatus;
    }
    public ArrayList<String> reportActions(String atacante, String defensor, String device, String weaken){
        combatStatus.add(atacante+" con un/una "+device+" activa la vulnerabilidad al "+weaken+" de "+defensor);
        combatStatus.add("\n---------------------------------------------------------------------------------------------------------------------");
        return combatStatus;
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

    public ArrayList<String> getCombatStatus() {
        return combatStatus;
    }
    
    
    }
  
    
    
  
