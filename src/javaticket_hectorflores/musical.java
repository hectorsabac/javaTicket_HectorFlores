/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaticket_hectorflores;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author hecto
 */
public class musical extends evento{
    public enum generos {
        POP, ROCK, RAP, CLASICA, RAGGAETON, OTRO;
    } 
    
    generos genero;
    ArrayList <artista> integrantes;
    
    public musical (String codigo, String titulo, String descripcion, Calendar fecha, double renta, String estado, generos genero){
        super(codigo, titulo, descripcion, fecha, renta * 1.3, estado);
        integrantes = new ArrayList<>();
        this.genero = genero;
    }

    public generos getGenero() {
        return genero;
    }

    public void setGenero(generos genero) {
        this.genero = genero;
    }

    public ArrayList<artista> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(ArrayList<artista> integrantes) {
        this.integrantes = integrantes;
    }
    
    
    
    public String integrantesAString(){
        String accum = "";
        for (int i = 0; i < integrantes.size(); i++) {
            accum += integrantes.get(i).getNombre() + " - " + integrantes.get(i).getCargo_o_instrumento() + "\n";
        }
        
        return accum;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nTipo: Musical\nGenero: " + genero.name() + "\nEstado: " + estado + "\nIntegrantes: " + integrantesAString();
    }
}
