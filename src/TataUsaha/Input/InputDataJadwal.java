package TataUsaha.Input;

import TataUsaha.HomeTataUsaha;
import koneksi.koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Achmad
 */
public class InputDataJadwal extends javax.swing.JFrame {

    /**
     * Creates new form InputDataJadwal
     */
    private HomeTataUsaha homeFrame;

    public InputDataJadwal(HomeTataUsaha homeFrame, String userName, int userId) {
        initComponents();
        this.homeFrame = homeFrame;
        this.userName = userName;
        this.userId = userId;
        user.setText(userName);
        loadComboBoxes();
        addHariComboBoxListener();
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
        loadGuruComboBox();
        loadMapelComboBox();
        loadJamComboBox();
    }

    private void addHariComboBoxListener() {
        hari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadJamComboBox();
            }
        });
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnKirimDataJadwal = new javax.swing.JButton();
        namaGuru = new javax.swing.JComboBox<>();
        namaMapel = new javax.swing.JComboBox<>();
        hari = new javax.swing.JComboBox<>();
        jam = new javax.swing.JComboBox<>();
        ruang = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        user = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INPUT DATA JADWAL");

        jPanel1.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INPUT DATA JADWAL");

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("GURU");

        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("MATA PELAJARAN");

        jLabel4.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("HARI");

        jLabel5.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("JAM");

        jLabel7.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("RUANG");

        btnKirimDataJadwal.setBackground(new java.awt.Color(204, 51, 255));
        btnKirimDataJadwal.setForeground(new java.awt.Color(255, 255, 255));
        btnKirimDataJadwal.setText("SUBMIT");
        btnKirimDataJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKirimDataJadwalActionPerformed(evt);
            }
        });

        hari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SENIN", "SELASA", "RABU", "KAMIS", "JUMAT" }));

        jam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00 - 08:40", "08:40 - 09:20", "09:35 - 10:15", "10:15 - 10:55", "10:55 - 11:35", "11:35 - 12:15", "13:00 - 13:45", "13:45 - 14:30", "14:30 - 15:15", "15:15 - 16:00" }));

        ruang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LAB 1", "LAB 2", "LAB 3", "LAB 4", "LAB 5", "R 44", "AWS" }));

        btnBack.setBackground(new java.awt.Color(204, 51, 255));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        user.setText("name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnKirimDataJadwal, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(user))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(114, 114, 114))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(109, 109, 109))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(119, 119, 119))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(96, 96, 96)))
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(namaGuru, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(namaMapel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hari, 0, 491, Short.MAX_VALUE)
                                    .addComponent(jam, 0, 491, Short.MAX_VALUE)
                                    .addComponent(ruang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(36, 36, 36))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namaGuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(namaMapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(hari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ruang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKirimDataJadwal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void loadJamComboBox() {
        String selectedHari = (String) hari.getSelectedItem();
        String query = "SELECT jam FROM jadwal_pelajaran WHERE hari = ?";

        try (Connection conn = koneksi.koneksiDB(); PreparedStatement preparedStatement = conn.prepareStatement(query)) {

            preparedStatement.setString(1, selectedHari);
            ResultSet resultSet = preparedStatement.executeQuery();

            String[] allJam = {
                "08:00 - 08:40", "08:40 - 09:20", "09:35 - 10:15", "10:15 - 10:55",
                "10:55 - 11:35", "11:35 - 12:15", "13:00 - 13:45", "13:45 - 14:30",
                "14:30 - 15:15", "15:15 - 16:00"
            };
            Set<String> availableJam = new HashSet<>(Arrays.asList(allJam));

            while (resultSet.next()) {
                String jamTerpakai = resultSet.getString("jam");
                availableJam.remove(jamTerpakai);
            }

            List<String> sortedJam = new ArrayList<>(availableJam);
            Collections.sort(sortedJam);

            jam.removeAllItems();
            for (String jamItem : sortedJam) {
                jam.addItem(jamItem);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal memuat data jam", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loadGuruComboBox() {
        String query = "SELECT nip, full_name FROM users WHERE role_id = 2";

        try (Connection conn = (Connection) koneksi.koneksiDB(); PreparedStatement preparedStatement = conn.prepareStatement(query); ResultSet resultSet = preparedStatement.executeQuery(query)) {

            namaGuru.removeAllItems();
            while (resultSet.next()) {
                String guruId = resultSet.getString("nip");
                String nama = resultSet.getString("full_name");
                namaGuru.addItem(guruId + " - " + nama);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal memuat data guru", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loadMapelComboBox() {
        String query = "SELECT id, nama_mapel FROM mapel";

        try (Connection conn = (Connection) koneksi.koneksiDB(); PreparedStatement preparedStatement = conn.prepareStatement(query); ResultSet resultSet = preparedStatement.executeQuery(query)) {

            namaMapel.removeAllItems();
            while (resultSet.next()) {
                String mapelId = resultSet.getString("id");
                String nama_napel = resultSet.getString("nama_mapel");
                namaMapel.addItem(mapelId + " - " + nama_napel);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Gagal memuat data Mata Pelajaran", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void insertDataJadwal() {
        String selectedGuru = (String) namaGuru.getSelectedItem();
        String guruId = selectedGuru.split(" - ")[0];

        String selectedMapel = (String) namaMapel.getSelectedItem();
        String mapelId = selectedMapel.split(" - ")[0];

        String selectedHari = (String) hari.getSelectedItem();
        String selectedJam = (String) jam.getSelectedItem();
        String selectedRuang = (String) ruang.getSelectedItem();

        String query = "INSERT INTO jadwal_pelajaran (user_id, mapel_id, hari, jam, ruang) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = (Connection) koneksi.koneksiDB(); PreparedStatement preparedStatement = conn.prepareStatement(query)) {
            preparedStatement.setInt(1, Integer.parseInt(guruId));
            preparedStatement.setInt(2, Integer.parseInt(mapelId));
            preparedStatement.setString(3, selectedHari);
            preparedStatement.setString(4, selectedJam);
            preparedStatement.setString(5, selectedRuang);

            int rowsInserted = preparedStatement.executeUpdate();

            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Success", JOptionPane.INFORMATION_MESSAGE);
                namaGuru.setSelectedIndex(-1);
                namaMapel.setSelectedIndex(-1);
                hari.setSelectedIndex(-1);
                jam.setSelectedIndex(-1);
                ruang.setSelectedIndex(-1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
//            JOptionPane.showMessageDialog(this, "Gagal menambahkan data", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btnKirimDataJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKirimDataJadwalActionPerformed
        insertDataJadwal();
    }//GEN-LAST:event_btnKirimDataJadwalActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        String hariDiPilih = homeFrame.getComboBoxHari().getSelectedItem().toString();
        homeFrame.setVisible(true);
        homeFrame.loadJadwalData(hariDiPilih);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jam;
    private javax.swing.JComboBox<String> namaGuru;
    private javax.swing.JComboBox<String> namaMapel;
    private javax.swing.JComboBox<String> ruang;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
