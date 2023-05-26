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
public class Ropa extends Objeto{
    private char talla;
    private String tipo;
    private String pais;

    public Ropa() {
        super();
    }

    public Ropa(char talla, String tipo, String pais) {
        this.talla = talla;
        this.tipo = tipo;
        this.pais = pais;
    }

    public Ropa(char talla, String tipo, String pais, Color color, String des, String marca, char tamano, String calidad, Personas persona) {
        super(color, des, marca, tamano, calidad, persona);
        this.talla = talla;
        this.tipo = tipo;
        this.pais = pais;
    }

    public char getTalla() {
        return talla;
    }

    public void setTalla(char talla) {
        this.talla = talla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Ropa{" + "talla=" + talla + ", tipo=" + tipo + ", pais=" + pais + '}';
    }
    
}
