package logica;

import java.time.LocalDate;

/**
 *
 * @author Andres
 */
public class Colaborador extends Persona {

    private int idColaborador;  // ID del colaborador
    private Puestos puesto;     // Puesto que ocupa el colaborador
    private String especialidad; // Especialidad del colaborador

    // Constructor vacío (sin parámetros)
    public Colaborador() {
        super();               // Llama al constructor de Persona
        this.idColaborador = 0;
        this.puesto = null;
        this.especialidad = "";
    }

    // Constructor lleno (con todos los parámetros)
    public Colaborador(int idColaborador, int cedula, String nombre, String direccion, LocalDate fechaNac,
            LocalDate fecIngreso, int telefono, String email, Puestos puesto, String departamento) {
        super(cedula, nombre, direccion, fechaNac, fecIngreso, telefono, email); // Inicializa atributos heredados
        this.idColaborador = idColaborador;
        this.puesto = puesto;
        this.especialidad = especialidad; // Aquí debería asignar "especialidad"
    }

    // Métodos get y set para idColaborador
    public int getIdColaborador() {
        return idColaborador;
    }

    public void setIdColaborador(int idColaborador) {
        this.idColaborador = idColaborador;
    }

    // Métodos get y set para puesto
    public Puestos getPuesto() {
        return puesto;
    }

    public void setPuesto(Puestos puesto) {
        this.puesto = puesto;
    }

    // Método get para especialidad
    public String getespecialidad() {
        return especialidad;
    }

    // Método set para especialidad 
    public void setespecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Método que devuelve una representación en texto del colaborador
    @Override
    public String toString() {
        return idColaborador + " - " + nombre + " (" + (puesto != null ? puesto.getNomPuesto() : "Sin puesto") + ")";
    }
}
