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
public class religioso extends evento{
    
    ArrayList <String> convertidas;
    
    public religioso (String codigo, String titulo, String descripcion, Calendar fecha, double renta, String estado){
        super(codigo, titulo, descripcion, fecha, renta + 2000, estado);
        convertidas = new ArrayList<>();
    }

    public ArrayList<String> getConvertidas() {
        return convertidas;
    }

    public void setConvertidas(ArrayList<String> convertidas) {
        this.convertidas = convertidas;
    }
    
    public String convertidasAString(){
        String accum = "\n";
        
        for (int i = 0; i < convertidas.size(); i++) {
            accum += convertidas.get(i) + "\n";
        }
        
        return accum;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nTipo: Religioso\nEstado: " + estado + "\nPersonas convertidas: " + convertidasAString();
    }
}
