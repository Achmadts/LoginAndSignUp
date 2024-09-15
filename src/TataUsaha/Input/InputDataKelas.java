/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TataUsaha.Input;

import TataUsaha.HomeTataUsaha;
import koneksi.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Achmad
 */
public class InputDataKelas extends javax.swing.JFrame {

    /**
     * Creates new form InputDataKelas
     */
    private HomeTataUsaha homeFrame;

    public InputDataKelas(HomeTataUsaha homeFrame, String userName, int userId) {
        initComponents();
        this.homeFrame = homeFrame;
        this.userName = userName;
        this.userId = userId;
        user.setText(userName);
        loadComboBoxes();
    }

    private int roleId;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    //    BARU 1
    private int userId;
    private String userName;

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private void loadComboBoxes() {
        loadGenComboBox();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnKirimDataKelas = new javax.swing.JButton();
        namaKelas = new javax.swing.JComboBox<>();
        namaJurusan = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        genSiswa = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INPUT DATA KELAS");

        jPanel1.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INPUT DATA KELAS");

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("KELAS");

        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("JURUSAN");

        btnKirimDataKelas.setBackground(new java.awt.Color(204, 51, 255));
        btnKirimDataKelas.setForeground(new java.awt.Color(255, 255, 255));
        btnKirimDataKelas.setText("SUBMIT");
        btnKirimDataKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKirimDataKelasActionPerformed(evt);
            }
        });

        namaKelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RPL 1", "RPL 2" }));

        namaJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rekayasa Perangkat Lunak" }));

        btnBack.setBackground(new java.awt.Color(204, 51, 255));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("GEN");

        user.setText("name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(user))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnKirimDataKelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(namaKelas, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(namaJurusan, javax.swing.GroupLayout.Alignment.TRAILING, 0, 548, Short.MAX_VALUE)
                                    .addComponent(genSiswa, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKirimDataKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loadGenComboBox() {
        String query = "SELECT id, gen FROM tahun_ajaran";

        try (Connection conn = (Connection) koneksi.koneksiDB(); PreparedStatement preparedStatement = conn.prepareStatement(query); ResultSet resultSet = preparedStatement.executeQuery(query)) {

            genSiswa.removeAllItems();
            while (resultSet.next()) {
                String genId = resultSet.getString("id");
                String gen = resultSet.getString("gen");
                genSiswa.addItem(genId + " - " + gen);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal memuat data gen", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void insertDataKelas() {
        String selectedKelas = (String) namaKelas.getSelectedItem();
        String selectedJurusan = (String) namaJurusan.getSelectedItem();

        String selectedGen = (String) genSiswa.getSelectedItem();
        String genId = selectedGen.split(" - ")[0];

        String query = "INSERT INTO kelas (nama_kelas, jurusan, gen_id) VALUES (?, ?, ?)";

        try (Connection conn = (Connection) koneksi.koneksiDB(); PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setString(1, selectedKelas);
            preparedStatement.setString(2, selectedJurusan);
            preparedStatement.setInt(3, Integer.parseInt(genId));

            int rowsInserted = preparedStatement.executeUpdate();

            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Success", JOptionPane.INFORMATION_MESSAGE);
                namaKelas.setSelectedIndex(-1);
                namaJurusan.setSelectedIndex(-1);
                genSiswa.setSelectedIndex(-1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal menambahkan data", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        String hariDiPilih = homeFrame.getComboBoxHari().getSelectedItem().toString();
        homeFrame.setVisible(true);
        homeFrame.loadJadwalData(hariDiPilih);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnKirimDataKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKirimDataKelasActionPerformed
        insertDataKelas();
    }//GEN-LAST:event_btnKirimDataKelasActionPerformed

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
            java.util.logging.Logger.getLogger(InputDataKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputDataKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputDataKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputDataKelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HomeTataUsaha homeFrame = new HomeTataUsaha();
                String userName = "NamaPenggunaTest";
                int userId = 1;
                new InputDataKelas(homeFrame, userName, userId).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnKirimDataKelas;
    private javax.swing.JComboBox<String> genSiswa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> namaJurusan;
    private javax.swing.JComboBox<String> namaKelas;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
