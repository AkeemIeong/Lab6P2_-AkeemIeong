/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_.akeemieong;

/**
 *
 * @author SURFACEB2I7
 */
public class PersonalGeneral extends Personas{
    private String occupa;
    private String horario;
    private int tiempo;
    private double pago;

    public PersonalGeneral() {
        super();
    }

    public PersonalGeneral(String occupa, String horario, int tiempo, double pago) {
        this.occupa = occupa;
        this.horario = horario;
        this.tiempo = tiempo;
        this.pago = pago;
    }

    public PersonalGeneral(String occupa, String horario, int tiempo, double pago, String identi, String nombre, char sexo, String estado, int altura, double peso) {
        super(identi, nombre, sexo, estado, altura, peso);
        this.occupa = occupa;
        this.horario = horario;
        this.tiempo = tiempo;
        this.pago = pago;
    }

    public String getOccupa() {
        return occupa;
    }

    public void setOccupa(String occupa) {
        this.occupa = occupa;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    @Override
    public String toString() {
        return super.toString() + "occupa=" + occupa + ", horario=" + horario + ", tiempo=" + tiempo + ", pago=" + pago + '}';
    }
    
    
}
