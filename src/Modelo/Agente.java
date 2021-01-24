/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ASUS
 */
public class Agente extends Persona{
    private String codAgente;

    public Agente() {
    }

    public Agente(String codAgente, String Cedula, String nombre, String apellido, String direccion, String telefono) {
        super(Cedula, nombre, apellido, direccion, telefono);
        this.codAgente = codAgente;
    }

    public String getCodAgente() {
        return codAgente;
    }

    public void setCodAgente(String codAgente) {
        this.codAgente = codAgente;
    }
}
