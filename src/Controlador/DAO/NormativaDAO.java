/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.DAO;

import Controlador.ListaSimple;
import Modelo.Normativa;

/**
 *
 * @author ASUS
 */
public class NormativaDAO extends AdaptadorDAO{
    private Normativa normativa;

    public NormativaDAO(String direccion) {
        super(new Conexion(direccion), Normativa.class);
    }

    public Normativa getNormativa() {
        if(normativa == null)
            normativa = new Normativa();
        return normativa;
    }

    public void setNormativa(Normativa normativa) {
        this.normativa = normativa;
    }
}
