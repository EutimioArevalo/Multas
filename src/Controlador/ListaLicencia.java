/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.TipoLicencia;
import Modelo.NodoTipoLicencia;

/**
 *
 * @author timoa
 */
public class ListaLicencia {
        private NodoTipoLicencia cabecera;

    public ListaLicencia() {
        this.cabecera = null;
    }
    
    public boolean estaVacia(){
        return (this.cabecera == null);
    }
    /**
     * Metodo de una lista enlazada para que retorne el tamaño de la lista
     * @return Tamaño de la lista
     */
    public int tamanio(){
        int tamanio = 0;
        if (!estaVacia()) {
            NodoTipoLicencia temp = cabecera;
            while (temp != null) {
                tamanio++;
                temp = temp.getSiguiente();
            }
        }
        return tamanio;
    }
    /**
     * Metodo insertar permitira ingresar el dato
     * @param dato de tipo MultaTransito
     */
    public void insertar(TipoLicencia dato){
        if (estaVacia()) {
            NodoTipoLicencia temp = new NodoTipoLicencia(dato, null);
            temp.setSiguiente(cabecera);
            cabecera = temp;
        }else{
            NodoTipoLicencia iterador = cabecera;
            while(iterador.getSiguiente() != null){
                iterador = iterador.getSiguiente();
            }
            NodoTipoLicencia temp = new NodoTipoLicencia(dato, null);
            iterador.setSiguiente(temp);
        }
    }
    
    public void mostrarLista(){
        if (!estaVacia()) {
            NodoTipoLicencia temp = cabecera;
            while (temp != null) {                
                temp = temp.getSiguiente();
            }
        }
    }
    
    public TipoLicencia obtenerPorPosicion(int pos){
        TipoLicencia dato = null;
        if (!estaVacia() && pos >= 0 && (pos < tamanio())) {
            NodoTipoLicencia temp = cabecera;
            for (int i = 0; i < pos; i++) {
                if (temp.getSiguiente() == null)
                    break;
                temp = temp.getSiguiente();
            }
            dato = temp.getDato();
        }
        return dato;
    }
}
