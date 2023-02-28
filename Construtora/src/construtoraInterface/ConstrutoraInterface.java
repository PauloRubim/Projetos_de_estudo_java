/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construtoraInterface;

import model.dao.EstabelecerConexao;
import model.bean.Construcao;
import model.bean.Funcionario;
import model.bean.Material;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
/**
 *
 * @author Neto
 */
public class ConstrutoraInterface extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    
    janelaInterna1 JanelaInterna1;
    janelaInterna2 JanelaInterna2;
    janelaInterna3 JanelaInterna3;
    
    ConstrucaoMaterial ConstrucaoMaterial;
    ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    ArrayList<Material> materiais = new ArrayList<Material>();
    ArrayList<Construcao> construcoes = new ArrayList<Construcao>();
    
    public ConstrutoraInterface() {
        initComponents();
        jDesktop.setVisible(true);
        EstabelecerConexao connection = new EstabelecerConexao();
        connection.getConnection();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFundo = new javax.swing.JPanel();
        jPanelAzul = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabelBotaoFunc = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabelBotaoMat = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabelBotaoConst = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jDesktop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Construtora");
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanelFundo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFundo.setForeground(new java.awt.Color(0, 102, 255));
        jPanelFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelAzul.setBackground(new java.awt.Color(0, 51, 255));
        jPanelAzul.setForeground(new java.awt.Color(255, 255, 255));
        jPanelAzul.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Construção Civil");
        jPanelAzul.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 48, 250, 70));

        jPanel3.setBackground(new java.awt.Color(51, 102, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/construtoraInterface/Images/Worker_50px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelAzul.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 60, 60));

        jPanel4.setBackground(new java.awt.Color(51, 102, 255));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jLabelBotaoFunc.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabelBotaoFunc.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBotaoFunc.setText("Funcionários");
        jLabelBotaoFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBotaoFuncMouseClicked(evt);
            }
        });
        jLabelBotaoFunc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabelBotaoFuncKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jLabelBotaoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelBotaoFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanelAzul.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 250, 60));

        jPanel5.setBackground(new java.awt.Color(51, 102, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/construtoraInterface/Images/Product_52px.png"))); // NOI18N
        jLabel4.setToolTipText("");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanelAzul.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 70, 60));

        jPanel6.setBackground(new java.awt.Color(51, 102, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/construtoraInterface/Images/Construction_50px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanelAzul.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 60, 60));

        jPanel7.setBackground(new java.awt.Color(51, 102, 255));

        jLabelBotaoMat.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabelBotaoMat.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBotaoMat.setText("Materiais");
        jLabelBotaoMat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBotaoMatMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabelBotaoMat, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelBotaoMat, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanelAzul.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 250, 60));

        jPanel8.setBackground(new java.awt.Color(51, 102, 255));

        jLabelBotaoConst.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabelBotaoConst.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBotaoConst.setText("Construções");
        jLabelBotaoConst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBotaoConstMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabelBotaoConst, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelBotaoConst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanelAzul.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 250, 60));
        jPanelAzul.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 102, 240, 10));

        jPanel9.setBackground(new java.awt.Color(51, 102, 255));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Material Construção");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanelAzul.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 230, 60));

        jPanel11.setBackground(new java.awt.Color(51, 102, 255));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/construtoraInterface/Images/Maintenance_50px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanelAzul.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 70, 60));

        jPanelFundo.add(jPanelAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));

        jLabel2.setBackground(new java.awt.Color(0, 51, 255));
        jLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/construtoraInterface/Images/Close Window_64px.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelFundo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(886, 0, 32, 30));

        jPanel10.setBackground(new java.awt.Color(0, 102, 255));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/construtoraInterface/Images/Minimize Window_64px.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelFundo.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 32, 30));

        jDesktop.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jDesktop.add(jPanel1);
        jPanel1.setBounds(0, -28, 620, 30);

        jPanelFundo.add(jDesktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 620, 470));

        getContentPane().add(jPanelFundo);
        jPanelFundo.setBounds(0, 0, 920, 500);

        setSize(new java.awt.Dimension(918, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelBotaoFuncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBotaoFuncMouseClicked
        if(JanelaInterna1 == null){
            if(JanelaInterna2 != null && JanelaInterna3 != null){
                JanelaInterna2.setVisible(false);
                JanelaInterna3.setVisible(false);
            }     
            JanelaInterna1 = new janelaInterna1(this.jDesktop);
            jDesktop.add(JanelaInterna1);
            JanelaInterna1.setVisible(true);
            ((BasicInternalFrameUI)JanelaInterna1.getUI()).setNorthPane(null);
            JanelaInterna1.setBorder(null);//retirar bordas
        }else{
            if(JanelaInterna2 != null){
                JanelaInterna2.setVisible(false);                
            }   
            if(JanelaInterna3 != null){
               JanelaInterna3.setVisible(false);
            }
            if(ConstrucaoMaterial != null){
                ConstrucaoMaterial.setVisible(false);
            }
            JanelaInterna1.setVisible(true);
        }
    }//GEN-LAST:event_jLabelBotaoFuncMouseClicked

    private void jLabelBotaoFuncKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabelBotaoFuncKeyPressed

    }//GEN-LAST:event_jLabelBotaoFuncKeyPressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Sair", dialog);
        if(result == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        this.setState(ConstrutoraInterface.ICONIFIED);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jLabelBotaoMatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBotaoMatMouseClicked
        if(JanelaInterna2 == null){
            if(JanelaInterna1 != null && JanelaInterna3 != null){
                JanelaInterna1.setVisible(false);
                JanelaInterna3.setVisible(false);
            }     
            JanelaInterna2 = new janelaInterna2(materiais);
            jDesktop.add(JanelaInterna2);
            JanelaInterna2.setVisible(true);
            ((BasicInternalFrameUI)JanelaInterna2.getUI()).setNorthPane(null);
            JanelaInterna2.setBorder(null);//retirar bordas
        }else{
            if(JanelaInterna1 != null){
            JanelaInterna1.setVisible(false);                      
            }
            if(JanelaInterna3 != null){
                JanelaInterna3.setVisible(false); 
            }
            if(ConstrucaoMaterial != null){
                ConstrucaoMaterial.setVisible(false);
            }
            JanelaInterna2.setVisible(true);
    }//GEN-LAST:event_jLabelBotaoMatMouseClicked

    }
    private void jLabelBotaoConstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBotaoConstMouseClicked
        if(JanelaInterna3 == null){
            if(JanelaInterna1 != null && JanelaInterna2 != null){
                JanelaInterna1.setVisible(false);
                JanelaInterna2.setVisible(false);
            }     
            JanelaInterna3 = new janelaInterna3(construcoes);
            jDesktop.add(JanelaInterna3);
            JanelaInterna3.setVisible(true);
            ((BasicInternalFrameUI)JanelaInterna3.getUI()).setNorthPane(null);
            JanelaInterna3.setBorder(null);//retirar bordas
        }else{
            if(JanelaInterna1 != null){
                JanelaInterna1.setVisible(false);                      
            }
            if(JanelaInterna2 != null){
                JanelaInterna2.setVisible(false);
            }
            if(ConstrucaoMaterial != null){
                ConstrucaoMaterial.setVisible(false);
            }
            JanelaInterna3.setVisible(true);
        }
    }//GEN-LAST:event_jLabelBotaoConstMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if(ConstrucaoMaterial == null){
            if(JanelaInterna1 != null && JanelaInterna2 != null){
                JanelaInterna1.setVisible(false);
                JanelaInterna2.setVisible(false);
            }     
            ConstrucaoMaterial = new ConstrucaoMaterial();
            jDesktop.add(ConstrucaoMaterial);
            ConstrucaoMaterial.setVisible(true);
            ((BasicInternalFrameUI)ConstrucaoMaterial.getUI()).setNorthPane(null);
            ConstrucaoMaterial.setBorder(null);//retirar bordas
        }else{
            if(JanelaInterna1 != null){
                JanelaInterna1.setVisible(false);                      
            }
            if(JanelaInterna2 != null){
                JanelaInterna2.setVisible(false);
            }
            if(JanelaInterna3 != null){
                JanelaInterna3.setVisible(false);
            }    
            ConstrucaoMaterial.setVisible(true);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(ConstrutoraInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConstrutoraInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConstrutoraInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConstrutoraInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConstrutoraInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelBotaoConst;
    private javax.swing.JLabel jLabelBotaoFunc;
    private javax.swing.JLabel jLabelBotaoMat;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelAzul;
    private javax.swing.JPanel jPanelFundo;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}