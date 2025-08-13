package datos;

import java.util.ArrayList;
import logica.Colaborador;

/**
 * Clase que maneja el almacenamiento de objetos Colaborador usando un ArrayList
 * Permite insertar, buscar, modificar, eliminar y mostrar colaboradores
 * 
 * @author Andres
 */
public class AlmacenamientoColaborador {

    /**
     * Lista que almacena los colaboradores
     */
    private ArrayList<Colaborador> listaColaboradores;

    public ArrayList<Colaborador> getListaColaboradores() {
        return listaColaboradores;
    }

    public void setListaColaboradores(ArrayList<Colaborador> listaColaboradores) {
        this.listaColaboradores = listaColaboradores;
    }

    /**
     * Constructor que inicializa la lista de colaboradores vacia
     */
    public AlmacenamientoColaborador() {
        this.listaColaboradores = new ArrayList<Colaborador>();
    }

    /**
     * Inserta un colaborador si no existe otro con el mismo id o cedula
     * @param c Colaborador a insertar
     * @return true si se inserto false si es null o ya existe id/cedula
     */
    public boolean insertarColab(Colaborador c) {
        if (c == null) {
            return false;
        }
        if (buscarPorId(c.getIdColaborador()) == null && buscarPorCedula(c.getCedula()) == null) {
            this.listaColaboradores.add(c);
            return true;
        }
        return false;
    }

    /**
     * Busca un colaborador por su id unico
     * @param id Id del colaborador a buscar
     * @return Colaborador encontrado o null si no existe
     */
    public Colaborador buscarPorId(int id) {
        for (Colaborador c : this.listaColaboradores) {
            if (c.getIdColaborador() == id) {
                return c;
            }
        }
        return null;
    }

    /**
     * Busca un colaborador por su numero de cedula
     * @param cedula Cedula del colaborador a buscar
     * @return Colaborador encontrado o null si no existe
     */
    public Colaborador buscarPorCedula(int cedula) {
        for (Colaborador c : this.listaColaboradores) {
            if (c.getCedula() == cedula) {
                return c;
            }
        }
        return null;
    }

    /**
     * Modifica un colaborador existente buscando por su id y reemplazandolo
     * Valida que no se duplique la cedula si cambia
     * @param nuevo Colaborador con los datos nuevos
     * @return true si la modificacion fue exitosa false si no se encontro o duplica cedula
     */
    public boolean modificarColab(Colaborador nuevo) {
        if (nuevo == null) {
            return false;
        }
        for (int i = 0; i < this.listaColaboradores.size(); i++) {
            Colaborador actual = this.listaColaboradores.get(i);
            if (actual.getIdColaborador() == nuevo.getIdColaborador()) {

                // Si cambia la cedula validar que no exista en otro registro
                if (actual.getCedula() != nuevo.getCedula()) {
                    Colaborador duplicado = buscarPorCedula(nuevo.getCedula());
                    if (duplicado != null && duplicado.getIdColaborador() != actual.getIdColaborador()) {
                        return false;
                    }
                }

                this.listaColaboradores.set(i, nuevo);
                return true;
            }
        }
        return false;
    }

    /**
     * Elimina un colaborador de la lista por su id
     * @param id Id del colaborador a eliminar
     * @return true si se elimino, false si no se encontro
     */
    public boolean eliminarColab(int id) {
        for (int i = 0; i < this.listaColaboradores.size(); i++) {
            if (this.listaColaboradores.get(i).getIdColaborador() == id) {
                this.listaColaboradores.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Devuelve la lista completa de colaboradores almacenados
     * @return ArrayList con todos los colaboradores
     */
    public ArrayList<Colaborador> mostrarColab() {
        return this.listaColaboradores;
    }
}
