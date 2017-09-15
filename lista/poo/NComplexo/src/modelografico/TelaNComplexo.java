package modelografico;

import classededados.NComplexo;

public class TelaNComplexo extends javax.swing.JFrame {

    public TelaNComplexo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelNumero1 = new javax.swing.JLabel();
        jLabelNumero2 = new javax.swing.JLabel();
        jTextFieldN1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldN2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldN3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldN4 = new javax.swing.JTextField();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonSubtrair = new javax.swing.JButton();
        jButtonMultiplicar = new javax.swing.JButton();
        jButtonIgualdade = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResults = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jButtonDividir = new javax.swing.JButton();
        jLabelErro = new javax.swing.JLabel();
        jButtonLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitle.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        jLabelTitle.setText("Números Complexos");

        jLabelNumero1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabelNumero1.setText("1º Número:");

        jLabelNumero2.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabelNumero2.setText("2º Número:");

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel4.setText("+");

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel5.setText("i");

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel6.setText("+");

        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jButtonSubtrair.setText("Subtrair");
        jButtonSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubtrairActionPerformed(evt);
            }
        });

        jButtonMultiplicar.setText("Multiplicar");
        jButtonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicarActionPerformed(evt);
            }
        });

        jButtonIgualdade.setText("Igualdade");
        jButtonIgualdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualdadeActionPerformed(evt);
            }
        });

        jTextAreaResults.setColumns(20);
        jTextAreaResults.setRows(5);
        jScrollPane1.setViewportView(jTextAreaResults);

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jLabel8.setText("i");

        jButtonDividir.setText("Dividir");
        jButtonDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDividirActionPerformed(evt);
            }
        });

        jLabelErro.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabelErro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

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
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelNumero1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldN1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelNumero2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldN3)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldN2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldN4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))
                                .addGap(15, 15, 15))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonIgualdade)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonLimpar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonSubtrair)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonMultiplicar)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabelTitle)))
                .addContainerGap())
            .addComponent(jLabelErro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumero1)
                    .addComponent(jTextFieldN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldN2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumero2)
                    .addComponent(jTextFieldN3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldN4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(16, 16, 16)
                .addComponent(jLabelErro, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdicionar)
                    .addComponent(jButtonMultiplicar)
                    .addComponent(jButtonSubtrair))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIgualdade)
                    .addComponent(jButtonDividir)
                    .addComponent(jButtonLimpar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        try{
            //Variáveis de armazenamento do valor digitado
            int n1 = Integer.parseInt(jTextFieldN1.getText().trim()); // 1º Número - Parte Real
            int n2 = Integer.parseInt(jTextFieldN2.getText().trim()); // 1º Número - Parte Imaginária

            int n3 = Integer.parseInt(jTextFieldN3.getText().trim()); // 2º Número - Parte Real
            int n4 = Integer.parseInt(jTextFieldN4.getText().trim()); // 2º Número - Parte Imaginária

            //Objetos de NComplexo
            NComplexo nc1 = new NComplexo(n1, n2);
            NComplexo nc2 = new NComplexo(n3, n4);
            
            //Objeto de saída
            String saida = nc1.adicionar(nc2).get();
            
            //Saída
            jTextAreaResults.setText(saida);
            jLabelErro.setText(""); // Limpa a mensagem de erro caso tenha tido algum.
        } catch (NumberFormatException e){
            jLabelErro.setText("Valor inválido"); //Caso tenha espaços, letras ou símbolos
        }
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jButtonSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubtrairActionPerformed
        try{
            //Variáveis de armazenamento do valor digitado
            int n1 = Integer.parseInt(jTextFieldN1.getText().trim()); // 1º Número - Parte Real
            int n2 = Integer.parseInt(jTextFieldN2.getText().trim()); // 1º Número - Parte Imaginária

            int n3 = Integer.parseInt(jTextFieldN3.getText().trim()); // 2º Número - Parte Real
            int n4 = Integer.parseInt(jTextFieldN4.getText().trim()); // 2º Número - Parte Imaginária

            //Objetos de NComplexo
            NComplexo nc1 = new NComplexo(n1, n2);
            NComplexo nc2 = new NComplexo(n3, n4);
            
            //Objeto de saída
            String saida = nc1.subtrair(nc2).get();
            
            //Saída
            jTextAreaResults.setText(saida);
            jLabelErro.setText(""); // Limpa a mensagem de erro caso tenha tido algum.
        } catch (NumberFormatException e){
            jLabelErro.setText("Valor inválido"); //Caso tenha espaços, letras ou símbolos
        }
    }//GEN-LAST:event_jButtonSubtrairActionPerformed

    private void jButtonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicarActionPerformed
        try{
            //Variáveis de armazenamento do valor digitado
            int n1 = Integer.parseInt(jTextFieldN1.getText().trim()); // 1º Número - Parte Real
            int n2 = Integer.parseInt(jTextFieldN2.getText().trim()); // 1º Número - Parte Imaginária

            int n3 = Integer.parseInt(jTextFieldN3.getText().trim()); // 2º Número - Parte Real
            int n4 = Integer.parseInt(jTextFieldN4.getText().trim()); // 2º Número - Parte Imaginária

            //Objetos de NComplexo
            NComplexo nc1 = new NComplexo(n1, n2);
            NComplexo nc2 = new NComplexo(n3, n4);
            
            //Objeto de saída
            String saida = nc1.multiplicar(nc2).get();
            
            //Saída
            jTextAreaResults.setText(saida);
            jLabelErro.setText(""); // Limpa a mensagem de erro caso tenha tido algum.
        } catch (NumberFormatException e){
            jLabelErro.setText("Valor inválido"); //Caso tenha espaços, letras ou símbolos
        }
    }//GEN-LAST:event_jButtonMultiplicarActionPerformed

    private void jButtonDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDividirActionPerformed
        try{
            //Variáveis de armazenamento do valor digitado
            int n1 = Integer.parseInt(jTextFieldN1.getText().trim()); // 1º Número - Parte Real
            int n2 = Integer.parseInt(jTextFieldN2.getText().trim()); // 1º Número - Parte Imaginária

            int n3 = Integer.parseInt(jTextFieldN3.getText().trim()); // 2º Número - Parte Real
            int n4 = Integer.parseInt(jTextFieldN4.getText().trim()); // 2º Número - Parte Imaginária

            //Objetos de NComplexo
            NComplexo nc1 = new NComplexo(n1, n2);
            NComplexo nc2 = new NComplexo(n3, n4);
            
            //Objeto de saída
            String saida = nc1.dividir(nc2).get();
            
            //Saída
            jTextAreaResults.setText(saida);
            jLabelErro.setText(""); // Limpa a mensagem de erro caso tenha tido algum.
        } catch (NumberFormatException e){
            jLabelErro.setText("Valor inválido"); //Caso tenha espaços, letras ou símbolos
        }
    }//GEN-LAST:event_jButtonDividirActionPerformed

    private void jButtonIgualdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIgualdadeActionPerformed
        try{
            //Variáveis de armazenamento do valor digitado
            int n1 = Integer.parseInt(jTextFieldN1.getText().trim()); // 1º Número - Parte Real
            int n2 = Integer.parseInt(jTextFieldN2.getText().trim()); // 1º Número - Parte Imaginária

            int n3 = Integer.parseInt(jTextFieldN3.getText().trim()); // 2º Número - Parte Real
            int n4 = Integer.parseInt(jTextFieldN4.getText().trim()); // 2º Número - Parte Imaginária

            //Objetos de NComplexo
            NComplexo nc1 = new NComplexo(n1, n2);
            NComplexo nc2 = new NComplexo(n3, n4);
            
            //Objeto de saída
            String saida;
            if (nc1.eIgual(nc2) == true)
                saida = "São iguais";
            else
                saida = "São diferentes";
            
            //Saída
            jTextAreaResults.setText(saida);
            jLabelErro.setText(""); // Limpa a mensagem de erro caso tenha tido algum.
        } catch (NumberFormatException e){
            jLabelErro.setText("Valor inválido"); //Caso tenha espaços, letras ou símbolos
        }
    }//GEN-LAST:event_jButtonIgualdadeActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextFieldN1.setText("");
        jTextFieldN2.setText("");
        jTextFieldN3.setText("");
        jTextFieldN4.setText("");
        jLabelErro.setText("");
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
            java.util.logging.Logger.getLogger(TelaNComplexo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNComplexo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNComplexo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNComplexo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaNComplexo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonDividir;
    private javax.swing.JButton jButtonIgualdade;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonMultiplicar;
    private javax.swing.JButton jButtonSubtrair;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelErro;
    private javax.swing.JLabel jLabelNumero1;
    private javax.swing.JLabel jLabelNumero2;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextAreaResults;
    private javax.swing.JTextField jTextFieldN1;
    private javax.swing.JTextField jTextFieldN2;
    private javax.swing.JTextField jTextFieldN3;
    private javax.swing.JTextField jTextFieldN4;
    // End of variables declaration//GEN-END:variables
}
