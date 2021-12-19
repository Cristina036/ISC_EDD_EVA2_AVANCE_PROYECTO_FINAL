
package eva2_proyecto_final_team_donut;

import javax.swing.JOptionPane;

/**
 *
 * @author TEAM DONUT
 */
public class LOGIN extends javax.swing.JFrame {

    /**
     * Creates new form LOGIN
     */
    public LOGIN() {
        initComponents();
        this.setTitle("Simple Academy");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Regresar2 = new javax.swing.JButton();
        Contraseña = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        Usuario = new javax.swing.JLabel();
        FONDO = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Regresar2.setBackground(new java.awt.Color(255, 255, 255));
        Regresar2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Regresar2.setForeground(new java.awt.Color(51, 51, 51));
        Regresar2.setText("REGRESAR");
        Regresar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Regresar2MouseClicked(evt);
            }
        });
        Regresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Regresar2ActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 425, 130, 30));

        Contraseña.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(0, 0, 0));
        Contraseña.setText("Contraseña");
        getContentPane().add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 120, 50));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 275, 300, 40));

        btnIngresar.setText("INGRESAR");
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 348, 200, 40));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 300, 40));

        Usuario.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Usuario.setForeground(new java.awt.Color(0, 0, 0));
        Usuario.setText("Usuario");
        getContentPane().add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 100, 30));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eva2_proyecto_final_team_donut/Imagenes/SA2_1.png"))); // NOI18N
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 460));

        jPasswordField2.setText("jPasswordField2");
        getContentPane().add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        //Usuarios y passwords autorizados

        String Usuario = "Ana Cristina Valenzuela";
        String Contraseña = "1234";

        String password = new String(jPasswordField1.getPassword());
        if (jTextField1.getText().equals(Usuario) && password.equals(Contraseña)) {
JOptionPane.showMessageDialog(null, "EALE EALE");
            /*this.setVisible(false);
            Menu e = new Menu();
            e.setVisible(true);
*/
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresarMouseClicked

    private void Regresar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Regresar2MouseClicked

    }//GEN-LAST:event_Regresar2MouseClicked

    private void Regresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Regresar2ActionPerformed
        this.setVisible(false);
        Menu m = new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_Regresar2ActionPerformed

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
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contraseña;
    private javax.swing.JLabel FONDO;
    private javax.swing.JButton Regresar2;
    private javax.swing.JLabel Usuario;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
