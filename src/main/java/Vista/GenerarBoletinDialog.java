
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Boletín");

        Contenedor.setBackground(new java.awt.Color(255, 255, 255));

        insmetIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dany\\Documents\\NetBeansProjects\\PROACT\\src\\main\\java\\Recursos\\INSMET.png")); // NOI18N

        annoLabel.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        annoLabel.setText("Año 2022");

        decenaLabel.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        decenaLabel.setText("1ra Decena de Enero");

        tempMaxLabel.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        tempMaxLabel.setText("Temperaturas Máximas:");

        tempMaxBoton.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        tempMaxBoton.setText("Mostrar Gráfico");
        tempMaxBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempMaxBotonActionPerformed(evt);
            }
        });

        tempMinLabel.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        tempMinLabel.setText("Temperaturas Mínimas:");

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
        precipitacionesLabel.setText("Precipitaciones:");

        velMedVientoLabel.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        velMedVientoLabel.setText("Velocidad Media del Viento:");

        evaporizacionLabel.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        evaporizacionLabel.setText("Evaporización:");

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tempMaxLabel)
                            .addComponent(tempMinLabel)
                            .addComponent(precipitacionesLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(velMedVientoLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(evaporizacionLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tempMinBoton)
                            .addComponent(tempMaxBoton)
                            .addGroup(ContenedorLayout.createSequentialGroup()
                                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(evaporizacionCaibarienText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(velMediaVientoCaibarienText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(precipitacionesCaibarienText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(caibarienLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(15, 15, 15)
                                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(velMediaVientoSaguaLaGrandeText)
                                    .addComponent(precipitacionesSaguaLaGrandeText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SaguaLaGrandeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(evaporizacionSaguaLaGrandeText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(velMediaVientoLaPiedraText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(laPiedraLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(precipitacionesLaPiedraText, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(evaporizacionLaPiedraText, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ContenedorLayout.createSequentialGroup()
                                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(evaporizacionSantoDomingoText, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(precipitacionesSantoDomingoText, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(velMediaVientoSantoDomingoText, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27)
                                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(velMediaVientoYabuText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(precipitacionesYabuText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(evaporizacionYabuText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(ContenedorLayout.createSequentialGroup()
                                        .addComponent(santoDomingoLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(yabuLabel)))))
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContenedorLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(decenaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContenedorLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(annoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(insmetIcon))))
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(annoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(decenaLabel))
                    .addComponent(insmetIcon))
                .addGap(49, 49, 49)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempMaxLabel)
                    .addComponent(tempMaxBoton))
                .addGap(18, 18, 18)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tempMinLabel)
                    .addComponent(tempMinBoton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
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
                    .addComponent(precipitacionesLaPiedraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precipitacionesSantoDomingoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precipitacionesYabuText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precipitacionesLabel))
                .addGap(16, 16, 16)
                .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(evaporizacionCaibarienText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(evaporizacionSaguaLaGrandeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(evaporizacionLaPiedraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(evaporizacionSantoDomingoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(evaporizacionYabuText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(evaporizacionLabel))
                    .addGroup(ContenedorLayout.createSequentialGroup()
                        .addGroup(ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(velMediaVientoCaibarienText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(velMediaVientoSaguaLaGrandeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(velMediaVientoLaPiedraText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(velMediaVientoSantoDomingoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(velMediaVientoYabuText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(velMedVientoLabel))
                        .addGap(42, 42, 42)))
                .addGap(50, 50, 50))
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
        info.setPreferredSize(new java.awt.Dimension(450,450));
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
