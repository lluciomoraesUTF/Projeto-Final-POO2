import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class CadFarm extends javax.swing.JFrame {
         private static CadFarm cadastFarm;
            
    /**
     * Creates new form CadFarm
     */
    public CadFarm() {
        initComponents();
    }
    public static CadFarm getCadfarm() {
        if (cadastFarm == null) {
            cadastFarm = new CadFarm();
        }
        return cadastFarm;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ctCPF = new javax.swing.JTextField();
        lblSaudCod = new javax.swing.JLabel();
        ctCRM = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        ctSenha = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();
        ctNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ctCPF.setText("2023001");
        ctCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctCPFActionPerformed(evt);
            }
        });

        lblSaudCod.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSaudCod.setText("CPF");

        ctCRM.setText("123");
        ctCRM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctCRMActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        ctSenha.setText("Alergia");
        ctSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctSenhaActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setText("Farmaceutico");

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        ctNome.setText("Nome do Farmaceutico");
        ctNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctNomeActionPerformed(evt);
            }
        });

        jLabel1.setText("CRM");

        jLabel2.setText("Senha");

        jLabel3.setText("Nome");

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSaudCod, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ctCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ctCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ctSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(btLimpar)
                .addGap(18, 18, 18)
                .addComponent(btCadastrar)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSaudCod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctCRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btCadastrar)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ctCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctCPFActionPerformed

    private void ctCRMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctCRMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctCRMActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void ctSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctSenhaActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cadastrar();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void ctNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctNomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            Principal.getPrincip().setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed
  
      private void limpar() {
        ctNome.setText("");
        ctCPF.setText("");
        ctCRM.setText("");
        ctSenha.setText("");
    }
     public void cadastrar() {
        PreparedStatement stPessoa = null;
        PreparedStatement stFarmaceutico = null;

        try {
            Conexao conexao = Conexao.getInstance();
            Connection con = conexao.getConnection();

            stPessoa = con.prepareStatement("INSERT INTO pessoa (cpf, nome) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);
            stPessoa.setString(1, ctCPF.getText());
            stPessoa.setString(2, ctNome.getText());

            int rowsAffectedPessoa = stPessoa.executeUpdate();

            if (rowsAffectedPessoa > 0) {
                stFarmaceutico = con.prepareStatement("INSERT INTO farmaceutico (cpf, nome_farm, crf, senha) VALUES (?, ?, ?, ?)");
                stFarmaceutico.setString(1, ctCPF.getText());
                stFarmaceutico.setString(2, ctNome.getText());
                stFarmaceutico.setString(3, ctCRM.getText());
                stFarmaceutico.setString(4, ctSenha.getText());

                int rowsAffectedFarmaceutico = stFarmaceutico.executeUpdate();

                if (rowsAffectedFarmaceutico > 0) {
                    JOptionPane.showMessageDialog(null, "Cadastro de farmacêutico realizado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao cadastrar farmacêutico", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar farmacêutico: " + ex.getMessage(), "Erro SQL", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "VALOR INVÁLIDO!", "VALOR INVÁLIDO", JOptionPane.WARNING_MESSAGE);
        } finally {
            try {
                if (stPessoa != null) {
                    stPessoa.close();
                }

                if (stFarmaceutico != null) {
                    stFarmaceutico.close();
                }
            } catch (SQLException e) {
            }
            System.out.println("Finally block executado.");
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
            java.util.logging.Logger.getLogger(CadFarm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadFarm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadFarm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadFarm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadFarm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JTextField ctCPF;
    private javax.swing.JTextField ctCRM;
    private javax.swing.JTextField ctNome;
    private javax.swing.JTextField ctSenha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblSaudCod;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
