package interfacegrafica;

import classededados.ContaPoupanca;
import javax.swing.JOptionPane;

public class ContaPoupancaCaixa extends javax.swing.JFrame {

    public ContaPoupancaCaixa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelNome = new javax.swing.JLabel();
        jLabelConta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonDepositar = new javax.swing.JButton();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldConta = new javax.swing.JTextField();
        jTextFieldAgencia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResult = new javax.swing.JTextArea();
        jButtonSacar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Acesso a conta");

        jLabelTitle.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        jLabelTitle.setText("Conta Poupança");

        jLabelNome.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabelNome.setText("Nome:");

        jLabelConta.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabelConta.setText("Número da conta:");

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel1.setText("Agência:");

        jButtonDepositar.setText("Depositar");
        jButtonDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDepositarActionPerformed(evt);
            }
        });

        jTextAreaResult.setColumns(20);
        jTextAreaResult.setRows(5);
        jScrollPane1.setViewportView(jTextAreaResult);

        jButtonSacar.setText("Sacar");
        jButtonSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSacarActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelNome)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabelTitle))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelConta)
                                            .addComponent(jLabel1)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jButtonDepositar)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldConta)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextFieldAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jButtonSacar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonLimpar)))))
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConta)
                    .addComponent(jTextFieldConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDepositar)
                    .addComponent(jButtonSacar)
                    .addComponent(jButtonLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //Objeto da Conta
    ContaPoupanca cp = new ContaPoupanca();
    
    //Variável para saldo
    float dep;
    float sac;
    
    private void jButtonDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDepositarActionPerformed
        try{
            
            //Entrada dos dados
            cp.setNomeDoCliente(jTextFieldNome.getText());
            cp.setNumeroDaConta(Integer.parseInt(jTextFieldConta.getText()));
            cp.setAgencia(Integer.parseInt(jTextFieldAgencia.getText()));
            
            dep = cp.depositarDinheiro(Float.parseFloat(JOptionPane.showInputDialog("Sr.(a) " + cp.getNomeDoCliente() + ", quanto deseja depositar?").replace(',', '.')));
            
            
            //Saída
            String saida = "Nome: " + cp.getNomeDoCliente() + "\n";
            saida += "Conta: " + cp.getNumeroDaConta() + "\n";
            saida += "Agência: " + cp.getAgencia() + "\n";
            saida += "Depositado: R$ " + dep + "\n";
            saida += "Saldo: R$ " + cp.getSaldo() + "\n";
            
            jTextAreaResult.setText(saida);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, "Espaço vazio, letras ou símbolos não permitidos!", "Erro!", 0);
        } catch (Exception er){
            JOptionPane.showMessageDialog(rootPane, er.getMessage(), "Erro!", 0);
        }
    }//GEN-LAST:event_jButtonDepositarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextFieldNome.setText("");
        jTextFieldConta.setText("");
        jTextFieldAgencia.setText("");
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSacarActionPerformed
        try{
            
            //Entrada dos dados
            cp.setNomeDoCliente(jTextFieldNome.getText());
            cp.setNumeroDaConta(Integer.parseInt(jTextFieldConta.getText()));
            cp.setAgencia(Integer.parseInt(jTextFieldAgencia.getText()));
            
            sac = cp.sacarDinheiro(Float.parseFloat(JOptionPane.showInputDialog("Sr.(a) " + cp.getNomeDoCliente() + ", quanto deseja sacar?").replace(',', '.')));
            
            
            //Saída
            String saida = "Nome: " + cp.getNomeDoCliente() + "\n";
            saida += "Conta: " + cp.getNumeroDaConta() + "\n";
            saida += "Agência: " + cp.getAgencia() + "\n";
            saida += "Sacado: R$ " + sac + "\n";
            saida += "Saldo: R$ " + cp.getSaldo() + "\n";
            
            jTextAreaResult.setText(saida);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, "Espaço vazio, letras ou símbolos não permitidos!", "Erro!", 0);
        } catch (Exception er){
            JOptionPane.showMessageDialog(rootPane, er.getMessage(), "Erro!", 0);
        }
    }//GEN-LAST:event_jButtonSacarActionPerformed

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
            java.util.logging.Logger.getLogger(ContaPoupancaCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContaPoupancaCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContaPoupancaCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContaPoupancaCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContaPoupancaCaixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDepositar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSacar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelConta;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextAreaResult;
    private javax.swing.JTextField jTextFieldAgencia;
    private javax.swing.JTextField jTextFieldConta;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
