
package Vista;

import Clases.Administracion;
import Excepciones.FechaExistente;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AgregarObservacionDialog extends javax.swing.JDialog {

    public AgregarObservacionDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        decenaLabel = new javax.swing.JLabel();
        mesLabel = new javax.swing.JLabel();
        annoLabel = new javax.swing.JLabel();
        fechaLabel = new javax.swing.JLabel();
        decenaCB = new javax.swing.JComboBox<>();
        mesCB = new javax.swing.JComboBox<>();
        annoCB = new javax.swing.JComboBox<>();
        tempMaxLabel = new javax.swing.JLabel();
        tempMinLabel = new javax.swing.JLabel();
        precipitacionesLabel = new javax.swing.JLabel();
        velMediaVientoLabel = new javax.swing.JLabel();
        evaporizacionLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        caibarienLabel = new javax.swing.JLabel();
        tempMaxCaibarienText = new javax.swing.JTextField();
        tempMinCaibarienText = new javax.swing.JTextField();
        precipitacionesCaibarienText = new javax.swing.JTextField();
        velMediaVientoCaibarienText = new javax.swing.JTextField();
        evaporizacionCaibarienText = new javax.swing.JTextField();
        SaguaLaGrandeLabel = new javax.swing.JLabel();
        tempMaxSaguaLaGrandeText = new javax.swing.JTextField();
        tempMinSaguaLaGrandeText = new javax.swing.JTextField();
        precipitacionesSaguaLaGrandeText = new javax.swing.JTextField();
        velMediaVientoSaguaLaGrandeText = new javax.swing.JTextField();
        evaporizacionSaguaLaGrandeText = new javax.swing.JTextField();
        laPiedraLabel = new javax.swing.JLabel();
        tempMaxLaPiedraText = new javax.swing.JTextField();
        tempMinLaPiedraText = new javax.swing.JTextField();
        precipitacionesLaPiedraText = new javax.swing.JTextField();
        velMediaVientoLaPiedraText = new javax.swing.JTextField();
        evaporizacionLaPiedraText = new javax.swing.JTextField();
        santoDomingoLabel = new javax.swing.JLabel();
        evaporizacionSantoDomingoText = new javax.swing.JTextField();
        velMediaVientoSantoDomingoText = new javax.swing.JTextField();
        precipitacionesSantoDomingoText = new javax.swing.JTextField();
        tempMinSantoDomingoText = new javax.swing.JTextField();
        tempMaxSantoDomingoText = new javax.swing.JTextField();
        yabuLabel = new javax.swing.JLabel();
        tempMaxYabuText = new javax.swing.JTextField();
        tempMinYabuText = new javax.swing.JTextField();
        precipitacionesYabuText = new javax.swing.JTextField();
        velMediaVientoYabuText = new javax.swing.JTextField();
        evaporizacionYabuText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Observación");

        decenaLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        decenaLabel.setText("Decena:");

        mesLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        mesLabel.setText("Mes:");

        annoLabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        annoLabel.setText("Año:");

        fechaLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        fechaLabel.setText("Fecha:");

        decenaCB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        decenaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primera", "Segunda", "Tercera" }));
        decenaCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decenaCBActionPerformed(evt);
            }
        });

        mesCB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mesCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        mesCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesCBActionPerformed(evt);
            }
        });

        annoCB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        annoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        annoCB.setSelectedIndex(2);

        tempMaxLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tempMaxLabel.setText("Temperatura Máxima:");

        tempMinLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tempMinLabel.setText("Temperatura Mínima:");

        precipitacionesLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        precipitacionesLabel.setText("Precipitaciones:");

        velMediaVientoLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        velMediaVientoLabel.setText("Velocidad Media del Viento:");

        evaporizacionLabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        evaporizacionLabel.setText("Evaporización:");

        addButton.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        addButton.setText("Agregar");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        caibarienLabel.setText("E. Caibarién");

        SaguaLaGrandeLabel.setText("E. Sagua la Grande");

        laPiedraLabel.setText("E. La Piedra");

        tempMaxLaPiedraText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempMaxLaPiedraTextActionPerformed(evt);
            }
        });

        santoDomingoLabel.setText("E. Santo Domingo");

        yabuLabel.setText("E. Yabú");

        tempMinYabuText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempMinYabuTextActionPerformed(evt);
            }
        });

        velMediaVientoYabuText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                velMediaVientoYabuTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(evaporizacionLabel)
                    .addComponent(precipitacionesLabel)
                    .addComponent(velMediaVientoLabel)
                    .addComponent(tempMinLabel)
                    .addComponent(tempMaxLabel)
                    .addComponent(fechaLabel))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(evaporizacionCaibarienText, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(velMediaVientoCaibarienText, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(caibarienLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tempMaxCaibarienText, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tempMinCaibarienText)
                                    .addComponent(precipitacionesCaibarienText))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tempMaxSaguaLaGrandeText, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SaguaLaGrandeLabel)
                                            .addComponent(tempMinSaguaLaGrandeText, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(precipitacionesSaguaLaGrandeText, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(velMediaVientoSaguaLaGrandeText, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(evaporizacionSaguaLaGrandeText, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tempMinLaPiedraText)
                                            .addComponent(precipitacionesLaPiedraText)
                                            .addComponent(velMediaVientoLaPiedraText)
                                            .addComponent(evaporizacionLaPiedraText)
                                            .addComponent(tempMaxLaPiedraText)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(laPiedraLabel)
                                        .addGap(0, 27, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(decenaLabel)
                                .addGap(54, 54, 54)
                                .addComponent(mesLabel)
                                .addGap(87, 87, 87)
                                .addComponent(annoLabel)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addButton)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tempMinSantoDomingoText, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                        .addComponent(precipitacionesSantoDomingoText, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                        .addComponent(velMediaVientoSantoDomingoText, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                        .addComponent(evaporizacionSantoDomingoText, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                        .addComponent(tempMaxSantoDomingoText)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cancelButton)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(evaporizacionYabuText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                        .addComponent(tempMaxYabuText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tempMinYabuText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(precipitacionesYabuText, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(velMediaVientoYabuText, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(santoDomingoLabel)
                                .addGap(18, 18, 18)
                                .addComponent(yabuLabel)))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(decenaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mesCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(annoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annoLabel)
                    .addComponent(decenaLabel)
                    .addComponent(mesLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaLabel)
                    .addComponent(decenaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(annoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caibarienLabel)
                    .addComponent(SaguaLaGrandeLabel)
                    .addComponent(laPiedraLabel)
                    .addComponent(santoDomingoLabel)
                    .addComponent(yabuLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempMaxCaibarienText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempMaxLabel)
                    .addComponent(tempMaxSaguaLaGrandeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempMaxLaPiedraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempMaxSantoDomingoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempMaxYabuText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempMinCaibarienText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempMinLabel)
                    .addComponent(tempMinSaguaLaGrandeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempMinLaPiedraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempMinSantoDomingoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempMinYabuText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precipitacionesCaibarienText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precipitacionesLabel)
                    .addComponent(precipitacionesSaguaLaGrandeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precipitacionesLaPiedraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precipitacionesSantoDomingoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precipitacionesYabuText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(velMediaVientoLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(velMediaVientoSaguaLaGrandeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(velMediaVientoLaPiedraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(evaporizacionLabel)
                            .addComponent(evaporizacionCaibarienText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(evaporizacionSaguaLaGrandeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(evaporizacionLaPiedraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(evaporizacionSantoDomingoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(evaporizacionYabuText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(velMediaVientoCaibarienText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(velMediaVientoSantoDomingoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(velMediaVientoYabuText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(cancelButton))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mesCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesCBActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void tempMaxLaPiedraTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempMaxLaPiedraTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempMaxLaPiedraTextActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        
        Administracion admin = new Administracion();
        String fecha = admin.normalizarFecha(annoCB.getSelectedItem().toString(), mesCB.getSelectedItem().toString(), decenaCB.getSelectedItem().toString());
        
        try {
            admin.revizarErrorFecha(fecha);
            
            admin.agregarObservacion(fecha, Float.parseFloat(tempMaxCaibarienText.getText()), Float.parseFloat(tempMinCaibarienText.getText()),
                    Float.parseFloat(precipitacionesCaibarienText.getText()), Float.parseFloat(velMediaVientoCaibarienText.getText()),
                    Float.parseFloat(evaporizacionCaibarienText.getText()), caibarienLabel.getText());
            
           
            admin.agregarObservacion(fecha, Float.parseFloat(tempMaxSaguaLaGrandeText.getText()), Float.parseFloat(tempMinSaguaLaGrandeText.getText()),
                    Float.parseFloat(precipitacionesSaguaLaGrandeText.getText()), Float.parseFloat(velMediaVientoSaguaLaGrandeText.getText()),
                    Float.parseFloat(evaporizacionSaguaLaGrandeText.getText()), SaguaLaGrandeLabel.getText());
            
             admin.agregarObservacion(fecha, Float.parseFloat(tempMaxLaPiedraText.getText()), Float.parseFloat(tempMinLaPiedraText.getText()),
                    Float.parseFloat(precipitacionesLaPiedraText.getText()), Float.parseFloat(velMediaVientoLaPiedraText.getText()),
                    Float.parseFloat(evaporizacionLaPiedraText.getText()), laPiedraLabel.getText());
            
            
            admin.agregarObservacion(fecha, Float.parseFloat(tempMaxSantoDomingoText.getText()), Float.parseFloat(tempMinSantoDomingoText.getText()),
                    Float.parseFloat(precipitacionesSantoDomingoText.getText()), Float.parseFloat(velMediaVientoSantoDomingoText.getText()),
                    Float.parseFloat(evaporizacionSantoDomingoText.getText()), santoDomingoLabel.getText());
        
            admin.agregarObservacion(fecha, Float.parseFloat(tempMaxYabuText.getText()), Float.parseFloat(tempMinYabuText.getText()),
                    Float.parseFloat(precipitacionesYabuText.getText()), Float.parseFloat(velMediaVientoYabuText.getText()),
                    Float.parseFloat(evaporizacionYabuText.getText()), yabuLabel.getText());
        
            JOptionPane.showMessageDialog(null, "Agregado Correctamente", "Correcto", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            
        } catch (SQLException | ClassNotFoundException | FechaExistente ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Recuerde llenar el formulario y usar '.' para los decimales", "Error", JOptionPane.WARNING_MESSAGE);
        }    
    }//GEN-LAST:event_addButtonActionPerformed

    private void decenaCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decenaCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_decenaCBActionPerformed

    private void tempMinYabuTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempMinYabuTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempMinYabuTextActionPerformed

    private void velMediaVientoYabuTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_velMediaVientoYabuTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_velMediaVientoYabuTextActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarObservacionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarObservacionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarObservacionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarObservacionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            AgregarObservacionDialog dialog = new AgregarObservacionDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel SaguaLaGrandeLabel;
    private javax.swing.JButton addButton;
    private javax.swing.JComboBox<String> annoCB;
    private javax.swing.JLabel annoLabel;
    private javax.swing.JLabel caibarienLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JComboBox<String> decenaCB;
    private javax.swing.JLabel decenaLabel;
    private javax.swing.JTextField evaporizacionCaibarienText;
    private javax.swing.JTextField evaporizacionLaPiedraText;
    private javax.swing.JLabel evaporizacionLabel;
    private javax.swing.JTextField evaporizacionSaguaLaGrandeText;
    private javax.swing.JTextField evaporizacionSantoDomingoText;
    private javax.swing.JTextField evaporizacionYabuText;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JLabel laPiedraLabel;
    private javax.swing.JComboBox<String> mesCB;
    private javax.swing.JLabel mesLabel;
    private javax.swing.JTextField precipitacionesCaibarienText;
    private javax.swing.JTextField precipitacionesLaPiedraText;
    private javax.swing.JLabel precipitacionesLabel;
    private javax.swing.JTextField precipitacionesSaguaLaGrandeText;
    private javax.swing.JTextField precipitacionesSantoDomingoText;
    private javax.swing.JTextField precipitacionesYabuText;
    private javax.swing.JLabel santoDomingoLabel;
    private javax.swing.JTextField tempMaxCaibarienText;
    private javax.swing.JTextField tempMaxLaPiedraText;
    private javax.swing.JLabel tempMaxLabel;
    private javax.swing.JTextField tempMaxSaguaLaGrandeText;
    private javax.swing.JTextField tempMaxSantoDomingoText;
    private javax.swing.JTextField tempMaxYabuText;
    private javax.swing.JTextField tempMinCaibarienText;
    private javax.swing.JTextField tempMinLaPiedraText;
    private javax.swing.JLabel tempMinLabel;
    private javax.swing.JTextField tempMinSaguaLaGrandeText;
    private javax.swing.JTextField tempMinSantoDomingoText;
    private javax.swing.JTextField tempMinYabuText;
    private javax.swing.JTextField velMediaVientoCaibarienText;
    private javax.swing.JTextField velMediaVientoLaPiedraText;
    private javax.swing.JLabel velMediaVientoLabel;
    private javax.swing.JTextField velMediaVientoSaguaLaGrandeText;
    private javax.swing.JTextField velMediaVientoSantoDomingoText;
    private javax.swing.JTextField velMediaVientoYabuText;
    private javax.swing.JLabel yabuLabel;
    // End of variables declaration//GEN-END:variables
}
