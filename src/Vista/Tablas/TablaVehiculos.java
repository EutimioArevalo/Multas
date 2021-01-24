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
import Modelo.Vehiculo;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.event.EventListenerList;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author ASUS
 */
public class TablaVehiculos extends AbstractTableModel{
    private ListaSimple listaVehiculos = new ListaSimple();
    private ListaSimple listaPersona = new ListaSimple();

    public ListaSimple getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ListaSimple listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public ListaSimple getListaPersona() {
        return listaPersona;
    }

    public void setListaPersona(ListaSimple listaPersona) {
        this.listaPersona = listaPersona;
    }
    
    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public int getRowCount() {
        return listaVehiculos.tamanio();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Vehiculo vehiculo = (Vehiculo)listaVehiculos.obtenerPorPosicion(rowIndex);
        Persona persona = (Persona)Utilidades.obtenerDato(listaPersona, "cedula", vehiculo.getPropietario());
        switch (columnIndex) {
            case 0: return persona.getCedula();
            case 1: return persona.getNombre();
            case 2: return vehiculo.getPlaca();
            case 3: return vehiculo.getModelo();
            case 4: return vehiculo.getColor();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Cedula Propietario";
            case 1: return "Nombre Propietario";
            case 2: return "Placa";
            case 3: return "Modelo";
            case 4: return "Color";
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
