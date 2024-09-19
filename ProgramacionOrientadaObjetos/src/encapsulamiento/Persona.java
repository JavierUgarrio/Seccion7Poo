/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulamiento;

/**
 *
 * @author User
 */
public class Persona {
    private String nombre;
    private int edad;
    private boolean eliminar;

    //Constructor
    public Persona(String nombre, int edad, boolean eliminar) {
        this.nombre = nombre;
        this.edad = edad;
        this.eliminar = eliminar;
    }
    
    //Get & Set
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre= nombre;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public boolean esEliminado(){
        return this.eliminar;
    }
    
    public void esEliminado(boolean eliminado){
        this.eliminar = eliminado;
    }
    
    //toString
    @Override //anotado modifica un metodo ya creado en java
    public String toString(){
        return "Personas: [Nombre: %S, Edad: %d, Eliminado: %b]"
                .formatted(this.nombre, this.edad, this.eliminar);
    } 
}
