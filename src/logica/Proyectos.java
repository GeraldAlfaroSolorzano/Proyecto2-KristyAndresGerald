package logica;

import datos.AlmacenamientoTareas;
import java.time.LocalDate;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Representa un proyecto con sus datos y porcentaje de avance
 * Calcula avance a partir de las tareas del proyecto
 * 
 * @author krist
 */
public class Proyectos {

    /**
     * Identificador unico del proyecto
     */
    private int idProyecto;

    /**
     * Nombre del proyecto
     */
    private String nomProyecto;

    /**
     * Fecha de inicio del proyecto
     */
    private LocalDate fechInicio;

    /**
     * Fecha de finalizacion del proyecto
     */
    private LocalDate fechFin;

    /**
     * Duracion del proyecto en dias
     */
    private int duracionDias;

    /**
     * Estado actual del proyecto
     */
    private String estado;

    /**
     * Porcentaje de avance del proyecto
     */
    private int porcAvance;

    /**
     * Constructor completo que inicializa todos los atributos del proyecto
     * @param idProyecto Identificador unico del proyecto
     * @param nomProyecto Nombre del proyecto
     * @param fechInicio Fecha de inicio
     * @param fechFin Fecha de finalización
     * @param duracionDias Duración del proyecto en dias
     * @param estado Estado actual del proyecto
     * @param porcAvance Porcentaje de avance inicial
     */
    public Proyectos(int idProyecto, String nomProyecto, LocalDate fechInicio, LocalDate fechFin,
                     int duracionDias, String estado, int porcAvance) {

        this.idProyecto = idProyecto;
        this.nomProyecto = nomProyecto;
        this.fechInicio = fechInicio;
        this.fechFin = fechFin;
        this.duracionDias = duracionDias;
        this.estado = estado;
        this.porcAvance = porcAvance;
    }

    /**
     * Constructor vacio que inicializa los atributos con valores por defecto
     */
    public Proyectos() {
        this.idProyecto = 0;
        this.nomProyecto = "";
        this.fechInicio = null;
        this.fechFin = null;
        this.duracionDias = 0;
        this.estado = "";
        this.porcAvance = 0;
    }

    /**
     * Obtiene el identificador del proyecto
     * @return idProyecto
     */
    public int getIdProyecto() {
        return idProyecto;
    }

    /**
     * Establece el identificador del proyecto
     * @param idProyecto Identificador a asignar
     */
    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    /**
     * Obtiene el nombre del proyecto
     * @return nomProyecto
     */
    public String getNomProyecto() {
        return nomProyecto;
    }

    /**
     * Establece el nombre del proyecto
     * @param nomProyecto Nombre a asignar
     */
    public void setNomProyecto(String nomProyecto) {
        this.nomProyecto = nomProyecto;
    }

    /**
     * Obtiene la fecha de inicio del proyecto
     * @return fechInicio
     */
    public LocalDate getFechInicio() {
        return fechInicio;
    }

    /**
     * Establece la fecha de inicio del proyecto
     * @param fechInicio Fecha a asignar
     */
    public void setFechInicio(LocalDate fechInicio) {
        this.fechInicio = fechInicio;
    }

    /**
     * Obtiene la fecha de finalizacion del proyecto
     * @return fechFin
     */
    public LocalDate getFechFin() {
        return fechFin;
    }

    /**
     * Establece la fecha de finalizacion del proyecto
     * @param fechFin Fecha a asignar
     */
    public void setFechFin(LocalDate fechFin) {
        this.fechFin = fechFin;
    }

    /**
     * Obtiene la duracion del proyecto en dias
     * @return duracionDias
     */
    public int getDuracionDias() {
        return duracionDias;
    }

    /**
     * Establece la duracion del proyecto en dias
     * @param duracionDias Duración a asignar
     */
    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }

    /**
     * Obtiene el estado actual del proyecto
     * @return estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado del proyecto
     * @param estado Estado a asignar
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Obtiene el porcentaje de avance del proyecto
     * @return porcAvance
     */
    public int getPorcAvance() {
        return porcAvance;
    }

    /**
     * Establece el porcentaje de avance del proyecto
     * @param porcAvance Porcentaje a asignar
     */
    public void setPorcAvance(int porcAvance) {
        this.porcAvance = porcAvance;
    }

    /**
     * Calcula el porcentaje de avance del proyecto promediando el avance de sus tareas
     * Este metodo recorre las tareas asociadas al proyecto calcula el porcentaje 
     * de cada una y obtiene el promedio
     * @param idProyecto Identificador del proyecto a calcular
     * @param repoTareas Repositorio de tareas de donde se obtendran las tareas asociadas
     * @return Porcentaje de avance calculado
     */
    public int calcAvance(int idProyecto, AlmacenamientoTareas repoTareas) {
        if (repoTareas == null) {
            this.porcAvance = 0;
            return this.porcAvance;
        }

        ArrayList<TareasDeProyecto> tareas = repoTareas.listarPorProyecto(idProyecto);

        if (tareas == null || tareas.isEmpty()) {
            this.porcAvance = 0;
            return this.porcAvance;
        }

        int suma = 0;

        for (TareasDeProyecto t : tareas) {
            t.calcPorcTarea();
            suma = suma + t.getPorcAvance();
        }

        int promedio = suma / tareas.size();
        this.porcAvance = promedio;

        return this.porcAvance;
    }
}