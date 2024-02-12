package javaticket_hectorflores;


public class artista {
    String nombre;
    String cargo_o_instrumento;
    
    public artista (String nombre, String cargo_o_instrumento){
        this.nombre = nombre;
        this.cargo_o_instrumento = cargo_o_instrumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo_o_instrumento() {
        return cargo_o_instrumento;
    }

    public void setCargo_o_instrumento(String cargo_o_instrumento) {
        this.cargo_o_instrumento = cargo_o_instrumento;
    }
}
