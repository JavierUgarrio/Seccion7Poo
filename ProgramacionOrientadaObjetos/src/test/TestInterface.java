/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import interfaces.*;
/**
 *
 * @author User
 */
public class TestInterface {
    public static void main(String [] args){
        IbaseDatos datos = new ImplementarMySQL();
        datos.actualizar();
        datos.eliminar();
    }
}
