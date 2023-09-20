/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.Heroes;
import Model.Person;

/**
 *
 * @author brayan.gomez1
 */
public interface Validate {
    public boolean isHero(Person person);
    public Heroes createHero(Person person, String artefacto, int force, int see);
    
}
