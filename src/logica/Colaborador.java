package logica;

import java.time.LocalDate;

/**
 * Clase que representa un colaborador, que hereda de la clase Persona
 * y agrega atributos propios como id, puesto y especialidad.
 * 
 * @author Andres
 */
public class Colaborador extends Persona {

    /**
     * Identificador unico del colaborador.
     */
    private int idColaborador;

    /**
     * Puesto que ocupa el colaborador.
     */
    private Puestos puesto;

    /**
     * Especialidad del colaborador.
     */
    private String especialidad;

    /**
     * Constructor vacio que inicializa los atributos con valores predeterminados.
     */
    public Colaborador() {
        super();
        this.idColaborador = 0;
        this.puesto = null;
        this.especialidad = "";
    }

    /**
     * Constructor con parametros que inicializa un colaborador con los datos proporcionados.
     * 
     * @param idColaborador Identificador unico del colaborador
     * @param cedula Numero de cedula de la persona
     * @param nombre Nombre de la persona
     * @param direccion Direccion de la persona
     * @param fechaNac Fecha de nacimiento
     * @param fecIngreso Fecha de ingreso
     * @param telefono Numero de telefono
     * @param email Correo electronico
     * @param puesto Puesto que ocupa el colaborador
     * @param departamento Especialidad o departamento del colaborador
     */
    public Colaborador(int idColaborador, int cedula, String nombre, String direccion, LocalDate fechaNac,
            LocalDate fecIngreso, int telefono, String email, Puestos puesto, String departamento) {
        super(cedula, nombre, direccion, fechaNac, fecIngreso, telefono, email);
        this.idColaborador = idColaborador;
        this.puesto = puesto;
        this.especialidad = departamento; // corregido para asignar departamento a especialidad
    }

    /**
     * Obtiene el id unico del colaborador.
     * 
     * @return idColaborador
     */
    public int getIdColaborador() {
        return idColaborador;
    }

    /**
     * Establece el id unico del colaborador.
     * 
     * @param idColaborador Identificador a asignar
     */
    public void setIdColaborador(int idColaborador) {
        this.idColaborador = idColaborador;
    }

    /**
     * Obtiene el puesto del colaborador.
     * 
     * @return puesto
     */
    public Puestos getPuesto() {
        return puesto;
    }

    /**
     * Establece el puesto del colaborador.
     * 
     * @param puesto Puesto a asignar
     */
    public void setPuesto(Puestos puesto) {
        this.puesto = puesto;
    }

    /**
     * Obtiene la especialidad del colaborador.
     * 
     * @return especialidad
     */
    public String getespecialidad() {
        return especialidad;
    }

    /**
     * Establece la especialidad del colaborador.
     * 
     * @param especialidad Especialidad a asignar
     */
    public void setespecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Devuelve una representacion en texto del colaborador, incluyendo id, nombre y puesto.
     * 
     * @return String con informacion del colaborador
     */
    @Override
    public String toString() {
        return idColaborador + " - " + nombre + " (" + (puesto != null ? puesto.getNomPuesto() : "Sin puesto") + ")";
    }
}

