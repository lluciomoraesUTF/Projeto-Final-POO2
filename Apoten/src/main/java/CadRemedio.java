import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class CadRemedio extends javax.swing.JFrame {

    /**
     * Creates new form CadRemedio
     */
    public CadRemedio() {
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

        ctNome = new javax.swing.JTextField();
        lblQuant = new javax.swing.JLabel();
        ctLote = new javax.swing.JTextField();
        ctQuant = new javax.swing.JTextField();
        lblDatadeValidade = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        ctDatadeValidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        ctCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ctNome.setText("Nome Remédio");

        lblQuant.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblQuant.setText("Quantidade:");

        ctLote.setText("2023001");
        ctLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctLoteActionPerformed(evt);
            }
        });

        ctQuant.setText("Ex:10");
        ctQuant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctQuantActionPerformed(evt);
            }
        });

        lblDatadeValidade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDatadeValidade.setText("Data de Validade:");

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setText("Remedio");

        ctDatadeValidade.setText("aaaa/mm/dd");
        ctDatadeValidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctDatadeValidadeActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("Lote");

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        jButton1.setText("Voltar");

        ctCodigo.setText("Código do Remédio");
        ctCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctCodigoActionPerformed(evt);
            }
        });

        jLabel3.setText("Código");

        jButton2.setText("Alterar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btCadastrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ctLote)
                                    .addComponent(ctNome)
                                    .addComponent(ctCodigo)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(lblTitle))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDatadeValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ctDatadeValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ctQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctDatadeValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDatadeValidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuant))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btLimpar)
                    .addComponent(btCadastrar)
                    .addComponent(jButton2))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ctLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctLoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctLoteActionPerformed

    private void ctQuantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctQuantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctQuantActionPerformed

    private void ctDatadeValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctDatadeValidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctDatadeValidadeActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        cadastrar();
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void ctCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctCodigoActionPerformed
     private void limpar() {
        ctCodigo.setText("");
        ctNome.setText("");
        ctLote.setText("");
        ctDatadeValidade.setText("");
        ctQuant.setText("");
    }
     
     private void cadastrar(){
        Connection con = null;
        PreparedStatement stRemedio = null;

        try {
            Conexao conexao = Conexao.getInstance();
            con = conexao.getConnection();

            stRemedio = con.prepareStatement("INSERT INTO remedio (rem_cod, nome, lote, data_valid) VALUES (?, ?, ?, ?)");
            stRemedio.setInt(1, Integer.parseInt(ctCodigo.getText())); 
            stRemedio.setString(2, ctNome.getText()); 
            stRemedio.setInt(3, Integer.parseInt(ctLote.getText()));
            LocalDate dataValidade = LocalDate.parse(ctDatadeValidade.getText());
            stRemedio.setDate(4, java.sql.Date.valueOf(dataValidade));

            int rowsAffectedRemedio = stRemedio.executeUpdate();

            if (rowsAffectedRemedio > 0) {
                JOptionPane.showMessageDialog(null, "Cadastro de remédio realizado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar remédio", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar remédio: " + ex.getMessage(), "Erro SQL", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException | DateTimeParseException nfe) {
            JOptionPane.showMessageDialog(null, "VALOR INVÁLIDO!", "VALOR INVÁLIDO", JOptionPane.WARNING_MESSAGE);
            nfe.printStackTrace(); // Isso é opcional, você pode remover se não quiser imprimir o stack trace no console
        
    } finally {
            try {
                if (stRemedio != null) {
                    stRemedio.close();
                }

                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                
            }
        }
    }
     public void alt(){
        try {            
            PreparedStatement st = null;
            Conexao conexao = Conexao.getInstance();
            Connection con = conexao.getConnection(); 
           st = con.prepareStatement("UPDATE remedio SET nome = ?, lote = ?, data_valid = ?, WHERE rem_cod = ?");
            st.setString(1, ctNome.getText());
            st.setInt(2, Integer.parseInt(ctLote.getText()));
            st.setDate(3, java.sql.Date.valueOf(LocalDate.parse(ctDatadeValidade.getText()))); // Certifique-se de que ctDataValidade seja uma String no formato adequado
            st.setInt(4, Integer.parseInt(ctCodigo.getText()));
            st.executeUpdate();

            
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JTextField ctCodigo;
    private javax.swing.JTextField ctDatadeValidade;
    private javax.swing.JTextField ctLote;
    private javax.swing.JTextField ctNome;
    private javax.swing.JTextField ctQuant;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblDatadeValidade;
    private javax.swing.JLabel lblQuant;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
