
package Vista;

import Clases.ActorClave;
import Clases.Administracion;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        photo = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuOperaciones = new javax.swing.JMenu();
        boletinMenu = new javax.swing.JMenu();
        addBoletin = new javax.swing.JMenuItem();
        modBoletin = new javax.swing.JMenuItem();
        actorClaveMenu = new javax.swing.JMenu();
        addAC = new javax.swing.JMenuItem();
        delAC = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        generarBoletinMenu = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROACT");
        setIconImages(null);

        photo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dany\\Documents\\NetBeansProjects\\PROACT\\src\\main\\java\\Recursos\\Principal.png")); // NOI18N

        menuOperaciones.setText("Operaciones");
        menuOperaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOperacionesActionPerformed(evt);
            }
        });

        boletinMenu.setText("Observaciones");

        addBoletin.setText("Agregar");
        addBoletin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBoletinActionPerformed(evt);
            }
        });
        boletinMenu.add(addBoletin);

        modBoletin.setText("Modificar");
        modBoletin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modBoletinActionPerformed(evt);
            }
        });
        boletinMenu.add(modBoletin);

        menuOperaciones.add(boletinMenu);

        actorClaveMenu.setText("Actor Clave");
        actorClaveMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actorClaveMenuActionPerformed(evt);
            }
        });

        addAC.setText("Agregar");
        addAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addACActionPerformed(evt);
            }
        });
        actorClaveMenu.add(addAC);

        delAC.setText("Eliminar");
        delAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delACActionPerformed(evt);
            }
        });
        actorClaveMenu.add(delAC);

        jMenuItem1.setText("Mostrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        actorClaveMenu.add(jMenuItem1);

        menuOperaciones.add(actorClaveMenu);

        generarBoletinMenu.setText("Generar Boletín");
        generarBoletinMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarBoletinMenuActionPerformed(evt);
            }
        });
        menuOperaciones.add(generarBoletinMenu);

        menuBar.add(menuOperaciones);

        jMenu1.setText("Información General");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Mostrar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(photo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(photo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modBoletinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modBoletinActionPerformed
        ModificarObservacionesDialog dialog = new ModificarObservacionesDialog(this, rootPaneCheckingEnabled);
        dialog.setVisible(true);
    }//GEN-LAST:event_modBoletinActionPerformed

    private void addBoletinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBoletinActionPerformed
        AgregarObservacionDialog dialog = new AgregarObservacionDialog(this, rootPaneCheckingEnabled);
        dialog.setVisible(true);
    }//GEN-LAST:event_addBoletinActionPerformed

    private void generarBoletinMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarBoletinMenuActionPerformed
        BuscarBoletinDialog dialog = new BuscarBoletinDialog(this, rootPaneCheckingEnabled);
        dialog.setVisible(true);
    }//GEN-LAST:event_generarBoletinMenuActionPerformed

    private void addACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addACActionPerformed
        
        AgregarActorClaveDialog dialog = new AgregarActorClaveDialog(this, rootPaneCheckingEnabled);
        dialog.setVisible(true);
    }//GEN-LAST:event_addACActionPerformed

    private void delACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delACActionPerformed
        String nombre = JOptionPane.showInputDialog(null, "Escriba el nombre de la organización a eliminar:", "Eliminar", JOptionPane.INFORMATION_MESSAGE);
        Administracion admin = new Administracion();
        
        
        try {
            if(admin.revizarNombre(nombre))
            if(admin.eliminarActorC(new ActorClave(nombre,null,null))){
                JOptionPane.showMessageDialog(null, "Se ha eliminado la organización correctamente","Correcto", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Ocurrio un error mientras se intentaba eliminar", "Error", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            
        }
    }//GEN-LAST:event_delACActionPerformed

    private void actorClaveMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actorClaveMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actorClaveMenuActionPerformed

    private void menuOperacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOperacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuOperacionesActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        MostrarActorClaveDialog dialog = new MostrarActorClaveDialog(this, rootPaneCheckingEnabled);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        InformacionDialog dialog = new InformacionDialog(this, rootPaneCheckingEnabled);
        dialog.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
    private javax.swing.JMenu actorClaveMenu;
    private javax.swing.JMenuItem addAC;
    private javax.swing.JMenuItem addBoletin;
    private javax.swing.JMenu boletinMenu;
    private javax.swing.JMenuItem delAC;
    private javax.swing.JMenuItem generarBoletinMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuOperaciones;
    private javax.swing.JMenuItem modBoletin;
    private javax.swing.JLabel photo;
    // End of variables declaration//GEN-END:variables
}
