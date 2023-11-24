import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;
public class RealizarDispensa extends javax.swing.JFrame {

    /**
     * Creates new form RealizarDispensa
     */
    public RealizarDispensa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ctRemCod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ctLote = new javax.swing.JTextField();
        lblQuant = new javax.swing.JLabel();
        ctQuant = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        ctCPF = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        ctNome_Pac = new javax.swing.JTextField();
        lblCPF1 = new javax.swing.JLabel();
        ctCRM = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ctData_Preesc = new javax.swing.JTextField();
        lblCPF2 = new javax.swing.JLabel();
        ctNome_Rem = new javax.swing.JTextField();
        lblCPF3 = new javax.swing.JLabel();
        lblCPF4 = new javax.swing.JLabel();
        ctCRF = new javax.swing.JTextField();
        lblCPF5 = new javax.swing.JLabel();
        ctNome_Farm = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Código do Remédio");

        ctRemCod.setText("Código do Remédio");

        jLabel2.setText("Lote");

        ctLote.setText("2023001");
        ctLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctLoteActionPerformed(evt);
            }
        });

        lblQuant.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblQuant.setText("Quantidade:");

        ctQuant.setText("Ex:10");
        ctQuant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctQuantActionPerformed(evt);
            }
        });

        lblCPF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCPF.setText("CPF:");

        ctCPF.setText("2023001");
        ctCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctCPFActionPerformed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome.setText("NOME:");

        ctNome_Pac.setText("Nome do Paciente");

        lblCPF1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCPF1.setText("CRM:");

        ctCRM.setText("2023001");
        ctCRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctCRMActionPerformed(evt);
            }
        });

        jButton1.setText("Dispensar");

        jButton2.setText("Sair");

        jLabel3.setText("Dispensa");

        ctData_Preesc.setText("2023001");
        ctData_Preesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctData_PreescActionPerformed(evt);
            }
        });

        lblCPF2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCPF2.setText("Data da preecrição:");

        ctNome_Rem.setText("2023001");
        ctNome_Rem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctNome_RemActionPerformed(evt);
            }
        });

        lblCPF3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCPF3.setText("Nome do Remédio");

        lblCPF4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCPF4.setText("Registro do famaceutico");

        ctCRF.setText("2023001");
        ctCRF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctCRFActionPerformed(evt);
            }
        });

        lblCPF5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCPF5.setText("Nome Farmaceutico");

        ctNome_Farm.setText("Farmaceutico");
        ctNome_Farm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctNome_FarmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 273, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblCPF4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ctCRF))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblCPF3)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(lblQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblCPF)
                                            .addComponent(lblNome)
                                            .addComponent(lblCPF1)
                                            .addComponent(lblCPF2))
                                        .addGap(47, 47, 47)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ctData_Preesc, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ctCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(ctNome_Rem, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(ctRemCod, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(ctLote, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(ctCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(ctNome_Pac, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(ctQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblCPF5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ctNome_Farm)
                                .addGap(79, 79, 79))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)))))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCPF3)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)
                        .addGap(15, 15, 15)
                        .addComponent(lblQuant)
                        .addGap(18, 18, 18)
                        .addComponent(lblCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNome)
                        .addGap(18, 18, 18)
                        .addComponent(lblCPF1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ctRemCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctNome_Rem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(ctLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctNome_Pac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ctCRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF2)
                    .addComponent(ctData_Preesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF4)
                    .addComponent(ctCRF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctNome_Farm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPF5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ctLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctLoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctLoteActionPerformed

    private void ctQuantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctQuantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctQuantActionPerformed

    private void ctCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctCPFActionPerformed

    private void ctCRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctCRMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctCRMActionPerformed

    private void ctData_PreescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctData_PreescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctData_PreescActionPerformed

    private void ctNome_RemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctNome_RemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctNome_RemActionPerformed

    private void ctCRFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctCRFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctCRFActionPerformed

    private void ctNome_FarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctNome_FarmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctNome_FarmActionPerformed
    public void cadastrar() {
        Connection con = null;
        PreparedStatement stReceita = null;
        PreparedStatement stDispensa = null;
        PreparedStatement stAtualizarEstoque = null;

        try {
            Conexao conexao = Conexao.getInstance();
            con = conexao.getConnection();

            // Inserir dados na tabela 'receita'
            stReceita = con.prepareStatement("INSERT INTO receita (cpf, nome_pac, crm, data_prescricao, rem_nome, quantidade_preescrita) " +
                    "VALUES (?, ?, ?, ?, ?, ?) RETURNING receita_id");

            stReceita.setString(1, ctCPF.getText());
            stReceita.setString(2, ctNome_Pac.getText());
            stReceita.setString(3, ctCRF.getText());
            LocalDate dataPrescricao = LocalDate.parse(ctData_Preesc.getText());
            stReceita.setDate(4, java.sql.Date.valueOf(dataPrescricao));
            stReceita.setString(5, ctNome_Rem.getText());
            stReceita.setInt(6, Integer.parseInt(ctRemCod.getText()));
            stReceita.setInt(6, Integer.parseInt(ctQuant.getText()));

            ResultSet rsReceita = stReceita.executeQuery();
            int receitaId = rsReceita.getInt("receita_id");
            stDispensa = con.prepareStatement("INSERT INTO dispensa (receita_id, cpf_paciente, nome_paciente, crf_farmaceutico, nome_farmaceutico, rem_cod, rem_nome, medicamento_lote, quantidade_preescrita, data_dispensa) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            stDispensa.setInt(1, receitaId);
            stDispensa.setString(2, ctCPF.getText());
            stDispensa.setString(3, ctNome_Pac.getText());
            stDispensa.setString(4, ctCRF.getText());
            stDispensa.setString(5, ctNome_Farm.getText());
            stDispensa.setInt(6, Integer.parseInt(ctRemCod.getText())); // Substitua ctRemCod pelo campo apropriado para o código do remédio
            stDispensa.setString(7, ctNome_Rem.getText());
            stDispensa.setInt(8, Integer.parseInt(ctLote.getText()));
            stDispensa.setInt(9, Integer.parseInt(ctQuant.getText()));
            stDispensa.setDate(10, java.sql.Date.valueOf(LocalDate.now()));
            int rowsAffectedDispensa = stDispensa.executeUpdate();

            stAtualizarEstoque = con.prepareStatement("UPDATE remedio SET quantidade_disponivel = quantidade_disponivel - ? " +
                    "WHERE rem_cod = ?");

            stAtualizarEstoque.setInt(1, Integer.parseInt(ctQuant.getText()));
            stAtualizarEstoque.setInt(2, Integer.parseInt(ctRemCod.getText()));

            int rowsAffectedEstoque = stAtualizarEstoque.executeUpdate();

            if (rowsAffectedEstoque > 0 && rowsAffectedDispensa > 0) {
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + ex.getMessage(), "Erro SQL", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException | DateTimeParseException nfe) {
            JOptionPane.showMessageDialog(null, "VALOR INVÁLIDO!", "VALOR INVÁLIDO", JOptionPane.WARNING_MESSAGE);
        } finally {
            try {
                if (stReceita != null) {
                    stReceita.close();
                }

                if (stDispensa != null) {
                    stDispensa.close();
                }

                if (stAtualizarEstoque != null) {
                    stAtualizarEstoque.close();
                }

                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
       
            }
        }
    }
    
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
            java.util.logging.Logger.getLogger(RealizarDispensa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RealizarDispensa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RealizarDispensa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RealizarDispensa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RealizarDispensa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ctCPF;
    private javax.swing.JTextField ctCRF;
    private javax.swing.JTextField ctCRM;
    private javax.swing.JTextField ctData_Preesc;
    private javax.swing.JTextField ctLote;
    private javax.swing.JTextField ctNome_Farm;
    private javax.swing.JTextField ctNome_Pac;
    private javax.swing.JTextField ctNome_Rem;
    private javax.swing.JTextField ctQuant;
    private javax.swing.JTextField ctRemCod;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCPF1;
    private javax.swing.JLabel lblCPF2;
    private javax.swing.JLabel lblCPF3;
    private javax.swing.JLabel lblCPF4;
    private javax.swing.JLabel lblCPF5;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQuant;
    // End of variables declaration//GEN-END:variables
}
