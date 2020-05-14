//@author Gustavo
package parcial2;

import java.util.ArrayList;

public class universidad {

    private String cunaDelConocimiento;
    private String diferentesCarreras;
    private String privada;
    private String publica;
    private ArrayList<estudiante> aEstudiantes = new ArrayList<>();
    private ArrayList<personalDocente> aPersonalDocente = new ArrayList<>();
    private ArrayList<recoleccionDeInformacion> aRecoleccionDeInformacion = new ArrayList<>();
    private ArrayList<region> aRegion = new ArrayList<>();
    
    //ArrayList<recoleccionDeInformacion>
    public universidad(String cunaDelConocimiento, String diferentesCarreras, String privada, String publica) {
        this.cunaDelConocimiento = cunaDelConocimiento;
        this.diferentesCarreras = diferentesCarreras;
        this.privada = privada;
        this.publica = publica;
    }

    public String getCunaDelConocimiento() {
        return cunaDelConocimiento;
    }

    public void setCunaDelConocimiento(String cunaDelConocimiento) {
        this.cunaDelConocimiento = cunaDelConocimiento;
    }

    public String getDiferentesCarreras() {
        return diferentesCarreras;
    }

    public void setDiferentesCarreras(String diferentesCarreras) {
        this.diferentesCarreras = diferentesCarreras;
    }

    public String getPrivada() {
        return privada;
    }

    public void setPrivada(String privada) {
        this.privada = privada;
    }

    public String getPublica() {
        return publica;
    }

    public void setPublica(String publica) {
        this.publica = publica;
    }

    public ArrayList<estudiante> getaEstudiantes() {
        return aEstudiantes;
    }

    public void setaEstudiantes(ArrayList<estudiante> aEstudiantes) {
        this.aEstudiantes = aEstudiantes;
    }

    public void addEstudiantes(estudiante e) {
        this.aEstudiantes.add(e);
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
    
    public ArrayList<recoleccionDeInformacion> getaRecoleccionDeInformacion() {
        return aRecoleccionDeInformacion;
    }

    public void setaRecoleccionDeInformacion(ArrayList<recoleccionDeInformacion> aRecoleccionDeInformacion) {
        this.aRecoleccionDeInformacion = aRecoleccionDeInformacion;
    }
    
    public void addRecoleccionDeInformacion(recoleccionDeInformacion r) {
        this.aRecoleccionDeInformacion.add(r);
    }
    
    public ArrayList<region> getaRegion() {
        return aRegion;
    }

    public void setaRegion(ArrayList<region> aRegion) {
        this.aRegion = aRegion;
    }
    
    public void addRegion(region r) {
        this.aRegion.add(r);
    }

    //metodos
    public String ayudarSociedad() {
        return "ayudarSociedad";
    }

    public void capacitarEstudiantes() {
        System.out.println("capacitarEstudiantes");
    }

    public String desarrollo() {
        return "desarrollo";
    }

    public String investigacion() {
        return "investigacion";
    }




}
