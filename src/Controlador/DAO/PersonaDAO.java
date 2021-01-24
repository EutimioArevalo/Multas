/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador.DAO;

import Modelo.Persona;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class PersonaDAO extends AdaptadorDAO{
    private Persona persona;

    public PersonaDAO(String direccion) {
        super(new Conexion(direccion), Persona.class);
    }

    public Persona getPersona() {
        if(persona == null)
            persona = new Persona();
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    public Boolean guardar(){
        try {
            this.guardar(this.getPersona());
            return true;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error al guardar");
            return false;
        }
    }
}
