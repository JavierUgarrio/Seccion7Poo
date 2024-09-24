/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloque.codigo;

/**
 *
 * @author User
 */
public class Persona {
    private final int idPersona;
    private static int contadorPersona;
    
    //esta la forma para iniciarlizar un codigo con atributos staticos
    static{
        System.out.println("Ejecucion de bloque estatico");
        ++Persona.contadorPersona;
    }
    //esta es la forma de inicialiar un codigo con atributos no staticos
    {
        System.out.println("ejecucion bloque no statico");
        this.idPersona = Persona.contadorPersona++;
    }
    
    //Constructor
    public Persona() {
        System.out.println("Ejecuccion del constructor");
    }
    
    //Get
    public int getPersona(){
        return this.idPersona;
    }
    
    //toString

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
}
