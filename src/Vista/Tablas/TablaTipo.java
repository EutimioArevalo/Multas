/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Tablas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ASUS
 */
public class TablaTipo extends AbstractTableModel{
    private ArrayList<String> lista = new ArrayList<>();

    public ArrayList<String> getLista() {
        return lista;
    }

    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
    }
    
    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String dato = lista.get(rowIndex);
        switch (columnIndex) {
            case 0: return dato;
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Tipo";
            default: return null;
        }
    }
}
