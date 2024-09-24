/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractas;

/**
 *
 * @author User
 */
public class Rectangulo extends FiguraGeometrica {

   //Constructor
    public Rectangulo(String tipoFigura){
        super(tipoFigura);
    }
    
    //metodo de la clase abstracta
    @Override
    public void pintarFigura(){
        System.out.println("Se dibuja un: "+ getClass().getSimpleName());
    }
}
