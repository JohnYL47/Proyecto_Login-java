/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author SENA
 */
public class fproducto extends javax.swing.JFrame {

    /**
     * Creates new form fproducto
     */
    public fproducto() {
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

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTProductos_Id = new javax.swing.JTextField();
        JTProductos_Nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JPComboBox_Categoria = new javax.swing.JComboBox<>();
        JTProductos_Precio = new javax.swing.JTextField();
        JBProductos_Guardar = new javax.swing.JButton();
        JBProductos_Mostrar = new javax.swing.JButton();
        JBProductos_Buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable_Productos = new javax.swing.JTable();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Formulario de productos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 102, 204))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Id");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("categoria");

<<<<<<< HEAD
        jTid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTid.addActionListener(new java.awt.event.ActionListener() {
=======
        JTProductos_Id.addActionListener(new java.awt.event.ActionListener() {
>>>>>>> 9b41ae2d6970dc797c8d4f5d9661fd13d89c16c3
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTProductos_IdActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        jTnombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTnombre.addActionListener(new java.awt.event.ActionListener() {
=======
        JTProductos_Nombre.addActionListener(new java.awt.event.ActionListener() {
>>>>>>> 9b41ae2d6970dc797c8d4f5d9661fd13d89c16c3
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTProductos_NombreActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("precio");

<<<<<<< HEAD
        jcbcategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Granos", "frutas", "verduras", "cereales", "tuberculos", "lacteos", "bebidas" }));
        jcbcategoria.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jcbcategoria.addActionListener(new java.awt.event.ActionListener() {
=======
        JPComboBox_Categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Granos", "frutas", "verduras", "cereales", "tuberculos", "lacteos", "bebidas" }));
        JPComboBox_Categoria.addActionListener(new java.awt.event.ActionListener() {
>>>>>>> 9b41ae2d6970dc797c8d4f5d9661fd13d89c16c3
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPComboBox_CategoriaActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        jTprecio.setText("$");
        jTprecio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTprecio.addActionListener(new java.awt.event.ActionListener() {
=======
        JTProductos_Precio.setText("$");
        JTProductos_Precio.addActionListener(new java.awt.event.ActionListener() {
>>>>>>> 9b41ae2d6970dc797c8d4f5d9661fd13d89c16c3
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTProductos_PrecioActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        jBguardar.setText("Guardar");
        jBguardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jBmostrar.setText("Mostrar");
        jBmostrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBmostrar.addActionListener(new java.awt.event.ActionListener() {
=======
        JBProductos_Guardar.setText("Guardar");

        JBProductos_Mostrar.setText("Mostrar");
        JBProductos_Mostrar.addActionListener(new java.awt.event.ActionListener() {
>>>>>>> 9b41ae2d6970dc797c8d4f5d9661fd13d89c16c3
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBProductos_MostrarActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        jBbuscar.setText("Buscar");
        jBbuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
=======
        JBProductos_Buscar.setText("Buscar");
>>>>>>> 9b41ae2d6970dc797c8d4f5d9661fd13d89c16c3

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
<<<<<<< HEAD
                            .addComponent(jTid)
                            .addComponent(jTnombre)
                            .addComponent(jTprecio)
                            .addComponent(jcbcategoria, 0, 139, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBguardar)
=======
                            .addComponent(JTProductos_Id)
                            .addComponent(JTProductos_Nombre)
                            .addComponent(JTProductos_Precio)
                            .addComponent(JPComboBox_Categoria, 0, 139, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(JBProductos_Guardar)
>>>>>>> 9b41ae2d6970dc797c8d4f5d9661fd13d89c16c3
                        .addGap(18, 18, 18)
                        .addComponent(JBProductos_Mostrar)
                        .addGap(18, 18, 18)
                        .addComponent(JBProductos_Buscar)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(JTProductos_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTProductos_Nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD
                    .addComponent(jTprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
=======
                    .addComponent(JTProductos_Precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPComboBox_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
>>>>>>> 9b41ae2d6970dc797c8d4f5d9661fd13d89c16c3
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBProductos_Guardar)
                    .addComponent(JBProductos_Mostrar)
                    .addComponent(JBProductos_Buscar))
                .addGap(14, 14, 14))
        );

        JTable_Productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(JTable_Productos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTProductos_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTProductos_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTProductos_IdActionPerformed

    private void JTProductos_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTProductos_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTProductos_NombreActionPerformed

    private void JPComboBox_CategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPComboBox_CategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JPComboBox_CategoriaActionPerformed

    private void JTProductos_PrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTProductos_PrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTProductos_PrecioActionPerformed

    private void JBProductos_MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBProductos_MostrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBProductos_MostrarActionPerformed

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
            java.util.logging.Logger.getLogger(fproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fproducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fproducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBProductos_Buscar;
    private javax.swing.JButton JBProductos_Guardar;
    private javax.swing.JButton JBProductos_Mostrar;
    private javax.swing.JComboBox<String> JPComboBox_Categoria;
    private javax.swing.JTextField JTProductos_Id;
    private javax.swing.JTextField JTProductos_Nombre;
    private javax.swing.JTextField JTProductos_Precio;
    private javax.swing.JTable JTable_Productos;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
