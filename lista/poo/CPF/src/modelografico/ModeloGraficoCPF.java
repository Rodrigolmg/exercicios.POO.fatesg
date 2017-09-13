package modelografico;

import classededados.CPF;
import javax.swing.JOptionPane;

public class ModeloGraficoCPF extends javax.swing.JFrame {

    public ModeloGraficoCPF() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitleCPF = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelNome = new javax.swing.JLabel();
        jLabelDataNasc = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jButtonCalcDigito = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldCPF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResults = new javax.swing.JTextArea();
        jTextFieldDia = new javax.swing.JTextField();
        jLabelBarra1 = new javax.swing.JLabel();
        jTextFieldMes = new javax.swing.JTextField();
        jLabelBarra2 = new javax.swing.JLabel();
        jTextFieldAno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitleCPF.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        jLabelTitleCPF.setText("CPF");

        jLabelNome.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabelNome.setText("Nome completo:");

        jLabelDataNasc.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabelDataNasc.setText("Data de nascimento");

        jLabelCPF.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabelCPF.setText("Número de CPF:");

        jButtonCalcDigito.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jButtonCalcDigito.setText("Calcular dígito");
        jButtonCalcDigito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcDigitoActionPerformed(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jTextAreaResults.setEditable(false);
        jTextAreaResults.setColumns(20);
        jTextAreaResults.setRows(5);
        jScrollPane1.setViewportView(jTextAreaResults);

        jLabelBarra1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabelBarra1.setText("/");

        jLabelBarra2.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabelBarra2.setText("/");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jButtonCalcDigito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonLimpar)
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNome)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabelDataNasc)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldDia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelBarra1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldMes, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelBarra2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldAno))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabelCPF)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 22, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabelTitleCPF)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitleCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataNasc)
                    .addComponent(jTextFieldDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBarra1)
                    .addComponent(jTextFieldMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBarra2)
                    .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCPF)
                    .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCalcDigito)
                    .addComponent(jButtonLimpar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //Objeto de CPF
    CPF cpf = new CPF();
    
    
    private void jButtonCalcDigitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcDigitoActionPerformed
        int pdigito; // Primeiro Dígito
        int sdigito; // Segundo Dígito
        try{
            //Entrada de dados
            cpf.setNome(jTextFieldNome.getText());
            cpf.setNumeroCpf(Integer.parseInt(jTextFieldCPF.getText()));
            cpf.setDia(Integer.parseInt(jTextFieldDia.getText()));
            cpf.setMes(Integer.parseInt(jTextFieldMes.getText()));
            cpf.setAno(Integer.parseInt(jTextFieldAno.getText()));
            
            pdigito = cpf.calcularPrimeiroDigito();
            sdigito = cpf.calcularSegundoDigito(pdigito);
            
            //Saída
            String saida = "Nome: " + cpf.getNome() + "\n";
            saida += "Data de nascimento: " + cpf.getDia() + " de " + cpf.getMes() + " de " + cpf.getAno() + "\n";
            saida += "CPF + Digitos de Verificação: " + cpf.getNumeroCpf() + " - " + pdigito + sdigito + "\n";
            
            jTextAreaResults.setText(saida);
            
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, "Espaço vazio, letras ou símbolos não permitidos!", "Erro!", 0);
        } catch (Exception er){
            JOptionPane.showMessageDialog(rootPane, er.getMessage(), "Erro!", 0);
        }
    }//GEN-LAST:event_jButtonCalcDigitoActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextFieldNome.setText("");
        jTextFieldDia.setText("");
        jTextFieldMes.setText("");
        jTextFieldAno.setText("");
        jTextFieldCPF.setText("");
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
            java.util.logging.Logger.getLogger(ModeloGraficoCPF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModeloGraficoCPF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModeloGraficoCPF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModeloGraficoCPF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModeloGraficoCPF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcDigito;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JLabel jLabelBarra1;
    private javax.swing.JLabel jLabelBarra2;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelDataNasc;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTitleCPF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextAreaResults;
    private javax.swing.JTextField jTextFieldAno;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldDia;
    private javax.swing.JTextField jTextFieldMes;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
