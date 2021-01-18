/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MultasTransito;
import java.io.*;


/**
 *
 * @author ASUS
 */
public class ControladorListaMulta {
    ListaMulta lista = new ListaMulta();

    public ListaMulta getLista() {
        return lista;
    }

    public void setLista(ListaMulta lista) {
        this.lista = lista;
    }
    
    
    /**
     * See lee los el archivo que contiene la informacion de las multas
     */
    public void leerTxt(){
        try {
            FileReader ficheroEntrada = new FileReader("multas.txt");
            BufferedReader buffer = new BufferedReader(ficheroEntrada);
            MultasTransito dato = null;
            String temp = "";
            while (temp != null) {
                temp = buffer.readLine();
                if (temp == null)
                    break;
                String x = temp;
                String [] arreglo = x.split(";");
                dato = new MultasTransito(arreglo[0], arreglo[1], arreglo[2]);
                lista.insertar(dato);
            }
            lista.mostrarLista();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
    
    public void escribirTxt(){
        try {
            FileWriter fichero = new FileWriter("multas.txt");
            int tamanio = lista.tamanio();
            for (int i = 0; i < tamanio; i++) {
                MultasTransito dato = lista.obtenerPorPosicion(i);
                fichero.write(dato.getRubro()+";"+dato.getDescripcion()+";"+dato.getTipoFalta()+"\n");
            }
            fichero.close();
        } catch (Exception e) {
        }
    }
}
