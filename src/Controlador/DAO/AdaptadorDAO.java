/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.DAO;

import com.thoughtworks.xstream.XStream;
import Controlador.ListaSimple;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilterOutputStream;
import java.util.List;
/**
 *
 * @author ASUS
 */
public class AdaptadorDAO implements InterfazDAO{
    private  Conexion conexion;
    private Class clazz;

    public AdaptadorDAO(Conexion conexion, Class clazz) {
        this.conexion = conexion;
        this.clazz = clazz;
    }

    @Override
    public ListaSimple listar() {
        ListaSimple lista = new ListaSimple();
        try {
            lista = (ListaSimple) conexion.getXtrStream().fromXML(new FileReader(conexion.getDireccion()+ File.separatorChar + clazz.getSimpleName() + ".json"));            //Object obj = xtrStream.fromXML(new FileReader(url+File.separatorChar+"horario.json") );

        } catch (Exception e) {
            System.out.println("No se pudo listar " + e);
            e.printStackTrace();
        }
        return lista;
    }

    @Override
    public void guardar(Object o) throws Exception {

        ListaSimple lista = listar();
        lista.insertar(o);
        conexion.getXtrStream().toXML(lista, new FileOutputStream(conexion.getDireccion()+ File.separatorChar + clazz.getSimpleName() + ".json"));

    }
    
    @Override
    public void guardar(Object o, String NombreArchivo) throws Exception {

        ListaSimple lista = listar();
        lista.insertar(o);
        conexion.getXtrStream().toXML(lista, new FileOutputStream(conexion.getDireccion()+ File.separatorChar + NombreArchivo + ".json"));

    }

    @Override
    public Boolean modificar(Object o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return false;
    }
}
