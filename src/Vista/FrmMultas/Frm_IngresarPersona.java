/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.FrmMultas;

import Controlador.DAO.LicenciaDAO;
import Controlador.DAO.PersonaDAO;
import Controlador.DAO.TipoLicenciaDAO;
import Controlador.Utilidades;
import Vista.Tablas.TablaPersona;
import Vista.Tablas.TablaTipo;
import Vista.componentes.Componentes;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Frm_IngresarPersona extends javax.swing.JFrame {

    /**
     * Creates new form Frm_IngresarPersona
     */
    TablaTipo modeloTipo = new TablaTipo();
    TablaPersona modeloPersona = new TablaPersona();
    PersonaDAO personaD = new PersonaDAO("C:/Users/ASUS/Documents/NetBeansProjects/Multas/Datos");
    LicenciaDAO licenciaD = new LicenciaDAO("C:/Users/ASUS/Documents/NetBeansProjects/Multas/Datos");
    TipoLicenciaDAO tipoLicenciaD = new TipoLicenciaDAO("C:/Users/ASUS/Documents/NetBeansProjects/Multas/Componentes");
    private ArrayList<String> tipos = new ArrayList<>();
    public Frm_IngresarPersona() {
        initComponents();
        Componentes.cargarCombo(jComboBoxTipoLicencia, tipoLicenciaD.listar(), "tipo");
        cargarTablaPersona();
    }
    
    
    public void cargarTablaPersona(){
        modeloPersona.setListaPersona(personaD.listar());
        modeloPersona.setListaLicencia(licenciaD.listar());
        tbPersonas.setModel(modeloPersona);
        tbPersonas.updateUI();
        cargarTablaTipos();
    }
    
    public void cargarTablaTipos(){
        modeloTipo.setLista(tipos);
        tbTipos.setModel(modeloTipo);
        tbTipos.updateUI();
    }
    
    public void limpiar(){
        txfCedula.setText(null);
        txfNombre.setText(null);
        txfApellido.setText(null);
        txfDireccion.setText(null);
        txfTelefono.setText(null);
        txfNroLicencia.setText(null);
        txfFechaCaducidad.setText(null);
        tipos.clear();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBoxTipoLicencia = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txfCedula = new javax.swing.JTextField();
        txfNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txfApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txfDireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txfTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txfNroLicencia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txfFechaCaducidad = new javax.swing.JTextField();
        jButtonAgregarTipo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbTipos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbPersonas = new javax.swing.JTable();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonEliminarTipo = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBoxTipoLicencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Tipo Licencia:");

        jLabel2.setText("Cédula:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("DATOS DE LA PERSONA");

        txfCedula.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txfCedulaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txfCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfCedulaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfCedulaFocusLost(evt);
            }
        });
        txfCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCedulaActionPerformed(evt);
            }
        });
        txfCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfCedulaKeyTyped(evt);
            }
        });

        jLabel5.setText("Apellido:");

        jLabel6.setText("Dirrección:");

        jLabel7.setText("Teléfono:");

        jLabel8.setText("DATOS DE LA LICENCIA");

        jLabel9.setText("Nro Licencia:");

        jLabel10.setText("Fecha Caducidad:");

        txfFechaCaducidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfFechaCaducidadActionPerformed(evt);
            }
        });

        jButtonAgregarTipo.setText("Agregar Tipo");
        jButtonAgregarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarTipoActionPerformed(evt);
            }
        });

        tbTipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane2.setViewportView(tbTipos);

        tbPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tbPersonas);

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");

        jButtonEliminarTipo.setText("Eliminar Tipo");
        jButtonEliminarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxTipoLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(jButtonGuardar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(186, 186, 186))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txfCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(18, 18, 18)
                                            .addComponent(txfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(txfNroLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(165, 165, 165)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 77, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(299, 299, 299)
                            .addComponent(jLabel4))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(284, 284, 284)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonEliminarTipo)
                        .addComponent(jButtonAgregarTipo)))
                .addGap(18, 18, 18)
                .addComponent(txfFechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txfCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txfNroLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txfFechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBoxTipoLicencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAgregarTipo))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEliminarTipo))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonCancelar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCedulaKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txfCedulaKeyTyped

    private void txfCedulaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfCedulaFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCedulaFocusGained

    private void txfCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfCedulaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCedulaFocusLost

    private void txfCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCedulaActionPerformed

    private void txfCedulaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txfCedulaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCedulaAncestorAdded

    private void jButtonAgregarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarTipoActionPerformed
        // TODO add your handling code here:
        if (jComboBoxTipoLicencia.getSelectedIndex() != 0) {
            String dato = (String)jComboBoxTipoLicencia.getSelectedItem();
            tipos.add(dato);
            cargarTablaTipos();
        }
    }//GEN-LAST:event_jButtonAgregarTipoActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
        if (txfCedula.getText().length() > 0 && txfNombre.getText().length() > 0 && txfApellido.getText().length() > 0 && txfDireccion.getText().length() > 0 && txfTelefono.getText().length() > 0 && txfNroLicencia.getText().length() > 0 && txfFechaCaducidad.getText().length() > 0 && tipos.size() > 0) {
            if (!Utilidades.datoRepetido(personaD.listar(), "cedula", txfCedula.getText())) {
                personaD.setPersona(null);
                personaD.getPersona().setCedula(txfCedula.getText());
                personaD.getPersona().setNombre(txfNombre.getText());
                personaD.getPersona().setApellido(txfApellido.getText());     
                personaD.getPersona().setDireccion(txfDireccion.getText());
                personaD.getPersona().setTelefono(txfTelefono.getText());
                licenciaD.setLicencia(null);
                licenciaD.getLicencia().setPropietario(txfCedula.getText());
                licenciaD.getLicencia().setNroLicencia(txfNroLicencia.getText());
                licenciaD.getLicencia().setPuntos(30);
                licenciaD.getLicencia().setFechaCaducidad(txfFechaCaducidad.getText());
                licenciaD.getLicencia().setTipos(tipos);
                if (personaD.guardar() && licenciaD.guardar()) {
                    JOptionPane.showConfirmDialog(null, "Se guardo correctamente");
                    limpiar();
                    cargarTablaPersona();
                }else{
                    JOptionPane.showConfirmDialog(null, "No se pudo guardar");
                } 
            }else{
                JOptionPane.showConfirmDialog(null, "Esa persona ya está registrada");
            }
        }else if(txfCedula.getText().length() > 0 && txfNombre.getText().length() > 0 && txfApellido.getText().length() > 0 && txfDireccion.getText().length() > 0 && txfTelefono.getText().length() > 0 && txfNroLicencia.getText().length() == 0 && txfFechaCaducidad.getText().length() == 0 && tipos.size() == 0){
            if (!Utilidades.datoRepetido(personaD.listar(), "cedula", txfCedula.getText())) {
                personaD.setPersona(null);
                personaD.getPersona().setCedula(txfCedula.getText());
                personaD.getPersona().setNombre(txfNombre.getText());
                personaD.getPersona().setApellido(txfApellido.getText());     
                personaD.getPersona().setDireccion(txfDireccion.getText());
                personaD.getPersona().setTelefono(txfTelefono.getText());
                if (personaD.guardar()) {
                    JOptionPane.showConfirmDialog(null, "Se guardo correctamente");
                    limpiar();
                    cargarTablaPersona();
                }else{
                    JOptionPane.showConfirmDialog(null, "No se pudo guardar");
                }
            }else{
                JOptionPane.showConfirmDialog(null, "Esa persona ya está registrada");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Llene todos los parametros o solo los de persona");
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void txfFechaCaducidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfFechaCaducidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfFechaCaducidadActionPerformed

    private void jButtonEliminarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarTipoActionPerformed
        // TODO add your handling code here:
        int fila = tbTipos.getSelectedRow();
        if (fila >= 0) {
            tipos.remove(fila);
            cargarTablaTipos();
        }else{
            JOptionPane.showConfirmDialog(null, "Seleccione el tipo de licencia que desea eliminar");
        }
    }//GEN-LAST:event_jButtonEliminarTipoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_IngresarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_IngresarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_IngresarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_IngresarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_IngresarPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarTipo;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEliminarTipo;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox<String> jComboBoxTipoLicencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tbPersonas;
    private javax.swing.JTable tbTipos;
    private javax.swing.JTextField txfApellido;
    private javax.swing.JTextField txfCedula;
    private javax.swing.JTextField txfDireccion;
    private javax.swing.JTextField txfFechaCaducidad;
    private javax.swing.JTextField txfNombre;
    private javax.swing.JTextField txfNroLicencia;
    private javax.swing.JTextField txfTelefono;
    // End of variables declaration//GEN-END:variables
}
