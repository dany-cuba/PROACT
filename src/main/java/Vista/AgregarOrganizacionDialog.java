
package Vista;

import Clases.Administracion;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AgregarOrganizacionDialog extends javax.swing.JDialog {

    public AgregarOrganizacionDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoBG = new javax.swing.ButtonGroup();
        Contenedor = new javax.swing.JPanel();
        nombreOrgLabel = new javax.swing.JLabel();
        nombreOrgText = new javax.swing.JTextField();
        municipioLabel = new javax.swing.JLabel();
        municipioCB = new javax.swing.JComboBox<>();
        estacionLabel = new javax.swing.JLabel();
        estacionCB = new javax.swing.JComboBox<>();
        entidadRB = new javax.swing.JRadioButton();
        productorRB = new javax.swing.JRadioButton();
        agregarB = new javax.swing.JButton();
        CancelarB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Organización");

        nombreOrgLabel.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        nombreOrgLabel.setText("Nombre:");

        nombreOrgText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        municipioLabel.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        municipioLabel.setText("Municipio:");

        municipioCB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        municipioCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caibarién ", "Camajuaní ", "Corralillo ", "Encrucijada ", "Quemado de Gϋines ", "Remedios", "Sagua la Grande" }));

        estacionLabel.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        estacionLabel.setText("Estación Correspondiente:");

        estacionCB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        estacionCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "E. Caibarién", "E. Sagua la Grande", "E. La Piedra", "E. Santo Domingo", "E. Yabú" }));

        tipoBG.add(entidadRB);
        entidadRB.setFont(new java.awt.Font("Segoe UI", 2, 15)); // NOI18N
        entidadRB.setText("Entidad Productiva");

        tipoBG.add(productorRB);
        productorRB.setFont(new java.awt.Font("Segoe UI", 2, 15)); // NOI18N
        productorRB.setText("Productor Agrícola");

        agregarB.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        agregarB.setText("Agregar");
        agregarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBActionPerformed(evt);
            }
        });

        CancelarB.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        CancelarB.setText("Cancelar");
        CancelarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(nombreOrgLabel)
                .addGap(18, 18, 18)
                .addComponent(nombreOrgText, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(municipioLabel)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(entidadRB)
                            .addComponent(estacionLabel))
                        .addGap(19, 19, 19)))
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(municipioCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estacionCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productorRB))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(agregarB)
                .addGap(18, 18, 18)
                .addComponent(CancelarB)
                .addGap(54, 54, 54))
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreOrgLabel)
                    .addComponent(nombreOrgText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(municipioLabel)
                    .addComponent(municipioCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estacionLabel)
                    .addComponent(estacionCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entidadRB)
                    .addComponent(productorRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarB)
                    .addComponent(CancelarB))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarBActionPerformed
        dispose();
    }//GEN-LAST:event_CancelarBActionPerformed

    private void agregarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBActionPerformed
        Administracion admin = new Administracion();
        try{
            if(entidadRB.isSelected() && !(productorRB.isSelected())){
                admin.agregarOrg(nombreOrgText.getText(), estacionCB.getSelectedItem().toString(),
                    municipioCB.getSelectedItem().toString(), entidadRB.getText());
            
            }else if(!(entidadRB.isSelected()) && productorRB.isSelected()) {
                admin.agregarOrg(nombreOrgText.getText(), estacionCB.getSelectedItem().toString(),
                    municipioCB.getSelectedItem().toString(), productorRB.getText());
            }else{
                throw new Exception("Recuerde llenar el nombre y seleccionar un tipo de identidad");
            }
               
            JOptionPane.showMessageDialog(null, "Agregado Correctamente", "Correcto", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,  ex.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_agregarBActionPerformed

    
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
            java.util.logging.Logger.getLogger(AgregarOrganizacionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarOrganizacionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarOrganizacionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarOrganizacionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            AgregarOrganizacionDialog dialog = new AgregarOrganizacionDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton CancelarB;
    private javax.swing.JPanel Contenedor;
    private javax.swing.JButton agregarB;
    private javax.swing.JRadioButton entidadRB;
    private javax.swing.JComboBox<String> estacionCB;
    private javax.swing.JLabel estacionLabel;
    private javax.swing.JComboBox<String> municipioCB;
    private javax.swing.JLabel municipioLabel;
    private javax.swing.JLabel nombreOrgLabel;
    private javax.swing.JTextField nombreOrgText;
    private javax.swing.JRadioButton productorRB;
    private javax.swing.ButtonGroup tipoBG;
    // End of variables declaration//GEN-END:variables
}
