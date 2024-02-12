package javaticket_hectorflores;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author hecto
 */
public class deportivo extends evento{
    String equipo1;
    String equipo2;
    deportes deporte;
    ArrayList <String> integrantes1;
    ArrayList <String> integrantes2;
    
    public enum deportes {
        FUTBOL, RUGBY, TENNIS, BASEBALL;
    }
    
    public deportivo(String codigo, String titulo, String descripcion, Calendar fecha, double renta, String estado, deportes deporte, String equipo1, String equipo2){
        super(codigo, titulo, descripcion, fecha, renta, estado);
        this.deporte = deporte;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        integrantes1 = new ArrayList<>();
        integrantes2 = new ArrayList<>();
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public deportes getDeporte() {
        return deporte;
    }

    public void setDeporte(deportes deporte) {
        this.deporte = deporte;
    }

    public ArrayList<String> getIntegrantes1() {
        return integrantes1;
    }

    public void setIntegrantes1(ArrayList<String> integrates1) {
        this.integrantes1 = integrates1;
    }

    public ArrayList<String> getIntegrantes2() {
        return integrantes2;
    }

    public void setIntegrantes2(ArrayList<String> integrantes2) {
        this.integrantes2 = integrantes2;
    }
    
    public String integrantesAString(ArrayList <String> integrantes){
        String accum = "";
        
        for (int i = 0; i < integrantes.size(); i++) {
            accum += integrantes.get(i) + "\n";
        }
        
        return accum;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nTipo: Deportivo\nDeporte: " + deporte.name() + "\nEstado: " + estado + "\nNombre de equipo 1: " + equipo1 + "\nNombre de equipo 2: " + equipo2 + ""
                + "\nIntegrantes de " + equipo1 + ":\n" + integrantesAString(integrantes1) + "\nIntegrantes de " + equipo2 + ":\n" + integrantesAString(integrantes2);
    }
    
}
