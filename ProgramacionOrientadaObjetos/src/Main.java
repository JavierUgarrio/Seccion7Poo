
import clases.Persona;
import clases.Calculadora;
import clases.Rectangulo;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instaciar objeto
        Persona persona1 = new Persona();
        
        persona1.nombre= "Javier";
        persona1.edad= 18;
        persona1.mostrarDatos();
        
        Persona persona2 = new Persona();
        
        persona2.nombre="Maria";
        persona2.edad= 21;
        persona2.mostrarDatos();
        
        Persona persona3= new Persona("Miguel");
        
        
        System.out.println(Calculadora.PI);
        
        System.out.println(Calculadora.sumar(3, 7));
        
        
        Rectangulo r1 = new Rectangulo();
        System.out.println(r1.areaRectangulo(8, 4));
    }
    
}
