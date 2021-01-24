/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.DAO;

import Modelo.Licencia;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class LicenciaDAO extends AdaptadorDAO{
    private Licencia licencia;

    public LicenciaDAO(String direccion) {
        super(new Conexion(direccion), Licencia.class);
    }

    public Licencia getLicencia() {
        if(licencia == null)
            licencia = new Licencia();
        return licencia;
    }

    public void setLicencia(Licencia licencia) {
        this.licencia = licencia;
    }
    
    public Boolean guardar(){
        try {
            this.guardar(this.getLicencia());
            return true;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error al guardar");
            return false;
        }
    }
}
