//@author Gustavo
package parcial2;

import java.util.ArrayList;

public class estudiante {

    private int aspiranteAGrado;

    private ArrayList<soluciones> aSoluciones = new ArrayList<>();
    private proyectoDeGrado proyectoDeGrado1;
    private ArrayList<universidad> aUniversidad = new ArrayList<>();
    private ArrayList<personalDocente> aPersonalDocente = new ArrayList<>();
    private ejecucionDelProyecto ejecucionDelProyecto1;
    private String nombre;

    //Contructor

    public estudiante(int aspiranteAGrado, String nombre) {
        this.aspiranteAGrado = aspiranteAGrado;
        this.nombre = nombre;
    }


    public int getAspiranteAGrado() {
        return aspiranteAGrado;
    }

    public void setAspiranteAGrado(int aspiranteAGrado) {
        this.aspiranteAGrado = aspiranteAGrado;
    }

    public ArrayList<soluciones> getaSoluciones() {
        return aSoluciones;
    }

    public void setaSoluciones(ArrayList<soluciones> aSoluciones) {
        this.aSoluciones = aSoluciones;
    }

    public void addSoluciones(soluciones s) {
        this.aSoluciones.add(s);
    }

    public ejecucionDelProyecto getEjecucionDelProyecto1() {
        return ejecucionDelProyecto1;
    }

    public void setEjecucionDelProyecto1(ejecucionDelProyecto ejecucionDelProyecto1) {
        this.ejecucionDelProyecto1 = ejecucionDelProyecto1;
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

    public ArrayList<universidad> getaUniversidad() {
        return aUniversidad;
    }

    public void setaUniversidad(ArrayList<universidad> aUniversidad) {
        this.aUniversidad = aUniversidad;
    }

    public void addUniversidad(universidad u) {
        this.aUniversidad.add(u);
    }

    public proyectoDeGrado getProyectoDeGrado1() {
        return proyectoDeGrado1;
    }

    public void setProyectoDeGrado1(proyectoDeGrado proyectoDeGrado1) {
        this.proyectoDeGrado1 = proyectoDeGrado1;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //metodos
    public String estudiar() {
        return "estudiar";
    }

    public String formarse() {
        return "formarse";
    }

    public String irALaUniversidad() {
        return "irALaUniversidad";
    }


}
