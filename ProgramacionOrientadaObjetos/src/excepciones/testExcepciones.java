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
        boolean continuarEjeccucion = true;
        
        do{
             try {
                System.out.println("Ingrese n1: ");
                int n1 = leer.nextInt();
                System.out.println("Ingrese n2: ");
                int n2 = leer.nextInt();
                int resultado = dividir(n1, n2);
                System.out.println(resultado);
                continuarEjeccucion = false;
            } catch (java.util.InputMismatchException e) {
                System.err.println("Ocurrio un error: Ingrese solo numeros enteros");
                e.printStackTrace(System.out);
                leer.nextLine();
            } catch (OperadorExcepcion e) {
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace(System.out);
            } catch (Exception e) {
                e.printStackTrace(System.out);
            } finally {
                System.out.println("Se reviso la division");
            }
        }while(continuarEjeccucion);
        
    }
    
    //crear una excepcion
    static int dividir(int n1, int n2) throws OperadorExcepcion {
        if(n2 ==0){
            throw new OperadorExcepcion("Dividir entre 0");
        }
        return n1/n2;
    }
}
