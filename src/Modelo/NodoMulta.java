/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ASUS
 */
public class NodoMulta {
    private MultasTransito dato;
    private NodoMulta siguiente;

    public NodoMulta() {
        this.dato = null;
        this.siguiente = null;
    }

    public NodoMulta(MultasTransito dato, NodoMulta siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public MultasTransito getDato() {
        return dato;
    }

    public void setDato(MultasTransito dato) {
        this.dato = dato;
    }

    public NodoMulta getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoMulta siguiente) {
        this.siguiente = siguiente;
    }
}
