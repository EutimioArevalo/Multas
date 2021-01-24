/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.componentes;

import Controlador.ListaLicencia;
import Modelo.TipoLicencia;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author timoa
 */
public class tablaLicencias extends AbstractTableModel{
        private ListaLicencia lista = new ListaLicencia();

    public ListaLicencia getLista() {
        return lista;
    }

    public void setLista(ListaLicencia lista) {
        this.lista = lista;
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public int getRowCount() {
        return lista.tamanio();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TipoLicencia dato = lista.obtenerPorPosicion(rowIndex);
        switch (columnIndex) {
            case 0: return dato.getCategoria();
            case 1: return dato.getTipo();
            case 2: return dato.getCaracteristicas();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Categoria";
            case 1: return "Tipo";
            case 2: return "Caracteristicas";
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
