/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Control;

import java.awt.Point;

/**
 *
 * @author Jhomar Arrieta
 * 
 * Intercafe / prima de clase -> metodos
 */

public interface Poderes {
    //public boolean see(String artefacto); //no tiene atributos
    public void see(String device, int see);
    public void force(String device, int force);
    public String teleport(Point currentPoint);
    public boolean inFly();
    public boolean isInvisible();
    

}
