/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package construtoraInterface;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Construcao_Material;
import model.dao.Construcao_MaterialDAO;
import model.dao.EstabelecerConexao;

/**
 *
 * @author Neto
 */
public class ConstrucaoMaterial extends javax.swing.JInternalFrame {

    /** Creates new form ConstrucaoMaterial */
    public ConstrucaoMaterial() {
        initComponents();
                
        this.recupera();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIDC = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtIDM = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBorder(null);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID Construção");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(27, 28, 180, 30);

        txtIDC.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        txtIDC.setForeground(new java.awt.Color(0, 102, 255));
        txtIDC.setBorder(null);
        txtIDC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDCActionPerformed(evt);
            }
        });
        jPanel1.add(txtIDC);
        txtIDC.setBounds(220, 30, 80, 30);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Material");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 100, 180, 30);

        txtIDM.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        txtIDM.setForeground(new java.awt.Color(0, 102, 255));
        txtIDM.setBorder(null);
        jPanel1.add(txtIDM);
        txtIDM.setBounds(220, 100, 80, 30);

        jButton1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cadastrar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(440, 130, 140, 30);

        jExcluir.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jExcluir.setText("Excluir");
        jExcluir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jExcluir.setContentAreaFilled(false);
        jExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(jExcluir);
        jExcluir.setBounds(440, 170, 140, 30);

        jDesktopPane1.add(jPanel1);
        jPanel1.setBounds(0, 0, 620, 220);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ID Construção", "ID Material"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jDesktopPane1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 220, 620, 230);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setBounds(0, 0, 620, 470);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDCActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(this.isNullOrEmpty(txtIDC.getText()) || this.isNullOrEmpty(txtIDM.getText())){
            JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos!");
        }else{
            
            EstabelecerConexao con = new EstabelecerConexao();
            Construcao_MaterialDAO construcao_materialdao = new Construcao_MaterialDAO(con);            
            Construcao_Material construcao_mat = new Construcao_Material();
            
            construcao_mat.setId_Construcao(Integer.parseInt(txtIDC.getText()));
            construcao_mat.setId_Material(Integer.parseInt(txtIDM.getText()));            
            //Adiciona no Banco de Dados
            construcao_materialdao.AdicionaConstrucao_Material(construcao_mat);                                                                        
            
            //Adicionar na JTable
            DefaultTableModel tableMatCons = (DefaultTableModel) jTable1.getModel();//Tabela
            Object[] objMatCons = {construcao_mat.getId(),construcao_mat.getId_Construcao(), construcao_mat.getId_Material()};
            tableMatCons.addRow(objMatCons);
            
            this.apagar();
            this.recupera();
        }       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExcluirActionPerformed
        if(jTable1.getSelectedRow() != -1){
                        
            int Id = Integer.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());            
            System.out.println(Id);
            
            EstabelecerConexao con = new EstabelecerConexao();
            Construcao_MaterialDAO construcao_materialdao = new Construcao_MaterialDAO(con);
            construcao_materialdao.DeletarConstrucao_Material(Id);
                   
            DefaultTableModel tableMatCons = (DefaultTableModel) jTable1.getModel();//Tabela
            tableMatCons.removeRow(jTable1.getSelectedRow());
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir!");
        }  
    }//GEN-LAST:event_jExcluirActionPerformed

    private boolean isNullOrEmpty(String s) {
        return s == null || s.isEmpty();
    }
    
    private void apagar(){
        DefaultTableModel tableMatCons = (DefaultTableModel) jTable1.getModel();//Tabela
        while(tableMatCons.getRowCount() != 0){
                tableMatCons.removeRow(0);                
            }
    }
    
    private void recupera(){
        EstabelecerConexao con = new EstabelecerConexao();                
        Construcao_MaterialDAO construcao_matdao = new Construcao_MaterialDAO(con);
                
        ArrayList <Construcao_Material> lista = new ArrayList();
        lista = construcao_matdao.RecuperarTudo();
        
        //Recuperar os Funcionarios do Banco de Dados e adiciona na JTable
        DefaultTableModel tabConsMat = (DefaultTableModel) jTable1.getModel();
        for(Construcao_Material c: lista){            
            Object[] objConsMat = {c.getId(),c.getId_Construcao(), c.getId_Material()};
            tabConsMat.addRow(objConsMat);
        }  
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JButton jExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtIDC;
    private javax.swing.JTextField txtIDM;
    // End of variables declaration//GEN-END:variables

}
