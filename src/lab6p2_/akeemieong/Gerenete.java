/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_.akeemieong;

/**
 *
 * @author SURFACEB2I7
 */
public class Gerenete extends Personas{
    private String usuario;
    private String contra;
    private String cargo;

    public Gerenete() {
        super();
    }

    public Gerenete(String usuario, String contra, String cargo) {
        this.usuario = usuario;
        this.contra = contra;
        this.cargo = cargo;
    }

    public Gerenete(String usuario, String contra, String cargo, String identi, String nombre, char sexo, String estado, int altura, double peso) {
        super(identi, nombre, sexo, estado, altura, peso);
        this.usuario = usuario;
        this.contra = contra;
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString()
                + "Usuario: " + usuario 
                + "\nContra: " + contra 
                + "\nCargo: " + cargo + "\n";
    }
    
    
    
}
