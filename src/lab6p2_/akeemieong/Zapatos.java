/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_.akeemieong;

import java.awt.Color;

/**
 *
 * @author SURFACEB2I7
 */
public class Zapatos extends Objeto{
    private double talla;
    private String desc;
    private int comodidad;

    public Zapatos() {
        super();
    }

    public Zapatos(double talla, String des, int comodidad) {
        this.talla = talla;
        this.desc = des;
        this.comodidad = comodidad;
    }

    public Zapatos(double talla, String desc, int comodidad, Color color, String des, String marca, char tamano, String calidad, Personas persona) {
        super(color, des, marca, tamano, calidad, persona);
        this.talla = talla;
        this.desc = desc;
        this.comodidad = comodidad;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getComodidad() {
        return comodidad;
    }

    public void setComodidad(int comodidad) {
        this.comodidad = comodidad;
    }

    @Override
    public String toString() {
        return "Zapatos{" + "talla=" + talla + ", desc=" + desc + ", comodidad=" + comodidad + '}';
    }
    
    
 
    
    
}
