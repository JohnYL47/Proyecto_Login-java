/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author SENA
 */
public class JFvendedor extends javax.swing.JFrame {

    /**
     * Creates new form fvendedor
     */
    public JFvendedor() {
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
        jPanel3 = new javax.swing.JPanel();
        a = new javax.swing.JLabel();
        JBACK_Vendedor = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLNombre = new javax.swing.JLabel();
        jLid = new javax.swing.JLabel();
        jLApellido = new javax.swing.JLabel();
        JTVENDEDOR_ID = new javax.swing.JTextField();
        JTVENDEDOR_Nombre = new javax.swing.JTextField();
        JTVENDEDOR_Apellido = new javax.swing.JTextField();
        JBVENDEDOR_Mostrar = new javax.swing.JButton();
        JBVENDEDOR_Buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable_Vendedor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        a.setBackground(new java.awt.Color(0, 102, 255));
        a.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        a.setForeground(new java.awt.Color(255, 255, 255));
        a.setText("Formulario de Vendedor");
        jPanel3.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        JBACK_Vendedor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JBACK_Vendedor.setText("<<");
        JBACK_Vendedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBACK_Vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBACK_VendedorActionPerformed(evt);
            }
        });
        jPanel3.add(JBACK_Vendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -2, 990, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "vendedores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 51, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLNombre.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLNombre.setText("Nombre");
        jPanel2.add(jLNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLid.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLid.setText("Id");
        jPanel2.add(jLid, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, 20));

        jLApellido.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        jLApellido.setText("Apellido");
        jPanel2.add(jLApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        JTVENDEDOR_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTVENDEDOR_IDActionPerformed(evt);
            }
        });
        jPanel2.add(JTVENDEDOR_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 144, -1));

        JTVENDEDOR_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTVENDEDOR_NombreActionPerformed(evt);
            }
        });
        jPanel2.add(JTVENDEDOR_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 144, -1));

        JTVENDEDOR_Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTVENDEDOR_ApellidoActionPerformed(evt);
            }
        });
        jPanel2.add(JTVENDEDOR_Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 144, 20));

        JBVENDEDOR_Mostrar.setBackground(new java.awt.Color(204, 204, 204));
        JBVENDEDOR_Mostrar.setText("Mostrar");
        JBVENDEDOR_Mostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(JBVENDEDOR_Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        JBVENDEDOR_Buscar.setBackground(new java.awt.Color(204, 204, 204));
        JBVENDEDOR_Buscar.setText("...");
        JBVENDEDOR_Buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBVENDEDOR_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBVENDEDOR_BuscarActionPerformed(evt);
            }
        });
        jPanel2.add(JBVENDEDOR_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 320, 280));

        JTable_Vendedor.setModel(new javax.swing.table.DefaultTableModel(
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
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(JTable_Vendedor);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, 340));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTVENDEDOR_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTVENDEDOR_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTVENDEDOR_IDActionPerformed

    private void JTVENDEDOR_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTVENDEDOR_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTVENDEDOR_NombreActionPerformed

    private void JTVENDEDOR_ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTVENDEDOR_ApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTVENDEDOR_ApellidoActionPerformed

    private void JBVENDEDOR_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBVENDEDOR_BuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBVENDEDOR_BuscarActionPerformed

    private void JBACK_VendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBACK_VendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBACK_VendedorActionPerformed

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
            java.util.logging.Logger.getLogger(JFvendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFvendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFvendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFvendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFvendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton JBACK_Vendedor;
    public javax.swing.JButton JBVENDEDOR_Buscar;
    public javax.swing.JButton JBVENDEDOR_Mostrar;
    public javax.swing.JTextField JTVENDEDOR_Apellido;
    public javax.swing.JTextField JTVENDEDOR_ID;
    public javax.swing.JTextField JTVENDEDOR_Nombre;
    public javax.swing.JTable JTable_Vendedor;
    private javax.swing.JLabel a;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLid;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
