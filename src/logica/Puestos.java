/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author galfa
 */
public class Puestos {
    private int idPuesto;
    private String nomPuesto;
    private int salario;

    public Puestos(int idPuesto, String nomPuesto, int salario) {
        this.idPuesto = idPuesto;
        this.nomPuesto = nomPuesto;
        this.salario = salario;
    }

    public Puestos() {
        this.idPuesto = 0;
        this.nomPuesto = "";
        this.salario = 0;
    }

    public int getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }

    public String getNomPuesto() {
        return nomPuesto;
    }

    public void setNomPuesto(String nomPuesto) {
        this.nomPuesto = nomPuesto;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    
}
