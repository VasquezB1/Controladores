/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Controlador;

import ec.edu.ups.clases.EmpleadoAsalariado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Byron PC
 */
public class ControladorEmpleadoAsalariado {
    
   
     private List<EmpleadoAsalariado> lista;
     private int codigo;

    public ControladorEmpleadoAsalariado() {        
        lista = new ArrayList<>();
        codigo=1;
    }

    public void create(EmpleadoAsalariado objeto) {
        objeto.setCodigo(codigo);
        codigo++;
        lista.add(objeto);
        
    }

    public EmpleadoAsalariado read(int codigo) {
        for (EmpleadoAsalariado empleadoasalariado : lista) {
            if (empleadoasalariado.getCodigo()== codigo) {
                return empleadoasalariado;
            }
        }
        return null;
    }

    public void update(EmpleadoAsalariado objeto) {
        for (int i = 0; i < lista.size(); i++) {
            EmpleadoAsalariado elemento = lista.get(i);
            if (elemento.getCodigo()== objeto.getCodigo()) {
                lista.set(i, objeto);
                break;
            }
        }
    }

    public void delete(int codigo) {
        for (int i = 0; i < lista.size(); i++) {
            EmpleadoAsalariado dato = lista.get(i);
            if (dato.getNombre().equals(codigo)) {
                lista.remove(i);
                break;
            }
        }
    }
    
 
    
}
