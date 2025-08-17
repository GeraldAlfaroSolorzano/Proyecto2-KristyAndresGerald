package datos;

import java.util.ArrayList;
import logica.Proyectos;



/**
 * Almacena proyectos en memoria usando ArrayList
 * expone operaciones CRUD 
 * @author Andres, Gerald, Kristy
 */
public class AlmacenamientoProyectos {

    /** 
     * Lista de proyectos registrados 
    */
    private ArrayList<Proyectos> listaProyectos;

    /** 
     * Constructor que inicializa la lista vacia 
    */
    public AlmacenamientoProyectos() {
        listaProyectos = new ArrayList<>();
    }

    /** 
     * @return lista de proyectos 
    */
    public ArrayList<Proyectos> getListaProyectos() {
        return listaProyectos;
    }

    /** 
     * @param listaProyectos lista a asignar 
    */
    public void setListaProyectos(ArrayList<Proyectos> listaProyectos) {
        this.listaProyectos = listaProyectos;
    }

    /**
     * Inserta un nuevo proyecto si su id no existe
     * @param proyecto proyecto a insertar
     * @return true si se inserto false si ya existe el id
     */
    public boolean insertar(Proyectos proyecto) {
        if (proyecto == null) {
            return false;
        }
        //debe ser unico 
        for (Proyectos p : listaProyectos) {
            if (p.getIdProyecto() == proyecto.getIdProyecto()) {
                return false;
            }
        }
        listaProyectos.add(proyecto);
        return true;
    }

    /**
     * Busca un proyecto por su id
     * @param idProyecto id del proyecto a buscar
     * @return el proyecto si existe
     */
    public Proyectos buscar(int idProyecto) {
        for (Proyectos p : listaProyectos) {
            if (p.getIdProyecto() == idProyecto) {
                return p;
            }
        }
        return null;
    }

    /**
     * Modifica un proyecto existente buscando por id
     * @param proyectoModificado proyecto con los datos actualizados
     * @return true si se modifico false si no se encontro
     */
    public boolean modificar(Proyectos proyectoModificado) {
        if (proyectoModificado == null) {
            return false;
        }
        for (int i = 0; i < listaProyectos.size(); i++) {
            if (listaProyectos.get(i).getIdProyecto() == proyectoModificado.getIdProyecto()) {
                listaProyectos.set(i, proyectoModificado);
                return true;
            }
        }
        return false;
    }

    /**
     * Elimina un proyecto por su id
     * @param idProyecto id del proyecto a eliminar
     * @return true si se elimino false si no se encontro
     */
    public boolean eliminar(int idProyecto) {
        return listaProyectos.removeIf(p -> p.getIdProyecto() == idProyecto);
    }

    /**
     * Devuelve la lista completa de proyectos registrados
     * @return lista de proyectos
     */
    public ArrayList<Proyectos> mostrar() {
        return listaProyectos;
    }
    
    /**
     * Devuelve el nombre del proyecto por id
     * @param idProyecto id del proyecto
     * @return nombre del proyecto o null si no existe
     */
    public String nombrePorId(int idProyecto) {
        Proyectos p = buscar(idProyecto);
        if (p != null) {
            return p.getNomProyecto();
        }
        return null;
    }
    
    public int posicionPorId(int idProyecto) {
    for (int i = 0; i < listaProyectos.size(); i++) {
        if (listaProyectos.get(i).getIdProyecto() == idProyecto) {
            return i;
        }
    }
    return -1;
}
}
