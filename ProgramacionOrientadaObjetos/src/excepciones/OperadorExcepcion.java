/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author User
 */

//Si ponemos RuntimeExcepcion no es necesario añadir el "throws OperadorExcepcion" en la funcion donde estas creando la excepcion
public class OperadorExcepcion extends Exception {
    
    //Constructor
    public OperadorExcepcion(String mensaje){
        super(mensaje);
    }
    
    
}
