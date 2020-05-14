//@author Gustavo
package parcial2;

import java.util.ArrayList;

public class soluciones {

    private String alternativas;

    private proyectoDeGrado proyectoDeGrado1;
    private ArrayList<estudiante> aEstudiantes = new ArrayList<>();

    
    //constructor
    public soluciones(String alternativas) {
        this.alternativas = alternativas;
    }

    //getter setter
    public String getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(String alternativas) {
        this.alternativas = alternativas;
    }

    public proyectoDeGrado getProyectoDeGrado1() {
        return proyectoDeGrado1;
    }

    public void setProyectoDeGrado1(proyectoDeGrado proyectoDeGrado1) {
        this.proyectoDeGrado1 = proyectoDeGrado1;
    }
    
    public ArrayList<estudiante> getaEstudiantes() {
        return aEstudiantes;
    }

    public void setaEstudiantes(ArrayList<estudiante> aEstudiantes) {
        this.aEstudiantes = aEstudiantes;
    }
    
    public void addEstudiantes(estudiante e){
    this.aEstudiantes.add(e);
    }
    
    //metodos
    public String escoger() {
        return "escoger";
    }



}
