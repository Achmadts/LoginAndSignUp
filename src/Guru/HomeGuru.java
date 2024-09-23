package Guru;

import Guru.DataSiswa;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import loginandsignup.Login;
import models.GuruModel;
//import java.util.ArrayList;

public class HomeGuru extends javax.swing.JFrame {

    private int userId;

    public HomeGuru(int userId, String username) {
        this.userId = userId;
        initComponents();
        this.user.setText(username);
        String hariDiPilih = comboBoxHari.getSelectedItem().toString();
        loadJadwalData(hariDiPilih);
        comboBoxHari.addActionListener(e -> loadJadwalData(comboBoxHari.getSelectedItem().toString()));
        LogOutBtn.addActionListener(e -> logOut());
    }

    public void loadJadwalData(String hari) {
        GuruModel guruModel = new GuruModel(userId);
        DefaultTableModel jadwalModel = guruModel.getJadwalData(hari);
        jadwalTable.setModel(jadwalModel);
        guruModel.setJadwalTableRenderer(jadwalTable, jadwalModel);
    }

    private void logOut() {
        int response = JOptionPane.showConfirmDialog(this, "Yakin mau Logout?", "Confirm Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {
            Login LoginFrame = new Login();
            LoginFrame.setVisible(true);
            LoginFrame.pack();
            LoginFrame.setLocationRelativeTo(null);
            this.dispose();
        }
    }

    public JTable getJadwalTable() {
        return jadwalTable;
    }

    public JComboBox<String> getComboBoxHari() {
        return comboBoxHari;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jToggleButton1 = new javax.swing.JToggleButton();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        LogOutBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jadwalTable = new javax.swing.JTable();
        user = new java.awt.Label();
        comboBoxHari = new javax.swing.JComboBox<>();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        inputNilaiRPL1_59 = new javax.swing.JMenuItem();
        inputNilaiRPL1_60 = new javax.swing.JMenuItem();
        inputNilaiRPL1_61 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        inputNilaiRPL2_59 = new javax.swing.JMenuItem();
        inputNilaiRPL2_60 = new javax.swing.JMenuItem();
        inputNilaiRPL2_61 = new javax.swing.JMenuItem();
        LogOutBtnOld = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenu1.setText("jMenu1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        jMenuItem6.setText("jMenuItem6");

        jToggleButton1.setText("jToggleButton1");

        jMenuItem7.setText("jMenuItem7");

        jMenu2.setText("File");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("jMenu4");

        jMenu5.setText("jMenu5");

        jMenuItem8.setText("jMenuItem8");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jMenu6.setText("jMenu6");

        jMenuItem9.setText("jMenuItem9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GURU");

        LogOutBtn.setBackground(new java.awt.Color(204, 51, 255));
        LogOutBtn.setForeground(new java.awt.Color(255, 255, 255));
        LogOutBtn.setText("LOGOUT");
        LogOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBtnActionPerformed(evt);
            }
        });

        jadwalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "JAM KE", "JAM", "MAPEL", "NAMA GURU", "RUANG"
            }
        ));
        jScrollPane1.setViewportView(jadwalTable);

        user.setAlignment(java.awt.Label.RIGHT);
        user.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        user.setForeground(new java.awt.Color(204, 51, 255));
        user.setText("Name");

        comboBoxHari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SENIN", "SELASA", "RABU", "KAMIS", "JUMAT" }));
        comboBoxHari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxHariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LogOutBtn)
                                .addGap(0, 795, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(comboBoxHari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxHari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(LogOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu7.setText("Data");
        jMenu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu7ActionPerformed(evt);
            }
        });

        jMenu9.setText("RPL 1");

        inputNilaiRPL1_59.setText("59");
        inputNilaiRPL1_59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNilaiRPL1_59ActionPerformed(evt);
            }
        });
        jMenu9.add(inputNilaiRPL1_59);

        inputNilaiRPL1_60.setText("60");
        inputNilaiRPL1_60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNilaiRPL1_60ActionPerformed(evt);
            }
        });
        jMenu9.add(inputNilaiRPL1_60);

        inputNilaiRPL1_61.setText("61");
        inputNilaiRPL1_61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNilaiRPL1_61ActionPerformed(evt);
            }
        });
        jMenu9.add(inputNilaiRPL1_61);

        jMenu7.add(jMenu9);

        jMenu10.setText("RPL 2");

        inputNilaiRPL2_59.setText("59");
        inputNilaiRPL2_59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNilaiRPL2_59ActionPerformed(evt);
            }
        });
        jMenu10.add(inputNilaiRPL2_59);

        inputNilaiRPL2_60.setText("60");
        inputNilaiRPL2_60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNilaiRPL2_60ActionPerformed(evt);
            }
        });
        jMenu10.add(inputNilaiRPL2_60);

        inputNilaiRPL2_61.setText("61");
        inputNilaiRPL2_61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNilaiRPL2_61ActionPerformed(evt);
            }
        });
        jMenu10.add(inputNilaiRPL2_61);

        jMenu7.add(jMenu10);

        jMenuBar2.add(jMenu7);

        LogOutBtnOld.setText("Edit");
        jMenuBar2.add(LogOutBtnOld);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LogOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBtnActionPerformed

    }//GEN-LAST:event_LogOutBtnActionPerformed

    private void inputNilaiRPL1_59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNilaiRPL1_59ActionPerformed
        String fname = user.getText();
        DataSiswa dataSiswa = new DataSiswa(this, fname, userId);
        dataSiswa.setFilters("1", "RPL 1");
        dataSiswa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_inputNilaiRPL1_59ActionPerformed

    private void inputNilaiRPL1_60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNilaiRPL1_60ActionPerformed
        String fname = user.getText();
        DataSiswa dataSiswa = new DataSiswa(this, fname, userId);
        dataSiswa.setFilters("2", "RPL 1");
        dataSiswa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_inputNilaiRPL1_60ActionPerformed

    private void inputNilaiRPL1_61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNilaiRPL1_61ActionPerformed
        String fname = user.getText();
        DataSiswa dataSiswa = new DataSiswa(this, fname, userId);
        dataSiswa.setFilters("3", "RPL 1");
        dataSiswa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_inputNilaiRPL1_61ActionPerformed

    private void inputNilaiRPL2_59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNilaiRPL2_59ActionPerformed
        String fname = user.getText();
        DataSiswa dataSiswa = new DataSiswa(this, fname, userId);
        dataSiswa.setFilters("1", "RPL 2");
        dataSiswa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_inputNilaiRPL2_59ActionPerformed

    private void inputNilaiRPL2_60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNilaiRPL2_60ActionPerformed
        String fname = user.getText();
        DataSiswa dataSiswa = new DataSiswa(this, fname, userId);
        dataSiswa.setFilters("2", "XI RPL 2");
        dataSiswa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_inputNilaiRPL2_60ActionPerformed

    private void inputNilaiRPL2_61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNilaiRPL2_61ActionPerformed
        String fname = user.getText();
        DataSiswa dataSiswa = new DataSiswa(this, fname, userId);
        dataSiswa.setFilters("3", "RPL 2");
        dataSiswa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_inputNilaiRPL2_61ActionPerformed

    private void comboBoxHariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxHariActionPerformed
        String hariDiPilih = (String) comboBoxHari.getSelectedItem();
    }//GEN-LAST:event_comboBoxHariActionPerformed

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu7ActionPerformed

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
            java.util.logging.Logger.getLogger(HomeGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String username = "NamaPenggunaTest";
                int userId = 1;
                new HomeGuru(userId, username).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogOutBtn;
    private javax.swing.JMenu LogOutBtnOld;
    private javax.swing.JComboBox<String> comboBoxHari;
    private javax.swing.JMenuItem inputNilaiRPL1_59;
    private javax.swing.JMenuItem inputNilaiRPL1_60;
    private javax.swing.JMenuItem inputNilaiRPL1_61;
    private javax.swing.JMenuItem inputNilaiRPL2_59;
    private javax.swing.JMenuItem inputNilaiRPL2_60;
    private javax.swing.JMenuItem inputNilaiRPL2_61;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable jadwalTable;
    private java.awt.Label user;
    // End of variables declaration//GEN-END:variables
}
