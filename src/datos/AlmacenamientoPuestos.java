package datos;

import java.util.ArrayList;
import logica.Puestos;

/**
 *
 * @author galfa
 */

/**
 * Clase donde se crea el almacenamiento de puestos
 */
public class AlmacenamientoPuestos {

    /**
     * Lista de puestos registrados
     */
    private ArrayList<Puestos> listaPuestos;

    /**
     * Constructor inicializa la lista vacia
     */
    public AlmacenamientoPuestos() {
        this.listaPuestos = new ArrayList<Puestos>();
    }

    /**
     * @return Lista completa de puestos
     */
    public ArrayList<Puestos> getListaPuestos() {
        return listaPuestos;
    }

    /**
     * @param listaPuestos Lista a establecer como almacenamiento
     */
    public void setListaPuestos(ArrayList<Puestos> listaPuestos) {
        this.listaPuestos = listaPuestos;
    }

    // CRUD
    /**
     * Inserta un puesto validando que el ID sea unico
     * @param puesto Puesto a insertar
     * @return true si se inserto o false si es nulo o ID repetido
     */
    public boolean insertar(Puestos puesto) {
        if (puesto == null) {
            return false;
        }
        for (Puestos p : this.listaPuestos) {
            if (p.getIdPuesto() == puesto.getIdPuesto()) {
                return false;
            }
        }
        this.listaPuestos.add(puesto);
        return true;
    }

    /**
     * Busca un puesto por su ID
     * @param idPuesto ID a buscar
     * @return Puesto encontrado o null si no existe
     */
    public Puestos buscarId(int idPuesto) {
        for (Puestos p : this.listaPuestos) {
            if (p.getIdPuesto() == idPuesto) {
                return p;
            }
        }
        return null;
    }

    public Puestos buscaPuesto(String puesto) {
        for (Puestos p : listaPuestos) {
            if (p.getNomPuesto().equals(puesto)) {
                return p;
            }
        }
        return null;
    }

    /**
     * Modifica nombre y salario de un puesto por su ID
     * @param idPuesto ID del puesto a modificar
     * @param nuevo Datos actualizados del puesto
     * @return true si se modifico o false si no existe
     */
    public boolean modificar(int idPuesto, Puestos nuevo) {
        if (nuevo == null) {
            return false;
        }
        for (int i = 0; i < this.listaPuestos.size(); i++) {
            Puestos actual = this.listaPuestos.get(i);
            if (actual.getIdPuesto() == idPuesto) {
                actual.setNomPuesto(nuevo.getNomPuesto());
                actual.setSalario(nuevo.getSalario());
                return true;
            }
        }
        return false;
    }

    /**
     * Elimina un puesto por su ID
     * @param idPuesto ID del puesto a eliminar
     * @return true si se elimino o false si no existe
     */
    public boolean eliminar(int idPuesto) {
        for (int i = 0; i < this.listaPuestos.size(); i++) {
            if (this.listaPuestos.get(i).getIdPuesto() == idPuesto) {
                this.listaPuestos.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Muestra todos los puestos registrados
     * @return Lista de puestos
     */
    public ArrayList<Puestos> mostrar() {
        return this.listaPuestos;
    }
}
