/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construtoraInterface;
import construtoraInterface.janelaInterna1Cadastro;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
/**
 *
 * @author Neto
 */
public class janelaInterna1Cadastro extends javax.swing.JInternalFrame {

    /**
     * Creates new form janelaInterna1Cadastro
     */
    
    JButton jCadastraFunc;
    JButton jRetiraFunc;
    JDesktopPane jdesktop;
    
    public janelaInterna1Cadastro(JButton jCadastra, JButton jRetira, JDesktopPane jDesktopInterno1Func) {
        initComponents();
        jCadastraFunc = jCadastra;
        jRetiraFunc = jRetira;
        jdesktop = jDesktopInterno1Func;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jCadastrarFuncInterno1 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Nome");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 30, 320, 30);

        jTextField1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 102, 255));
        jPanel2.add(jTextField1);
        jTextField1.setBounds(20, 60, 320, 30);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Nascimento");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 130, 320, 30);
        jPanel2.add(jFormattedTextField1);
        jFormattedTextField1.setBounds(20, 160, 320, 30);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("Salário");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 230, 320, 30);

        jTextField2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 102, 255));
        jPanel2.add(jTextField2);
        jTextField2.setBounds(20, 260, 320, 30);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Sexo");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 320, 320, 30);

        jComboBox1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 102, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino", "Outro" }));
        jComboBox1.setBorder(null);
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(20, 350, 320, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/construtoraInterface/Images/download.png"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(380, 20, 220, 230);

        jCadastrarFuncInterno1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jCadastrarFuncInterno1.setForeground(new java.awt.Color(0, 102, 255));
        jCadastrarFuncInterno1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/construtoraInterface/Images/Add User Group Woman Man_50px.png"))); // NOI18N
        jCadastrarFuncInterno1.setText("Cadastrar");
        jCadastrarFuncInterno1.setContentAreaFilled(false);
        jCadastrarFuncInterno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarFuncInterno1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCadastrarFuncInterno1);
        jCadastrarFuncInterno1.setBounds(410, 270, 170, 50);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 620, 470);
    }// </editor-fold>//GEN-END:initComponents

    private void jCadastrarFuncInterno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarFuncInterno1ActionPerformed
        
        
        
        setVisible(false);
        //jCadastraFunc.setVisible(true);
        //jRetiraFunc.setVisible(true);
        //jdesktop.setVisible(true);
    }//GEN-LAST:event_jCadastrarFuncInterno1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCadastrarFuncInterno1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
