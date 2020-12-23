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
    
    public boolean estaVacia(){
        return (this.cabecera == null);
    }
    
    public int tamanio(){
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
    
    public void insertar(MultasTransito dato){
        if (estaVacia()) {
            NodoMulta temp = new NodoMulta(dato, null);
            temp.setSiguiente(cabecera);
            cabecera = temp;
        }else{
            NodoMulta iterador = cabecera;
            while(iterador.getSiguiente() != null){
                iterador = iterador.getSiguiente();
            }
            NodoMulta temp = new NodoMulta(dato, null);
            iterador.setSiguiente(temp);
        }
    }
    
    public void mostrarLista(){
        if (!estaVacia()) {
            NodoMulta temp = cabecera;
            while (temp != null) {                
                temp = temp.getSiguiente();
            }
        }
    }
    
    public MultasTransito obtenerPorPosicion(int pos){
        MultasTransito dato = null;
        if (!estaVacia() && pos >= 0 && (pos < tamanio())) {
            NodoMulta temp = cabecera;
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
