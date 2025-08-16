/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.util.ArrayList;
import logica.TareasDeProyecto;

/**
 *
 * @author galfa
 */
public class AlmacenamientoTareas {
    /**
     * Lista que almacena todas las tareas registradas
     */
    private ArrayList<TareasDeProyecto> listaTareas;

    /**
     * Constructor que inicializa la lista de tareas vacia
     */
    public AlmacenamientoTareas() {
        this.listaTareas = new ArrayList<TareasDeProyecto>();
    }

    public ArrayList<TareasDeProyecto> getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(ArrayList<TareasDeProyecto> listaTareas) {
        this.listaTareas = listaTareas;
    }

    
    /**
     * Inserta una nueva tarea validando que el idTarea sea unico
     * @param tarea tarea a insertar
     * @return true si se inserta false si es null
     */
    public boolean insertar(TareasDeProyecto tarea) {
        if (tarea == null) {
            return false;
        }
        for (TareasDeProyecto t : this.listaTareas) {
            if (t.getIdTarea() == tarea.getIdTarea()) {
                return false;
            }
        }
        this.listaTareas.add(tarea);
        return true;
    }

    /**
     * Busca una tarea por su idTarea
     * @param idTarea id de la tarea a buscar
     * @return la tarea si existe o null si no se encuentra
     */
    public TareasDeProyecto buscar(int idTarea) {
        for (TareasDeProyecto t : this.listaTareas) {
            if (t.getIdTarea() == idTarea) {
                return t;
            }
        }
        return null;
    }

    /**
     * Modifica una tarea existente identificada por idTarea
     * Mantiene el idTarea y actualiza los demas datos segun el objeto nuevo
     * @param idTarea id de la tarea a modificar
     * @param nuevo datos nuevos de la tarea
     * @return true si se modifica false si no existe
     */
    public boolean modificar(int idTarea, TareasDeProyecto nuevo) {
        if (nuevo == null) {
            return false;
        }
        for (int i = 0; i < this.listaTareas.size(); i++) {
            TareasDeProyecto actual = this.listaTareas.get(i);
            if (actual.getIdTarea() == idTarea) {
                // mantener el id original
                nuevo.setIdTarea(idTarea);
                this.listaTareas.set(i, nuevo);
                return true;
            }
        }
        return false;
    }

    /**
     * Elimina una tarea por su idTarea
     * @param idTarea id de la tarea a eliminar
     * @return true si se elimina false si no existe
     */
    public boolean eliminar(int idTarea) {
        for (int i = 0; i < this.listaTareas.size(); i++) {
            if (this.listaTareas.get(i).getIdTarea() == idTarea) {
                this.listaTareas.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Devuelve la lista completa de tareas registradas
     * @return lista de tareas
     */
    public ArrayList<TareasDeProyecto> mostrar() {
        return this.listaTareas;
    }

    /**
     * Lista todas las tareas que pertenecen a un proyecto especifico
     * Necesario para calcular el porcentaje de avance del proyecto
     * @param idProyecto id del proyecto
     * @return lista de tareas del proyecto
     */
    public ArrayList<TareasDeProyecto> listarPorProyecto(int idProyecto) {
        ArrayList<TareasDeProyecto> res = new ArrayList<TareasDeProyecto>();
        for (TareasDeProyecto t : this.listaTareas) {
            if (t.getIdProyecto() == idProyecto) {
                res.add(t);
            }
        }
        return res;
    }
}
