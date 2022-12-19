
package Vista;

import Clases.Administracion;
import Excepciones.FechaExistente;
import java.awt.Frame;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class BuscarBoletinDialog extends javax.swing.JDialog {

    
    public BuscarBoletinDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        initComponents();
        setLocationRelativeTo(parent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        decenaLabel = new javax.swing.JLabel();
        decenaCB = new javax.swing.JComboBox<>();
        mesLabel = new javax.swing.JLabel();
        mesCB = new javax.swing.JComboBox<>();
        annoLabel = new javax.swing.JLabel();
        annoCB = new javax.swing.JComboBox<>();
        mostrarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar");

        decenaLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        decenaLabel.setText("Decena:");

        decenaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primera", "Segunda", "Tercera" }));

        mesLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        mesLabel.setText("Mes:");

        mesCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        annoLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        annoLabel.setText("Año:");

        annoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        annoCB.setSelectedIndex(2);

        mostrarButton.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        mostrarButton.setText("Mostrar");
        mostrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(decenaLabel)
                    .addComponent(decenaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mesLabel)
                    .addComponent(mesCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mostrarButton)
                    .addComponent(annoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(annoLabel))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(decenaLabel)
                    .addComponent(mesLabel)
                    .addComponent(annoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(decenaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(annoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(mostrarButton)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarButtonActionPerformed
        try{
            Administracion admin = new Administracion();
            String fecha = admin.normalizarFecha(annoCB.getSelectedItem().toString(), mesCB.getSelectedItem().toString(), decenaCB.getSelectedItem().toString());
        
            if(admin.revizarFecha(fecha)){
                dispose();
                GenerarBoletinDialog dialog = new GenerarBoletinDialog((Frame) this.getParent(), rootPaneCheckingEnabled);
                dialog.atInit(annoCB.getSelectedItem().toString(), mesCB.getSelectedItem().toString(), decenaCB.getSelectedItem().toString());
                dialog.establecerCampos(fecha);
                dialog.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null , "No existen observaciones para esa fecha", "Error", JOptionPane.WARNING_MESSAGE);
            }
            
        } catch (FechaExistente | ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        }       
    }//GEN-LAST:event_mostrarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarBoletinDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarBoletinDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarBoletinDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarBoletinDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            BuscarBoletinDialog dialog = new BuscarBoletinDialog(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> annoCB;
    private javax.swing.JLabel annoLabel;
    private javax.swing.JComboBox<String> decenaCB;
    private javax.swing.JLabel decenaLabel;
    private javax.swing.JComboBox<String> mesCB;
    private javax.swing.JLabel mesLabel;
    private javax.swing.JButton mostrarButton;
    // End of variables declaration//GEN-END:variables
}
