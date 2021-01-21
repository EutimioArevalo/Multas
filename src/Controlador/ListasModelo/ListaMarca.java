/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.ListasModelo;

import Controlador.ListaSimple;
import Modelo.Marca;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ASUS
 */
public class ListaMarca {
    ListaSimple lista = new ListaSimple();

    public ListaSimple getLista() {
        return lista;
    }

    public void setLista(ListaSimple lista) {
        this.lista = lista;
    }
    
    public void leerTxt(){
        try {
            FileReader ficheroEntrada = new FileReader("Componentes/marca.txt");
            BufferedReader buffer = new BufferedReader(ficheroEntrada);
            Marca dato = null;
            String temp = "";
            while (temp != null) {
                temp = buffer.readLine();
                if (temp == null)
                    break;
                dato = new Marca(temp);
                lista.insertar(dato);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
    
    public void escribirTxt(){
        try {
            FileWriter fichero = new FileWriter("Componentes/marca.txt");
            int tamanio = lista.tamanio();
            for (int i = 0; i < tamanio; i++) {
                Marca dato = (Marca)lista.obtenerPorPosicion(i);
                fichero.write(dato.getNombre()+"\n");
            }
            fichero.close();
        } catch (Exception e) {
        }
    }
}
