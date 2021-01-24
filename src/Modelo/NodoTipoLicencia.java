/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author timoa
 */
public class NodoTipoLicencia {
    private TipoLicencia dato;
    private NodoTipoLicencia siguiente;

    public NodoTipoLicencia() {
        this.dato = null;
        this.siguiente = null;
    }

    public NodoTipoLicencia(TipoLicencia dato, NodoTipoLicencia siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public TipoLicencia getDato() {
        return dato;
    }

    public void setDato(TipoLicencia dato) {
        this.dato = dato;
    }

    public NodoTipoLicencia getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoTipoLicencia siguiente) {
        this.siguiente = siguiente;
    }
}
