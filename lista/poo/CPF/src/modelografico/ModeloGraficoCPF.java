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
        jLabelCPF = new javax.swing.JLabel();
        jButtonVerificar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jTextFieldCPF = new javax.swing.JTextField();
        jLabelResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitleCPF.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        jLabelTitleCPF.setText("CPF");

        jLabelCPF.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabelCPF.setText("Número de CPF:");

        jButtonVerificar.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jButtonVerificar.setText("Verificar dígito");
        jButtonVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarActionPerformed(evt);
            }
        });

        jButtonLimpar.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jLabelResultado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResultado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabelTitleCPF))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelCPF)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButtonVerificar)
                        .addGap(47, 47, 47)
                        .addComponent(jButtonLimpar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitleCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCPF)
                    .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVerificar)
                    .addComponent(jButtonLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //Objeto de CPF
    CPF cpf = new CPF();
    
    
    private void jButtonVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarActionPerformed
        int pdigito; // Primeiro Dígito
        int sdigito; // Segundo Dígito
        try{
            //Entrada de dados
            cpf.setNumerocpf(Long.parseLong(jTextFieldCPF.getText()));
            pdigito = cpf.calcularPrimeiroDigito();
            sdigito = cpf.calcularSegundoDigito(pdigito);
            
            //Objeto para saída
            String saida;
            
            if (cpf.validarCPF(pdigito, sdigito) == true) saida = "CPF válido!";
            else saida = "CPF inválido!";
            jLabelResultado.setText(saida);
            
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, "Espaço vazio, letras ou símbolos não permitidos!", "Erro!", 0);
        } catch (Exception er){
            JOptionPane.showMessageDialog(rootPane, er.getMessage(), "Erro!", 0);
        }
    }//GEN-LAST:event_jButtonVerificarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
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
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonVerificar;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JLabel jLabelTitleCPF;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldCPF;
    // End of variables declaration//GEN-END:variables
}
