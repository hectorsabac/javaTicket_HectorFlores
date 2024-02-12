package javaticket_hectorflores;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

public abstract class evento {
    String codigo;
    String titulo;
    String descripcion;
    Calendar fecha;
    double renta;
    String estado;
    SimpleDateFormat a = new SimpleDateFormat("dd-MM-yyyy");
    String simple;

    public evento(String codigo, String titulo, String descripcion, Calendar fecha, double renta, String estado) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.renta = renta;
        this.estado = estado;
        this.simple = a.format(fecha.getTime());
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public double getRenta() {
        return renta;
    }

    public void setRenta(double renta) {
        this.renta = renta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSimple() {
        return simple;
    }

    public void setSimple(String simple) {
        this.simple = simple;
    }
    
    @Override
    public String toString(){
        
        return "Codigo: " + codigo + "\nTitulo: " + titulo + "\nDescripcion: " + descripcion + "\nFecha: " + a.format(fecha.getTime()) + "\nRenta: " + renta;
    }

    
}
