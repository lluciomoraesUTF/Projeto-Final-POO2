import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsultaPac extends javax.swing.JFrame {
    private static ConsultaPac consRem;  
    /**
     * Creates new form ConsultaPac
     */
    public ConsultaPac() {
        initComponents();
    }
    public static ConsultaPac getConsPac() {
        if (consRem == null) {
            consRem = new ConsultaPac();
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

        lblCPF = new javax.swing.JLabel();
        ctCPF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btConsultar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProntuario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCPF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCPF.setText("CPF:");

        ctCPF.setText("2023001");
        ctCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctCPFActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText(" Prontuário");

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        tableProntuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CPF", "Nome", "Data de Nascimento", "email", "Data da Dispensa", "Quantidade ", "Nome do Remédio"
            }
        ));
        jScrollPane1.setViewportView(tableProntuario);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btLimpar)
                .addGap(26, 26, 26)
                .addComponent(btConsultar)
                .addGap(407, 407, 407))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblCPF)
                        .addGap(18, 18, 18)
                        .addComponent(ctCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPF))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConsultar)
                    .addComponent(btLimpar)
                    .addComponent(btVoltar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ctCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctCPFActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
 
           consulta();  
            preencherTabela();
      
       
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
         try {
            Principal.getPrincipal().setVisible(true);
            this.dispose(); 
        } catch (SQLException ex) {
            Logger.getLogger(CadPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btVoltarActionPerformed

    private void limpar() { 
        ctCPF.setText("");
}
public List<Dispensa> consulta() {
    List<Dispensa> dispensas = new ArrayList<>();
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
        Connection con = null;

        Conexao conexao = Conexao.getInstance();
        con = conexao.getConnection();

        String cpfPaciente = ctCPF.getText();

        String sql = "SELECT d.*, r.quantidade_preescrita, r.medicamento_nome " +
                     "FROM dispensa d " +
                     "INNER JOIN receita r ON d.receita_id = r.receita_id " +
                     "INNER JOIN paciente p ON r.cpf_paciente = p.cpf " +
                     "WHERE p.cpf = ?";

        stmt = con.prepareStatement(sql);
        stmt.setString(1, cpfPaciente);
        rs = stmt.executeQuery();

        while (rs.next()) {
            Receita receita = new Receita();
            receita.setId(rs.getInt("receita_id"));
            receita.setQuantidade(rs.getInt("quantidade_preescrita"));

            Remedio remedio = new Remedio();
            remedio.setNome(rs.getString("medicamento_nome"));

            Farmaceutico farmaceutico = new Farmaceutico();
            farmaceutico.setCrf(rs.getString("crm_farmaceutico"));

            Dispensa dispensa = new Dispensa(receita, farmaceutico, remedio, rs.getDate("data_dispensa").toLocalDate());
            dispensa.setDispensaId(rs.getInt("dispensa_id"));

            dispensas.add(dispensa);
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    } finally {

        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    return dispensas;
}

public void preencherTabela() {
    DefaultTableModel modelo = (DefaultTableModel) tableProntuario.getModel();
    modelo.setRowCount(0);

    List<Dispensa> dispensas = consulta(); // Obter a lista de dispensas
    for (Dispensa dispensa : dispensas) {
        Object[] rowData = {
            dispensa.getReceita().getPaciente().getCpf(),
            dispensa.getReceita().getPaciente().getNome(),
            dispensa.getReceita().getPaciente().getDataNascimento(),
            dispensa.getReceita().getPaciente().getEmail(),
            dispensa.getDataDispensa(),
            dispensa.getReceita().getQuantidade(),
            dispensa.getReceita().getRemedio().getNome()
        };
        modelo.addRow(rowData);
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField ctCPF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JTable tableProntuario;
    // End of variables declaration//GEN-END:variables
}
