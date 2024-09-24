/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractas;

/**
 *
 * @author User
 */
public abstract class FiguraGeometrica {
    //Atributos
    protected String tipoFigura;
    
    //Constructor
    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura = tipoFigura;
    }
    
    //metodo abstracto
    //Definicion metodo abstracto
    public abstract void pintarFigura();
    
    //Get & Set

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    
    //toString

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FiguraGeometrica{");
        sb.append("tipoFigura=").append(tipoFigura);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
