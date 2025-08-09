/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.time.LocalDate;

/**
 *
 * @author galfa
 */

public class TareasDeProyecto {

    private int idTarea;
    private int idProyecto;
    private String nomTarea;
    private int idColaborador;
    private LocalDate fechInicio;
    private LocalDate fechFin;
    private int duracion;
    private EstadoTarea estado;
    private int porcAvance;

    public TareasDeProyecto(int idTarea, int idProyecto, String nomTarea, int idColaborador, LocalDate fechInicio, LocalDate fechFin, int duracion, EstadoTarea estado, int porcAvance) {
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

    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNomTarea() {
        return nomTarea;
    }

    public void setNomTarea(String nomTarea) {
        this.nomTarea = nomTarea;
    }

    public int getIdColaborador() {
        return idColaborador;
    }

    public void setIdColaborador(int idColaborador) {
        this.idColaborador = idColaborador;
    }

    public LocalDate getFechInicio() {
        return fechInicio;
    }

    public void setFechInicio(LocalDate fechInicio) {
        this.fechInicio = fechInicio;
    }

    public LocalDate getFechFin() {
        return fechFin;
    }

    public void setFechFin(LocalDate fechFin) {
        this.fechFin = fechFin;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public EstadoTarea getEstado() {
        return estado;
    }

    public void setEstado(EstadoTarea estado) {
        this.estado = estado;
        calcPorcTarea();
    }

    public int getPorcAvance() {
        return porcAvance;
    }

    public void setPorcAvance(int porcAvance) {
        this.porcAvance = porcAvance;
    }

    //Metodos
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
    
    
    
    
    
    
    
    
}