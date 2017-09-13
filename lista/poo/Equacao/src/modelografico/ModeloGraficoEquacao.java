package modelografico;

import classededados.Equacao;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class ModeloGraficoEquacao extends javax.swing.JFrame {

    public ModeloGraficoEquacao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelCoeficienteA = new javax.swing.JLabel();
        jLabelCoeficienteB = new javax.swing.JLabel();
        jLabelCoeficienteC = new javax.swing.JLabel();
        jTextFieldCoefiA = new javax.swing.JTextField();
        jTextFieldCoefiB = new javax.swing.JTextField();
        jTextFieldCoefiC = new javax.swing.JTextField();
        jButtonCalc = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResult = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        jLabelTitulo.setText("Projeto Equação");

        jLabelCoeficienteA.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabelCoeficienteA.setText("Coeficiente a:");

        jLabelCoeficienteB.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabelCoeficienteB.setText("Coeficiente b:");

        jLabelCoeficienteC.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabelCoeficienteC.setText("Coeficiente c:");

        jButtonCalc.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jButtonCalc.setText("Calcular");
        jButtonCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcActionPerformed(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jTextAreaResult.setEditable(false);
        jTextAreaResult.setColumns(20);
        jTextAreaResult.setRows(5);
        jScrollPane1.setViewportView(jTextAreaResult);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabelTitulo))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCoeficienteA)
                                    .addComponent(jLabelCoeficienteB)
                                    .addComponent(jLabelCoeficienteC))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldCoefiA)
                                    .addComponent(jTextFieldCoefiB)
                                    .addComponent(jTextFieldCoefiC, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jButtonCalc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jButtonLimpar)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCoeficienteA)
                    .addComponent(jTextFieldCoefiA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCoeficienteB)
                    .addComponent(jTextFieldCoefiB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCoeficienteC)
                    .addComponent(jTextFieldCoefiC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCalc)
                    .addComponent(jButtonLimpar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //Objeto da Equação de Segundo Grau
    Equacao segundo = new Equacao();
    
    
    private void jButtonCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcActionPerformed
        double a;
        double b;
        double c;
        double delta;
        double[] x;
        try{
            //Entrada de dados
            a = Double.parseDouble(jTextFieldCoefiA.getText().replace(',', '.'));
            b = Double.parseDouble(jTextFieldCoefiB.getText().replace(',', '.'));
            c = Double.parseDouble(jTextFieldCoefiC.getText().replace(',', '.'));
            
            segundo.setA(a);
            segundo.setB(b);
            segundo.setC(c);
            delta = segundo.calcularDelta(a, b, c);
            x = segundo.raizesX(delta, a, b, c);
            
            
            //Saida e calculo
            String saida = "a = " + a  + "\n";
            saida += "b = " + b + "\n";
            saida += "c = " + c + "\n";
            saida += "Delta = " + delta + "\n";
            saida += "Raizes: " + Arrays.toString(segundo.equacao(x[0], x[1])) + "\n";
            
            jTextAreaResult.setText(saida);
            
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, "Espaço vazio, letras ou símbolos não permitidos!", "Erro!", 0);
        } catch (Exception er){
            JOptionPane.showMessageDialog(rootPane, er.getMessage(), "Erro!", 0);
        }
    }//GEN-LAST:event_jButtonCalcActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextFieldCoefiA.setText("");
        jTextFieldCoefiB.setText("");
        jTextFieldCoefiC.setText("");
    }//GEN-LAST:event_jButtonLimparActionPerformed

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
            java.util.logging.Logger.getLogger(ModeloGraficoEquacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModeloGraficoEquacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModeloGraficoEquacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModeloGraficoEquacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModeloGraficoEquacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalc;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JLabel jLabelCoeficienteA;
    private javax.swing.JLabel jLabelCoeficienteB;
    private javax.swing.JLabel jLabelCoeficienteC;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextAreaResult;
    private javax.swing.JTextField jTextFieldCoefiA;
    private javax.swing.JTextField jTextFieldCoefiB;
    private javax.swing.JTextField jTextFieldCoefiC;
    // End of variables declaration//GEN-END:variables
}
