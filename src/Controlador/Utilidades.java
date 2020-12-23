/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import java.io.*;

/**
 *
 * @author ASUS
 */
public class Utilidades {
    public String leerTxtProcetajeMulta(){
        String dato = "";
        try {
            FileReader ficheroEntrada = new FileReader("porcentajeMulta.txt");
            BufferedReader buffer = new BufferedReader(ficheroEntrada);
            String temp = "";
            while (temp != null) {
                temp = buffer.readLine();
                if (temp == null)
                    break;
                dato = dato + "\n" + temp;
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex){
            ex.printStackTrace();
        }
        return dato;
    }
}
