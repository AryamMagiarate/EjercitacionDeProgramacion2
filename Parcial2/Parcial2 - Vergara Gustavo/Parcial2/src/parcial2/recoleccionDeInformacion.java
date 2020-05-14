//@author Gustavo
package parcial2;

import java.util.ArrayList;

public class recoleccionDeInformacion extends interfazIngresoInformacion{

    private String datosDeLosAfectados;
    private String datosDeLosdirectamenteInteresados;

    private ArrayList<universidad> aUniversidad = new ArrayList<>();
    
//Constructor
    public recoleccionDeInformacion(String datosDeLosAfectados, String datosDeLosdirectamenteInteresados, String comentariosAbiertosEnLinea, String formularioEnLinea, byte plataformaDeSoftware) {
        super(comentariosAbiertosEnLinea, formularioEnLinea, plataformaDeSoftware);
        this.datosDeLosAfectados = datosDeLosAfectados;
        this.datosDeLosdirectamenteInteresados = datosDeLosdirectamenteInteresados;
    }


    public String getDatosDeLosAfectados() {
        return datosDeLosAfectados;
    }

    public void setDatosDeLosAfectados(String datosDeLosAfectados) {
        this.datosDeLosAfectados = datosDeLosAfectados;
    }

    public String getDatosDeLosdirectamenteInteresados() {
        return datosDeLosdirectamenteInteresados;
    }

    public void setDatosDeLosdirectamenteInteresados(String datosDeLosdirectamenteInteresados) {
        this.datosDeLosdirectamenteInteresados = datosDeLosdirectamenteInteresados;
    }

    public ArrayList<universidad> getaUniversidad() {
        return aUniversidad;
    }

    public void setaUniversidad(ArrayList<universidad> aUniversidad) {
        this.aUniversidad = aUniversidad;
    }

    public void addUniversidad(universidad u) {
        this.aUniversidad.add(u);
    }

    //Metodos
    public String conocer() {
        return "conocer";
    }


}
