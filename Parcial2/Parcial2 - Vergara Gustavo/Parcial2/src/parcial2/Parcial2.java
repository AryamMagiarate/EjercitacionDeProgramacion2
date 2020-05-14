package parcial2;

//@author Gustavo
public class Parcial2 {

    public static void main(String[] args) {

        soluciones soluciones1 = new soluciones("Solucion alternativa1 y Solucion alternativa2");

        resultados resultados1 = new resultados("Planeamiento completado");
        ejecucionDelProyecto ejecucionDelProyecto1 = new ejecucionDelProyecto("proyectoDeGradoTerminado", 0);
        ejecucionDelProyecto1.setResultados1(resultados1);

        proyectoDeGrado proyectoDeGrado1 = new proyectoDeGrado("regional", 1000000, "Construir una represa", "Construirla en dos años", 2, "Construccion de represa", 10);
        proyectoDeGrado1.setEjecucionDelProyecto1(ejecucionDelProyecto1);

        proyectoDeGrado1.setSoluciones1(soluciones1);

        interfazIngresoInformacion interfazIngresoInformacion1 = new interfazIngresoInformacion("comentariosAbiertosEnLinea", "formularioEnLinea", (byte) 0);
        problemas problemas1 = new problemas("infraestructura hidrica");
        necesidades necesidades1 = new necesidades("falta de agua");
        problemas1.addInterfazIngresoInformacion(interfazIngresoInformacion1);
        region region1 = new region("Montañeses", "aislacion por cuarentena", "buenas personas",
                "Mendoza");
        region1.addProblemas(problemas1);
        region1.addNecesidades(necesidades1);
        recoleccionDeInformacion recoleccionDeInformacion1 = new recoleccionDeInformacion("Comunidades rurales",
                "trabajadores de la viña", "comentariosAbiertosEnLinea", "formularioEnLinea", (byte) 0);
        universidad universidad1 = new universidad("cunaDelConocimiento", "Programacion - Ingenieria en Sistemas - Ingenieria Quimica ", "-", "publica");
        universidad1.addRegion(region1);
        universidad1.addRecoleccionDeInformacion(recoleccionDeInformacion1);

        personalDocente personalDocente1 = new personalDocente("Ingenieria hidrica", "empresa constructora ICEO", 5, "Juana Ingeniera");
        personalDocente personalDocente2 = new personalDocente("Lic. en Medioambiente", "trabajó como docente", 10, "Juan GreenPeace");

        personalDocente1.addUniversidad(universidad1);
        universidad1.addPersonalDocente(personalDocente1);

        personalDocente2.addUniversidad(universidad1);
        universidad1.addPersonalDocente(personalDocente2);

        recopilacion recopilacion1 = new recopilacion("datosMayorFavorabilidad",
                "falta de canales de riego y acumulacion de agua", "trabajadores rurales de escasos recursos", "hombres y muejeres de 30 a 50 años",
                "comentariosAbiertosEnLinea", "formularioEnLinea", (byte) 0);
        personalDocente1.addRecopilacion(recopilacion1);
        personalDocente1.setEjecucionDelProyecto1(ejecucionDelProyecto1);

        personalDocente2.addRecopilacion(recopilacion1);
        personalDocente2.setEjecucionDelProyecto1(ejecucionDelProyecto1);

        //estudiante clase central
        estudiante estudiante1 = new estudiante(1, "Teodoro");
        estudiante1.addSoluciones(soluciones1);
        estudiante1.setProyectoDeGrado1(proyectoDeGrado1);
        estudiante1.addUniversidad(universidad1);
        estudiante1.addPersonalDocente(personalDocente1);
        estudiante1.addPersonalDocente(personalDocente2);
        estudiante1.setEjecucionDelProyecto1(ejecucionDelProyecto1);

        System.out.println("----------------------");
        System.out.println("Universidad en la que estudia el estudiante (diferentes carreras)");
        System.out.println(estudiante1.getaUniversidad().get(0).getDiferentesCarreras());
        System.out.println("----------------------");
        System.out.println("Necesidades Insatisfechas del estudiante");
        System.out.println(estudiante1.getaUniversidad().get(0).getaRegion().get(0).getaNecesidades().get(0).insatisfaccion());
        System.out.println("----------------------");
        System.out.println("Proyecto de grado que realiza el estudiante");
        System.out.println(estudiante1.getProyectoDeGrado1().getObjetivo());
        System.out.println("----------------------");
        System.out.println("Resultados del proyecto de grado que realiza el estudiante");
        System.out.println(estudiante1.getProyectoDeGrado1().getEjecucionDelProyecto1().getResultados1().getImplementacionFinalizada());
        System.out.println("----------------------");
        System.out.println("Datos de los afectados");
        System.out.println(estudiante1.getaPersonalDocente().get(0).getaRecopilacion().get(0).getDatosDeLosAfectados());
        System.out.println("----------------------");
        System.out.println("Datos de los directamente interesados");
        System.out.println(estudiante1.getaPersonalDocente().get(0).getaRecopilacion().get(0).getDatosDeLosdirectamenteInteresados());
        System.out.println("----------------------");
        System.out.println("Docentes asignados al estudiante");
        System.out.println("");
        System.out.println("Nombre: " + estudiante1.getaPersonalDocente().get(0).getNombre());
        System.out.println("Conocimientos: " + estudiante1.getaPersonalDocente().get(0).getConocimiento());
        System.out.println("");
        System.out.println("Nombre: " + estudiante1.getaPersonalDocente().get(1).getNombre());
        System.out.println("Conocimientos: " + estudiante1.getaPersonalDocente().get(1).getConocimiento());

    }

}
