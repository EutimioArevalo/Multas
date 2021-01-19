/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.utilidades;

import Controlador.ControladorListaMulta;
import Modelo.MultasTransito;
import javax.swing.JComboBox;

/**
 *
 * @author ASUS
 */
public class UtilidadesComponentes {
    public static void cargarCombo(JComboBox cbx){
        cbx.removeAllItems();
        ControladorListaMulta lista = new ControladorListaMulta();
        lista.leerTxt();
        int tamanio = lista.getLista().tamanio();
        for(int i = 0; i < tamanio; i++){
            MultasTransito dato = lista.getLista().obtenerPorPosicion(i);
            cbx.addItem(dato.getRubro());
        }
    }
}
