
package Vista;

import Clases.Administracion;
import Excepciones.FechaExistente;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ModificarObservacionesDialog extends javax.swing.JDialog {

    
    public ModificarObservacionesDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tempMaxCaibarienText = new javax.swing.JTextField();
        velMediaVientoCaibarienText = new javax.swing.JTextField();
        tempMinYabuText = new javax.swing.JTextField();
        evaporizacionLabel = new javax.swing.JLabel();
        tempMinLaPiedraText = new javax.swing.JTextField();
        SaguaLaGrandeLabel = new javax.swing.JLabel();
        evaporizacionCaibarienText = new javax.swing.JTextField();
        precipitacionesCaibarienText = new javax.swing.JTextField();
        laPiedraLabel = new javax.swing.JLabel();
        tempMinCaibarienText = new javax.swing.JTextField();
        deletBoton = new javax.swing.JButton();
        tempMinSantoDomingoText = new javax.swing.JTextField();
        evaporizacionLaPiedraText = new javax.swing.JTextField();
        velMediaVientoSaguaLaGrandeText = new javax.swing.JTextField();
        santoDomingoLabel = new javax.swing.JLabel();
        fechaLabel = new javax.swing.JLabel();
        mesLabel = new javax.swing.JLabel();
        tempMaxLabel = new javax.swing.JLabel();
        precipitacionesLabel = new javax.swing.JLabel();
        tempMinSaguaLaGrandeText = new javax.swing.JTextField();
        precipitacionesSantoDomingoText = new javax.swing.JTextField();
        yabuLabel = new javax.swing.JLabel();
        evaporizacionSaguaLaGrandeText = new javax.swing.JTextField();
        precipitacionesSaguaLaGrandeText = new javax.swing.JTextField();
        tempMaxYabuText = new javax.swing.JTextField();
        precipitacionesYabuText = new javax.swing.JTextField();
        tempMaxSaguaLaGrandeText = new javax.swing.JTextField();
        decenaCB = new javax.swing.JComboBox<>();
        decenaLabel = new javax.swing.JLabel();
        velMediaVientoLabel = new javax.swing.JLabel();
        evaporizacionYabuText = new javax.swing.JTextField();
        velMediaVientoSantoDomingoText = new javax.swing.JTextField();
        evaporizacionSantoDomingoText = new javax.swing.JTextField();
        velMediaVientoLaPiedraText = new javax.swing.JTextField();
        velMediaVientoYabuText = new javax.swing.JTextField();
        annoLabel = new javax.swing.JLabel();
        annoCB = new javax.swing.JComboBox<>();
        caibarienLabel = new javax.swing.JLabel();
        mesCB = new javax.swing.JComboBox<>();
        tempMaxLaPiedraText = new javax.swing.JTextField();
        tempMinLabel = new javax.swing.JLabel();
        precipitacionesLaPiedraText = new javax.swing.JTextField();
        tempMaxSantoDomingoText = new javax.swing.JTextField();
        mostrarButton = new javax.swing.JButton();
        modBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar Observaciones");

        evaporizacionLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        evaporizacionLabel.setText("Evaporización:");

        SaguaLaGrandeLabel.setText("E. Sagua la Grande");

        laPiedraLabel.setText("E. La Piedra");

        deletBoton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deletBoton.setText("Eliminar");
        deletBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletBotonActionPerformed(evt);
            }
        });

        santoDomingoLabel.setText("E. Santo Domingo");

        fechaLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fechaLabel.setText("Fecha:");

        mesLabel.setText("Mes:");

        tempMaxLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tempMaxLabel.setText("Temperatura Máxima:");

        precipitacionesLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        precipitacionesLabel.setText("Precipitaciones:");

        yabuLabel.setText("E. Yabú");

        decenaCB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        decenaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primera", "Segunda", "Tercera" }));
        decenaCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decenaCBActionPerformed(evt);
            }
        });

        decenaLabel.setText("Decena:");

        velMediaVientoLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        velMediaVientoLabel.setText("Velocidad Media del Viento:");

        annoLabel.setText("Año:");

        annoCB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        annoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        annoCB.setSelectedIndex(2);

        caibarienLabel.setText("E. Caibarién");

        mesCB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mesCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        mesCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesCBActionPerformed(evt);
            }
        });

        tempMaxLaPiedraText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempMaxLaPiedraTextActionPerformed(evt);
            }
        });

        tempMinLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tempMinLabel.setText("Temperatura Mínima:");

        mostrarButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mostrarButton.setText("Mostrar");
        mostrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarButtonActionPerformed(evt);
            }
        });

        modBoton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        modBoton.setText("Modificar");
        modBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(evaporizacionLabel)
                    .addComponent(precipitacionesLabel)
                    .addComponent(velMediaVientoLabel)
                    .addComponent(tempMinLabel)
                    .addComponent(tempMaxLabel)
                    .addComponent(fechaLabel))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(evaporizacionCaibarienText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                            .addComponent(velMediaVientoCaibarienText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                            .addComponent(precipitacionesCaibarienText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                            .addComponent(tempMinCaibarienText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                            .addComponent(tempMaxCaibarienText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                            .addComponent(caibarienLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(15, 15, 15)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(velMediaVientoSaguaLaGrandeText)
                                            .addComponent(precipitacionesSaguaLaGrandeText, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tempMinSaguaLaGrandeText, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tempMaxSaguaLaGrandeText, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(SaguaLaGrandeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(evaporizacionSaguaLaGrandeText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tempMaxLaPiedraText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                            .addComponent(tempMinLaPiedraText, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(precipitacionesLaPiedraText, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(laPiedraLabel)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(velMediaVientoLaPiedraText)
                                            .addComponent(evaporizacionLaPiedraText, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(decenaLabel)
                                        .addGap(70, 70, 70)
                                        .addComponent(mesLabel)
                                        .addGap(90, 90, 90)
                                        .addComponent(annoLabel)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(santoDomingoLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(yabuLabel))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tempMaxSantoDomingoText, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tempMinSantoDomingoText, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(precipitacionesSantoDomingoText, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(velMediaVientoSantoDomingoText, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(evaporizacionSantoDomingoText, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tempMinYabuText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tempMaxYabuText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(precipitacionesYabuText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(velMediaVientoYabuText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(evaporizacionYabuText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(modBoton)
                                .addGap(30, 30, 30)
                                .addComponent(deletBoton)))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(decenaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mesCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(annoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(mostrarButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(decenaLabel)
                    .addComponent(mesLabel)
                    .addComponent(annoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaLabel)
                    .addComponent(decenaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(annoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrarButton))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caibarienLabel)
                    .addComponent(SaguaLaGrandeLabel)
                    .addComponent(laPiedraLabel)
                    .addComponent(santoDomingoLabel)
                    .addComponent(yabuLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempMaxCaibarienText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempMaxLabel)
                    .addComponent(tempMaxSaguaLaGrandeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempMaxLaPiedraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempMaxSantoDomingoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempMaxYabuText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempMinCaibarienText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempMinLabel)
                    .addComponent(tempMinSaguaLaGrandeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempMinLaPiedraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempMinSantoDomingoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tempMinYabuText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precipitacionesCaibarienText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precipitacionesLabel)
                    .addComponent(precipitacionesSaguaLaGrandeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precipitacionesLaPiedraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precipitacionesSantoDomingoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precipitacionesYabuText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(velMediaVientoLabel)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(evaporizacionLabel)
                            .addComponent(evaporizacionCaibarienText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(evaporizacionSaguaLaGrandeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(evaporizacionLaPiedraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(evaporizacionSantoDomingoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(evaporizacionYabuText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(velMediaVientoCaibarienText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(velMediaVientoSaguaLaGrandeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(velMediaVientoLaPiedraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(velMediaVientoSantoDomingoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(velMediaVientoYabuText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletBoton)
                    .addComponent(modBoton))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void decenaCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decenaCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_decenaCBActionPerformed

    private void mesCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesCBActionPerformed

    private void tempMaxLaPiedraTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempMaxLaPiedraTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempMaxLaPiedraTextActionPerformed

    private void mostrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarButtonActionPerformed
        Administracion admin = new Administracion();
        String fecha = admin.normalizarFecha(annoCB.getSelectedItem().toString(),
                    mesCB.getSelectedItem().toString(), decenaCB.getSelectedItem().toString());
        
        try {
            if(admin.revizarFecha(fecha)){
            String[][] matriz = admin.buscarMatriZValores_Fecha(fecha);
            
            tempMaxCaibarienText.setText(matriz[0][0]);
            tempMinCaibarienText.setText(matriz[0][1]);
            precipitacionesCaibarienText.setText(matriz[0][2]);
            velMediaVientoCaibarienText.setText(matriz[0][3]);
            evaporizacionCaibarienText.setText(matriz[0][4]);
            
            tempMaxSaguaLaGrandeText.setText(matriz[1][0]);
            tempMinSaguaLaGrandeText.setText(matriz[1][1]);
            precipitacionesSaguaLaGrandeText.setText(matriz[1][2]);
            velMediaVientoSaguaLaGrandeText.setText(matriz[1][3]);
            evaporizacionSaguaLaGrandeText.setText(matriz[1][4]);
            
            tempMaxLaPiedraText.setText(matriz[2][0]);
            tempMinLaPiedraText.setText(matriz[2][1]);
            precipitacionesLaPiedraText.setText(matriz[2][2]);
            velMediaVientoLaPiedraText.setText(matriz[2][3]);
            evaporizacionLaPiedraText.setText(matriz[2][4]);
            
            tempMaxSantoDomingoText.setText(matriz[3][0]);
            tempMinSantoDomingoText.setText(matriz[3][1]);
            precipitacionesSantoDomingoText.setText(matriz[3][2]);
            velMediaVientoSantoDomingoText.setText(matriz[3][3]);
            evaporizacionSantoDomingoText.setText(matriz[3][4]);
            
            tempMaxYabuText.setText(matriz[4][0]);
            tempMinYabuText.setText(matriz[4][1]);
            precipitacionesYabuText.setText(matriz[4][2]);
            velMediaVientoYabuText.setText(matriz[4][3]);
            evaporizacionYabuText.setText(matriz[4][4]);
            }else
                JOptionPane.showMessageDialog(null, "No existen observaciones de esa fecha", "Error", JOptionPane.WARNING_MESSAGE);
        } catch (SQLException | ClassNotFoundException | FechaExistente ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        }        
    }//GEN-LAST:event_mostrarButtonActionPerformed

    private void deletBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletBotonActionPerformed
        Administracion admin = new Administracion();
        String fecha = admin.normalizarFecha(annoCB.getSelectedItem().toString(),
                    mesCB.getSelectedItem().toString(), decenaCB.getSelectedItem().toString());
        
        try {
            if(admin.revizarFecha(fecha)){
               if(JOptionPane.showConfirmDialog(null, "Seguro desea borrar las observaciones de esta fecha ", "Confirmación", 2, JOptionPane.WARNING_MESSAGE) == 0){
                    
                    if(admin.eliminarObservacion(fecha)){
                        JOptionPane.showMessageDialog(null, "Se han eliminado las observaciones correctamente","Correcto", JOptionPane.INFORMATION_MESSAGE);
                        limpiarCampos();
                    }else{
                        throw new FechaExistente("Ha ocurrido un error al eliminar la observación");
                    }
                } 
            }
        } catch (SQLException | ClassNotFoundException | FechaExistente ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_deletBotonActionPerformed

    private void modBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modBotonActionPerformed
        
        Administracion admin = new Administracion();
        String fecha = admin.normalizarFecha(annoCB.getSelectedItem().toString(), mesCB.getSelectedItem().toString(), decenaCB.getSelectedItem().toString());
        
        try {            
            admin.modificarObservacion(fecha, Float.parseFloat(tempMaxCaibarienText.getText()), Float.parseFloat(tempMinCaibarienText.getText()),
                    Float.parseFloat(precipitacionesCaibarienText.getText()), Float.parseFloat(velMediaVientoCaibarienText.getText()),
                    Float.parseFloat(evaporizacionCaibarienText.getText()), caibarienLabel.getText());
            
            admin.modificarObservacion(fecha, Float.parseFloat(tempMaxLaPiedraText.getText()), Float.parseFloat(tempMinLaPiedraText.getText()),
                    Float.parseFloat(precipitacionesLaPiedraText.getText()), Float.parseFloat(velMediaVientoLaPiedraText.getText()),
                    Float.parseFloat(evaporizacionLaPiedraText.getText()), laPiedraLabel.getText());
            
            admin.modificarObservacion(fecha, Float.parseFloat(tempMaxSaguaLaGrandeText.getText()), Float.parseFloat(tempMinSaguaLaGrandeText.getText()),
                    Float.parseFloat(precipitacionesSaguaLaGrandeText.getText()), Float.parseFloat(velMediaVientoSaguaLaGrandeText.getText()),
                    Float.parseFloat(evaporizacionSaguaLaGrandeText.getText()), SaguaLaGrandeLabel.getText());
            
            
            admin.modificarObservacion(fecha, Float.parseFloat(tempMaxSantoDomingoText.getText()), Float.parseFloat(tempMinSantoDomingoText.getText()),
                    Float.parseFloat(precipitacionesSantoDomingoText.getText()), Float.parseFloat(velMediaVientoSantoDomingoText.getText()),
                    Float.parseFloat(evaporizacionSantoDomingoText.getText()), santoDomingoLabel.getText());
        
            admin.modificarObservacion(fecha, Float.parseFloat(tempMaxYabuText.getText()), Float.parseFloat(tempMinYabuText.getText()),
                    Float.parseFloat(precipitacionesYabuText.getText()), Float.parseFloat(velMediaVientoYabuText.getText()),
                    Float.parseFloat(evaporizacionYabuText.getText()), yabuLabel.getText());
        
            JOptionPane.showMessageDialog(null, "Modificado Correctamente", "Correcto", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            
        } catch (SQLException | ClassNotFoundException  ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Recuerde llenar el formulario y usar '.' para los decimales", "Error", JOptionPane.WARNING_MESSAGE);
        }    
    
    }//GEN-LAST:event_modBotonActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarObservacionesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarObservacionesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarObservacionesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarObservacionesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            ModificarObservacionesDialog dialog = new ModificarObservacionesDialog(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }
    
    public void limpiarCampos(){
        tempMaxCaibarienText.setText(null);
            tempMinCaibarienText.setText(null);
            precipitacionesCaibarienText.setText(null);
            velMediaVientoCaibarienText.setText(null);
            evaporizacionCaibarienText.setText(null);
            
            tempMaxSaguaLaGrandeText.setText(null);
            tempMinSaguaLaGrandeText.setText(null);
            precipitacionesSaguaLaGrandeText.setText(null);
            velMediaVientoSaguaLaGrandeText.setText(null);
            evaporizacionSaguaLaGrandeText.setText(null);
            
            tempMaxLaPiedraText.setText(null);
            tempMinLaPiedraText.setText(null);
            precipitacionesLaPiedraText.setText(null);
            velMediaVientoLaPiedraText.setText(null);
            evaporizacionLaPiedraText.setText(null);
            
            tempMaxSantoDomingoText.setText(null);
            tempMinSantoDomingoText.setText(null);
            precipitacionesSantoDomingoText.setText(null);
            velMediaVientoSantoDomingoText.setText(null);
            evaporizacionSantoDomingoText.setText(null);
            
            tempMaxYabuText.setText(null);
            tempMinYabuText.setText(null);
            precipitacionesYabuText.setText(null);
            velMediaVientoYabuText.setText(null);
            evaporizacionYabuText.setText(null);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SaguaLaGrandeLabel;
    private javax.swing.JComboBox<String> annoCB;
    private javax.swing.JLabel annoLabel;
    private javax.swing.JLabel caibarienLabel;
    private javax.swing.JComboBox<String> decenaCB;
    private javax.swing.JLabel decenaLabel;
    private javax.swing.JButton deletBoton;
    private javax.swing.JTextField evaporizacionCaibarienText;
    private javax.swing.JTextField evaporizacionLaPiedraText;
    private javax.swing.JLabel evaporizacionLabel;
    private javax.swing.JTextField evaporizacionSaguaLaGrandeText;
    private javax.swing.JTextField evaporizacionSantoDomingoText;
    private javax.swing.JTextField evaporizacionYabuText;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel laPiedraLabel;
    private javax.swing.JComboBox<String> mesCB;
    private javax.swing.JLabel mesLabel;
    private javax.swing.JButton modBoton;
    private javax.swing.JButton mostrarButton;
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
