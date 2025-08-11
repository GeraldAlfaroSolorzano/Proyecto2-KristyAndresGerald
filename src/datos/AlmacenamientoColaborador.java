package datos;

import java.util.ArrayList;
import logica.Colaborador;

/**
 * Clase que maneja el almacenamiento de objetos Colaborador usando un ArrayList.
 * Permite insertar, buscar, modificar, eliminar y mostrar colaboradores.
 * 
 * @author Andres
 */
public class AlmacenamientoColaborador {

    /**
     * Lista que almacena los colaboradores.
     */
    private ArrayList<Colaborador> listaColaboradores;

    /**
     * Constructor que inicializa la lista de colaboradores vacia.
     */
    public AlmacenamientoColaborador() {
        listaColaboradores = new ArrayList<>();
    }

    /**
     * Inserta un colaborador en la lista si no existe otro con el mismo id o cedula.
     * 
     * @param c Colaborador a insertar
     * @return true si se inserto correctamente, false si ya existe id o cedula igual
     */
    public boolean insertar(Colaborador c) {
        if (buscarPorId(c.getIdColaborador()) == null && buscarPorCedula(c.getCedula()) == null) {
            listaColaboradores.add(c);
            return true;
        }
        return false; // Ya existe el idColaborador o cedula
    }

    /**
     * Busca un colaborador por su id unico.
     * 
     * @param id Id del colaborador a buscar
     * @return Colaborador encontrado o null si no existe
     */
    public Colaborador buscarPorId(int id) {
        for (Colaborador c : listaColaboradores) {
            if (c.getIdColaborador() == id) {
                return c;
            }
        }
        return null;
    }

    /**
     * Busca un colaborador por su numero de cedula.
     * 
     * @param cedula Cedula del colaborador a buscar
     * @return Colaborador encontrado o null si no existe
     */
    public Colaborador buscarPorCedula(int cedula) {
        for (Colaborador c : listaColaboradores) {
            if (c.getCedula() == cedula) {
                return c;
            }
        }
        return null;
    }

    /**
     * Modifica un colaborador existente buscando por su id y reemplazandolo.
     * 
     * @param nuevo Colaborador con los datos nuevos
     * @return true si la modificacion fue exitosa, false si no se encontro el colaborador
     */
    public boolean modificar(Colaborador nuevo) {
        for (int i = 0; i < listaColaboradores.size(); i++) {
            if (listaColaboradores.get(i).getIdColaborador() == nuevo.getIdColaborador()) {
                listaColaboradores.set(i, nuevo);
                return true;
            }
        }
        return false;
    }

    /**
     * Elimina un colaborador de la lista por su id.
     * 
     * @param id Id del colaborador a eliminar
     * @return true si se elimino correctamente, false si no se encontro
     */
    public boolean eliminar(int id) {
        return listaColaboradores.removeIf(c -> c.getIdColaborador() == id);
    }

    /**
     * Devuelve la lista completa de colaboradores almacenados.
     * 
     * @return ArrayList con todos los colaboradores
     */
    public ArrayList<Colaborador> mostrar() {
        return listaColaboradores;
    }
}
