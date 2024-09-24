/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractas;

/**
 *
 * @author User
 */
public class Cuadrado extends FiguraGeometrica {
    
    public Cuadrado(String tipoFigura){
        super(tipoFigura);
    }
    
    @Override
    public void pintarFigura(){
        System.out.println("La figura que se pinta es: "+ getClass().getSimpleName());
    }
}
