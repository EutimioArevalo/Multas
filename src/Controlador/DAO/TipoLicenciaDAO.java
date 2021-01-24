/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.DAO;

import Controlador.ListaSimple;
import Modelo.TipoLicencia;

/**
 *
 * @author ASUS
 */
public class TipoLicenciaDAO extends AdaptadorDAO{
    private TipoLicencia tipoLicencia;

    public TipoLicenciaDAO(String direccion) {
        super(new Conexion(direccion), TipoLicencia.class);
    }

    public TipoLicencia getTipoLicencia() {
        if(tipoLicencia == null)
            tipoLicencia = new TipoLicencia();
        return tipoLicencia;
    }

    public void setTipoLicencia(TipoLicencia tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }
}
