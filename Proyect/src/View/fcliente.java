/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author AdminSena
 */
public class fcliente extends javax.swing.JFrame {

    /**
     * Creates new form fcliente
     */
    public fcliente() {
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

        jPanel1 = new javax.swing.JPanel();
        a = new javax.swing.JLabel();
        JBACK_Client = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLNombre = new javax.swing.JLabel();
        jLid = new javax.swing.JLabel();
        jLApellido = new javax.swing.JLabel();
        JTClient_ID = new javax.swing.JTextField();
        JTClient_Nombre = new javax.swing.JTextField();
        JTClient_Apellido = new javax.swing.JTextField();
        JBClient_Mostrar = new javax.swing.JButton();
        JBUSCAR_CLient = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable_Cliente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        a.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        a.setForeground(new java.awt.Color(255, 255, 255));
        a.setText("Formulario de Cliente");
        jPanel1.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 40));

        JBACK_Client.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBACK_Client.setText("<<");
        JBACK_Client.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBACK_Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBACK_ClientActionPerformed(evt);
            }
        });
        jPanel1.add(JBACK_Client, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 986, -1));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 51, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLNombre.setText("Nombre");
        jPanel2.add(jLNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLid.setText("Id");
        jPanel2.add(jLid, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLApellido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLApellido.setText("Apellido");
        jPanel2.add(jLApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        JTClient_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTClient_IDActionPerformed(evt);
            }
        });
        jPanel2.add(JTClient_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 92, 160, 20));

        JTClient_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTClient_NombreActionPerformed(evt);
            }
        });
        jPanel2.add(JTClient_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 160, 20));

        JTClient_Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTClient_ApellidoActionPerformed(evt);
            }
        });
        jPanel2.add(JTClient_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 152, 160, 20));

        JBClient_Mostrar.setText("Mostrar");
        JBClient_Mostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBClient_Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBClient_MostrarActionPerformed(evt);
            }
        });
        jPanel2.add(JBClient_Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, 20));

        JBUSCAR_CLient.setText("...");
        JBUSCAR_CLient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(JBUSCAR_CLient, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 102, 330, 280));

        JTable_Cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(JTable_Cliente);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTClient_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTClient_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTClient_IDActionPerformed

    private void JTClient_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTClient_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTClient_NombreActionPerformed

    private void JTClient_ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTClient_ApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTClient_ApellidoActionPerformed

    private void JBACK_ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBACK_ClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBACK_ClientActionPerformed

    private void JBClient_MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBClient_MostrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBClient_MostrarActionPerformed

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
            java.util.logging.Logger.getLogger(fcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fcliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton JBACK_Client;
    public javax.swing.JButton JBClient_Mostrar;
    public javax.swing.JButton JBUSCAR_CLient;
    public javax.swing.JTextField JTClient_Apellido;
    public javax.swing.JTextField JTClient_ID;
    public javax.swing.JTextField JTClient_Nombre;
    public javax.swing.JTable JTable_Cliente;
    private javax.swing.JLabel a;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLid;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
