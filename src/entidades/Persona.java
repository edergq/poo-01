package entidades;

import java.util.Date;

public class Persona {
    
    String nombre;
    String apellidos;
    Date   fechaNacimiento;
    
    public void sonreir(){        
        System.out.println(nombre +" "+ apellidos +" "+ "jaja-jeje");        
    }
    
    public String getNombre() {        
        return nombre;
    }
   
   

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }    
}
