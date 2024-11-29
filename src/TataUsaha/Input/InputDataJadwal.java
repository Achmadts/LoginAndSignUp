package TataUsaha.Input;

import TataUsaha.HomeTataUsaha;
import controllers.InputDataJadwalController;
import java.util.List;
import javax.swing.JOptionPane;

public class InputDataJadwal extends javax.swing.JFrame {

    private InputDataJadwalController controller;
    private HomeTataUsaha homeFrame;

    public InputDataJadwal() {
        initComponents();
        controller = new InputDataJadwalController();
        loadComboBoxes();
        addHariComboBoxListener();
    }

    private void loadComboBoxes() {
        loadGuruComboBox();
        loadMapelComboBox();
        loadJamComboBox();
    }

    private void addHariComboBoxListener() {
        hari.addActionListener(evt -> loadJamComboBox());
    }

    private void loadGuruComboBox() {
        List<String> guruList = controller.loadGuruList();
        namaGuru.removeAllItems();
        for (String guru : guruList) {
            namaGuru.addItem(guru);
        }
    }

    private void loadMapelComboBox() {
        List<String> mapelList = controller.loadMapelList();
        namaMapel.removeAllItems();
        for (String mapel : mapelList) {
            namaMapel.addItem(mapel);
        }
    }

    private void loadJamComboBox() {
        String selectedHari = (String) hari.getSelectedItem();
        List<String> jamList = controller.loadAvailableJam(selectedHari);
        jam.removeAllItems();
        for (String jamItem : jamList) {
            jam.addItem(jamItem);
        }
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {
        String selectedGuru = (String) namaGuru.getSelectedItem();
        String selectedMapel = (String) namaMapel.getSelectedItem();
        String selectedHari = (String) hari.getSelectedItem();
        String selectedJam = (String) jam.getSelectedItem();
        String selectedRuang = (String) ruang.getSelectedItem();

        if (controller.saveDataJadwal(selectedGuru, selectedMapel, selectedHari, selectedJam, selectedRuang)) {
            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Gagal menambahkan data", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        namaGuru = new javax.swing.JComboBox<>();
        namaMapel = new javax.swing.JComboBox<>();
        hari = new javax.swing.JComboBox<>();
        jam = new javax.swing.JComboBox<>();
        ruang = new javax.swing.JComboBox<>();
        btnKirimDataJadwal = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INPUT DATA JADWAL");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        namaGuru.setBackground(new java.awt.Color(255, 255, 255));
        namaGuru.setBorder(null);
        getContentPane().add(namaGuru, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 137, 550, -1));

        namaMapel.setBackground(new java.awt.Color(255, 255, 255));
        namaMapel.setBorder(null);
        namaMapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaMapelActionPerformed(evt);
            }
        });
        getContentPane().add(namaMapel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 550, -1));

        hari.setBackground(new java.awt.Color(255, 255, 255));
        hari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SENIN", "SELASA", "RABU", "KAMIS", "JUMAT" }));
        hari.setBorder(null);
        hari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hariActionPerformed(evt);
            }
        });
        getContentPane().add(hari, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 264, 550, 20));

        jam.setBackground(new java.awt.Color(255, 255, 255));
        jam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00 - 08:40", "08:40 - 09:20", "09:35 - 10:15", "10:15 - 10:55", "10:55 - 11:35", "11:35 - 12:15", "13:00 - 13:45", "13:45 - 14:30", "14:30 - 15:15", "15:15 - 16:00" }));
        jam.setBorder(null);
        getContentPane().add(jam, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 327, 550, -1));

        ruang.setBackground(new java.awt.Color(255, 255, 255));
        ruang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LAB 1", "LAB 2", "LAB 3", "LAB 4", "LAB 5", "R 44", "AWS" }));
        ruang.setBorder(null);
        ruang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruangActionPerformed(evt);
            }
        });
        getContentPane().add(ruang, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 550, -1));

        btnKirimDataJadwal.setBackground(new java.awt.Color(0, 102, 102));
        btnKirimDataJadwal.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        btnKirimDataJadwal.setForeground(new java.awt.Color(255, 255, 255));
        btnKirimDataJadwal.setText("SUBMIT");
        btnKirimDataJadwal.setBorder(null);
        btnKirimDataJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKirimDataJadwalActionPerformed(evt);
            }
        });
        getContentPane().add(btnKirimDataJadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 458, 100, 44));

        btnBack.setBackground(new java.awt.Color(0, 102, 102));
        btnBack.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 458, 100, 44));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/InputDataJadwal.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKirimDataJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKirimDataJadwalActionPerformed
        String selectedGuru = (String) namaGuru.getSelectedItem();
        String selectedMapel = (String) namaMapel.getSelectedItem();
        String selectedHari = (String) hari.getSelectedItem();
        String selectedJam = (String) jam.getSelectedItem();
        String selectedRuang = (String) ruang.getSelectedItem();

        if (selectedGuru == null || selectedMapel == null || selectedHari == null || selectedJam == null || selectedRuang == null) {
            JOptionPane.showMessageDialog(this, "Pastikan semua data telah diisi!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (controller.saveDataJadwal(selectedGuru, selectedMapel, selectedHari, selectedJam, selectedRuang)) {
            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Success", JOptionPane.INFORMATION_MESSAGE);
            namaGuru.setSelectedIndex(-1);
            namaMapel.setSelectedIndex(-1);
            hari.setSelectedIndex(-1);
            jam.setSelectedIndex(-1);
            ruang.setSelectedIndex(-1);
        } else {
            JOptionPane.showMessageDialog(this, "Gagal menambahkan data", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnKirimDataJadwalActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void namaMapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaMapelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaMapelActionPerformed

    private void hariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hariActionPerformed

    private void ruangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ruangActionPerformed

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
            java.util.logging.Logger.getLogger(InputDataJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputDataJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputDataJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputDataJadwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                HomeTataUsaha homeFrame = new HomeTataUsaha();
//                String userName = "NamaPenggunaTest";
//                int userId = 1;
//                new InputDataJadwal(homeFrame, userName, userId).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnKirimDataJadwal;
    private javax.swing.JComboBox<String> hari;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> jam;
    private javax.swing.JComboBox<String> namaGuru;
    private javax.swing.JComboBox<String> namaMapel;
    private javax.swing.JComboBox<String> ruang;
    // End of variables declaration//GEN-END:variables
}
