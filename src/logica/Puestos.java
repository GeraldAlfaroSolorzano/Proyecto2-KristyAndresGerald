/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author Andres, Gerald, Kristy
 */
public class Puestos {

    /**
     * Identificador unico del puesto
     */
    private int idPuesto;

    /**
     * Nombre del puesto
     */
    private String nomPuesto;

    /**
     * Salario asociado al puesto
     */
    private int salario;

    /**
     * Constructor que inicializa todos los atributos con los valores dados
     * @param idPuesto identificador unico del puesto
     * @param nomPuesto nombre del puesto
     * @param salario salario asociado al puesto
     */
    public Puestos(int idPuesto, String nomPuesto, int salario) {
        this.idPuesto = idPuesto;
        this.nomPuesto = nomPuesto;
        this.salario = salario;
    }

    /**
     * Constructor vacio que inicializa los atributos con valores por defecto
     */
    public Puestos() {
        this.idPuesto = 0;
        this.nomPuesto = "";
        this.salario = 0;
    }

    /**
     * Obtiene el identificador unico del puesto
     * @return id del puesto
     */
    public int getIdPuesto() {
        return idPuesto;
    }

    /**
     * Establece el identificador unico del puesto
     * @param idPuesto id del puesto
     */
    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }

    /**
     * Obtiene el nombre del puesto
     * @return nombre del puesto
     */
    public String getNomPuesto() {
        return nomPuesto;
    }

    /**
     * Establece el nombre del puesto
     * @param nomPuesto nombre del puesto
     */
    public void setNomPuesto(String nomPuesto) {
        this.nomPuesto = nomPuesto;
    }

    /**
     * Obtiene el salario del puesto
     * @return salario del puesto
     */
    public int getSalario() {
        return salario;
    }

    /**
     * Establece el salario del puesto
     * @param salario salario del puesto
     */
    public void setSalario(int salario) {
        this.salario = salario;
    }
}
