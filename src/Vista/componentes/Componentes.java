/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.componentes;

import Controlador.ControladorListaMulta;
import Modelo.MultasTransito;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author timoa
 */
public class Componentes extends JFrame {

    //JButton consultar, biblioteca, registrarM, registrarA, generarI;
    public static void cargarCombo(JComboBox cbx) {
        cbx.removeAllItems();
        ControladorListaMulta lista = new ControladorListaMulta();
        lista.leerTxt();
        int tamanio = lista.getLista().tamanio();
        for (int i = 0; i < tamanio; i++) {
            MultasTransito dato = lista.getLista().obtenerPorPosicion(i);
            cbx.addItem(dato.getRubro());
        }
    }

}
