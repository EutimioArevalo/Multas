/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MultasTransito;
import Modelo.NodoMulta;

/**
 *
 * @author ASUS
 */
public class ListaMulta {

    private NodoMulta cabecera;

    public ListaMulta() {
        this.cabecera = null;
    }

    public boolean estaVacia() {
        return (this.cabecera == null);
    }

    /**
     * Metodo de una lista enlazada para que retorne el tamaño de la lista
     *
     * @return Tamaño de la lista
     */
    public int tamanio() {
        int tamanio = 0;
        if (!estaVacia()) {
            NodoMulta temp = cabecera;
            while (temp != null) {
                tamanio++;
                temp = temp.getSiguiente();
            }
        }
        return tamanio;
    }

    /**
     * Metodo insertar permitira ingresar el dato
     *
     * @param dato de tipo MultaTransito
     */
    public void insertar(MultasTransito dato) {
        if (estaVacia()) {
            NodoMulta temp = new NodoMulta(dato, null);
            temp.setSiguiente(cabecera);
            cabecera = temp;
        } else {
            NodoMulta iterador = cabecera;
            while (iterador.getSiguiente() != null) {
                iterador = iterador.getSiguiente();
            }
            NodoMulta temp = new NodoMulta(dato, null);
            iterador.setSiguiente(temp);
        }
    }

    public void insertarPos(MultasTransito dato, int pos) {
        if (estaVacia() || pos <= 0) {
            insertar(dato);
        } else {
            NodoMulta iterador = this.cabecera;
            for (int i = 0; i < pos; i++) {
                if (iterador.getSiguiente() == null) {
                    break;
                }
                iterador = iterador.getSiguiente();
            }
            NodoMulta tmp = new NodoMulta(dato, iterador.getSiguiente());
            iterador.setSiguiente(tmp);
        }
    }

    public void insertarFinal(MultasTransito dato) {
        insertarPos(dato, (0));
    }

    public void mostrarLista() {
        if (!estaVacia()) {
            NodoMulta temp = cabecera;
            while (temp != null) {
                temp = temp.getSiguiente();
            }
        }
    }

    public MultasTransito obtenerPorPosicion(int pos) {
        MultasTransito dato = null;
        if (!estaVacia() && pos >= 0 && (pos < tamanio())) {
            NodoMulta temp = cabecera;
            for (int i = 0; i < pos; i++) {
                if (temp.getSiguiente() == null) {
                    break;
                }
                temp = temp.getSiguiente();
            }
            dato = temp.getDato();
        }
        return dato;
    }

    public MultasTransito buscarporDato(String dato) {
        MultasTransito aux = null;
        if (estaVacia()) {
            System.out.println("Lista Vacia");
        } else {
            NodoMulta iterador = cabecera;

            while (iterador != null) {
                if (iterador.getDato().getRubro().equals(dato)) {
                    aux = iterador.getDato();
                    break;
                }
                iterador = iterador.getSiguiente();
            }
        }
        return aux;
    }

    public boolean compararRubro(String rubro) {
        boolean rubros = false;
        if (!estaVacia()) {
            NodoMulta temp = cabecera;
            while (temp != null) {
                if (temp.getDato().getRubro().equals(rubro)) {
                    System.out.println(temp.getDato().getRubro() + " " + temp.getDato().getTipoFalta());
                    rubros = true;
                    break;
                }

                temp = temp.getSiguiente();
            }
        }
        return rubros;
    }
}
