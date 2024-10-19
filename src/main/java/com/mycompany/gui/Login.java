
package com.mycompany.gui;

import javax.swing.JOptionPane;

/**
 *
 * @author Equipo
 */
public class Login extends javax.swing.JInternalFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIngresar = new javax.swing.JButton();
        lblContraseña = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jpasswordContraseña = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();

        btnIngresar.setText("ENTRAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        lblContraseña.setText("Contraseña:");

        lblUsuario.setText("Usuario");

        jpasswordContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpasswordContraseñaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(btnIngresar)
                .addContainerGap(166, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblContraseña)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpasswordContraseña)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(81, 215, Short.MAX_VALUE)
                .addComponent(btnIngresar)
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpasswordContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContraseña))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        String Usuario="admin"; 
        String Contraseña="123";
        
        String Pass=new String(jpasswordContraseña.getPassword());
        
        if (txtUsuario.getText().equals(Usuario) && Pass.equals(Contraseña)){
            
            DesktopTiendita DT=new DesktopTiendita();
            DT.setVisible(true);
            dispose();
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Contraseña Incorrecta");
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void jpasswordContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpasswordContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpasswordContraseñaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JPasswordField jpasswordContraseña;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
