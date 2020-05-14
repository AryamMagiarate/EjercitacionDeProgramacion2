//@author Gustavo
package parcial2;

import java.util.ArrayList;

public class recopilacion extends recoleccionDeInformacion{

    private String datosMayorFavorabilidad;
    private String datosMayorUrgencia;
    private ArrayList<personalDocente> aPersonalDocente = new ArrayList<>();

    //contructor
    public recopilacion(String datosMayorFavorabilidad, String datosMayorUrgencia, String datosDeLosAfectados, String datosDeLosdirectamenteInteresados, String comentariosAbiertosEnLinea, String formularioEnLinea, byte plataformaDeSoftware) {
        super(datosDeLosAfectados, datosDeLosdirectamenteInteresados, comentariosAbiertosEnLinea, formularioEnLinea, plataformaDeSoftware);
        this.datosMayorFavorabilidad = datosMayorFavorabilidad;
        this.datosMayorUrgencia = datosMayorUrgencia;
    }
    
    
    public String getDatosMayorFavorabilidad() {
        return datosMayorFavorabilidad;
    }

    public void setDatosMayorFavorabilidad(String datosMayorFavorabilidad) {
        this.datosMayorFavorabilidad = datosMayorFavorabilidad;
    }

    public String getDatosMayorUrgencia() {
        return datosMayorUrgencia;
    }

    public void setDatosMayorUrgencia(String datosMayorUrgencia) {
        this.datosMayorUrgencia = datosMayorUrgencia;
    }

    public ArrayList<personalDocente> getaPersonalDocente() {
        return aPersonalDocente;
    }

    public void setaPersonalDocente(ArrayList<personalDocente> aPersonalDocente) {
        this.aPersonalDocente = aPersonalDocente;
    }

    public void addPersonalDocente(personalDocente p) {
        this.aPersonalDocente.add(p);
    }

    //metodos
    public String filtrar() {
        return "filtrar";
    }

    public String priorizar() {
        return "priorizar";
    }

}
