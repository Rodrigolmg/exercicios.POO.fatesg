package modelografico;

import classededados.Triangulo;
import javax.swing.JOptionPane;

public class ModeloGraficoTriangulo extends javax.swing.JFrame {

    public ModeloGraficoTriangulo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelLadoA = new javax.swing.JLabel();
        jLabelLadoB = new javax.swing.JLabel();
        jLabelLadoC = new javax.swing.JLabel();
        jTextFieldLadoA = new javax.swing.JTextField();
        jTextFieldLadoB = new javax.swing.JTextField();
        jTextFieldLadoC = new javax.swing.JTextField();
        jButtonCalc = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResult = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Triângulo");

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        jLabel1.setText("Cálculo do Triangulo");

        jLabelLadoA.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabelLadoA.setText("Lado A: ");

        jLabelLadoB.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabelLadoB.setText("Lado B:");

        jLabelLadoC.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabelLadoC.setText("Lado C:");

        jButtonCalc.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jButtonCalc.setText("Calcular");
        jButtonCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcActionPerformed(evt);
            }
        });

        jButtonClear.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jButtonClear.setText("Limpar");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
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
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelLadoA)
                                .addComponent(jLabelLadoB)
                                .addComponent(jLabelLadoC))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldLadoB)
                                .addComponent(jTextFieldLadoA)
                                .addComponent(jTextFieldLadoC))
                            .addGap(94, 94, 94))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCalc)
                            .addGap(37, 37, 37)
                            .addComponent(jButtonClear)
                            .addGap(37, 37, 37)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLadoA)
                    .addComponent(jTextFieldLadoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLadoB)
                    .addComponent(jTextFieldLadoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLadoC)
                    .addComponent(jTextFieldLadoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCalc)
                    .addComponent(jButtonClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //Objeto de Triangulo
    Triangulo triangulo = new Triangulo();
    
    //Variáveis para os lados do triângulo
    float la; // lado a
    float lb; // lado b
    float lc; // lado c
    
    private void jButtonCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcActionPerformed
        try{
            //Entrada de dados
            la = Float.parseFloat(jTextFieldLadoA.getText().replace(',', '.'));
            lb = Float.parseFloat(jTextFieldLadoB.getText().replace(',', '.'));
            lc = Float.parseFloat(jTextFieldLadoC.getText().replace(',', '.'));
            
            triangulo.setLados(la, lb, lc);
            triangulo.condicao(la, lb, lc);
            
            //Saída e calculos
            String saida = "Lado A: " + triangulo.getLadoA() + "\n";
            saida += "Lado B: " + triangulo.getLadoB() + "\n";
            saida += "Lado C: " + triangulo.getLadoC() + "\n";
            saida += "Área do Triângulo: " + triangulo.calcularArea() + "\n";
            saida += "Tipo de Triângulo: " + triangulo.tipoDeLado() + "\n";
            saida += "Tipo de Ângulo: " + triangulo.tipoDeAngulo() + "\n";
            
            jTextAreaResult.setText(saida);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, "Espaço vazio, letras ou símbolos não permitidos!", "Erro!", 0);
        } catch (Exception er){
            JOptionPane.showMessageDialog(rootPane, er.getMessage(), "Erro!", 0);
        }
    }//GEN-LAST:event_jButtonCalcActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        jTextFieldLadoA.setText("");
        jTextFieldLadoB.setText("");
        jTextFieldLadoC.setText("");
    }//GEN-LAST:event_jButtonClearActionPerformed

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
            java.util.logging.Logger.getLogger(ModeloGraficoTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModeloGraficoTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModeloGraficoTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModeloGraficoTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModeloGraficoTriangulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalc;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelLadoA;
    private javax.swing.JLabel jLabelLadoB;
    private javax.swing.JLabel jLabelLadoC;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextAreaResult;
    private javax.swing.JTextField jTextFieldLadoA;
    private javax.swing.JTextField jTextFieldLadoB;
    private javax.swing.JTextField jTextFieldLadoC;
    // End of variables declaration//GEN-END:variables
}
