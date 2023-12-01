import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaRem extends javax.swing.JFrame {
    private static ConsultaRem consRem;
    /**
     * Creates new form ConsultaRem
     */
    List<Remedio> remedios = new ArrayList<>();
    public ConsultaRem() {
        initComponents();
    }
    public static ConsultaRem getConsRem() {
        if (consRem == null) {
            consRem = new ConsultaRem();
        }   
        return consRem;
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
        ctCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        btConsultar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jRemedios = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Código");

        ctCodigo.setText("Código do remédio");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Consulta Remédio ");

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        jRemedios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "lote", "Data de Validade"
            }
        ));
        jScrollPane1.setViewportView(jRemedios);

        jButton3.setText("Deletar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btConsultar)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btVoltar)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(ctCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel2)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimpar)
                    .addComponent(btConsultar)
                    .addComponent(btVoltar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        
        try {
            consulta();
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaRem.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            preencherTabela();
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaRem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btConsultarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            del();
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaRem.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            preencherTabela();
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaRem.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
   try {
            Principal.getPrincipal().setVisible(true);
            this.dispose(); 
        } catch (SQLException ex) {
            Logger.getLogger(CadPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
                                      
    }//GEN-LAST:event_btVoltarActionPerformed
      private void limpar() { 
        ctCodigo.setText("");
    }
      public List<Remedio> consulta() throws SQLException {
        
        PreparedStatement stRemedio = null;
        ResultSet rs = null;

        try {
            
            Conexao conexao = Conexao.getInstance();
            Connection con = null;
            con = conexao.getConnection();

            int codigo = Integer.parseInt(ctCodigo.getText());

            stRemedio = con.prepareStatement("SELECT rem_cod, nome, lote, data_valid FROM remedio WHERE rem_cod = ?");
            stRemedio.setInt(1, codigo);
            rs = stRemedio.executeQuery();

            if (rs.next()) {
                Remedio remedio = new Remedio();
                remedio.setCodigo(rs.getInt("rem_cod"));
                remedio.setNome(rs.getString("nome"));
                remedio.setLote(rs.getInt("lote"));
                remedio.setData_Validade(rs.getDate("data_valid").toLocalDate());
                remedios.add(remedio);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaRem.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (rs != null) rs.close();
                if (stRemedio != null) stRemedio.close();
                
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return remedios;
    }
      
    public void preencherTabela() throws SQLException {
        DefaultTableModel estruturaTabela = (DefaultTableModel) jRemedios.getModel();
        int posLin = 0;
        estruturaTabela.setRowCount(posLin);
    
        remedios.clear(); // Limpa a lista antes de preenchê-la novamente
    
         for (Remedio rm : consulta()) {
            estruturaTabela.insertRow(posLin, new Object[]{rm.getCodigo(), rm.getNome(), rm.getLote(),
                rm.getData_Validade(), rm.getQuantidade()});
            posLin++;
        }
    }


    public void del() throws SQLException{
        try {            
            PreparedStatement st = null;
            Conexao conexao = Conexao.getInstance();
            Connection con = conexao.getConnection(); 
            st = con.prepareStatement("DELETE FROM remedio WHERE rem_cod = ?",Statement.RETURN_GENERATED_KEYS);           
            String codigo_Remedio = ctCodigo.getText();
            int codigoRemedio = Integer.parseInt(codigo_Remedio);
            st.setInt(1, codigoRemedio);
            st.executeUpdate();
            JOptionPane.showMessageDialog(null,"Remedio deletado","ERRO",1);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO!","VALOR INVÁLIDO",1);
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
            java.util.logging.Logger.getLogger(ConsultaRem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaRem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaRem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaRem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaRem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField ctCodigo;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTable jRemedios;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
