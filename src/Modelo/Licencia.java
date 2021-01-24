/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Licencia {
    private String NroLicencia;
    private float puntos;
    private String propietario;
    private String fechaCaducidad;
    private ArrayList<String> tipos = new ArrayList<>();

    public Licencia() {
    }

    public Licencia(String NroLicencia, float puntos, String propietario, String fechaCaducidad) {
        this.NroLicencia = NroLicencia;
        this.puntos = puntos;
        this.propietario = propietario;
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getNroLicencia() {
        return NroLicencia;
    }

    public void setNroLicencia(String NroLicencia) {
        this.NroLicencia = NroLicencia;
    }

    public float getPuntos() {
        return puntos;
    }

    public void setPuntos(float puntos) {
        this.puntos = puntos;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public ArrayList<String> getTipos() {
        return tipos;
    }

    public void setTipos(ArrayList<String> tipos) {
        this.tipos = tipos;
    }
}
