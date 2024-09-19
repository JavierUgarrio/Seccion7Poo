/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import encapsulamiento.Persona;
/**
 *
 * @author User
 */
public class TestPersona {
    public static void main(String[]args){
        Persona persona1 = new Persona("Miguel",21,false);
        persona1.setEdad(32);
        
        System.out.println(persona1.getEdad());
        System.out.println(persona1.toString());
    }
}
