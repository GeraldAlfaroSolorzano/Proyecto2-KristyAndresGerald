/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import datos.AlmacenamientoColaborador;
import datos.AlmacenamientoProyectos;
import java.time.LocalDate;

/**
 *
 * @author galfa
 */
public class TareasDeProyecto {
    /** 
     * Identificador unico de la tarea 
     */
    private int idTarea;

    /** 
     * Identificador del proyecto al que pertenece la tarea 
    */
    private int idProyecto;

    /** 
     * Nombre de la tarea 
    */
    private String nomTarea;

    /** 
     * Identificador del colaborador asignado a la tarea 
    */
    private int idColaborador;

    /** 
     * Fecha de inicio de la tarea 
    */
    private LocalDate fechInicio;

    /** 
     * Fecha de finalizacion de la tarea 
    */
    private LocalDate fechFin;

    /** 
     * Duracion de la tarea en dias 
    */
    private int duracion;

    /** 
     * Estado actual de la tarea 
    */
    private EstadoTarea estado;

    /** 
     * Porcentaje de avance de la tarea 
    */
    private int porcAvance;

    /**
     * Constructor que inicializa todos los atributos con los valores dados
     * @param idTarea identificador unico de la tarea
     * @param idProyecto identificador del proyecto asociado
     * @param nomTarea nombre de la tarea
     * @param idColaborador identificador del colaborador asignado
     * @param fechInicio fecha de inicio
     * @param fechFin fecha de finalizacion
     * @param duracion duracion en dias
     * @param estado estado actual de la tarea
     * @param porcAvance porcentaje de avance
     */
    public TareasDeProyecto(int idTarea, int idProyecto, String nomTarea, int idColaborador,
                            LocalDate fechInicio, LocalDate fechFin, int duracion,
                            EstadoTarea estado, int porcAvance) {
        this.idTarea = idTarea;
        this.idProyecto = idProyecto;
        this.nomTarea = nomTarea;
        this.idColaborador = idColaborador;
        this.fechInicio = fechInicio;
        this.fechFin = fechFin;
        this.duracion = duracion;
        this.estado = estado;
        this.porcAvance = porcAvance;
    }

    /**
     * Constructor vacio que inicializa con valores por defecto
     */
    public TareasDeProyecto() {
        this.idTarea = 0;
        this.idProyecto = 0;
        this.nomTarea = "";
        this.idColaborador = 0;
        this.fechInicio = null;
        this.fechFin = null;
        this.duracion = 0;
        this.estado = null;
        this.porcAvance = 0;
    }

    /**
     * Obtiene el identificador unico de la tarea
     * @return id de la tarea
     */
    public int getIdTarea() {
        return idTarea;
    }

    /**
     * Establece el identificador unico de la tarea
     * @param idTarea id de la tarea
     */
    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    /**
     * Obtiene el identificador del proyecto asociado a la tarea
     * @return id del proyecto
     */
    public int getIdProyecto() {
        return idProyecto;
    }

    /**
     * Establece el identificador del proyecto asociado a la tarea
     * @param idProyecto id del proyecto
     */
    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    /**
     * Obtiene el nombre de la tarea
     * @return nombre de la tarea
     */
    public String getNomTarea() {
        return nomTarea;
    }

    /**
     * Establece el nombre de la tarea
     * @param nomTarea nombre de la tarea
     */
    public void setNomTarea(String nomTarea) {
        this.nomTarea = nomTarea;
    }

    /**
     * Obtiene el identificador del colaborador asignado a la tarea
     * @return id del colaborador
     */
    public int getIdColaborador() {
        return idColaborador;
    }

    /**
     * Establece el identificador del colaborador asignado a la tarea
     * @param idColaborador id del colaborador
     */
    public void setIdColaborador(int idColaborador) {
        this.idColaborador = idColaborador;
    }

    /**
     * Obtiene la fecha de inicio de la tarea
     * @return fecha de inicio
     */
    public LocalDate getFechInicio() {
        return fechInicio;
    }

    /**
     * Establece la fecha de inicio de la tarea
     * @param fechInicio fecha de inicio
     */
    public void setFechInicio(LocalDate fechInicio) {
        this.fechInicio = fechInicio;
    }

    /**
     * Obtiene la fecha de finalizacion de la tarea
     * @return fecha de fin
     */
    public LocalDate getFechFin() {
        return fechFin;
    }

    /**
     * Establece la fecha de finalizacion de la tarea
     * @param fechFin fecha de fin
     */
    public void setFechFin(LocalDate fechFin) {
        this.fechFin = fechFin;
    }

    /**
     * Obtiene la duracion de la tarea en dias
     * @return duracion en dias
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * Establece la duracion de la tarea en dias
     * @param duracion duracion en dias
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * Obtiene el estado actual de la tarea
     * @return estado actual
     */
    public EstadoTarea getEstado() {
        return estado;
    }

    /**
     * Establece el estado actual de la tarea y recalcula el porcentaje de avance
     * @param estado nuevo estado
     */
    public void setEstado(EstadoTarea estado) {
        this.estado = estado;
        calcPorcTarea();
    }

    /**
     * Obtiene el porcentaje de avance de la tarea
     * @return porcentaje de avance
     */
    public int getPorcAvance() {
        return porcAvance;
    }

    /**
     * Establece el porcentaje de avance de la tarea
     * @param porcAvance porcentaje de avance
     */
    public void setPorcAvance(int porcAvance) {
        this.porcAvance = porcAvance;
    }

    /**
     * Calcula el porcentaje de avance segun el estado actual
     * CREADA 0 INICIADA 25 EN_EJECUCION 50 REVISION 75 FINALIZADA 100
     */
    public void calcPorcTarea() {
        if (estado == null) {
            this.porcAvance = 0;
            return;
        }
        switch (estado) {
            case CREADA:
                this.porcAvance = 0;
                break;
            case INICIADA:
                this.porcAvance = 25;
                break;
            case EN_EJECUCION:
                this.porcAvance = 50;
                break;
            case REVISION:
                this.porcAvance = 75;
                break;
            case FINALIZADA:
                this.porcAvance = 100;
                break;
        }
    }

    /**
     * Verifica si existe un colaborador con el id indicado consultando el almacenamiento recibido
     * @param idColaborador id del colaborador a verificar
     * @param colabs almacenamiento de colaboradores
     * @return true si existe en el almacenamiento false sino
     */
    public boolean verificarColaborador(int idColaborador, AlmacenamientoColaborador colabs) {
        if (colabs == null) {
            return false;
        }
        return colabs.buscarPorId(idColaborador) != null;
    }

    /**
     * Verifica si existe un proyecto con el id indicado consultando el almacenamiento recibido
     * @param idProyecto id del proyecto a verificar
     * @param proyectos almacenamiento de proyectos
     * @return true si existe en el almacenamiento false sino
     */
    public boolean verificarProyecto(int idProyecto, AlmacenamientoProyectos proyectos) {
        if (proyectos == null) {
            return false;
        }
        return proyectos.buscar(idProyecto) != null;
    }
}