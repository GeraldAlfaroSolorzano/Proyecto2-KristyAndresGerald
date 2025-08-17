package logica;

import java.time.LocalDate;

/**
 *
 * @author Andres, Gerald, Kristy
 */
import java.time.LocalDate;

/**
 * Clase abstracta que representa a una persona en el sistema
 * Sirve como clase base para otros tipos de personas
 * Contiene atributos comunes y métodos de acceso
 * 
 * @author krist
 */
public abstract class Persona {

    /**
     * Numero de cedula de la persona
     */
    protected int cedula;

    /**
     * Nombre completo de la persona
     */
    protected String nombre;

    /**
     * Direccion fisica de la persona
     */
    protected String direccion;

    /**
     * Fecha de nacimiento de la persona
     */
    private LocalDate fechaNac;

    /**
     * Fecha de ingreso de la persona a la organizacion
     */
    protected LocalDate fechIngreso;

    /**
     * Numero de telefono de la persona
     */
    protected int telefono;

    /**
     * Email de la persona
     */
    protected String email;

    /**
     * Constructor con parametros que inicializa todos los atributos
     * @param cedula Numero de ccdula de la persona
     * @param nombre Nombre completo de la persona
     * @param direccion Direccion fisica de la persona
     * @param fechaNac Fecha de nacimiento de la persona
     * @param fechIngreso Fecha de ingreso a la organizacion
     * @param telefono Numero de telefono de la persona
     * @param email Email de la persona
     */
    public Persona(int cedula, String nombre, String direccion, LocalDate fechaNac, LocalDate fechIngreso, int telefono, String email) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaNac = fechaNac;
        this.fechIngreso = fechIngreso;
        this.telefono = telefono;
        this.email = email;
    }

    /**
     * Constructor vaciio que inicializa los atributos con valores por defecto
     */
    public Persona() {
        this.cedula = 0;
        this.nombre = "";
        this.direccion = "";
        this.fechaNac = null;
        this.fechIngreso = null;
        this.telefono = 0;
        this.email = "";
    }

    /**
     * Obtiene el numero de cedula de la persona 
     * @return Numero de cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * Establece el numero de cedula de la persona
     * @param cedula Numero de ceddula
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * Obtiene el nombre completo de la persona
     * @return Nombre completo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre completo de la persona
     * @param nombre Nombre completo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la direccion fisica de la persona
     * @return Direccion fisica
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la direccion fisica de la persona
     * @param direccion Direccipn fisica
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene la fecha de nacimiento de la persona
     * @return Fecha de nacimiento
     */
    public LocalDate getFechaNac() {
        return fechaNac;
    }

    /**
     * Establece la fecha de nacimiento de la persona
     * @param fechaNac Fecha de nacimiento
     */
    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    /**
     * Obtiene la fecha de ingreso de la persona a la organizacion
     * @return Fecha de ingreso
     */
    public LocalDate getFechIngreso() {
        return fechIngreso;
    }

    /**
     * Establece la fecha de ingreso de la persona a la organizacion
     * @param fechIngreso Fecha de ingreso
     */
    public void setFechIngreso(LocalDate fechIngreso) {
        this.fechIngreso = fechIngreso;
    }

    /**
     * Obtiene el numero de telefono de la persona
     * @return Numero de telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Establece el numero de telefono de la persona
     * @param telefono Numero de telefono
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene el email de la persona
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el email de la persona
     * @param email email
     */
    public void setEmail(String email) {
        this.email = email;
    }
}