//@author Gustavo
package parcial2;

import java.util.ArrayList;

public class personalDocente {

    private String conocimiento;
    private String experiencia;
    private int trayectoria;
    private ArrayList<estudiante> aEstudiante = new ArrayList<>();
    private ArrayList<universidad> aUniversidad = new ArrayList<>();
    private ArrayList<recopilacion> aRecopilacion = new ArrayList<>();
    private ejecucionDelProyecto ejecucionDelProyecto1;

    private String nombre;
    
//Contructor
    public personalDocente(String conocimiento, String experiencia, int trayectoria, String nombre) {
        this.conocimiento = conocimiento;
        this.experiencia = experiencia;
        this.trayectoria = trayectoria;
        this.nombre = nombre;
    }
    
    

    public String getConocimiento() {
        return conocimiento;
    }

    public void setConocimiento(String conocimiento) {
        this.conocimiento = conocimiento;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public int getTrayectoria() {
        return trayectoria;
    }

    public void setTrayectoria(int trayectoria) {
        this.trayectoria = trayectoria;
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

    public ArrayList<universidad> getaUniversidad() {
        return aUniversidad;
    }

    public void setaUniversidad(ArrayList<universidad> aUniversidad) {
        this.aUniversidad = aUniversidad;
    }

    public void addUniversidad(universidad u) {
        this.aUniversidad.add(u);
    }

    public ArrayList<recopilacion> getaRecopilacion() {
        return aRecopilacion;
    }

    public void setaRecopilacion(ArrayList<recopilacion> aRecopilacion) {
        this.aRecopilacion = aRecopilacion;
    }

    public void addRecopilacion(recopilacion r) {
        this.aRecopilacion.add(r);
    }

    public ejecucionDelProyecto getEjecucionDelProyecto1() {
        return ejecucionDelProyecto1;
    }

    public void setEjecucionDelProyecto1(ejecucionDelProyecto ejecucionDelProyecto1) {
        this.ejecucionDelProyecto1 = ejecucionDelProyecto1;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //metodos
    public String evaluar() {
        return "evaluar";
    }

    public String funcionDeSeguimiento() {
        return "funcionDeSeguimiento";
    }

    public String gestion() {
        return "gestion";
    }

    public String orientar() {
        return "orientar";
    }



}

