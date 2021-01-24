/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.TipoLicencia;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author timoa
 */
public class ControladorListaLicencias {
    ListaLicencia lista = new ListaLicencia();

    public ListaLicencia getLista() {
        return lista;
    }

    public void setLista(ListaLicencia lista) {
        this.lista = lista;
    }

    
    /**
     * See lee los el archivo que contiene la informacion de las licencias
     */
    public void leerTxt(){
        try {
            FileReader ficheroEntrada = new FileReader("licencias.txt");
            BufferedReader buffer = new BufferedReader(ficheroEntrada);
            TipoLicencia dato = null;
            String temp = "";
            while (temp != null) {
                temp = buffer.readLine();
                if (temp == null)
                    break;
                String x = temp;
                String [] arreglo = x.split(";");
                dato = new TipoLicencia(arreglo[0], arreglo[1], arreglo[2]);
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
            FileWriter fichero = new FileWriter("licencias.txt");
            int tamanio = lista.tamanio();
            for (int i = 0; i < tamanio; i++) {
                TipoLicencia dato = lista.obtenerPorPosicion(i);
                fichero.write(dato.getCategoria()+";"+dato.getTipo()+";"+dato.getCaracteristicas()+"\n");
            }
            fichero.close();
        } catch (Exception e) {
        }
    }
}
