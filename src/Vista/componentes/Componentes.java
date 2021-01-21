/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.componentes;

import Controlador.ListasModelo.ListaNormativa;
import Controlador.ListasModelo.ListaMarca;
import Modelo.Normativa;
import Modelo.Marca;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author timoa
 */
public class Componentes extends JFrame {

    //JButton consultar, biblioteca, registrarM, registrarA, generarI;
    public static void cargarComboNormativa(JComboBox cbx) {
        cbx.removeAllItems();
        ListaNormativa lista = new ListaNormativa();
        lista.leerTxt();
        int tamanio = lista.getLista().tamanio();
        for (int i = 0; i < tamanio; i++) {
            Normativa dato = (Normativa)lista.getLista().obtenerPorPosicion(i);
            cbx.addItem(dato.getRubro());
        }
    }

    public static void cargarComboPlacas(JComboBox cbx) {
        cbx.removeAllItems();
        ListaMarca lista = new ListaMarca();
        lista.leerTxt();
        int tamanio = lista.getLista().tamanio();
        for (int i = 0; i < tamanio; i++) {
            Marca dato = (Marca)lista.getLista().obtenerPorPosicion(i);
            cbx.addItem(dato.getNombre());
        }
    }
}
