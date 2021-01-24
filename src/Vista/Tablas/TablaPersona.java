/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Tablas;

import Controlador.ListaSimple;
import Controlador.Utilidades;
import Modelo.Licencia;
import Modelo.Persona;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author ASUS
 */
public class TablaPersona extends AbstractTableModel{
    private ListaSimple listaPersona = new ListaSimple();
    private ListaSimple listaLicencia = new ListaSimple();

    public ListaSimple getListaPersona() {
        return listaPersona;
    }

    public void setListaPersona(ListaSimple listaPersona) {
        this.listaPersona = listaPersona;
    }

    public ListaSimple getListaLicencia() {
        return listaLicencia;
    }

    public void setListaLicencia(ListaSimple listaLicencia) {
        this.listaLicencia = listaLicencia;
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public int getRowCount() {
        return listaPersona.tamanio();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Persona persona = (Persona)listaPersona.obtenerPorPosicion(rowIndex);
        Licencia aux = (Licencia) listaLicencia.obtenerPorPosicion(rowIndex);
        Licencia licencia = (Licencia)Utilidades.obtenerDato(listaLicencia, "propietario", persona.getCedula());
        if (licencia == null) {
            licencia = new Licencia("", 0, "", "");
        }
        switch (columnIndex) {
            case 0: return persona.getCedula();
            case 1: return persona.getNombre();
            case 2: return persona.getApellido();
            case 3: return persona.getDireccion();
            case 4: return persona.getTelefono();
            case 5: return licencia.getNroLicencia();
            case 6: return licencia.getPuntos();
            case 7: return licencia.getFechaCaducidad();
            case 8: return Utilidades.obtenerStringTipos(licencia.getTipos());
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Cédula";
            case 1: return "Nombre";
            case 2: return "Apellido";
            case 3: return "Dirección";
            case 4: return "Teléfono";
            case 5: return "Nro Licencia";
            case 6: return "Puntos";
            case 7: return "Fecha Caducidad";
            case 8: return "Tipos de Licencia";
            default: return null;
        }
    }

    public void ajustarTabla(JTable tabla){
        tabla.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            DefaultTableColumnModel colModelo = (DefaultTableColumnModel) tabla.getColumnModel();
            TableColumn col = colModelo.getColumn(i);
            int ancho = 0;
            
            TableCellRenderer renderizador = col.getHeaderRenderer();
            for (int j = 0; j < tabla.getRowCount(); j++) {
                renderizador = tabla.getCellRenderer(j, i);
                Component comp = renderizador.getTableCellRendererComponent(tabla, tabla.getValueAt(j, i), false, false, j, i);
                ancho = Math.max(ancho, comp.getPreferredSize().width);
            }
            col.setPreferredWidth(ancho + 2);
        }
    }
}
