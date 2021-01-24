/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.componentes;

import Controlador.DAO.MarcaDAO;
import Controlador.DAO.NormativaDAO;
import Controlador.DAO.TipoLicenciaDAO;
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
    public static void cargarComboNormativa(JComboBox cbx) {
        cbx.removeAllItems();
        NormativaDAO normativaD = new NormativaDAO("C:/Users/ASUS/Documents/NetBeansProjects/Multas/Componentes");
        int tamanio = normativaD.listar().tamanio();
        cbx.addItem("");
        for (int i = 0; i < tamanio; i++) {
            Normativa dato = (Normativa)normativaD.listar().obtenerPorPosicion(i);
            cbx.addItem(dato.getRubro());
        }
    }

    public static void cargarComboPlacas(JComboBox cbx) {
        cbx.removeAllItems();
        MarcaDAO marcaD = new MarcaDAO("C:/Users/ASUS/Documents/NetBeansProjects/Multas/Componentes");
        int tamanio = marcaD.listar().tamanio();
        cbx.addItem("");
        for (int i = 0; i < tamanio; i++) {
            Marca dato = (Marca)marcaD.listar().obtenerPorPosicion(i);
            cbx.addItem(dato.getNombre());
        }
    }
    
    public static void cargarComboTipoLicencia(JComboBox cbx) {
        cbx.removeAllItems();
        TipoLicenciaDAO tipoLicenciaD = new TipoLicenciaDAO("C:/Users/ASUS/Documents/NetBeansProjects/Multas/Componentes");
        int tamanio = tipoLicenciaD.listar().tamanio();
        cbx.addItem("");
        for (int i = 0; i < tamanio; i++) {
            TipoLicencia dato = (TipoLicencia)tipoLicenciaD.listar().obtenerPorPosicion(i);
            cbx.addItem(dato.getTipo());
        }
    }
}
