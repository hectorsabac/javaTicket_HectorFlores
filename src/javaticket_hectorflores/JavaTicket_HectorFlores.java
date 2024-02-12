package javaticket_hectorflores;

import java.util.ArrayList;

public class JavaTicket_HectorFlores {
    
    static ArrayList <usuario> usuarios;

    public static ArrayList<usuario> getUsuarios() {
        return usuarios;
    }

    public static void setUsuarios(ArrayList<usuario> usuarios) {
        JavaTicket_HectorFlores.usuarios = usuarios;
    }
    
    public static void main(String[] args) {
        //Muestra la pagina de login
        login login = new login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        
        //Inicializa el usuario de tipo admin con username admin y contra supersecreto como unico usuario valido hasta el momento
        usuarios = new ArrayList<>();
        admin unAdmin = new admin("Hector Flores", "admin", "supersecreto", 17);
        usuarios.add(unAdmin);
        login.setUsuarios(usuarios);
        login.admins.add(unAdmin);
    }
    
}
