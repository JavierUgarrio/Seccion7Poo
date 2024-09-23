/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

import java.util.Date;

/**
 *
 * @author User
 */
public class Clientes extends Persona {
    //Atributo
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;
    
    //Constructor
    public Clientes(int idCliente, Date fechaRegistro, boolean vip, String nombre, int edad, String apellidos, char genero, String direccion) {
        super(nombre, edad, apellidos, genero, direccion);
        this.idCliente = ++Clientes.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }
    
    //Get & Set

    public int getIdCliente() {
        return this.idCliente;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

   //toString
    @Override
    public String obtenerDetalle(){
        return super.obtenerDetalle()+ " Vip: " +this.vip;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Clientes{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(" , ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
   
    
    
}
