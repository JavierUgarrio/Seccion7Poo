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
       System.out.println(persona1.obtenerDetalle());
       Persona persona2 = new Persona("Matias",74,"Lezo",'M',"calle ancha 15 Donosti");
       imprimir(persona2);
       
       Empleado empleado1 = new Empleado(1,2000,"Jose Luis");
       System.out.println(empleado1);
       Empleado empleado2 = new Empleado(2,1500,"Maria");
       System.out.println(empleado2);
       System.out.println(empleado1.obtenerDetalle());
       imprimir(empleado2);
       
       var fecha = new Date();
       Clientes cliente1 = new Clientes(1, fecha, true,"Alvaro",12,"Moreno",'M',"calle de la cordura Grandada");
       System.out.println(cliente1);
       System.out.println(cliente1.obtenerDetalle());
       Clientes cliente2 = new Clientes(2, fecha, false,"Leire",12,"Garcia",'F',"calle de la cordura Malaga");
       imprimir(cliente2);
       determinarTipo(empleado1);
       determinarTipo(cliente1);
       determinarTipo(persona1);
       
       //realizar conversion de objetos DOWNCASTING (de padre a hija)
       Persona persona4 = new Empleado(3,2500,"Lara");
       Empleado empleado4 =(Empleado)persona4; //convierto el objeto "persona4" a un objeto de tipo empleado 
       empleado4.getSueldo();
       System.out.println(empleado4.obtenerDetalle());
       
       //realizar conversion de objetos Upcasting (de hija a padre)
       Persona persona5 = empleado1;
       System.out.println(persona5.obtenerDetalle());
       
       Persona p1 = new Persona("Javier",12,"Perez",'M',"calle mayor 15 Leon");
       Persona p2 = new Persona("Jose",12,"Perez",'M',"calle mayor 15 Leon");
       
       System.out.println(p1.equals(p2));
       System.out.println(p1.hashCode());
       System.out.println(p2.hashCode());
       
   } 
   //funcion para llamar a los diferentes metodos que se encuentran en las clases y utilizarlo como si fuera uno
   public static void imprimir(Persona persona){
       System.out.println(persona.obtenerDetalle());
   }
   //Comparacion de objetos utilizando InstanceOf, las comparaciones se tiene que hacer de menos generica a mas generica
   public static void determinarTipo(Object objeto){
       if(objeto instanceof Empleado){
           System.out.println("es de tipo empleado");
       }else if(objeto instanceof Clientes){
           System.out.println("es de tipo cliente");
       }else if(objeto instanceof Persona){
           System.out.println("es de tipo Persona");
       }else if(objeto instanceof Object){
           System.out.println("es de tipo objeto");
       }
   }
}
