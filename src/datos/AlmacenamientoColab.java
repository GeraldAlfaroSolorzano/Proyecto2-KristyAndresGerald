package datos;

import java.util.ArrayList;
import logica.Colaborador;

/**
 * Clase que gestiona el almacenamiento de colaboradores en una lista
 * Permite realizar operaciones CRUD sobre objetos de tipo Colaborador
 * 
 * @author Andres
 */
public class AlmacenamientoColab {

    private ArrayList<Colaborador> arrayColab;

    /**
     * Constructor que inicializa la lista de colaboradores vacia
     */
    public AlmacenamientoColab() {
        this.arrayColab = new ArrayList();
    }

    /**
     * Retorna la lista completa de colaboradores
     * @return lista de colaboradores
     */
    public ArrayList<Colaborador> getArrayColab() {
        return arrayColab;
    }

    /**
     * Asigna una nueva lista de colaboradores
     * @param arrayColab lista de colaboradores a asignar
     */
    public void setArrayColab(ArrayList<Colaborador> arrayColab) {
        this.arrayColab = arrayColab;
    }

    /**
     * Inserta un colaborador si no existe otro con el mismo id o cedula
     * genera un id
     * @param c colaborador a insertar
     * @return true si se inserto correctamente, false si es null o ya existe
     */
    public boolean insertarColab(Colaborador c) {
        if (c == null) {
            return false;
        }

        // autogenera id
        if (c.getIdColaborador() <= 0) {
            int max = 0;
            for (Colaborador x : this.arrayColab) {
                if (x.getIdColaborador() > max) {
                    max = x.getIdColaborador();
                }
            }
            c.setIdColaborador(max + 1);
        }

        // valida id 
        if (buscarPorId(c.getIdColaborador()) == null && buscaCedula(c.getCedula()) == null) {
            this.arrayColab.add(c);
            return true;
        }
        return false;
    }

    /**
     * Busca un colaborador por su id unico
     * @param id id del colaborador a buscar
     * @return colaborador encontrado o null si no existe
     */
    public Colaborador buscarPorId(int id) {
        for (Colaborador c : this.arrayColab) {
            if (c.getIdColaborador() == id) {
                return c;
            }
        }
        return null;
    }

    /**
     * Reemplaza el colaborador en la posicion indicada por uno nuevo
     * @param index posicion en la lista
     * @param newColab nuevo colaborador a asignar
     */
    public boolean editarColab(int index, Colaborador newColab) {
        if (newColab == null) {
            return false;
        }
        if (index < 0 || index >= this.arrayColab.size()) {
            return false;
        }
        this.arrayColab.set(index, newColab);
        return true;
    }

    /**
     * Elimina un colaborador si existe en la lista
     * @param colab colaborador a eliminar
     * @return true si se elimino correctamente, false si no existe
     */
    public boolean eliminarColab(Colaborador colab) {
        if (this.arrayColab.contains(colab)) {
            this.arrayColab.remove(colab);
            return true;
        }
        return false;
    }

    /**
     * Busca un colaborador por su cedula
     * @param cedula numero de cedula a buscar
     * @return colaborador encontrado o null si no existe
     */
    public Colaborador buscaCedula(int cedula) {
        for (Colaborador c : arrayColab) {
            if (c.getCedula() == cedula) {
                return c;
            }
        }
        return null;
    }

    /**
     * Devuelve el nombre del colaborador dado su id
     * @param idColaborador id del colaborador
     * @return nombre del colaborador o null si no existe
     */
    public String nombrePorId(int idColaborador) {
        Colaborador c = buscarPorId(idColaborador);
        if (c != null) {
            return c.getNombre();
        }
        return null;
    }
    /**
     * Devuelve la posicion dado su id
     * @param idColaborador id del colaborador
     * @return nombre del colaborador o null si no existe
     */
    public int posicionPorId(int idColaborador) {
        for (int i = 0; i < arrayColab.size(); i++) {
            if (arrayColab.get(i).getIdColaborador() == idColaborador) {
                return i;
            }
        }
        return -1;
    }
}
