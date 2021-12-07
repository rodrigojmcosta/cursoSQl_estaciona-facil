package gui;

import beans.Veiculo;
import dao.DaoVeiculo;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaVeiculo extends javax.swing.JFrame {

    // instancia um novo objeto da classe Pessoa.java 
    Veiculo veiculo = new Veiculo();

    // instancia um novo objeto da classe DaoPessoa.java 
    DaoVeiculo daoV = new DaoVeiculo();

    // variavel da tabela modelo Pessoa 
    private DefaultTableModel tabelaModeloVeiculo = new DefaultTableModel();

    //Array List da tabela que ira popular a tabela
    ArrayList<Veiculo> arlTabela = new ArrayList<Veiculo>();

    //Creates new form TelaVeiculo
    public TelaVeiculo() {

        //INICIA OS COMPONENTES
        initComponents();

        //DISPOSE DA "MP"
        TelaVeiculo.this.dispose();

        //PREENCHE A TABELA COM OS DADOS DO BD COM O "DAO"
        listarVeiculos();

    }

    private void gravarVeiculo() {
        veiculo.setCod(Integer.parseInt(jtfCod.getText()));
        veiculo.setMarca(jtfMarca.getText());
        veiculo.setModelo(jtfModelo.getText());
        veiculo.setCor(jtfCor.getText());
        veiculo.setPlaca(jtfPlaca.getText());
        veiculo.setNomeProp(jtfNomeProp.getText());
        veiculo.setTelProp(jtfTelProp.getText());
        veiculo.setCpfProp(jtfCpfProp.getText());
        daoV.grava(veiculo);
    }

    private void alterarVeiculo() {
        veiculo.setCod(Integer.parseInt(jtfCod.getText()));
        veiculo.setMarca(jtfMarca.getText());
        veiculo.setModelo(jtfModelo.getText());
        veiculo.setCor(jtfCor.getText());
        veiculo.setPlaca(jtfPlaca.getText());
        veiculo.setNomeProp(jtfNomeProp.getText());
        veiculo.setTelProp(jtfTelProp.getText());
        veiculo.setCpfProp(jtfCpfProp.getText());
        daoV.atualiza(veiculo);
    }

    private void deletarVeiculo() {
        veiculo.setCod(Integer.parseInt(jtfCod.getText()));
        daoV.deleta(veiculo);
    }

    public void listarVeiculos() {
        try {
            //inicalizando vetor para armazenar dados das pessoas 
            arlTabela = new ArrayList<Veiculo>();
            //consultado dados no banco de dados
            arlTabela = daoV.lista();
            //definindo nomes das colunas da tabela
            String nomesColunas[] = {"Código", "Marca", "Modelo", "Cor", "Placa", "Proprietário", "Telefone", "CPF"};

            //criando um modelo para a tabela de acordo com os nomes das colunas 
            tabelaModeloVeiculo = new DefaultTableModel();
            tabelaModeloVeiculo.setColumnIdentifiers(nomesColunas);

            //atribuindo o modelo de tabela (tabelaModeloPessoa) a tabela em si (variável tabela);
            tabela.setModel(tabelaModeloVeiculo);
            //preenchendo a tabela deacordo com o vetor (arlTabela) que contém os dados 
            //que vieram do banco de dados
            for (int i = 0; i < arlTabela.size(); i++) {
                //atribuindo uma pessoa do vetor de tabelas a variavel pess
                Veiculo veic = (Veiculo) arlTabela.get(i);
                //criando um vetor com todos os dados de uma linha da tabela
                Vector linha = new Vector();
                //adicionando os dados a cada coluna da linha
                linha.add(veic.getCod());
                linha.add(veic.getMarca());
                linha.add(veic.getModelo());
                linha.add(veic.getCor());
                linha.add(veic.getPlaca());
                linha.add(veic.getNomeProp());
                linha.add(veic.getTelProp());
                linha.add(veic.getCpfProp());
                //adicionando a linha com os dados a ao modelo da tabela 
                //(é no modelo da tabela, vinculado a tabela, que se deve adicionar as linhas com os dados )
                tabelaModeloVeiculo.addRow(linha);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Iiihh deu pau na tabela!");
        }
    }

    public void limpaTela() {
        jtfCod.setText("");
        jtfCor.setText("");
        jtfMarca.setText("");
        jtfModelo.setText("");
        jtfPlaca.setText("");
        jtfNomeProp.setText("");
        jtfTelProp.setText("");
        jtfCpfProp.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        fundo = new javax.swing.JPanel();
        acoes = new javax.swing.JPanel();
        jbGravar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbListar = new javax.swing.JButton();
        manterConsultar = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jtfCod = new javax.swing.JTextField();
        jtfMarca = new javax.swing.JTextField();
        jtfModelo = new javax.swing.JTextField();
        jtfCor = new javax.swing.JTextField();
        jtfPlaca = new javax.swing.JTextField();
        jtfNomeProp = new javax.swing.JTextField();
        jtfTelProp = new javax.swing.JTextField();
        jtfCpfProp = new javax.swing.JTextField();
        jlCod = new javax.swing.JLabel();
        jlMarca = new javax.swing.JLabel();
        jlModelo = new javax.swing.JLabel();
        jlCor = new javax.swing.JLabel();
        jlPlaca = new javax.swing.JLabel();
        jlNomeProp = new javax.swing.JLabel();
        jlTelProp = new javax.swing.JLabel();
        jlCpfProp = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fundo.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de veículos"));

        acoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));

        jbGravar.setText("Gravar");
        jbGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGravarActionPerformed(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbListar.setText("Listar");
        jbListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbListarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout acoesLayout = new javax.swing.GroupLayout(acoes);
        acoes.setLayout(acoesLayout);
        acoesLayout.setHorizontalGroup(
            acoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, acoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jbListar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        acoesLayout.setVerticalGroup(
            acoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acoesLayout.createSequentialGroup()
                .addGroup(acoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jbListar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbExcluir)
                    .addComponent(jbAlterar)
                    .addComponent(jbGravar))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        acoesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbAlterar, jbExcluir, jbGravar, jbListar});

        manterConsultar.setToolTipText("");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do veículo"));

        jtfCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodActionPerformed(evt);
            }
        });

        jlCod.setText("Código");

        jlMarca.setText("Marca");

        jlModelo.setText("Modelo");

        jlCor.setText("Cor");

        jlPlaca.setText("Placa");

        jlNomeProp.setText("Nome do proprietario");

        jlTelProp.setText("Telefone para contato");

        jlCpfProp.setText("CPF do proprietario");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCod)
                    .addComponent(jlMarca)
                    .addComponent(jlModelo)
                    .addComponent(jlCor)
                    .addComponent(jlPlaca)
                    .addComponent(jlNomeProp)
                    .addComponent(jlTelProp)
                    .addComponent(jlCpfProp))
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtfModelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(jtfCod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTelProp, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfNomeProp, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfCpfProp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(jtfPlaca, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfMarca, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfCor))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCor)
                    .addComponent(jtfCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlPlaca)
                    .addComponent(jtfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNomeProp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNomeProp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelProp)
                    .addComponent(jtfTelProp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCpfProp)
                    .addComponent(jtfCpfProp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jlNomeProp.getAccessibleContext().setAccessibleDescription("jtfAno");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        manterConsultar.addTab("Dados", jPanel3);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Marca", "Modelo", "Cor", "Placa", "Proprietário", "Telefone", "CPF"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addContainerGap())
        );

        manterConsultar.addTab("Consulta", jPanel5);

        javax.swing.GroupLayout fundoLayout = new javax.swing.GroupLayout(fundo);
        fundo.setLayout(fundoLayout);
        fundoLayout.setHorizontalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manterConsultar)
                    .addComponent(acoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        fundoLayout.setVerticalGroup(
            fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoLayout.createSequentialGroup()
                .addComponent(acoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manterConsultar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCodActionPerformed

    private void jbListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbListarActionPerformed
        listarVeiculos();
        limpaTela();
    }//GEN-LAST:event_jbListarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        deletarVeiculo();
        limpaTela();
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        alterarVeiculo();
        limpaTela();
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGravarActionPerformed
        gravarVeiculo();
        limpaTela();
    }//GEN-LAST:event_jbGravarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVeiculo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVeiculo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVeiculo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVeiculo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel acoes;
    private javax.swing.JPanel fundo;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbGravar;
    private javax.swing.JButton jbListar;
    private javax.swing.JLabel jlCod;
    private javax.swing.JLabel jlCor;
    private javax.swing.JLabel jlCpfProp;
    private javax.swing.JLabel jlMarca;
    private javax.swing.JLabel jlModelo;
    private javax.swing.JLabel jlNomeProp;
    private javax.swing.JLabel jlPlaca;
    private javax.swing.JLabel jlTelProp;
    private javax.swing.JTextField jtfCod;
    private javax.swing.JTextField jtfCor;
    private javax.swing.JTextField jtfCpfProp;
    private javax.swing.JTextField jtfMarca;
    private javax.swing.JTextField jtfModelo;
    private javax.swing.JTextField jtfNomeProp;
    private javax.swing.JTextField jtfPlaca;
    private javax.swing.JTextField jtfTelProp;
    private javax.swing.JTabbedPane manterConsultar;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
