/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author User
 */
public class ImplementarMySQL implements IbaseDatos {

    @Override
    public void insertar() {
        System.out.println("Se inserto un dato");
    }

    @Override
    public void listar() {
        System.out.println("Se listo los datos");
    }

    @Override
    public void actualizar() {
        System.out.println("Se actualizo la base de datos");
    }

    @Override
    public void eliminar() {
        System.out.println("Se elimino el dato");
    }
    
}
