
package Vista;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        menuOperaciones = new javax.swing.JMenu();
        boletinMenu = new javax.swing.JMenu();
        addBoletin = new javax.swing.JMenuItem();
        delBoletin = new javax.swing.JMenuItem();
        modBoletin = new javax.swing.JMenuItem();
        organizacionesMenu = new javax.swing.JMenu();
        addOrg = new javax.swing.JMenuItem();
        delOrg = new javax.swing.JMenuItem();
        generarBoletinMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROACT");

        menuOperaciones.setText("Operaciones");

        boletinMenu.setText("Observaciones");

        addBoletin.setText("Agregar");
        addBoletin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBoletinActionPerformed(evt);
            }
        });
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

        organizacionesMenu.setText("Organizaciones");

        addOrg.setText("Agregar");
        organizacionesMenu.add(addOrg);

        delOrg.setText("Eliminar");
        organizacionesMenu.add(delOrg);

        menuOperaciones.add(organizacionesMenu);

        generarBoletinMenu.setText("Generar Boletín");
        generarBoletinMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarBoletinMenuActionPerformed(evt);
            }
        });
        menuOperaciones.add(generarBoletinMenu);

        menuBar.add(menuOperaciones);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 254, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modBoletinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modBoletinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modBoletinActionPerformed

    private void addBoletinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBoletinActionPerformed
        AddBoletinDialog dialog = new AddBoletinDialog(this, rootPaneCheckingEnabled);
        dialog.setVisible(true);
    }//GEN-LAST:event_addBoletinActionPerformed

    private void generarBoletinMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarBoletinMenuActionPerformed
        BuscarBoletinDialog dialog = new BuscarBoletinDialog(this, rootPaneCheckingEnabled);
        dialog.setVisible(true);
    }//GEN-LAST:event_generarBoletinMenuActionPerformed

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
    private javax.swing.JMenuItem addOrg;
    private javax.swing.JMenu boletinMenu;
    private javax.swing.JMenuItem delBoletin;
    private javax.swing.JMenuItem delOrg;
    private javax.swing.JMenuItem generarBoletinMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuOperaciones;
    private javax.swing.JMenuItem modBoletin;
    private javax.swing.JMenu organizacionesMenu;
    // End of variables declaration//GEN-END:variables
}
