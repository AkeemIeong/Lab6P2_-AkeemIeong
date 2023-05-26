/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_.akeemieong;

/**
 *
 * @author SURFACEB2I7
 */
public class Personas {
    private String identi;
    private String nombre;
    private char sexo;
    private String estado;
    private int altura;
    private double peso;

    public Personas() {
    }
    
    public Personas(String identi, String nombre, char sexo, String estado, int altura, double peso) {
        this.identi = identi;
        this.nombre = nombre;
        this.sexo = sexo;
        this.estado = estado;
        setAltura(altura);
        setPeso(peso);
    }

    public String getIdenti() {
        return identi;
    }

    public void setIdenti(String identi) {
        this.identi = identi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if(altura>0){
            this.altura = altura;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso>0){
            this.peso = peso;
        }
    }

    @Override
    public String toString() {
        return "Identificacion: " + identi 
                +"\nNombre: " + nombre 
                + "\nSexo: " + sexo 
                + "\nEstado civil: " + estado 
                + "\nAltura de la personas: " + altura 
                + "\nPeso de la persona:" + peso + "\n";
    }
    
    
}
