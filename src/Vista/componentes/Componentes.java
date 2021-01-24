/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.componentes;

import Controlador.DAO.MarcaDAO;
import Controlador.DAO.NormativaDAO;
import Controlador.DAO.TipoLicenciaDAO;
import Controlador.ListaSimple;
import Controlador.Utilidades;
import Modelo.Normativa;
import Modelo.Marca;
import Modelo.TipoLicencia;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author timoa
 */
public class Componentes extends JFrame {

    //JButton consultar, biblioteca, registrarM, registrarA, generarI;
    
    public static void cargarCombo(JComboBox cbx, ListaSimple lista, String atributoClase) {
        cbx.removeAllItems();
        int tamanio = lista.tamanio();
        cbx.addItem("");
        for (int i = 0; i < tamanio; i++) {
                String dato = Utilidades.extracciondato(lista.obtenerPorPosicion(i), atributoClase);
                cbx.addItem(dato);
        }
    }
}
