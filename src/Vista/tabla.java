/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ListaSimple;
import Modelo.Normativa;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.*;

/**
 *
 * @author ASUS
 */
public class tabla extends AbstractTableModel{
    private ListaSimple lista = new ListaSimple();

    public ListaSimple getLista() {
        return lista;
    }

    public void setLista(ListaSimple lista) {
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
        Normativa dato = (Normativa)lista.obtenerPorPosicion(rowIndex);
        switch (columnIndex) {
            case 0: return dato.getRubro();
            case 1: return dato.getDescripcion();
            case 2: return dato.getTipoFalta();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Rubro";
            case 1: return "Descripcion";
            case 2: return "Tipo de falta";
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
