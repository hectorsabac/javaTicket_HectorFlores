package javaticket_hectorflores;
import java.util.ArrayList;

public final class admin extends usuario{
    ArrayList <evento> eventos;

    public ArrayList<evento> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<evento> eventos) {
        this.eventos = eventos;
    }
    
    public admin (String nombreCompleto, String username, String password, int edad){
        super(nombreCompleto, username, password, edad);
        eventos = new ArrayList<>();
    }
    
    public String listarEventos(){
        String accum = "";
        String tipo = "";
        for (int i = 0; i < eventos.size(); i++) {
            
            if (eventos.get(i) instanceof deportivo){
                tipo = "Deportivo";
            } else if(eventos.get(i) instanceof musical){
                tipo = "Musical";
            } else {
                tipo = "Religioso";
            }
            
            
            accum += "\nCodigo: " + eventos.get(i).getCodigo() + " Tipo: " + tipo + " Estado: " + eventos.get(i).getEstado() + " Monto: " + eventos.get(i).getRenta() + "\n";
        }
        
        return accum;
    }
    
    @Override
    public final String toString(){
        return super.toString() + "\nEventos:\n" + listarEventos();
    }
}
