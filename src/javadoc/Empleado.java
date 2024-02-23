package javadoc;

/**
 * Clase que representa a un empleado
 * @author Rodrigo
 */
public class Empleado {
    // Atributos de la clase
    /**
     * Atributo que almacena el nombre
     */
    private String nombre;
    /**
     * Atributo que almacena el id
     */
    private String id;
    /**
     * Atributo que almacena el sueldo
     */
    private double sueldo;


    /**
     * Constructor para todos los atributos de la clase
     * @param nombre Valor para el atributo nombre
     * @param id Valor para el atributo id
     * @param sueldo Valor para el atributo sueldo
     */
    public Empleado(String nombre, String id, double sueldo) {
        this.nombre = nombre;
        this.id = id;
        this.sueldo = sueldo;
    }


    /**
     * Método que retorna el nombre del empleado
     * @return Valor del atributo nombre
     */
    public String getNombre() {
        return nombre;
    }


    /**
     * Método para actualizar el nombre del empleado
     * @param nombre Nuevo valor para el atributo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /**
     * Método que retorna el id del empleado
     * @return Valor del atributo id
     */
    public String getId() {
        return id;
    }


    /**
     * Método que retorna el sueldo del empleado
     * @return Valor del atributo sueldo
     */
    public double getSueldo() {
        return sueldo;
    }


    /**
     * Método para actualizar el sueldo del empleado
     * @param sueldo Nuevo valor para el atributo nombre
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


    /**
     * Método que incrementa el valor del sueldo
     * @param incremento Cantidad de incremento para el atributo sueldo
     */
    public void incrementarSueldo(double incremento) {
        this.sueldo += incremento;
    }

    /**
     * Método que devuelve los atributos de la clase Empleado en una cadena
     * @return String que contiene los valores de todos los atributos de Empleado
     */
    @Override
    public String toString() {
        return "javadoc.Empleado{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
