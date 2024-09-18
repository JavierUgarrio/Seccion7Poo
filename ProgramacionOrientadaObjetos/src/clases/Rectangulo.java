
package clases;

public class Rectangulo {
    //atributos
    public int base;
    public int altura;
    
    //constructor
    public Rectangulo(){
        System.out.println(base);
        System.out.println(altura);
    }
    
    public int areaRectangulo(int base,int altura){
        this.base = base;
        this.altura= altura;
        
        return this.base * this.altura;
    }
    
    public int perimetro(int base, int altura){
        this.base = base;
        this.altura= altura;
        
        return (this.base *2)+(this.altura *2);
    }
}
