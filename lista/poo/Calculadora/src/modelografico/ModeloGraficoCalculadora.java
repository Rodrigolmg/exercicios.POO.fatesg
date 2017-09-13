package modelografico;

import classededados.Calculadora;
import java.util.ArrayList;

public class ModeloGraficoCalculadora extends javax.swing.JFrame {

    public ModeloGraficoCalculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton10 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jLabelVisor = new javax.swing.JLabel();
        jTextFieldGravador = new javax.swing.JTextField();
        jButtonMais = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();
        jButtonMenos = new javax.swing.JButton();
        jButtonVezes = new javax.swing.JButton();
        jButtonDividir = new javax.swing.JButton();
        jButtonRaiz2 = new javax.swing.JButton();
        jButtonRaiz = new javax.swing.JButton();
        jButtonX2 = new javax.swing.JButton();
        jButtonSete = new javax.swing.JButton();
        jButtonOito = new javax.swing.JButton();
        jButtonNove = new javax.swing.JButton();
        jButtonQuatro = new javax.swing.JButton();
        jButtonCinco = new javax.swing.JButton();
        jButtonSeis = new javax.swing.JButton();
        jButtonUm = new javax.swing.JButton();
        jButtonDois = new javax.swing.JButton();
        jButtonTres = new javax.swing.JButton();
        jButtonZero = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButtonCE = new javax.swing.JButton();
        jButtonMaisMenos = new javax.swing.JButton();
        jButtonVirgula = new javax.swing.JButton();

        jButton10.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        jButton10.setText("=");

        jButton2.setText("jButton2");

        jButton21.setText("jButton3");

        jButton25.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton25.setText("0");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelVisor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelVisor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTextFieldGravador.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButtonMais.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        jButtonMais.setText("+");
        jButtonMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMaisActionPerformed(evt);
            }
        });

        jButtonIgual.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        jButtonIgual.setText("=");
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualActionPerformed(evt);
            }
        });

        jButtonMenos.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        jButtonMenos.setText("-");

        jButtonVezes.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        jButtonVezes.setText("x");

        jButtonDividir.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        jButtonDividir.setText("÷");

        jButtonRaiz2.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        jButtonRaiz2.setText("√ ");

        jButtonRaiz.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        jButtonRaiz.setText("Raiz");

        jButtonX2.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        jButtonX2.setText("x²");

        jButtonSete.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonSete.setText("7");
        jButtonSete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeteActionPerformed(evt);
            }
        });

        jButtonOito.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonOito.setText("8");
        jButtonOito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOitoActionPerformed(evt);
            }
        });

        jButtonNove.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonNove.setText("9");
        jButtonNove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNoveActionPerformed(evt);
            }
        });

        jButtonQuatro.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonQuatro.setText("4");
        jButtonQuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuatroActionPerformed(evt);
            }
        });

        jButtonCinco.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonCinco.setText("5");
        jButtonCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCincoActionPerformed(evt);
            }
        });

        jButtonSeis.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonSeis.setText("6");
        jButtonSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeisActionPerformed(evt);
            }
        });

        jButtonUm.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonUm.setText("1");
        jButtonUm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUmActionPerformed(evt);
            }
        });

        jButtonDois.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonDois.setText("2");
        jButtonDois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDoisActionPerformed(evt);
            }
        });

        jButtonTres.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonTres.setText("3");
        jButtonTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTresActionPerformed(evt);
            }
        });

        jButtonZero.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonZero.setText("0");
        jButtonZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZeroActionPerformed(evt);
            }
        });

        jButtonC.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonC.setText("C");
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });

        jButtonCE.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButtonCE.setText("CE");
        jButtonCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCEActionPerformed(evt);
            }
        });

        jButtonMaisMenos.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        jButtonMaisMenos.setText("±");
        jButtonMaisMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMaisMenosActionPerformed(evt);
            }
        });

        jButtonVirgula.setFont(new java.awt.Font("Franklin Gothic Book", 0, 18)); // NOI18N
        jButtonVirgula.setText(",");
        jButtonVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVirgulaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldGravador, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelVisor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonCE, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(jButtonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonUm, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonDois, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonTres, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonVezes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonDividir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonSete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonOito, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonNove, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonMaisMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonX2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRaiz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRaiz2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabelVisor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldGravador, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMaisMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSete, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOito, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNove, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonQuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonVezes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButtonMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButtonMais, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonUm, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDois, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonTres, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCE, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonZero, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonX2, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(jButtonRaiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonRaiz2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZeroActionPerformed
        jTextFieldGravador.setText(jTextFieldGravador.getText() + Integer.toString(0));
    }//GEN-LAST:event_jButtonZeroActionPerformed

    private void jButtonUmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUmActionPerformed
        jTextFieldGravador.setText(jTextFieldGravador.getText() + Integer.toString(1));
    }//GEN-LAST:event_jButtonUmActionPerformed

    private void jButtonDoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoisActionPerformed
        jTextFieldGravador.setText(jTextFieldGravador.getText() + Integer.toString(2));
    }//GEN-LAST:event_jButtonDoisActionPerformed

    private void jButtonTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTresActionPerformed
        jTextFieldGravador.setText(jTextFieldGravador.getText() + Integer.toString(3));
    }//GEN-LAST:event_jButtonTresActionPerformed

    private void jButtonQuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuatroActionPerformed
        jTextFieldGravador.setText(jTextFieldGravador.getText() + Integer.toString(4));
    }//GEN-LAST:event_jButtonQuatroActionPerformed

    private void jButtonCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCincoActionPerformed
        jTextFieldGravador.setText(jTextFieldGravador.getText() + Integer.toString(5));
    }//GEN-LAST:event_jButtonCincoActionPerformed

    private void jButtonSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeisActionPerformed
        jTextFieldGravador.setText(jTextFieldGravador.getText() + Integer.toString(6));
    }//GEN-LAST:event_jButtonSeisActionPerformed

    private void jButtonSeteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeteActionPerformed
        jTextFieldGravador.setText(jTextFieldGravador.getText() + Integer.toString(7));
    }//GEN-LAST:event_jButtonSeteActionPerformed

    private void jButtonOitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOitoActionPerformed
        jTextFieldGravador.setText(jTextFieldGravador.getText() + Integer.toString(8));
    }//GEN-LAST:event_jButtonOitoActionPerformed

    private void jButtonNoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNoveActionPerformed
        jTextFieldGravador.setText(jTextFieldGravador.getText() + Integer.toString(9));
    }//GEN-LAST:event_jButtonNoveActionPerformed

    private void jButtonCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCEActionPerformed
        jTextFieldGravador.setText("");
    }//GEN-LAST:event_jButtonCEActionPerformed

    private void jButtonMaisMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMaisMenosActionPerformed
        
        if (Double.parseDouble(jTextFieldGravador.getText().replace(',', '.')) > 0)
            jTextFieldGravador.setText("-" + jTextFieldGravador.getText());
        else if (Double.parseDouble(jTextFieldGravador.getText().replace(',', '.')) < 0)
            jTextFieldGravador.setText(jTextFieldGravador.getText().replaceFirst("-", ""));
    }//GEN-LAST:event_jButtonMaisMenosActionPerformed

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
        jTextFieldGravador.setText("");
        jLabelVisor.setText("");
    }//GEN-LAST:event_jButtonCActionPerformed
    
    //Objeto da calculadora
    Calculadora calculadora = new Calculadora();
    
    //Lista de valores
    ArrayList<Double> n = new ArrayList<>();
    
    private void jButtonMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMaisActionPerformed
        try{
            //Entrada de dados
            
            for (int i = 0; i < 2; i++) {
                n.add(i, Double.parseDouble(jTextFieldGravador.getText().replace(',', '.')));
            }
            calculadora.setNumero(n.get(0));
            jLabelVisor.setText(jLabelVisor.getText() + jTextFieldGravador.getText() + " + ");
            jTextFieldGravador.setText("");
            calculadora.setNumero2(n.get(1));
            
        } catch(NumberFormatException e){
            
        }
    }//GEN-LAST:event_jButtonMaisActionPerformed

    private void jButtonVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVirgulaActionPerformed
        jTextFieldGravador.setText(jTextFieldGravador.getText()  + ",");
    }//GEN-LAST:event_jButtonVirgulaActionPerformed

    private void jButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIgualActionPerformed
        try{
            jTextFieldGravador.setText(Double.toString(calculadora.adicao()));
            jLabelVisor.setText("");
        } catch (NumberFormatException e){
            
        }
    }//GEN-LAST:event_jButtonIgualActionPerformed

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
            java.util.logging.Logger.getLogger(ModeloGraficoCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModeloGraficoCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModeloGraficoCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModeloGraficoCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModeloGraficoCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonCE;
    private javax.swing.JButton jButtonCinco;
    private javax.swing.JButton jButtonDividir;
    private javax.swing.JButton jButtonDois;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JButton jButtonMais;
    private javax.swing.JButton jButtonMaisMenos;
    private javax.swing.JButton jButtonMenos;
    private javax.swing.JButton jButtonNove;
    private javax.swing.JButton jButtonOito;
    private javax.swing.JButton jButtonQuatro;
    private javax.swing.JButton jButtonRaiz;
    private javax.swing.JButton jButtonRaiz2;
    private javax.swing.JButton jButtonSeis;
    private javax.swing.JButton jButtonSete;
    private javax.swing.JButton jButtonTres;
    private javax.swing.JButton jButtonUm;
    private javax.swing.JButton jButtonVezes;
    private javax.swing.JButton jButtonVirgula;
    private javax.swing.JButton jButtonX2;
    private javax.swing.JButton jButtonZero;
    private javax.swing.JLabel jLabelVisor;
    private javax.swing.JTextField jTextFieldGravador;
    // End of variables declaration//GEN-END:variables
}
