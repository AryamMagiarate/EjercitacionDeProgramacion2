//@author Gustavo
package parcial2;

public class resultados {

    private String implementacionFinalizada;
    private ejecucionDelProyecto ejecucionDelProyecto1;

    //Constructor vacio
    public resultados() {
    }

    //Constructor
    public resultados(String implementacionFinalizada) {
        this.implementacionFinalizada = implementacionFinalizada;
    }

    public String getImplementacionFinalizada() {
        return implementacionFinalizada;
    }

    public void setImplementacionFinalizada(String implementacionFinalizada) {
        this.implementacionFinalizada = implementacionFinalizada;
    }

    public ejecucionDelProyecto getEjecucionDelProyecto1() {
        return ejecucionDelProyecto1;
    }

    public void setEjecucionDelProyecto1(ejecucionDelProyecto ejecucionDelProyecto1) {
        this.ejecucionDelProyecto1 = ejecucionDelProyecto1;
    }
    
    //metodos   
    public int efectosPositivosyNegativos() {
        return 0;
    }

    public int medidasDeSatisfaccionDeDiferentesAspectos() {
        return 0;
    }


}
