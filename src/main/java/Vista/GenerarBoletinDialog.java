
package Vista;

import Clases.Administracion;
import java.sql.SQLException;
import javax.swing.JDialog;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class GenerarBoletinDialog extends javax.swing.JDialog {
    
    private static String anno;
    private static String mes;
    private static String decena;

    public GenerarBoletinDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JPanel();
        insmetIcon = new javax.swing.JLabel();
        annoLabel = new javax.swing.JLabel();
        decenaLabel = new javax.swing.JLabel();
        tempMaxLabel = new javax.swing.JLabel();
        tempMaxBoton = new javax.swing.JButton();
        tempMinLabel = new javax.swing.JLabel();
        tempMinBoton = new javax.swing.JButton();
        velMediaVientoYabuText = new javax.swing.JTextField();
        evaporizacionSantoDomingoText = new javax.swing.JTextField();
        evaporizacionSaguaLaGrandeText = new javax.swing.JTextField();
        precipitacionesSantoDomingoText = new javax.swing.JTextField();
        evaporizacionCaibarienText = new javax.swing.JTextField();
        velMediaVientoSantoDomingoText = new javax.swing.JTextField();
        precipitacionesSaguaLaGrandeText = new javax.swing.JTextField();
        yabuLabel = new javax.swing.JLabel();
        velMediaVientoCaibarienText = new javax.swing.JTextField();
        velMediaVientoLaPiedraText = new javax.swing.JTextField();
        santoDomingoLabel = new javax.swing.JLabel();
        laPiedraLabel = new javax.swing.JLabel();
        caibarienLabel = new javax.swing.JLabel();
        precipitacionesLaPiedraText = new javax.swing.JTextField();
        evaporizacionLaPiedraText = new javax.swing.JTextField();
        SaguaLaGrandeLabel = new javax.swing.JLabel();
        precipitacionesCaibarienText = new javax.swing.JTextField();
        velMediaVientoSaguaLaGrandeText = new javax.swing.JTextField();
        evaporizacionYabuText = new javax.swing.JTextField();
        precipitacionesYabuText = new javax.swing.JTextField();
        precipitacionesLabel = new javax.swing.JLabel();
        velMedVientoLabel = new javax.swing.JLabel();
        evaporizacionLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Boletín");

        Contenedor.setBackground(new java.awt.Color(255, 255, 255));

        annoLabel.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        annoLabel.setText("Año 2022");

        decenaLabel.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        decenaLabel.setText("1ra Decena de Enero");

        tempMaxLabel.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        tempMaxLabel.setText("Temperaturas Máximas (°C):");

        tempMaxBoton.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        tempMaxBoton.setText("Mostrar Gráfico");
        tempMaxBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempMaxBotonActionPerformed(evt);
            }
        });

        tempMinLabel.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        tempMinLabel.setText("Temperaturas Mínimas (°C):");

        tempMinBoton.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        tempMinBoton.setText("Mostrar Gráfico");
        tempMinBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempMinBotonActionPerformed(evt);
            }
        });

        velMediaVientoYabuText.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        velMediaVientoYabuText.setEnabled(false);

        evaporizacionSantoDomingoText.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        evaporizacionSantoDomingoText.setEnabled(false);

        evaporizacionSaguaLaGrandeText.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        evaporizacionSaguaLaGrandeText.setEnabled(false);

        precipitacionesSantoDomingoText.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        precipitacionesSantoDomingoText.setEnabled(false);

        evaporizacionCaibarienText.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        evaporizacionCaibarienText.setEnabled(false);

        velMediaVientoSantoDomingoText.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        velMediaVientoSantoDomingoText.setEnabled(false);

        precipitacionesSaguaLaGrandeText.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        precipitacionesSaguaLaGrandeText.setEnabled(false);

        yabuLabel.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        yabuLabel.setText("E. Yabú");

        velMediaVientoCaibarienText.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        velMediaVientoCaibarienText.setEnabled(false);

        velMediaVientoLaPiedraText.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        velMediaVientoLaPiedraText.setEnabled(false);

        santoDomingoLabel.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        santoDomingoLabel.setText("E. Santo Domingo");

        laPiedraLabel.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        laPiedraLabel.setText("E. La Piedra");

        caibarienLabel.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        caibarienLabel.setText("E. Caibarién");

        precipitacionesLaPiedraText.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        precipitacionesLaPiedraText.setEnabled(false);

        evaporizacionLaPiedraText.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        evaporizacionLaPiedraText.setEnabled(false);

        SaguaLaGrandeLabel.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        SaguaLaGrandeLabel.setText("E. Sagua la Grande");

        precipitacionesCaibarienText.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        precipitacionesCaibarienText.setEnabled(false);

        velMediaVientoSaguaLaGrandeText.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        velMediaVientoSaguaLaGrandeText.setEnabled(false);

        evaporizacionYabuText.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        evaporizacionYabuText.setEnabled(false);

        precipitacionesYabuText.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        precipitacionesYabuText.setEnabled(false);

        precipitacionesLabel.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        precipitacionesLabel.setText("Precipitaciones (mm):");

        velMedVientoLabel.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        velMedVientoLabel.setText("Velocidad Media del Viento (km/h):");

        evaporizacionLabel.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        evaporizacionLabel.setText("Evaporización (mm):");

        jLabel1.setIcon(new javax.swing.ImageIcon("Img/INSMET.png"));
        jLabel1.setText(" ");

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addComponent(annoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 746, Short.MAX_VALUE)
                        .addComponent(insmetIcon))
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addComponent(decenaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(precipitacionesLabel)
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tempMinLabel)
                            .addComponent(tempMaxLabel))
                        .addGap(30, 30, 30))
                    .addComponent(evaporizacionLabel)
                    .addComponent(velMedVientoLabel))
                .addGap(18, 18, 18)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addComponent(tempMaxBoton)
                        .addGap(92, 469, Short.MAX_VALUE))
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ContenedorLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(ContenedorLayout.createSequentialGroup()
                                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ContenedorLayout.createSequentialGroup()
                                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(velMediaVientoCaibarienText)
                                            .addComponent(precipitacionesCaibarienText)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ContenedorLayout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(caibarienLabel))
                                            .addComponent(evaporizacionCaibarienText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(SaguaLaGrandeLabel)
                                                .addGap(35, 35, 35)
                                                .addComponent(laPiedraLabel)
                                                .addGap(20, 20, 20))
                                            .addGroup(ContenedorLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(ContenedorLayout.createSequentialGroup()
                                                        .addComponent(precipitacionesSaguaLaGrandeText, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(precipitacionesLaPiedraText, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(ContenedorLayout.createSequentialGroup()
                                                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(velMediaVientoSaguaLaGrandeText, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(evaporizacionSaguaLaGrandeText, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(evaporizacionLaPiedraText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(velMediaVientoLaPiedraText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                    .addComponent(tempMinBoton))
                                .addGap(18, 18, 18)
                                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ContenedorLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(ContenedorLayout.createSequentialGroup()
                                                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(velMediaVientoSantoDomingoText, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(precipitacionesSantoDomingoText, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(precipitacionesYabuText, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                                    .addComponent(velMediaVientoYabuText)))
                                            .addGroup(ContenedorLayout.createSequentialGroup()
                                                .addComponent(santoDomingoLabel)
                                                .addGap(42, 42, 42)
                                                .addComponent(yabuLabel))))
                                    .addGroup(ContenedorLayout.createSequentialGroup()
                                        .addComponent(evaporizacionSantoDomingoText, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(evaporizacionYabuText, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(0, 47, Short.MAX_VALUE))))
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insmetIcon)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContenedorLayout.createSequentialGroup()
                                .addComponent(annoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(decenaLabel))
                            .addComponent(jLabel1))
                        .addGap(58, 58, 58)
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tempMaxLabel)
                            .addComponent(tempMaxBoton))
                        .addGap(18, 18, 18)
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tempMinBoton)
                            .addComponent(tempMinLabel))))
                .addGap(39, 39, 39)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caibarienLabel)
                    .addComponent(SaguaLaGrandeLabel)
                    .addComponent(laPiedraLabel)
                    .addComponent(santoDomingoLabel)
                    .addComponent(yabuLabel))
                .addGap(18, 18, 18)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precipitacionesCaibarienText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precipitacionesSaguaLaGrandeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precipitacionesLabel)
                    .addComponent(precipitacionesLaPiedraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precipitacionesSantoDomingoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precipitacionesYabuText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(velMediaVientoSaguaLaGrandeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(velMediaVientoLaPiedraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(velMediaVientoSantoDomingoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(velMediaVientoYabuText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(velMediaVientoCaibarienText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(velMedVientoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(evaporizacionCaibarienText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(evaporizacionLabel)
                    .addComponent(evaporizacionLaPiedraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(evaporizacionSaguaLaGrandeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(evaporizacionSantoDomingoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(evaporizacionYabuText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addGap(22, 22, 22))
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

    private void tempMaxBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempMaxBotonActionPerformed
        
        Administracion admin = new Administracion();
        try {
            float[] lista = admin.listaTemperaturas(admin.normalizarFecha(anno, mes, decena),"max");
            graficarTemperatura(lista[0], lista[1], lista[2], lista[3], lista[4], "max");
        
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_tempMaxBotonActionPerformed

    private void tempMinBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempMinBotonActionPerformed
        Administracion admin = new Administracion();
        try {
            float[] lista = admin.listaTemperaturas(admin.normalizarFecha(anno, mes, decena),"min");
            graficarTemperatura(lista[0], lista[1], lista[2], lista[3], lista[4], "min");
        
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_tempMinBotonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GenerarBoletinDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerarBoletinDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerarBoletinDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerarBoletinDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            GenerarBoletinDialog dialog = new GenerarBoletinDialog(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }
    
    public void atInit(String anno, String mes, String decena) throws SQLException, ClassNotFoundException{
        GenerarBoletinDialog.anno = anno;
        GenerarBoletinDialog.mes = mes;
        GenerarBoletinDialog.decena = decena;
        annoLabel.setText("Año "+anno);
        decenaLabel.setText(decena+" Decena de "+mes);  
    }
    
    public void establecerCampos(String fecha) throws SQLException, ClassNotFoundException{
        Administracion admin = new Administracion();
        
        String[][] matriz = new String[5][3];
        
        String[] estacion = new String[5];
        estacion[0] = caibarienLabel.getText();
        estacion[1] = SaguaLaGrandeLabel.getText();
        estacion[2] = laPiedraLabel.getText();
        estacion[3] = santoDomingoLabel.getText();
        estacion[4] = yabuLabel.getText();
        
        String[] observacion = new String[3];
        observacion[0] = "Precipitaciones";
        observacion[1] = "Media_Viento";
        observacion[2] = "Evaporización_agua";
        
        for(int i=0; i<5; i++){
            for(int j=0; j<3; j++){
                matriz[i][j] = admin.buscarValor_FechaEstacion(fecha, estacion[i], observacion[j]);
            }
        }
        
        precipitacionesCaibarienText.setText(matriz[0][0]);
        precipitacionesSaguaLaGrandeText.setText(matriz[1][0]);
        precipitacionesLaPiedraText.setText(matriz[2][0]);
        precipitacionesSantoDomingoText.setText(matriz[3][0]);
        precipitacionesYabuText.setText(matriz[4][0]);
        
        velMediaVientoCaibarienText.setText(matriz[0][1]);
        velMediaVientoSaguaLaGrandeText.setText(matriz[1][1]);
        velMediaVientoLaPiedraText.setText(matriz[2][1]);
        velMediaVientoSantoDomingoText.setText(matriz[3][1]);
        velMediaVientoYabuText.setText(matriz[4][1]);
        
        evaporizacionCaibarienText.setText(matriz[0][2]);
        evaporizacionSaguaLaGrandeText.setText(matriz[1][2]);
        evaporizacionLaPiedraText.setText(matriz[2][2]);
        evaporizacionSantoDomingoText.setText(matriz[3][2]);
        evaporizacionYabuText.setText(matriz[4][2]);
    }
    
    public void graficarTemperatura(float val, float val2, float val3, float val4, float val5, String type){
        
        JFreeChart grafico = null;
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        data.addValue(val, caibarienLabel.getText(), "");
        data.addValue(val2, SaguaLaGrandeLabel.getText(), "");
        data.addValue(val3, laPiedraLabel.getText(), "");
        data.addValue(val4, santoDomingoLabel.getText(), "");
        data.addValue(val5, yabuLabel.getText(), "");
        
        switch(type){
            case "max" -> grafico = ChartFactory.createBarChart("TEMPERATURAS MÁXIMAS", "", "Temperaturas", data, PlotOrientation.VERTICAL, true, true, false);
            case "min" -> grafico = ChartFactory.createBarChart("TEMPERATURAS MÍNIMAS", "", "Temperaturas", data, PlotOrientation.VERTICAL, true, true, false);
            default -> System.err.println("Error tipo de grafica");
        }
        
        ChartPanel panel = new ChartPanel(grafico);
        JDialog info = new JDialog(this);
        info.setAlwaysOnTop(true);
        info.setTitle("Gráfico");
        info.getContentPane().add(panel);
        info.setPreferredSize(new java.awt.Dimension(500,450));
        info.pack();
        info.setLocationRelativeTo(null);
        info.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JLabel SaguaLaGrandeLabel;
    private javax.swing.JLabel annoLabel;
    private javax.swing.JLabel caibarienLabel;
    private javax.swing.JLabel decenaLabel;
    private javax.swing.JTextField evaporizacionCaibarienText;
    private javax.swing.JTextField evaporizacionLaPiedraText;
    private javax.swing.JLabel evaporizacionLabel;
    private javax.swing.JTextField evaporizacionSaguaLaGrandeText;
    private javax.swing.JTextField evaporizacionSantoDomingoText;
    private javax.swing.JTextField evaporizacionYabuText;
    private javax.swing.JLabel insmetIcon;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel laPiedraLabel;
    private javax.swing.JTextField precipitacionesCaibarienText;
    private javax.swing.JTextField precipitacionesLaPiedraText;
    private javax.swing.JLabel precipitacionesLabel;
    private javax.swing.JTextField precipitacionesSaguaLaGrandeText;
    private javax.swing.JTextField precipitacionesSantoDomingoText;
    private javax.swing.JTextField precipitacionesYabuText;
    private javax.swing.JLabel santoDomingoLabel;
    private javax.swing.JButton tempMaxBoton;
    private javax.swing.JLabel tempMaxLabel;
    private javax.swing.JButton tempMinBoton;
    private javax.swing.JLabel tempMinLabel;
    private javax.swing.JLabel velMedVientoLabel;
    private javax.swing.JTextField velMediaVientoCaibarienText;
    private javax.swing.JTextField velMediaVientoLaPiedraText;
    private javax.swing.JTextField velMediaVientoSaguaLaGrandeText;
    private javax.swing.JTextField velMediaVientoSantoDomingoText;
    private javax.swing.JTextField velMediaVientoYabuText;
    private javax.swing.JLabel yabuLabel;
    // End of variables declaration//GEN-END:variables
}
