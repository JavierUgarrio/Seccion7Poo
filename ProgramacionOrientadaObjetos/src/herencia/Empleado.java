
package herencia;

public class Empleado extends Persona{
    //Atributos
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;
    
    //Constructor

    public Empleado(int idEmpleado, double sueldo, String nombre) {
        super(nombre);
        this.idEmpleado = ++Empleado.contadorEmpleado;
        this.sueldo = sueldo;
    }

    //Get & Set

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public static int getContadorEmpleado() {
        return contadorEmpleado;
    }

    //toString
    @Override
    public String obtenerDetalle(){
        return super.obtenerDetalle() + "Sueldo: " + this.sueldo;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(" , ").append(super.toString()); //este  linea indica que se añade el objeto padre para ver el estado del objeto padre
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
