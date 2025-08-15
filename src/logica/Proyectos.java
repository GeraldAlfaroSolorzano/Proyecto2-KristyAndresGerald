package logica;

import java.time.LocalDate;
import java.util.List;

/**
 * Representa un proyecto con sus datos y porcentaje de avance
 * Calcula avance a partir de sus tareas
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
     * Constructor completo
     * @param idProyecto identificador unico del proyecto
     * @param nomProyecto nombre del proyecto
     * @param fechInicio fecha de inicio
     * @param fechFin fecha de fin
     * @param duracionDias duracion en dias
     * @param estado estado actual
     * @param porcAvance porcentaje de avance inicial
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
     * Constructor vacio 
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
     * @return idProyecto 
    */
    public int getIdProyecto() {
        return idProyecto;
    }

    /**
     * Establece el identificador del proyecto
     * @param idProyecto identificador a asignar
     */
    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    /** 
     * @return nomProyecto 
    */
    public String getNomProyecto() {
        return nomProyecto;
    }

    /**
     * Establece el nombre del proyecto
     * @param nomProyecto nombre a asignar
     */
    public void setNomProyecto(String nomProyecto) {
        this.nomProyecto = nomProyecto;
    }

    /** 
     * @return fechInicio 
    */
    public LocalDate getFechInicio() {
        return fechInicio;
    }

    /**
     * Establece la fecha de inicio del proyecto
     * @param fechInicio fecha a asignar
     */
    public void setFechInicio(LocalDate fechInicio) {
        this.fechInicio = fechInicio;
    }

    /** 
     * @return fechFin 
    */
    public LocalDate getFechFin() {
        return fechFin;
    }

    /**
     * Establece la fecha de finalizacion del proyecto
     * @param fechFin fecha a asignar
     */
    public void setFechFin(LocalDate fechFin) {
        this.fechFin = fechFin;
    }

    /** 
     * @return duracionDias 
    */
    public int getDuracionDias() {
        return duracionDias;
    }

    /**
     * Establece la duracion del proyecto en dias
     * @param duracionDias duracion a asignar
     */
    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }

    /** 
     * @return estado 
    */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado del proyecto
     * @param estado estado a asignar
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /** @return porcAvance */
    public int getPorcAvance() {
        return porcAvance;
    }

    /**
     * Establece el porcentaje de avance del proyecto
     * @param porcAvance porcentaje a asignar
     */
    public void setPorcAvance(int porcAvance) {
        this.porcAvance = porcAvance;
    }

    /**
     * Calcula el porcentaje de avance promediando 
     * Recibe la lista de tareas del proyecto
     * @param tareasDelProyecto lista de tareas del proyecto
     * @return porcentaje de avance calculado
     */
    public int calcAvance(List<TareasDeProyecto> tareasDelProyecto) {
        if (tareasDelProyecto == null || tareasDelProyecto.isEmpty()) {
            this.porcAvance = 0;
            return this.porcAvance;
        }
        int suma = 0;
        for (TareasDeProyecto t : tareasDelProyecto) {
            t.calcPorcTarea();
            suma += t.getPorcAvance();
        }
        this.porcAvance = suma / tareasDelProyecto.size();
        return this.porcAvance;
    }
}
