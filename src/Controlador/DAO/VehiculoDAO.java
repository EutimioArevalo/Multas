/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.DAO;

import Modelo.Vehiculo;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class VehiculoDAO extends AdaptadorDAO{
    private Vehiculo vehiculo;

    public VehiculoDAO(String direccion, String NombreArchivo) {
        super(new Conexion(direccion), NombreArchivo);
    }

    public Vehiculo getVehiculo() {
        if(vehiculo == null)
            vehiculo = new Vehiculo();
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public Boolean guardar(String NombreArchivo){
        try {
            this.guardar(this.getVehiculo(), NombreArchivo);
            return true;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error al guardar");
            return false;
        }
    }
}
