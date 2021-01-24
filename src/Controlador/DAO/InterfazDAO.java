/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.DAO;

import Controlador.ListaSimple;

/**
 *
 * @author ASUS
 */
public interface InterfazDAO {
    public void guardar(Object o)throws Exception;
    public void guardar(Object o, String NombreArchivo)throws Exception;
    public Boolean modificar(Object o);
    public ListaSimple listar();
    public ListaSimple listarSinClass();
}
