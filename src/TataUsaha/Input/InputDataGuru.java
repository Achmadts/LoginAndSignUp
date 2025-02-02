package TataUsaha.Input;

import TataUsaha.HomeTataUsaha;
import controllers.InputDataGuruController;
import java.awt.Color;
import models.InputDataGuruModel;
import javax.swing.JOptionPane;

public class InputDataGuru extends javax.swing.JFrame {

    private HomeTataUsaha homeFrame;
    private InputDataGuruController controller;
    private int userId;
    private String userName;

    public InputDataGuru(HomeTataUsaha homeFrame, String userName, int userId) {
        initComponents();
        this.homeFrame = homeFrame;
        this.userName = userName;
        this.userId = userId;
        controller = new InputDataGuruController();
        user.setText(userName);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nipGuru = new javax.swing.JTextField();
        namaGuru = new javax.swing.JTextField();
        emailGuru = new javax.swing.JTextField();
        passwordGuru = new javax.swing.JPasswordField();
        mapelGuru = new javax.swing.JComboBox<>();
        btnKirimDataGuru = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        user = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INPUT DATA SISWA");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INPUT DATA GURU");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nipGuru.setBackground(new java.awt.Color(255, 255, 255));
        nipGuru.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        nipGuru.setForeground(new java.awt.Color(60, 63, 65));
        nipGuru.setBorder(null);
        nipGuru.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nipGuruFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nipGuruFocusLost(evt);
            }
        });
        nipGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nipGuruActionPerformed(evt);
            }
        });
        getContentPane().add(nipGuru, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 135, 550, 22));

        namaGuru.setBackground(new java.awt.Color(255, 255, 255));
        namaGuru.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        namaGuru.setForeground(new java.awt.Color(60, 63, 65));
        namaGuru.setBorder(null);
        namaGuru.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                namaGuruFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                namaGuruFocusLost(evt);
            }
        });
        namaGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaGuruActionPerformed(evt);
            }
        });
        getContentPane().add(namaGuru, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 198, 550, 22));

        emailGuru.setBackground(new java.awt.Color(255, 255, 255));
        emailGuru.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        emailGuru.setForeground(new java.awt.Color(60, 63, 65));
        emailGuru.setBorder(null);
        emailGuru.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailGuruFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailGuruFocusLost(evt);
            }
        });
        getContentPane().add(emailGuru, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 262, 550, 22));

        passwordGuru.setBackground(new java.awt.Color(255, 255, 255));
        passwordGuru.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        passwordGuru.setForeground(new java.awt.Color(60, 63, 65));
        passwordGuru.setBorder(null);
        passwordGuru.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordGuruFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordGuruFocusLost(evt);
            }
        });
        getContentPane().add(passwordGuru, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 326, 550, 22));

        mapelGuru.setBackground(new java.awt.Color(255, 255, 255));
        mapelGuru.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        mapelGuru.setForeground(new java.awt.Color(60, 63, 65));
        mapelGuru.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PBT", "PPB", "PWB", "BSD" }));
        mapelGuru.setBorder(null);
        getContentPane().add(mapelGuru, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 389, 550, 22));

        btnKirimDataGuru.setBackground(new java.awt.Color(0, 102, 102));
        btnKirimDataGuru.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        btnKirimDataGuru.setForeground(new java.awt.Color(255, 255, 255));
        btnKirimDataGuru.setText("SUBMIT");
        btnKirimDataGuru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKirimDataGuruActionPerformed(evt);
            }
        });
        getContentPane().add(btnKirimDataGuru, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 463, 100, 44));

        btnBack.setBackground(new java.awt.Color(0, 102, 102));
        btnBack.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 463, 100, 44));

        user.setFont(new java.awt.Font("Segoe UI Historic", 1, 12)); // NOI18N
        user.setForeground(new java.awt.Color(60, 63, 65));
        user.setText("name");
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/InputDataGuru.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nipGuruFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nipGuruFocusGained
        if (nipGuru.getText().equals("Masukkan NIP Guru")) {
            nipGuru.setText("");
            nipGuru.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_nipGuruFocusGained

    private void nipGuruFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nipGuruFocusLost
        if (nipGuru.getText().equals("")) {
            nipGuru.setText("Masukkan NIP Guru");
            nipGuru.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_nipGuruFocusLost

    private void namaGuruFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namaGuruFocusGained
        if (namaGuru.getText().equals("Masukkan Nama Guru")) {
            namaGuru.setText("");
            namaGuru.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_namaGuruFocusGained

    private void namaGuruFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namaGuruFocusLost
        if (namaGuru.getText().equals("")) {
            namaGuru.setText("Masukkan Nama Guru");
            namaGuru.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_namaGuruFocusLost

    private void emailGuruFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailGuruFocusGained
        if (emailGuru.getText().equals("Masukkan Email Guru")) {
            emailGuru.setText("");
            emailGuru.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_emailGuruFocusGained

    private void emailGuruFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailGuruFocusLost
        if (emailGuru.getText().equals("")) {
            emailGuru.setText("Masukkan Email Guru");
            emailGuru.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_emailGuruFocusLost

    private void namaGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaGuruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaGuruActionPerformed

    private void btnKirimDataGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKirimDataGuruActionPerformed
        String nip = nipGuru.getText();
        String nama = namaGuru.getText();
        String email = emailGuru.getText();
        String password = passwordGuru.getText();
        String selectedMapel = (String) mapelGuru.getSelectedItem();

        InputDataGuruModel guru = new InputDataGuruModel(nip, nama, email, password, selectedMapel);

        boolean success = controller.insertDataGuru(guru);
        if (success) {
            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Success", JOptionPane.INFORMATION_MESSAGE);
            nipGuru.setText("");
            namaGuru.setText("");
            emailGuru.setText("");
            passwordGuru.setText("");
            mapelGuru.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_btnKirimDataGuruActionPerformed

    private void passwordGuruFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordGuruFocusGained

    }//GEN-LAST:event_passwordGuruFocusGained

    private void passwordGuruFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordGuruFocusLost

    }//GEN-LAST:event_passwordGuruFocusLost

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        String hariDiPilih = homeFrame.getComboBoxHari().getSelectedItem().toString();
        homeFrame.setVisible(true);
        homeFrame.loadJadwalData(hariDiPilih);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void nipGuruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nipGuruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nipGuruActionPerformed

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
            java.util.logging.Logger.getLogger(InputDataGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputDataGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputDataGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputDataGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                HomeTataUsaha homeFrame = new HomeTataUsaha();
//                String userName = "NamaPenggunaTest";
//                int userId = 1;
//                new InputDataGuru(homeFrame, userName, userId).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnKirimDataGuru;
    private javax.swing.JTextField emailGuru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> mapelGuru;
    private javax.swing.JTextField namaGuru;
    private javax.swing.JTextField nipGuru;
    private javax.swing.JPasswordField passwordGuru;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
