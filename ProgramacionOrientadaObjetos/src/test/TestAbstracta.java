/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import abstractas.*;
/**
 *
 * @author User
 */
public class TestAbstracta {
    public static void main(String [] args){
       
        FiguraGeometrica figura = new Rectangulo("Rectangulo1");
        System.out.println(figura);
        figura.pintarFigura();
        
        figura = new Cuadrado("Cuadrado");
        figura.pintarFigura();
    }
}
