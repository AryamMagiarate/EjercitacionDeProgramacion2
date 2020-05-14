//@author Gustavo
package parcial2;

import java.util.ArrayList;

public class proyectoDeGrado {

    private String alcance;
    private int costo;
    private String objetivo;
    private String planDeProyecto;
    private int tiempoDeRealizacion;
    private String titulo;
    private int viabilidad;

    private soluciones soluciones1;
    private ArrayList<estudiante> aEstudiante = new ArrayList<>();
    private ejecucionDelProyecto ejecucionDelProyecto1 = new ejecucionDelProyecto();

    //constructor
    public proyectoDeGrado(String alcance, int costo, String objetivo, String planDeProyecto, int tiempoDeRealizacion, String titulo, int viabilidad) {
        this.alcance = alcance;
        this.costo = costo;
        this.objetivo = objetivo;
        this.planDeProyecto = planDeProyecto;
        this.tiempoDeRealizacion = tiempoDeRealizacion;
        this.titulo = titulo;
        this.viabilidad = viabilidad;
    }

    public String getAlcance() {
        return alcance;
    }

    public void setAlcance(String alcance) {
        this.alcance = alcance;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getPlanDeProyecto() {
        return planDeProyecto;
    }

    public void setPlanDeProyecto(String planDeProyecto) {
        this.planDeProyecto = planDeProyecto;
    }

    public int getTiempoDeRealizacion() {
        return tiempoDeRealizacion;
    }

    public void setTiempoDeRealizacion(int tiempoDeRealizacion) {
        this.tiempoDeRealizacion = tiempoDeRealizacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getViabilidad() {
        return viabilidad;
    }

    public void setViabilidad(int viabilidad) {
        this.viabilidad = viabilidad;
    }

    public ejecucionDelProyecto getEjecucionDelProyecto1() {
        return ejecucionDelProyecto1;
    }

    public void setEjecucionDelProyecto1(ejecucionDelProyecto ejecucionDelProyecto1) {
        this.ejecucionDelProyecto1 = ejecucionDelProyecto1;
    }

    public soluciones getSoluciones1() {
        return soluciones1;
    }

    public void setSoluciones1(soluciones soluciones1) {
        this.soluciones1 = soluciones1;
    }

    public ArrayList<estudiante> getaEstudiante() {
        return aEstudiante;
    }

    public void setaEstudiante(ArrayList<estudiante> aEstudiante) {
        this.aEstudiante = aEstudiante;
    }

    public void addEstudiante(estudiante e) {
        this.aEstudiante.add(e);
    }

    //metodos
    public String efectoPositivoEnRegion() {
        return "efectoPositivoEnRegion";
    }

    public String obtenerTituloProfesional() {
        return "obtenerTituloProfesional";
    }


}
