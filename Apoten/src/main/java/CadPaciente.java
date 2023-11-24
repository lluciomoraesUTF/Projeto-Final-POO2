import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CadPaciente extends javax.swing.JFrame {

    /**
     * Creates new form CadPaciente
     */
    public CadPaciente() {
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

        btLimpar = new javax.swing.JButton();
        lblAlergiaMedicamento = new javax.swing.JLabel();
        ctEmail = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        ctNome = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        ctCPF = new javax.swing.JTextField();
        lblSaudCod = new javax.swing.JLabel();
        ctDataNasc = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        lblAlergiaMedicamento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAlergiaMedicamento.setText("e-mail");

        ctEmail.setText("name@example.com");
        ctEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctEmailActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setText("Paciente");

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNome.setText("NOME:");

        ctNome.setText("Nome do Paciente");

        lblCPF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCPF.setText("CPF:");

        ctCPF.setText("2023001");
        ctCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctCPFActionPerformed(evt);
            }
        });

        lblSaudCod.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSaudCod.setText("Data de Nacimento");

        ctDataNasc.setText("123");
        ctDataNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctDataNascActionPerformed(evt);
            }
        });

        jButton1.setText("Voltar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSaudCod, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(ctDataNasc))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCPF)
                        .addGap(21, 21, 21)
                        .addComponent(ctCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAlergiaMedicamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ctEmail)))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCadastrar)
                .addGap(18, 18, 18))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(127, 127, 127)
                    .addComponent(jButton1)
                    .addContainerGap(128, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(ctCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaudCod)
                    .addComponent(ctDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlergiaMedicamento)
                    .addComponent(ctEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btLimpar))
                .addGap(189, 189, 189))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(187, 187, 187)
                    .addComponent(jButton1)
                    .addContainerGap(187, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cadastrar();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void ctCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctCPFActionPerformed

    private void ctDataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctDataNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctDataNascActionPerformed

    private void ctEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctEmailActionPerformed
    private void limpar() {
        ctEmail.setText("");
        ctCPF.setText("");
        ctNome.setText("");
        ctDataNasc.setText("");
    }

    public void cadastrar() {
        Connection con = null;
        PreparedStatement stPessoa = null;
        PreparedStatement stPaciente = null;

        try {
            Conexao conexao = Conexao.getInstance();
            con = conexao.getConnection();

            stPessoa = con.prepareStatement("INSERT INTO pessoa (cpf, nome) VALUES (?, ?)");
            stPessoa.setString(1, ctCPF.getText());
            stPessoa.setString(2, ctNome.getText());

            int rowsAffectedPessoa = stPessoa.executeUpdate();

            if (rowsAffectedPessoa > 0) {
                stPaciente = con.prepareStatement("INSERT INTO paciente (cpf, nome_pac, data_nasc, email) VALUES (?, ?, ?, ?)");
                stPaciente.setString(1, ctCPF.getText());
                stPaciente.setString(2, ctNome.getText());
                // Supondo que ctDataNasc seja um campo de data ou formato adequado
                stPaciente.setDate(3, java.sql.Date.valueOf(ctDataNasc.getText()));
                stPaciente.setString(4, ctEmail.getText());

                int rowsAffectedPaciente = stPaciente.executeUpdate();

                if (rowsAffectedPaciente > 0) {
                    JOptionPane.showMessageDialog(null, "Cadastro de paciente realizado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao cadastrar paciente", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar paciente: " + ex.getMessage(), "Erro SQL", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        } catch (NumberFormatException | DateTimeParseException nfe) {
            JOptionPane.showMessageDialog(null, "VALOR INVÁLIDO!", "VALOR INVÁLIDO", JOptionPane.WARNING_MESSAGE);
            nfe.printStackTrace();
        } finally {
            try {
                if (stPessoa != null) {
                    stPessoa.close();
                }

                if (stPaciente != null) {
                    stPaciente.close();
                }

                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JTextField ctCPF;
    private javax.swing.JTextField ctDataNasc;
    private javax.swing.JTextField ctEmail;
    private javax.swing.JTextField ctNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblAlergiaMedicamento;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSaudCod;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
