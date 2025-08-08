package logica;

import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author krist
 */
public class Proyectos {

    private int idProyecto;
    private String nomProyecto;
    private LocalDate fechInicio;
    private LocalDate fechFin;
    private int duracionDias;
    private String estado;
    private int porcAvance;
//constructor lleno 

    public Proyectos(int idProyecto, String nomProyecto, LocalDate fechInicio, LocalDate fechFin, int duracionDias, String estado, int porcAvance) {
        this.idProyecto = idProyecto;
        this.nomProyecto = nomProyecto;
        this.fechInicio = fechInicio;
        this.fechFin = fechFin;
        this.duracionDias = duracionDias;
        this.estado = estado;
        this.porcAvance = porcAvance;
    }
//constructor vacio

    public Proyectos() {
        this.idProyecto = 0;
        this.nomProyecto = "";
        this.fechInicio = null;
        this.fechFin = null;
        this.duracionDias = 0;
        this.estado = "";
        this.porcAvance = 0;
    }

    //set y get 

    public int getIdProyecto() {
        return idProyecto;
    }

    public String getNomProyecto() {
        return nomProyecto;
    }

    public LocalDate getFechInicio() {
        return fechInicio;
    }

    public LocalDate getFechFin() {
        return fechFin;
    }

    public int getDuracionDias() {
        return duracionDias;
    }

    public String getEstado() {
        return estado;
    }

    public int getPorcAvance() {
        return porcAvance;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public void setNomProyecto(String nomProyecto) {
        this.nomProyecto = nomProyecto;
    }

    public void setFechInicio(LocalDate fechInicio) {
        this.fechInicio = fechInicio;
    }

    public void setFechFin(LocalDate fechFin) {
        this.fechFin = fechFin;
    }

    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPorcAvance(int porcAvance) {
        this.porcAvance = porcAvance;
    }
    
    //metodo para calcular avance 
     public int calcAvance(int idProyecto) {
        if (this.idProyecto == idProyecto) {
            return this.porcAvance;
        }
        return -1; 
    }

}
