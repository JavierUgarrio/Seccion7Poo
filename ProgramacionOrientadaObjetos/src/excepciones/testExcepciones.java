/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

import java.util.*;

/**
 *
 * @author User
 */
public class testExcepciones {
    public static void main(String [] args){
        Scanner leer = new Scanner(System.in);
        
        try{
          System.out.println("Ingrese n1: ");
            int n1 = leer.nextInt();
            System.out.println("Ingrese n2: ");
            int n2 = leer.nextInt();
            int resultado = n1/n2;
            System.out.println(resultado);
        }catch(java.util.InputMismatchException e){
            System.err.println("Ocurrio un error: Ingrese solo numeros enteros");
            e.printStackTrace(System.out);
        }catch(ArithmeticException e){
            System.out.println("Ocurrio un error: No se puede dividir entre 0");
            e.printStackTrace(System.out);
        }catch(Exception e){
            e.printStackTrace(System.out);
        }finally{
            System.out.println("Se reviso la división");
        }
        
        
        
    }
}
