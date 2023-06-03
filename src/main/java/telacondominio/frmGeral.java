/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telacondominio;

/**
 *
 * @author leafar
 */
public class frmGeral extends javax.swing.JFrame {

    /**
     * Creates new form frmGeral
     */
    public frmGeral() {
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

        dpnTelas = new javax.swing.JDesktopPane();
        menubarMenu = new javax.swing.JMenuBar();
        mCadastros = new javax.swing.JMenu();
        mmCadastroMorador = new javax.swing.JMenuItem();
        mmAdministrador = new javax.swing.JMenuItem();
        mSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);

        javax.swing.GroupLayout dpnTelasLayout = new javax.swing.GroupLayout(dpnTelas);
        dpnTelas.setLayout(dpnTelasLayout);
        dpnTelasLayout.setHorizontalGroup(
            dpnTelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
        );
        dpnTelasLayout.setVerticalGroup(
            dpnTelasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        mCadastros.setText("Cadastro");

        mmCadastroMorador.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mmCadastroMorador.setText("Morador");
        mmCadastroMorador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmCadastroMoradorActionPerformed(evt);
            }
        });
        mCadastros.add(mmCadastroMorador);

        mmAdministrador.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mmAdministrador.setText("Administrador");
        mCadastros.add(mmAdministrador);

        menubarMenu.add(mCadastros);

        mSair.setText("Sair");
        mSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mSairMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mSairMouseReleased(evt);
            }
        });
        mSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSairActionPerformed(evt);
            }
        });
        menubarMenu.add(mSair);

        setJMenuBar(menubarMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnTelas, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnTelas, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mmCadastroMoradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmCadastroMoradorActionPerformed
        // TODO add your handling code here:
        dpnTelas.removeAll();
        ifrmCadastroAdm frameAdm = new ifrmCadastroAdm();
        dpnTelas.add(frameAdm).setVisible(true);
    }//GEN-LAST:event_mmCadastroMoradorActionPerformed

    private void mSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSairActionPerformed
        
    }//GEN-LAST:event_mSairActionPerformed

    private void mSairMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mSairMouseReleased
        // TODO add your handling code here:
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mSairMouseReleased

    private void mSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mSairMouseClicked
        // TODO add your handling code here:
        frmLogin frameLogin = new frmLogin();
        frameLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mSairMouseClicked

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
            java.util.logging.Logger.getLogger(frmGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmGeral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpnTelas;
    private javax.swing.JMenu mCadastros;
    private javax.swing.JMenu mSair;
    private javax.swing.JMenuBar menubarMenu;
    private javax.swing.JMenuItem mmAdministrador;
    private javax.swing.JMenuItem mmCadastroMorador;
    // End of variables declaration//GEN-END:variables
}