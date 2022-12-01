
package Vista;

import Clases.Conexion;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        menuOperaciones = new javax.swing.JMenu();
        boletinMenu = new javax.swing.JMenu();
        addBoletin = new javax.swing.JMenuItem();
        delBoletin = new javax.swing.JMenuItem();
        modBoletin = new javax.swing.JMenuItem();
        entidadMenu = new javax.swing.JMenu();
        addEntidad = new javax.swing.JMenuItem();
        delEntidad = new javax.swing.JMenuItem();
        modEntidad = new javax.swing.JMenuItem();
        productoresMenu = new javax.swing.JMenu();
        addProductor = new javax.swing.JMenuItem();
        delProductor = new javax.swing.JMenuItem();
        modProductor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROACT");

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 254, Short.MAX_VALUE)
        );

        menuOperaciones.setText("Operaciones");

        boletinMenu.setText("Boletines");

        addBoletin.setText("Agregar");
        boletinMenu.add(addBoletin);

        delBoletin.setText("Eliminar");
        boletinMenu.add(delBoletin);

        modBoletin.setText("Modificar");
        modBoletin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modBoletinActionPerformed(evt);
            }
        });
        boletinMenu.add(modBoletin);

        menuOperaciones.add(boletinMenu);

        entidadMenu.setText("Entidades Productivas");

        addEntidad.setText("Agregar");
        entidadMenu.add(addEntidad);

        delEntidad.setText("Eliminar");
        entidadMenu.add(delEntidad);

        modEntidad.setText("Modificar");
        modEntidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modEntidadActionPerformed(evt);
            }
        });
        entidadMenu.add(modEntidad);

        menuOperaciones.add(entidadMenu);

        productoresMenu.setText("Productores Agrícolas");

        addProductor.setText("Agregar");
        productoresMenu.add(addProductor);

        delProductor.setText("Eliminar");
        productoresMenu.add(delProductor);

        modProductor.setText("Modificar");
        modProductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modProductorActionPerformed(evt);
            }
        });
        productoresMenu.add(modProductor);

        menuOperaciones.add(productoresMenu);

        menuBar.add(menuOperaciones);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modBoletinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modBoletinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modBoletinActionPerformed

    private void modEntidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modEntidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modEntidadActionPerformed

    private void modProductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modProductorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modProductorActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addBoletin;
    private javax.swing.JMenuItem addEntidad;
    private javax.swing.JMenuItem addProductor;
    private javax.swing.JMenu boletinMenu;
    private javax.swing.JPanel contenedor;
    private javax.swing.JMenuItem delBoletin;
    private javax.swing.JMenuItem delEntidad;
    private javax.swing.JMenuItem delProductor;
    private javax.swing.JMenu entidadMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuOperaciones;
    private javax.swing.JMenuItem modBoletin;
    private javax.swing.JMenuItem modEntidad;
    private javax.swing.JMenuItem modProductor;
    private javax.swing.JMenu productoresMenu;
    // End of variables declaration//GEN-END:variables
}
