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
    private static final boolean FLIGHT = true;
    private final float SUPERSTRENGHT = size*5;
    private static  boolean VG_VUL = false;
    private static  boolean HS_VUL = false;
    private static  boolean GR_VUL = false;
    private static  boolean UVR_VUL = false;

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

    public static boolean isVG_VUL() {
        return VG_VUL;
    }

    public static void setVG_VUL(boolean VG_VUL) {
        Alfis.VG_VUL = VG_VUL;
    }

    public static boolean isHS_VUL() {
        return HS_VUL;
    }

    public static void setHS_VUL(boolean HS_VUL) {
        Alfis.HS_VUL = HS_VUL;
    }

    public static boolean isGR_VUL() {
        return GR_VUL;
    }

    public static void setGR_VUL(boolean GR_VUL) {
        Alfis.GR_VUL = GR_VUL;
    }

    public static boolean isUVR_VUL() {
        return UVR_VUL;
    }

    public static void setUVR_VUL(boolean UVR_VUL) {
        Alfis.UVR_VUL = UVR_VUL;
    }
    
    @Override
    public String toString() {
        return "Alfis{" + "name=" + name + ", size=" + size + ", SUPERSTRENGHT=" + SUPERSTRENGHT + '}';
    }
    
}
