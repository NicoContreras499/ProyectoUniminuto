package com.mycompany.gui;

import com.mycompany.conexionDB.ConexionDB;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Equipo
 */
public class DesktopTiendita extends javax.swing.JFrame {

    /**
     * Creates new form DesktopTiendita
     */
    public DesktopTiendita() {
        initComponents();
        /*ConexionDB conexionDB = new ConexionDB();
        conexionDB.getConexionDB();*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDesktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuTiendita = new javax.swing.JMenu();
        itemRegistrar = new javax.swing.JMenuItem();
        itemActualizar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelDesktopLayout = new javax.swing.GroupLayout(panelDesktop);
        panelDesktop.setLayout(panelDesktopLayout);
        panelDesktopLayout.setHorizontalGroup(
            panelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
        );
        panelDesktopLayout.setVerticalGroup(
            panelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 357, Short.MAX_VALUE)
        );

        mnuTiendita.setText("Tiendita");
        mnuTiendita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTienditaActionPerformed(evt);
            }
        });

        itemRegistrar.setText("Registrar Producto");
        itemRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistrarActionPerformed(evt);
            }
        });
        mnuTiendita.add(itemRegistrar);

        itemActualizar.setText("Actualizar Producto");
        itemActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActualizarActionPerformed(evt);
            }
        });
        mnuTiendita.add(itemActualizar);

        jMenuBar1.add(mnuTiendita);

        jMenu2.setText("Help");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDesktop)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDesktop)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistrarActionPerformed
        // TODO add your handling code here:
        RegistrarProducto registrarProducto = new RegistrarProducto();
        panelDesktop.add(registrarProducto);
        registrarProducto.show();
    }//GEN-LAST:event_itemRegistrarActionPerformed

    private void mnuTienditaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTienditaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuTienditaActionPerformed

    private void itemActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemActualizarActionPerformed

        
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
            java.util.logging.Logger.getLogger(DesktopTiendita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DesktopTiendita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DesktopTiendita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DesktopTiendita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DesktopTiendita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemActualizar;
    private javax.swing.JMenuItem itemRegistrar;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuTiendita;
    private javax.swing.JDesktopPane panelDesktop;
    // End of variables declaration//GEN-END:variables
}
