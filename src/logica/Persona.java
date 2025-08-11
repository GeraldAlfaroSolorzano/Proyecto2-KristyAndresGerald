
package logica;

import java.time.LocalDate;

/**
 *
 * @author galfa
 */
public abstract class Persona {
    protected int cedula;
    protected String nombre;
    protected String direccion;
    private LocalDate fechaNac;
    protected LocalDate fecIngreso;
    protected int telefono;
    protected String email;

    public Persona(int cedula, String nombre, String direccion, LocalDate fechaNac, LocalDate fecIngreso, int telefono, String email) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaNac = fechaNac;
        this.fecIngreso = fecIngreso;
        this.telefono = telefono;
        this.email = email;
    }

    public Persona() {
        this.cedula = 0;
        this.nombre = "";
        this.direccion = "";
        this.fechaNac = null;
        this.fecIngreso = null;
        this.telefono = 0;
        this.email = "";
    }
    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public LocalDate getFecIngreso() {
        return fecIngreso;
    }

    public void setFecIngreso(LocalDate fecIngreso) {
        this.fecIngreso = fecIngreso;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}
