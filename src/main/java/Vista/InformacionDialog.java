/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author user
 */
public class InformacionDialog extends javax.swing.JDialog {

    /**
     * Creates new form InformacionDialog
     */
    public InformacionDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        
    String texto = "<html>Título: “Fortalecimiento de la resiliencia comunitaria para la seguridad alimentaria y nutricional en siete municipios de la región central de Cuba impactados por la sequía y el huracán Irma”<P>" + 
                   "<html>Este proyecto tiene como finalidad fortalecer la resiliencia comunitaria ante huracanes y sequía en siete municipios de la provincia de Villa Clara, para apoyar la disponibilidad, acceso y consumo de una alimentación diversificada y saludable que contribuya a la seguridad alimentaria y nutricional de las poblaciones más vulnerables.<P>" +
                   "<html>Avalado por el Ministerio de la Agricultura (MINAG),está alineado con varios programas nacionales de desarrollo, que incluyen los encadenamientos productivos, el fortalecimiento de los programas sociales, el autoabastecimiento municipal, la Agricultura Urbana, sub-urbana y familiar (AUSF) y la estrategia de género del sistema de la agricultura. La plataforma principal para la implementación será el Programa de autoabastecimiento municipal y de AUSF. La experiencia de la FAO en el acompañamiento a políticas públicas para la introducción de la agricultura de conservación en el país potenciará las acciones previstas para el fortalecimiento de la resiliencia de la cadena de valor de hortalizas y vegetales a nivel local, en particular la gestión del conocimiento para las bases productivas. También se trabajará en colaboración con UNICEF que ha generado, de conjunto con PMA, guías para el manejo alimentario en situaciones de emergencia para la resiliencia y nutrición en la infancia. <P>"+
                   "<html>La propuesta se focaliza en siete municipios de la provincia de Villa Clara ubicados en la región central del país seriamente afectada por una intensa sequía y donde se implementa la operación de respuesta a los daños ocasionados por el huracán Irma: Corralillo, Quemado de Güines, Sagua la Grande, Encrucijada, Camajuaní, Remedios y Caibarién. Además, estos asentamientos costeros son altamente vulnerables al ascenso continuo del nivel del mar y se requiere la recuperación de cultivos por las severas afectaciones a los suelos y la salinización. Es por ello que constituye una prioridad incrementar la resiliencia de estas poblaciones a los fenómenos hidrometeorológicos extremos.La focalización propuesta responde a la estrategia de desarrollo del MINAG de concentración geográfica en zonas de alto potencial productivo con capacidad de abastecer de alimentos a otras regiones. Esta zona es una de las cuencas hidrográficas estratégicas del país, con suelos de elevada agroproductividad cuya conservación es prioritaria.<P>"+
                   "<html>Como resultado se logró la implementación de un procedimiento que establece las funciones de los sistemas meteorológico e hidrológico para el monitoreo de la sequía y define umbrales de indicadores seleccionados que funcionan como “disparadores” de medidas específicas de respuesta. Mejoras en las informaciones de monitoreo de la sequía con mediciones más precisas y confiables de variables climáticas, agrometeorológicas e hidrológicas, gracias a la compra de equipos de medición y para el procesamiento de los datos.Desarrollado de los flujos infocomunicacionales municipales, basados en la utilización de todas las vías y canales existentes y pensando de manera innovadora en el empleo de otras actualmente en desuso.En cuanto a la gestión del riesgo asociado a la sequía se desarrollaron e implementaron matrices para identificar las principales vulnerabilidades de la producción local de alimentos, específicamente de la cadena de valor de hortalizas, que permitieron organizar la gestión de la reducción del riesgo con mayor objetividad. <P>";   
    jLabel2.setText(texto);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(618, 618, 618)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(InformacionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InformacionDialog dialog = new InformacionDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
