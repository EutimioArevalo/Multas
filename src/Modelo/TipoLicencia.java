/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author timoa
 */
public class TipoLicencia {
    private String categoria;
    private String tipo;
    private String caracteristicas;

    public TipoLicencia() {
    }
    

    public TipoLicencia(String categoria, String tipo, String caracteristicas) {
        this.categoria = categoria;
        this.tipo = tipo;
        this.caracteristicas = caracteristicas;
    }
    
    
    

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
    
    
}
