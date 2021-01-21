/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.ListasModelo;

import Controlador.ListaSimple;
import Modelo.Normativa;
import java.io.*;

/**
 *
 * @author ASUS
 */
public class ListaNormativa {
    ListaSimple lista = new ListaSimple();

    public ListaSimple getLista() {
        return lista;
    }

    public void setLista(ListaSimple lista) {
        this.lista = lista;
    }
    
    public void leerTxt(){
        try {
            FileReader ficheroEntrada = new FileReader("Componentes/multas.txt");
            BufferedReader buffer = new BufferedReader(ficheroEntrada);
            Normativa dato = null;
            String temp = "";
            while (temp != null) {
                temp = buffer.readLine();
                if (temp == null)
                    break;
                String x = temp;
                String [] arreglo = x.split(";");
                dato = new Normativa(arreglo[0], arreglo[1], arreglo[2]);
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
            FileWriter fichero = new FileWriter("Componentes/multas.txt");
            int tamanio = lista.tamanio();
            for (int i = 0; i < tamanio; i++) {
                Normativa dato = (Normativa)lista.obtenerPorPosicion(i);
                fichero.write(dato.getRubro()+";"+dato.getDescripcion()+";"+dato.getTipoFalta()+"\n");
            }
            fichero.close();
        } catch (Exception e) {
        }
    }
}
