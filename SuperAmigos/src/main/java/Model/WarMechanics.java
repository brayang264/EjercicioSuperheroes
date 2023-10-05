/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class WarMechanics {
    private ArrayList<Person> heroes1;
    private ArrayList<Alfis> alfis;
    ArrayList<String> state1 = new ArrayList();
    ArrayList<Integer> lifeCount1 = new ArrayList();
    ArrayList<String> state2 = new ArrayList();
    ArrayList<Integer> lifeCount2 = new ArrayList();
    ArrayList<Person>  heroSide = new ArrayList();
    ArrayList<Alfis> alfiSide = new ArrayList();
    
    public WarMechanics(){
    }

    
    
    

    public WarMechanics(ArrayList<Person> heroes1, ArrayList<Alfis> alfis) {
        this.heroes1 = heroes1;
        this.alfis = alfis;
    }
    
    public void FillPositions (){
        
        for(int i = 0; i < 10; i++){
            heroSide.add(this.heroes1.get(i));
            alfiSide.add(this.alfis.get(i));
            state1.add("☺");
            state2.add("☺");
            lifeCount1.add(10);
            lifeCount2.add(10);
            
        }
    
    }
    public ArrayList<String> alfisToString(){
        ArrayList<String> labelAlfi = new ArrayList();
        for(int i = 0; i < 10; i++){
            labelAlfi.add(String.valueOf(alfiSide.get(i).getName())+"["+String.valueOf(lifeCount1.get(i))+"]"+"\t"+state2.get(i));
        }
        return labelAlfi ;
    }
    
    public ArrayList<String> heroToString(){
        ArrayList<String> labelHero = new ArrayList();
        for(int i = 0; i < 10; i++){
            labelHero.add(String.valueOf(heroSide.get(i).getName())+"["+String.valueOf(lifeCount2.get(i))+"]"+"\t"+state1.get(i));
        }
        return labelHero ;
    }
    
    
    }
  
    
    
    
    
    
    
    

   
    
    
    

