/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.DAO;

import Controlador.ListaSimple;
import Modelo.Marca;

/**
 *
 * @author ASUS
 */
public class MarcaDAO extends AdaptadorDAO{
    private Marca marca;

    public MarcaDAO(String direccion) {
        super(new Conexion(direccion), Marca.class);
    }   

    public Marca getMarca() {
        if(marca == null)
            marca = new Marca();
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}
