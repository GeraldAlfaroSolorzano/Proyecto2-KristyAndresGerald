package datos;

import java.util.ArrayList;
import logica.Colaborador;

/**
 *
 * @author Andres
 *
 * Clase donde se crea el almacenamiento de Colaborador
 */
public class AlmacenamientoColaborador {

    private ArrayList<Colaborador> listaColaboradores;

    public AlmacenamientoColaborador() {
        listaColaboradores = new ArrayList<>();
    }

    // Insertar con validaciones
    public boolean insertar(Colaborador c) {
        if (buscarPorId(c.getIdColaborador()) == null && buscarPorCedula(c.getCedula()) == null) {
            listaColaboradores.add(c);
            return true;
        }
        return false; // Ya existe el idColaborador o cedula
    }

    // Buscar por idColaborador
    public Colaborador buscarPorId(int id) {
        for (Colaborador c : listaColaboradores) {
            if (c.getIdColaborador() == id) {
                return c;
            }
        }
        return null;
    }

    // Buscar por cedula
    public Colaborador buscarPorCedula(int cedula) {
        for (Colaborador c : listaColaboradores) {
            if (c.getCedula() == cedula) {
                return c;
            }
        }
        return null;
    }

    // Modificar
    public boolean modificar(Colaborador nuevo) {
        for (int i = 0; i < listaColaboradores.size(); i++) {
            if (listaColaboradores.get(i).getIdColaborador() == nuevo.getIdColaborador()) {
                listaColaboradores.set(i, nuevo);
                return true;
            }
        }
        return false;
    }

    // Eliminar
    public boolean eliminar(int id) {
        return listaColaboradores.removeIf(c -> c.getIdColaborador() == id);
    }

    // Mostrar todos
    public ArrayList<Colaborador> mostrar() {
        return listaColaboradores;
    }
}
