package javadoc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rodrigo
 * Clase que representa un gestor de empleados
 */
public class GestorPersonal {


    /**
     * Atributo que almacena objetos de la clase Empleado en una lista
     */
    private List<Empleado> empleados;

    /**
     * Constructor que inicializa el atributo empleados a una ArrayList
     */
    public GestorPersonal() {
        empleados = new ArrayList<>();
    }

    /**
     * Método que añade objetos de la clase Empleado al atributo empleados
     * @param empleado Objeto de clase Empleado a introducir en empleados
     */
    public void contratar(Empleado empleado) {
        empleados.add(empleado);
    }

    /**
     * Método que elimina a los empleados que tengan el id introducido
     * @param id Valor a comparar
     * @return booleano que indica si se eliminó o no un empleado con el id introducido
     */
    public boolean despedir(String id) {
        return empleados.removeIf(e -> e.getId().equals(id));
    }


    /**
     * Método que cambia el sueldo a los empleados con el id indicado
     * @param id Valor a comparar
     * @param nuevoSueldo Nuevo valor para sueldo de los empleados
     * @return booleano que indica si se cambió o no el sueldo a un empleado
     */
    public boolean cambiarSueldo(String id, double nuevoSueldo) {
        for (Empleado empleado : empleados) {
            if (empleado.getId().equals(id)) {
                empleado.setSueldo(nuevoSueldo);
                return true;
            }
        }
        return false;
    }

    /**
     * Método que retorna la el atributo empleados en forma de ArrayList
     * @return Valor de empleados en ArrayList
     */
    public List<Empleado> getEmpleados() {
        return new ArrayList<>(empleados);
    }
}
