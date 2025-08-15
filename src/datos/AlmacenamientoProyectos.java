/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.util.ArrayList;
import logica.Proyectos;

/**
 *
 * @author krist
 */
public class AlmacenamientoProyectos {

    /**
     * Lista que almacena todos los proyectos registrados
     */
    private ArrayList<Proyectos> listaProyectos;

    public void setListaProyectos(ArrayList<Proyectos> listaProyectos) {
        this.listaProyectos = listaProyectos;
    }

    public ArrayList<Proyectos> getListaProyectos() {
        return listaProyectos;
    }

    /**
     * Constructor que inicializa la lista de proyectos vacia
     */
    public AlmacenamientoProyectos() {
        listaProyectos = new ArrayList<>();
    }

    /**
     * Inserta un nuevo proyecto en la lista
     * @param proyecto Proyecto a insertar
     */
    public void insertar(Proyectos proyecto) {
        listaProyectos.add(proyecto);
    }

    /**
     * Busca un proyecto por su ID
     * @param idProyecto ID del proyecto a buscar
     * @return El proyecto si se encuentra o null si no existe
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
     * Modifica un proyecto existente en la lista
     * @param proyectoModificado Proyecto con los datos actualizados
     * @return true si se modifico correctamente false si no se encontro
     */
    public boolean modificar(Proyectos proyectoModificado) {
        for (int i = 0; i < listaProyectos.size(); i++) {
            if (listaProyectos.get(i).getIdProyecto() == proyectoModificado.getIdProyecto()) {
                listaProyectos.set(i, proyectoModificado);
                return true;
            }
        }
        return false;
    }

    /**
     * Elimina un proyecto por su ID
     * @param idProyecto ID del proyecto a eliminar
     * @return true si se elimino correctament false si no se encontro
     */
    public boolean eliminar(int idProyecto) {
        return listaProyectos.removeIf(p -> p.getIdProyecto() == idProyecto);
    }

    /**
     * Devuelve la lista completa de proyectos registrados 
     * @return Lista de proyectos
     */
    public ArrayList<Proyectos> mostrar() {
        return listaProyectos;
    }
}
