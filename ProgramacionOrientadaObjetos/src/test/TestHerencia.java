/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import herencia.Persona;
import herencia.Empleado;
import herencia.Clientes;
import java.util.*;
/**
 *
 * @author User
 */
public class TestHerencia {
   public static void main(String [] args){
       Persona persona1 = new Persona("Javier",12,"Perez",'M',"calle mayor 15 Leon");
       System.out.println(persona1);
       
       Empleado empleado1 = new Empleado(1,2000,"Jose Luis");
       System.out.println(empleado1);
       Empleado empleado2 = new Empleado(2,1500,"Maria");
       System.out.println(empleado2);
       
       var fecha = new Date();
       Clientes cliente1 = new Clientes(1, fecha, true,"Alvaro",12,"Moreno",'M',"calle de la cordura Grandada");
       System.out.println(cliente1);
   } 
}
