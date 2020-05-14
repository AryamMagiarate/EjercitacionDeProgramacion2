//@author Gustavo
package parcial2;

import java.util.ArrayList;

public class problemas {

    private String definir;
    private ArrayList<region> aRegion = new ArrayList<>();
    private ArrayList<interfazIngresoInformacion> aInterfazIngresoInformacion = new ArrayList<>();
    
    
//constructor
    public problemas(String definir) {
        this.definir = definir;
    }

    public String getDefinir() {
        return definir;
    }

    public void setDefinir(String definir) {
        this.definir = definir;
    }

    public ArrayList<interfazIngresoInformacion> getaInterfazIngresoInformacion() {
        return aInterfazIngresoInformacion;
    }

    public void setaInterfazIngresoInformacion(ArrayList<interfazIngresoInformacion> aInterfazIngresoInformacion) {
        this.aInterfazIngresoInformacion = aInterfazIngresoInformacion;
    }

    public void addInterfazIngresoInformacion( interfazIngresoInformacion i) {
        this.aInterfazIngresoInformacion.add(i) ;
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
    public String efectosIndeseables() {
        return "efectosIndeseables";
    }




}
