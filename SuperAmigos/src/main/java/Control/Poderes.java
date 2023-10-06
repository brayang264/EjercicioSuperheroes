/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Control;

import Model.Device;
import java.awt.Point;

/**
 *
 * @author Jhomar Arrieta
 * 
 * Intercafe / prima de clase -> metodos
 */

public interface Poderes {
    //public boolean see(String artefacto); //no tiene atributos
    public void see(Device device);
    public void force(Device device);
    public boolean inFly();
    public boolean isInvisible();
    public int mentalControl();
    

}
