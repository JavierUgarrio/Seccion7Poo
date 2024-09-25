/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;
import java.io.*;

public class ExcepcionVerificada {
    public static void main(String []args)throws FileNotFoundException{
        readFile1();
    }
    
    public static void readFile1()throws FileNotFoundException{
        File file = new File("C://file.txt");
        FileReader fr = new FileReader(file);
    }
}
