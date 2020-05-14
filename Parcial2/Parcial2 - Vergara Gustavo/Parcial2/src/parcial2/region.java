//@author Gustavo
package parcial2;

import java.util.ArrayList;

public class region {

    private String aspectosSocioCulturales;
    private String nivelGrupal;
    private String nivelPersonal;
    private String parteEspecificaDelPais;
    private ArrayList<universidad> aUniversidad = new ArrayList<>();
    private ArrayList<problemas> aProblemas = new ArrayList<>();
    private ArrayList<necesidades> aNecesidades = new ArrayList<>();

    //constructor
    public region(String aspectosSocioCulturales, String nivelGrupal, String nivelPersonal, String parteEspecificaDelPais) {
        this.aspectosSocioCulturales = aspectosSocioCulturales;
        this.nivelGrupal = nivelGrupal;
        this.nivelPersonal = nivelPersonal;
        this.parteEspecificaDelPais = parteEspecificaDelPais;
    }

    public String getAspectosSocioCulturales() {
        return aspectosSocioCulturales;
    }

    public void setAspectosSocioCulturales(String aspectosSocioCulturales) {
        this.aspectosSocioCulturales = aspectosSocioCulturales;
    }

    public String getNivelGrupal() {
        return nivelGrupal;
    }

    public void setNivelGrupal(String nivelGrupal) {
        this.nivelGrupal = nivelGrupal;
    }

    public String getNivelPersonal() {
        return nivelPersonal;
    }

    public void setNivelPersonal(String nivelPersonal) {
        this.nivelPersonal = nivelPersonal;
    }

    public String getParteEspecificaDelPais() {
        return parteEspecificaDelPais;
    }

    public void setParteEspecificaDelPais(String parteEspecificaDelPais) {
        this.parteEspecificaDelPais = parteEspecificaDelPais;
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
    public String cotidianidad() {
        String tmp="";
        tmp += "En " + this.getParteEspecificaDelPais();
        tmp += " la gente está " + this.getNivelGrupal();
        tmp += ", individualmente son " + this.getNivelPersonal();
        return tmp;

    }

}
