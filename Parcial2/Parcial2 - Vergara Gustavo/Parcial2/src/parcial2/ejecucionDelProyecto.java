//@author Gustavo
package parcial2;

import java.util.ArrayList;

public class ejecucionDelProyecto {

    private String proyectoDeGradoTerminado;
    private int recursosdisponibles;

    private resultados resultados1 = new resultados();
    private proyectoDeGrado proyectoDeGrado;
    private ArrayList<estudiante> aEstudiante = new ArrayList<>();
    private ArrayList<personalDocente> aPersonalDocente = new ArrayList<>();
    
    //Contructor Vacio
    public ejecucionDelProyecto() {

    }

    //Contructor
    public ejecucionDelProyecto(String proyectoDeGradoTerminado, int recursosdisponibles) {
        this.proyectoDeGradoTerminado = proyectoDeGradoTerminado;
        this.recursosdisponibles = recursosdisponibles;
    }

    public String getProyectoDeGradoTerminado() {
        return proyectoDeGradoTerminado;
    }

    public void setProyectoDeGradoTerminado(String proyectoDeGradoTerminado) {
        this.proyectoDeGradoTerminado = proyectoDeGradoTerminado;
    }

    public int getRecursosdisponibles() {
        return recursosdisponibles;
    }

    public void setRecursosdisponibles(int recursosdisponibles) {
        this.recursosdisponibles = recursosdisponibles;
    }

    public resultados getResultados1() {
        return resultados1;
    }

    public void setResultados1(resultados resultados1) {
        this.resultados1 = resultados1;
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

    public proyectoDeGrado getProyectoDeGrado() {
        return proyectoDeGrado;
    }

    public void setProyectoDeGrado(proyectoDeGrado proyectoDeGrado) {
        this.proyectoDeGrado = proyectoDeGrado;
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
    public String comenzarDesarrolloDelProyecto() {
        return "comenzarDesarrolloDelProyecto";
    }

    public String finalizarDesarrolloDelProyecto() {
        return "finalizarDesarrolloDelProyecto";
    }



}
