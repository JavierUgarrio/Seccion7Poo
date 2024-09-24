/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enumeraciones;

/**
 *
 * @author User
 */
public enum Continentes {
    Africa(54),
    Europa(52),
    Asia(48),
    America(35),
    Oceania(14);
    
    private final int paises;
    
    private Continentes(int paises){
        this.paises = paises;
    }
    
    //get
    public int getPaises(){
        return this.paises;
    }
}
