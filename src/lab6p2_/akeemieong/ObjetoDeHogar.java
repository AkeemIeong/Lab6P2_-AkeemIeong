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
public class ObjetoDeHogar extends Objeto{
    private String descri;
    private String lugar;
    private String funcio;
    private int garantia;

    public ObjetoDeHogar() {
        super();
    }

    public ObjetoDeHogar(String descri, String lugar, String funcio, int garantia) {
        this.descri = descri;
        this.lugar = lugar;
        this.funcio = funcio;
        this.garantia = garantia;
    }

    public ObjetoDeHogar(String descri, String lugar, String funcio, int garantia, Color color, String des, String marca, char tamano, String calidad, Personas persona) {
        super(color, des, marca, tamano, calidad, persona);
        this.descri = descri;
        this.lugar = lugar;
        this.funcio = funcio;
        this.garantia = garantia;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFuncio() {
        return funcio;
    }

    public void setFuncio(String funcio) {
        this.funcio = funcio;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return "ObjetoDeHogar{" + "descri=" + descri + ", lugar=" + lugar + ", funcio=" + funcio + ", garantia=" + garantia + '}';
    }
    
}
