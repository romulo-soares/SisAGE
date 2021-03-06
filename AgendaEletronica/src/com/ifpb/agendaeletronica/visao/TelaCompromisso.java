package com.ifpb.agendaeletronica.visao;

import com.ifpb.agendaeletronica.controle.AgendaDaoBanco;
import com.ifpb.agendaeletronica.controle.AgendaDaoBinario;
import com.ifpb.agendaeletronica.controle.CompromissoDaoBanco;
import com.ifpb.agendaeletronica.controle.CompromissoDaoBinario;
import com.ifpb.agendaeletronica.controle.UsuarioDaoBanco;
import com.ifpb.agendaeletronica.controle.UsuarioDaoBinario;
import com.ifpb.agendaeletronica.modelo.Compromisso;
import com.ifpb.agendaeletronica.excecoes.DescricaoInvalidaException;
import com.ifpb.agendaeletronica.excecoes.LocalInvalidoException;
import com.ifpb.agendaeletronica.interfaces.AgendaDao;
import com.ifpb.agendaeletronica.interfaces.CompromissoDao;
import com.ifpb.agendaeletronica.interfaces.UsuarioDao;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Familia
 */
public class TelaCompromisso extends javax.swing.JFrame {

    /**
     * Creates new form TelaCompromisso
     */
    private AgendaDao dao;
    private UsuarioDao dao2;
    private CompromissoDao dao3;

    public TelaCompromisso() {

        dao = new AgendaDaoBanco();
        dao2 = new UsuarioDaoBanco();
        dao3 = new CompromissoDaoBanco();
        initComponents();
        inicializarComponentes();
    }

    public void inicializarComponentes() {
        List<String> listaNomesAgendas = new ArrayList<>();

        try {
            listaNomesAgendas = dao.retornaNomeAgendas();
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,
                    "Falha na Conexão",
                    "Mensagem de Erro",
                    JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "já existe uma agenda com esse nome",
                    "Mensagem de Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
        comboAgenda.removeAllItems();
        for (int i = 0; i < listaNomesAgendas.size(); i++) {
            comboAgenda.addItem(listaNomesAgendas.get(i));
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoData = new com.toedter.calendar.JDateChooser();
        campoHora = new javax.swing.JSpinner();
        campoMinuto = new javax.swing.JSpinner();
        campoDescricao = new javax.swing.JTextField();
        campoLocal = new javax.swing.JTextField();
        comboAgenda = new javax.swing.JComboBox();
        botaoOk = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Novo Compromisso");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Data");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Hora");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Descrição");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Local");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Agenda");

        campoData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        campoHora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoHora.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));

        campoMinuto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoMinuto.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        campoDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDescricaoActionPerformed(evt);
            }
        });

        campoLocal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoLocalActionPerformed(evt);
            }
        });

        comboAgenda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAgendaActionPerformed(evt);
            }
        });

        botaoOk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoOk.setText("Adicionar");
        botaoOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(campoHora, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(botaoOk)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addGap(15, 15, 15)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(campoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {campoHora, campoMinuto});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(campoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(botaoOk, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDescricaoActionPerformed

    private void campoLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoLocalActionPerformed

    private void botaoOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOkActionPerformed

        Compromisso compromisso = new Compromisso();

        try {

            compromisso.setDescricao(campoDescricao.getText());

            compromisso.setLocal(campoLocal.getText());

            LocalDate data = LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(campoData.getDate()));

            compromisso.setData(data);

            int hour = (int) campoHora.getValue();
            int minute = (int) campoMinuto.getValue();

            LocalTime hora = LocalTime.of(hour, minute);
            compromisso.setHora(hora);

            compromisso.setEmail(TelaInicial.usuarioLogado.getEmail());
            compromisso.setNome((String) comboAgenda.getSelectedItem());

            if (dao3.createCompromisso(compromisso)) {
                System.out.println(dao3.updateCompromisso(compromisso));
                JOptionPane.showMessageDialog(null,
                        "Compromisso Adicionado Com Sucesso");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null,
                        "Compromisso Não Pode Ser Adicionado",
                        "Mensagem de Erro",
                        JOptionPane.ERROR_MESSAGE);
            }

        } catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(null,
                    "Data Inválida", "Mensagem de Erro",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,
                    "Falha na Conexão",
                    "Mensagem de Erro",
                    JOptionPane.ERROR_MESSAGE);
        } catch (DateTimeException ex) {
            JOptionPane.showMessageDialog(null,
                    "Data ou Hora Inválida", "Mensagem de Erro",
                    JOptionPane.ERROR_MESSAGE);
        } catch (DescricaoInvalidaException ex) {
            JOptionPane.showMessageDialog(null,
                    "A Descrição Não Pode Ser Vazia", "Mensagem de Erro",
                    JOptionPane.ERROR_MESSAGE);
        } catch (LocalInvalidoException ex) {
            JOptionPane.showMessageDialog(null,
                    "O Local Não Pode Ser Vazio", "Mensagem de Erro",
                    JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "já existe um compromisso com esse nome",
                    "Mensagem de Erro",
                    JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null,
                    "Campo Não Pode ser vazio", "Mensagem de Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoOkActionPerformed

    private void comboAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAgendaActionPerformed


    }//GEN-LAST:event_comboAgendaActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaCompromisso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCompromisso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCompromisso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCompromisso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCompromisso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoOk;
    private com.toedter.calendar.JDateChooser campoData;
    private javax.swing.JTextField campoDescricao;
    private javax.swing.JSpinner campoHora;
    private javax.swing.JTextField campoLocal;
    private javax.swing.JSpinner campoMinuto;
    private javax.swing.JComboBox comboAgenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}
