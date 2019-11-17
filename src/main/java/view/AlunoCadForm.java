/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controle.AlunoControle;
import controle.TurmaControle;
import dominio.Turma;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.util.List;
import javassist.tools.rmi.RemoteException;
import javax.swing.JOptionPane;
import util.ValidacaoException;

/**
 *
 * @author juan
 */
public class AlunoCadForm extends javax.swing.JInternalFrame {

    private final AlunoControle alunoControle;
    private final TurmaControle turmaControle;
    /**
     * Creates new form AlunoCadForm
     */
    public AlunoCadForm() {
        alunoControle = new AlunoControle();
        turmaControle = new TurmaControle();
        initComponents();
    }
    
    public void Centralizar() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    public AlunoControle getAlunoControle() {
        return alunoControle;
    }

    public TurmaControle getTurmaControle() {
        return turmaControle;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        btnGroupPCD = new javax.swing.ButtonGroup();
        panelMenu = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        panelDados = new javax.swing.JPanel();
        lblMatricula = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblAnoNasc = new javax.swing.JLabel();
        lblTurma = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        cbTurma = new javax.swing.JComboBox<>();
        panelPCD = new javax.swing.JPanel();
        rBtnSim = new javax.swing.JRadioButton();
        rBtnNao = new javax.swing.JRadioButton();
        txtAnoNasc = new javax.swing.JTextField();
        panelScroll = new javax.swing.JScrollPane();
        tabelaAlunos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Alunos");
        setToolTipText("Tela para cadastro, atualização, remoção e pesquisa de Alunos do Sistema Escola DJJL");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        panelMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnNovo.setMnemonic('n');
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setMnemonic('s');
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnRemover.setMnemonic('r');
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnRemover))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblMatricula.setText("Matrícula:");

        lblNome.setText("Nome:");

        lblAnoNasc.setText("Ano de Nascimento:");

        lblTurma.setText("Turma:");

        txtMatricula.setEditable(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${alunoControle.alunoDigitado.id}"), txtMatricula, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${alunoControle.alunoDigitado.nome}"), txtNome, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeKeyTyped(evt);
            }
        });

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${alunoControle.alunoDigitado.turma.nome}"), cbTurma, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        panelPCD.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "PCD"));
        panelPCD.setName(""); // NOI18N

        btnGroupPCD.add(rBtnSim);
        rBtnSim.setText("Sim");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${alunoControle.alunoDigitado.PCD}"), rBtnSim, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        btnGroupPCD.add(rBtnNao);
        rBtnNao.setSelected(true);
        rBtnNao.setText("Não");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${alunoControle.alunoDigitado.PCD}"), rBtnNao, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout panelPCDLayout = new javax.swing.GroupLayout(panelPCD);
        panelPCD.setLayout(panelPCDLayout);
        panelPCDLayout.setHorizontalGroup(
            panelPCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPCDLayout.createSequentialGroup()
                .addComponent(rBtnNao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rBtnSim))
        );
        panelPCDLayout.setVerticalGroup(
            panelPCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPCDLayout.createSequentialGroup()
                .addGroup(panelPCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rBtnNao)
                    .addComponent(rBtnSim))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${alunoControle.alunoDigitado.anoNasc}"), txtAnoNasc, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txtAnoNasc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAnoNascKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelDadosLayout = new javax.swing.GroupLayout(panelDados);
        panelDados.setLayout(panelDadosLayout);
        panelDadosLayout.setHorizontalGroup(
            panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelDadosLayout.createSequentialGroup()
                        .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelDadosLayout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addGap(2, 2, 2)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDadosLayout.createSequentialGroup()
                                .addComponent(lblTurma)
                                .addGap(2, 2, 2)
                                .addComponent(cbTurma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelPCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDadosLayout.createSequentialGroup()
                        .addComponent(lblMatricula)
                        .addGap(3, 3, 3)
                        .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAnoNasc)
                        .addGap(2, 2, 2)
                        .addComponent(txtAnoNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDadosLayout.setVerticalGroup(
            panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatricula)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnoNasc)
                    .addComponent(txtAnoNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDadosLayout.createSequentialGroup()
                        .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTurma)
                            .addComponent(cbTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panelPCD, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelScroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabelaAlunos.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${alunoControle.alunosTabelas}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, tabelaAlunos);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Matrícula");
        columnBinding.setColumnClass(Long.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${anoNasc}"));
        columnBinding.setColumnName("Ano Nasc");
        columnBinding.setColumnClass(Long.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${PCD}"));
        columnBinding.setColumnName("PCD");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${turma.nome}"));
        columnBinding.setColumnName("Turma");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${alunoControle.alunoSelecionado}"), tabelaAlunos, org.jdesktop.beansbinding.BeanProperty.create("selectedElement"));
        bindingGroup.addBinding(binding);

        panelScroll.setViewportView(tabelaAlunos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        cbTurma.setSelectedIndex(0);
        rBtnNao.setSelected(true);
        alunoControle.novo();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        try {
            List<Turma> lista = turmaControle.getTurmasTabelas();
            lista.stream().filter((tur) -> (tur.getNome() == null ? cbTurma.getSelectedItem().toString() == null : tur.getNome().equals(cbTurma.getSelectedItem().toString()))).forEach((tur) -> {
                alunoControle.getAlunoDigitado().setTurma(tur);
            });
            alunoControle.salvar();
            JOptionPane.showMessageDialog(this, 
                "Aluno salvo com sucesso",
                "Salvar Aluno",
                JOptionPane.INFORMATION_MESSAGE);              
        } catch(ValidacaoException e) {
            JOptionPane.showMessageDialog(this, 
                e.getMessage(),
                "Falha de Validação",
                JOptionPane.WARNING_MESSAGE);              
        } catch(RemoteException e ){
            JOptionPane.showMessageDialog(this,
                    "Erro "+e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        } 
        cbTurma.setSelectedIndex(0);
        rBtnNao.setSelected(true);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(this, 
                "Deseja realmente remover este Aluno?",
                "Remover Aluno",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            
            try {
                alunoControle.remover();
                JOptionPane.showMessageDialog(this, 
                    "Aluno removido com sucesso",
                    "Remover Aluno",
                    JOptionPane.INFORMATION_MESSAGE);              
            } catch(RemoteException e ){
                JOptionPane.showMessageDialog(this,
                    "Erro "+e.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
            }        
        }
        cbTurma.setSelectedIndex(0);
        rBtnNao.setSelected(true);
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        cbTurma.addItem("Selecione uma Turma");
        try {
            List<Turma> lista = turmaControle.getTurmasTabelas();
            lista.stream().forEach((tur) -> {
                //se o tamanho da turma é menor que 40 ela aparece para ser selecionada
                if(tur.getTamanhoTurma() < 40) {
                    cbTurma.addItem(tur.getNome());
                }
            });
        } catch(Exception erro) {
            System.out.println(erro);
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void txtAnoNascKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAnoNascKeyTyped
        // TODO add your handling code here:
        int k = evt.getKeyChar();
        if((k > 47 && k < 58)) {
            if(txtAnoNasc.getText().length() == 4){ 
                //quando tiver 4 digitos consome os digitados a mais se usuárop tenta burlar
                evt.consume();
                //depois muda o foco
                txtNome.requestFocus();
            }
        } else {
            evt.setKeyChar((char)KeyEvent.VK_CLEAR);
        }
    }//GEN-LAST:event_txtAnoNascKeyTyped

    private void txtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyTyped
        // TODO add your handling code here:
        if(txtNome.getText().length() == 255) {
            //quando tiver 255 digitos consome os que digitarem a mais
            evt.consume();
            //depois muda o foco
            cbTurma.requestFocus();
        }
    }//GEN-LAST:event_txtNomeKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupPCD;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbTurma;
    private javax.swing.JLabel lblAnoNasc;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTurma;
    private javax.swing.JPanel panelDados;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPCD;
    private javax.swing.JScrollPane panelScroll;
    private javax.swing.JRadioButton rBtnNao;
    private javax.swing.JRadioButton rBtnSim;
    private javax.swing.JTable tabelaAlunos;
    private javax.swing.JTextField txtAnoNasc;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
