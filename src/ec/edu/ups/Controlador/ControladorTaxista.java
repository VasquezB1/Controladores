/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Controlador;

import ec.edu.ups.clases.Taxista;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Byron PC
 */
public class ControladorTaxista {

    private List<Taxista> lista;

    public ControladorTaxista() {
        lista = new ArrayList<>();
    }

    public void create(Taxista objeto) {
        lista.add(objeto);
    }

    public Taxista read(String nombre) {
        for (Taxista taxista : lista) {
            if (taxista.getNombre().equals(nombre)) {
                return taxista;
            }
        }
        return null;
    }

    public void update(Taxista objeto) {
        for (int i = 0; i < lista.size(); i++) {
            Taxista elemento = lista.get(i);
            if (elemento.getNombre().equals(objeto.getNombre())) {
                lista.set(i, objeto);
                break;
            }
        }
    }

    public void delete(String nombre) {
        for (int i = 0; i < lista.size(); i++) {
            Taxista dato = lista.get(i);
            if ((dato.getNombre().equals(nombre))) {
                lista.remove(i);
                break;
            }
        }
    }
}
