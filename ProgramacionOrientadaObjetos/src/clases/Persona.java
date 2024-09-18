package clases;

public class Persona {
    //atributos 
    public String nombre;
    public int edad; //con los modificadores de acceso de public y private, permite dan acceso de los atributos y metodos de la clase a otros paquetes
    
    //Constructor
    public Persona(){
        
    }
    //sobrecarga constructor
    public Persona(String nombre){
        System.out.println("Construyendo con nombre: " +nombre);
    }
    
    //metodos
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
    
}
