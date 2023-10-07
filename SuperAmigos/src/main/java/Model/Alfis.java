/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author PC
 */
public class Alfis {
    private String name;
    private float size;
    private int health;
    private static final boolean flight = true;
    private float superStrenght = size*5;
    private boolean vinagerVul = false;  // Se inicializan las vulnerabilidades en false, para que al interactuar con un artefacto este las modifica a true
    private boolean hSVul = false;
    private boolean gammaRVul = false;
    private boolean ultraViolVul = false;

    public Alfis() {
    }
    
    public Alfis(String name, float size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public float getsuperStrenght() {
        return size*5;
    }

    public void setsuperStrenght(float superStrenght) {
        this.superStrenght = superStrenght;
    }
    
    

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isvinagerVul() {
        return vinagerVul;
    }

    public void setvinagerVul(boolean vinagerVul) {
        this.vinagerVul = vinagerVul;
    }

    public boolean ishSVul() {
        return hSVul;
    }

    public void sethSVul(boolean hSVul) {
        this.hSVul = hSVul;
    }

    public boolean isgammaRVul() {
        return gammaRVul;
    }

    public void setgammaRVul(boolean gammaRVul) {
        this.gammaRVul = gammaRVul;
    }

    public boolean isultraViolVul() {
        return ultraViolVul;
    }

    public void setultraViolVul(boolean ultraViolVul) {
        this.ultraViolVul = ultraViolVul;
    }
    

    
    
    @Override
    public String toString() {
        return "Alfis{" + "name=" + name + ", size=" + size + ", superStrenght=" + superStrenght + '}';
    }
    
}
