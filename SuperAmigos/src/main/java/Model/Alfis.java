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
    private static final boolean FLIGHT = true;
    private float SUPERSTRENGHT = size*5;
    private boolean VG_VUL = false;
    private boolean HS_VUL = false;
    private boolean GR_VUL = false;
    private boolean UVR_VUL = false;

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

    public float getSUPERSTRENGHT() {
        return size*5;
    }

    public void setSUPERSTRENGHT(float SUPERSTRENGHT) {
        this.SUPERSTRENGHT = SUPERSTRENGHT;
    }
    
    

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isVG_VUL() {
        return VG_VUL;
    }

    public void setVG_VUL(boolean VG_VUL) {
        this.VG_VUL = VG_VUL;
    }

    public boolean isHS_VUL() {
        return HS_VUL;
    }

    public void setHS_VUL(boolean HS_VUL) {
        this.HS_VUL = HS_VUL;
    }

    public boolean isGR_VUL() {
        return GR_VUL;
    }

    public void setGR_VUL(boolean GR_VUL) {
        this.GR_VUL = GR_VUL;
    }

    public boolean isUVR_VUL() {
        return UVR_VUL;
    }

    public void setUVR_VUL(boolean UVR_VUL) {
        this.UVR_VUL = UVR_VUL;
    }
    

    
    
    @Override
    public String toString() {
        return "Alfis{" + "name=" + name + ", size=" + size + ", SUPERSTRENGHT=" + SUPERSTRENGHT + '}';
    }
    
}
