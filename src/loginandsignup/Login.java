/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginandsignup;

import TataUsaha.HomeTataUsaha;
import koneksi.koneksi;
import Guru.HomeGuru;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    private int userId;
    private String username;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        email = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        LoginBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        email.setBackground(new java.awt.Color(235, 239, 255));
        email.setBorder(null);
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 339, 310, 20));

        password.setBackground(new java.awt.Color(235, 239, 255));
        password.setBorder(null);
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 407, 310, 20));

        LoginBtn.setBackground(new java.awt.Color(95, 207, 248));
        LoginBtn.setForeground(new java.awt.Color(255, 225, 255));
        LoginBtn.setText("Login");
        LoginBtn.setBorder(null);
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(LoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 474, 310, 22));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Login Pagelogin page.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        LoginMethod();
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFocusGained

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFocusLost

    public void LoginMethod() {
        String Email, Password, query, fname = null, passDb = null;
        int notFound = 0;

        try {
            Connection conn = (Connection) koneksi.koneksiDB();
            Statement st = conn.createStatement();

            if ("".equals(email.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Email tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            } else if ("".equals(password.getText())) {
                JOptionPane.showMessageDialog(new JFrame(), "Password tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                Email = email.getText();
                Password = password.getText();

                query = "SELECT * FROM users WHERE email = '" + Email + "'";
                ResultSet rs = st.executeQuery(query);
                int userIdFromDb = 0;
                while (rs.next()) {
                    passDb = rs.getString("password");
                    fname = rs.getString("full_name");
                    userIdFromDb = rs.getInt("nip");
                    int role = rs.getInt("role_id");
                    notFound = 1;

                    if (Password.equals(passDb)) {
                        userId = userIdFromDb;
                        username = fname;

                        if (role == 1) {
                            HomeTataUsaha HomeFrame = new HomeTataUsaha(userId, username);
                            HomeFrame.setUserId(userIdFromDb);
                            HomeFrame.setUser(fname);
                            HomeFrame.setVisible(true);
                            HomeFrame.pack();
                            HomeFrame.setLocationRelativeTo(null);
                            this.dispose();
                        } else if (role == 2) {
                            HomeGuru homeGuru = new HomeGuru(userId, username);
                            homeGuru.setVisible(true);
                            this.dispose();
                        }
                        return;
                    } else {
                        JOptionPane.showMessageDialog(new JFrame(), "Password salah!", "Error", JOptionPane.ERROR_MESSAGE);
                        password.setText("");
                        return;
                    }
                }

                if (notFound == 0) {
                    JOptionPane.showMessageDialog(new JFrame(), "Email tidak ada!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (Exception e) {
            System.out.println("Error!" + e.getMessage());
        }
    }

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBtn;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField password;
    // End of variables declaration//GEN-END:variables
}
