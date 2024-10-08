/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import java.util.Objects;

/**
 *
 * @author User
 */
public class Persona {
    //Atributos
    protected String nombre;
    protected int edad;
    protected String apellidos;
    protected char genero;
    protected String direccion;

    //Constructores
    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, int edad, String apellidos, char genero, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellidos = apellidos;
        this.genero = genero;
        this.direccion = direccion;
    }
    //Get & Set

    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    public int getEdad() {
        return this.edad;
    }
    
    public void setEdad(int edad){
        this.edad= edad;
    }

    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public char getGenero() {
        return this.genero;
    }
    
    public void setGenero(char genero){
        this.genero = genero;
    }

    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public String obtenerDetalle(){
        return "Nombre: %s Edad: %d".formatted(this.nombre, this.edad);
    }
    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(this.nombre);
        sb.append(", edad=").append(this.edad);
        sb.append(", apellidos=").append(this.apellidos);
        sb.append(", genero=").append(this.genero);
        sb.append(", direccion=").append(this.direccion);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + this.edad;
        hash = 97 * hash + Objects.hashCode(this.apellidos);
        hash = 97 * hash + this.genero;
        hash = 97 * hash + Objects.hashCode(this.direccion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (this.genero != other.genero) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        return Objects.equals(this.direccion, other.direccion);
    }
    
    
    
    
}
