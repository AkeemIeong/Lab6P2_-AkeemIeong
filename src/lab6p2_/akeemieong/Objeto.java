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
public class Objeto {
    private Color color;
    private String des;
    private String marca;
    private char tamano;
    private String calidad;
    private Personas persona;

    public Objeto() {
    }

    public Objeto(Color color, String des, String marca, char tamano, String calidad, Personas persona) {
        this.color = color;
        this.des = des;
        this.marca = marca;
        this.tamano = tamano;
        this.calidad = calidad;
        this.persona = persona;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public char getTamano() {
        return tamano;
    }

    public void setTamano(char tamano) {
        this.tamano = tamano;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public Personas getPersona() {
        return persona;
    }

    public void setPersona(Personas persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Objeto{" + "color=" + color + ", des=" + des + ", marca=" + marca + ", tamano=" + tamano + ", calidad=" + calidad + ", persona=" + persona + '}';
    }
    
    
}
