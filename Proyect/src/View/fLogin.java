/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author SENA
 */
public class fLogin extends javax.swing.JFrame {

    /**
     * Creates new form fLogin
     */
    public fLogin() {
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

        JTPassword_login = new javax.swing.JPanel();
        JTNombre_login = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JBGuardar_login = new javax.swing.JButton();
        JPassword_login = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTPassword_login.setBackground(new java.awt.Color(153, 255, 255));
        JTPassword_login.setForeground(new java.awt.Color(153, 204, 255));
        JTPassword_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        JTPassword_login.add(JTNombre_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 140, -1));

        jLabel1.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel1.setText("Password");
        JTPassword_login.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLabel2.setText("Usuario");
        JTPassword_login.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel3.setText("Ingresar Sesion");
        JTPassword_login.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        JBGuardar_login.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        JBGuardar_login.setText("Ingresar");
        JBGuardar_login.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JBGuardar_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JTPassword_login.add(JBGuardar_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));
        JTPassword_login.add(JPassword_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 140, -1));

        getContentPane().add(JTPassword_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(fLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton JBGuardar_login;
    public javax.swing.JPasswordField JPassword_login;
    public javax.swing.JTextField JTNombre_login;
    public javax.swing.JPanel JTPassword_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
