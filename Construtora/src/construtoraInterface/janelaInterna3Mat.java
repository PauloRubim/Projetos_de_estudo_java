/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construtoraInterface;

import model.bean.Material;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.bean.Funcionario;
import model.dao.FuncionarioDAO;
import model.dao.MaterialDAO;

/**
 *
 * @author Neto
 */
public class janelaInterna3Mat extends javax.swing.JInternalFrame {
    ArrayList<Material> materiais;

    public janelaInterna3Mat() {
        initComponents();
        
        MaterialDAO matDAO = new MaterialDAO();
        
        //Recuperar os Funcionarios do Banco de Dados e adiciona na JTableMaterial       
        DefaultTableModel tabFunc = (DefaultTableModel) jTable2.getModel();
        for(Material m: matDAO.findAll()){            
            Object[] objMateriais = {m.getId(), m.getNome(), m.getFornecedor(), m.getEstoque(), m.getPreco()};
            tabFunc.addRow(objMateriais);
        }                                             
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBranco = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jSelecionar = new javax.swing.JButton();
        jVoltar = new javax.swing.JButton();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(620, 497));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBranco.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBranco.setLayout(null);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição", "Fornecedor", "Estoque", "Preço"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        jPanelBranco.add(jScrollPane1);
        jScrollPane1.setBounds(0, 170, 620, 270);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.setLayout(null);

        jSelecionar.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jSelecionar.setForeground(new java.awt.Color(255, 255, 255));
        jSelecionar.setText("Selecionar");
        jSelecionar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jSelecionar.setContentAreaFilled(false);
        jPanel1.add(jSelecionar);
        jSelecionar.setBounds(100, 90, 180, 30);

        jVoltar.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jVoltar.setForeground(new java.awt.Color(255, 255, 255));
        jVoltar.setText("Voltar");
        jVoltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jVoltar.setContentAreaFilled(false);
        jVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(jVoltar);
        jVoltar.setBounds(310, 90, 180, 30);

        jPanelBranco.add(jPanel1);
        jPanel1.setBounds(0, 0, 620, 170);

        getContentPane().add(jPanelBranco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 470));

        setBounds(0, 0, 620, 470);
    }// </editor-fold>//GEN-END:initComponents

    private void jVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVoltarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBranco;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSelecionar;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jVoltar;
    // End of variables declaration//GEN-END:variables
}
