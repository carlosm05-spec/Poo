

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement; 
import javax.swing.table.DefaultTableModel;
import Conexion.conexion;
import PDF.pdf;

public class MenuCrud extends javax.swing.JFrame {

    public MenuCrud() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Agregar = new javax.swing.JLabel();
        Agregar1 = new javax.swing.JLabel();
        Agregar2 = new javax.swing.JLabel();
        Agregar3 = new javax.swing.JLabel();
        Agregar4 = new javax.swing.JLabel();
        Insertar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        Lista = new javax.swing.JButton();
        pdf = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Agregar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Agregar.setForeground(new java.awt.Color(0, 0, 0));
        Agregar.setText("Agregar Producto");

        Agregar1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Agregar1.setForeground(new java.awt.Color(0, 0, 0));
        Agregar1.setText("Eliminar Producto");

        Agregar2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Agregar2.setForeground(new java.awt.Color(0, 0, 0));
        Agregar2.setText("Actualizar Producto");

        Agregar3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Agregar3.setForeground(new java.awt.Color(0, 0, 0));
        Agregar3.setText("Ver Listado de Productos");

        Agregar4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Agregar4.setForeground(new java.awt.Color(0, 0, 0));
        Agregar4.setText("Generar PDF");

        Insertar.setBackground(new java.awt.Color(153, 153, 153));
        Insertar.setForeground(new java.awt.Color(204, 255, 204));
        Insertar.setText("Ir");
        Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertarActionPerformed(evt);
            }
        });

        Eliminar.setBackground(new java.awt.Color(153, 153, 153));
        Eliminar.setForeground(new java.awt.Color(204, 255, 204));
        Eliminar.setText("Ir");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Actualizar.setBackground(new java.awt.Color(153, 153, 153));
        Actualizar.setForeground(new java.awt.Color(204, 255, 204));
        Actualizar.setText("Ir");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        Lista.setBackground(new java.awt.Color(153, 153, 153));
        Lista.setForeground(new java.awt.Color(204, 255, 204));
        Lista.setText("Ir");
        Lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaActionPerformed(evt);
            }
        });

        pdf.setBackground(new java.awt.Color(153, 153, 153));
        pdf.setForeground(new java.awt.Color(204, 255, 204));
        pdf.setText("Generar");
        pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("!Bienvenido! ¿Que va a realizar en el dia de hoy?");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Agregar3)
                                .addGap(57, 57, 57)
                                .addComponent(Lista))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Agregar4)
                                .addGap(60, 60, 60)
                                .addComponent(pdf)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Agregar2)
                                .addGap(71, 71, 71)
                                .addComponent(Actualizar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Agregar)
                                .addGap(73, 73, 73)
                                .addComponent(Insertar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Agregar1)
                                .addGap(67, 67, 67)
                                .addComponent(Eliminar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(63, 63, 63))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Agregar)
                            .addComponent(Insertar))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Agregar1)
                            .addComponent(Eliminar)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agregar2)
                    .addComponent(Actualizar))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agregar3)
                    .addComponent(Lista))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agregar4)
                    .addComponent(pdf))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
      IrEliminar A = new IrEliminar();
            A.setVisible(true);
            this.setVisible(false);
            MenuCrud L = new MenuCrud();
            L.dispose();
    }//GEN-LAST:event_EliminarActionPerformed

    private void pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfActionPerformed

        pdf pdfGen = new pdf();
    
    String ruta = "resumen_compra.pdf";
    
    pdfGen.generarPDF(ruta);
    
    JOptionPane.showMessageDialog(this, "PDF generado en: " + ruta);
        
    }//GEN-LAST:event_pdfActionPerformed

    private void ListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaActionPerformed
        IrLista A = new IrLista();
            A.setVisible(true);
            this.setVisible(false);
            MenuCrud L = new MenuCrud();
            L.dispose();
    }//GEN-LAST:event_ListaActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        IrActualizar A = new IrActualizar();
            A.setVisible(true);
            this.setVisible(false);
            MenuCrud L = new MenuCrud();
            L.dispose();
    }//GEN-LAST:event_ActualizarActionPerformed

    private void InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertarActionPerformed
        IrAgregar A = new IrAgregar();
            A.setVisible(true);
            this.setVisible(false);
            MenuCrud L = new MenuCrud();
            L.dispose();
    }//GEN-LAST:event_InsertarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCrud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JLabel Agregar;
    private javax.swing.JLabel Agregar1;
    private javax.swing.JLabel Agregar2;
    private javax.swing.JLabel Agregar3;
    private javax.swing.JLabel Agregar4;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Insertar;
    private javax.swing.JButton Lista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton pdf;
    // End of variables declaration//GEN-END:variables
}
