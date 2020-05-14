//@author Gustavo

package parcial2;

import java.util.ArrayList;

public class interfazIngresoInformacion {

    private String comentariosAbiertosEnLinea;
    private String formularioEnLinea;
    private byte plataformaDeSoftware;
    private ArrayList<necesidades> aNecesidades = new ArrayList<>();
    private ArrayList<problemas> aProblemas = new ArrayList<>();
    
    //constructor
    public interfazIngresoInformacion(String comentariosAbiertosEnLinea, String formularioEnLinea, byte plataformaDeSoftware) {
        this.comentariosAbiertosEnLinea = comentariosAbiertosEnLinea;
        this.formularioEnLinea = formularioEnLinea;
        this.plataformaDeSoftware = plataformaDeSoftware;
    }

       
    
    
    public String getComentariosAbiertosEnLinea() {
        return comentariosAbiertosEnLinea;
    }

    public void setComentariosAbiertosEnLinea(String comentariosAbiertosEnLinea) {
        this.comentariosAbiertosEnLinea = comentariosAbiertosEnLinea;
    }

    public String getFormularioEnLinea() {
        return formularioEnLinea;
    }

    public void setFormularioEnLinea(String formularioEnLinea) {
        this.formularioEnLinea = formularioEnLinea;
    }

    public byte getPlataformaDeSoftware() {
        return plataformaDeSoftware;
    }

    public void setPlataformaDeSoftware(byte plataformaDeSoftware) {
        this.plataformaDeSoftware = plataformaDeSoftware;
    }
    
    public ArrayList<necesidades> getaNecesidades() {
        return aNecesidades;
    }

    public void setaNecesidades(ArrayList<necesidades> aNecesidades) {
        this.aNecesidades = aNecesidades;
    }

    public void addNecesidades(necesidades n) {
        this.aNecesidades.add(n);
    }

    public ArrayList<problemas> getaProblemas() {
        return aProblemas;
    }

    public void setaProblemas(ArrayList<problemas> aProblemas) {
        this.aProblemas = aProblemas;
    }

    public void addProblemas(problemas p) {
        this.aProblemas.add(p);
    }

    //metodos
    public String registroDeFormularioEnLinea(){
    return "registroDeFormularioEnLinea"; //concatenar los atributos
    }


    
}
