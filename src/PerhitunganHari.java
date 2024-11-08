import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;
import com.toedter.calendar.JCalendar;

public class PerhitunganHari extends javax.swing.JFrame {

    /**
     * Creates new form PerhitunganHari
     */
    public PerhitunganHari() {
        initComponents();
        setTitle("Aplikasi Penghitung Hari");
        setLocationRelativeTo(null);
        btnHitung.addActionListener(evt -> btnHitungActionPerformed(evt));
        btnHapus.addActionListener(evt -> btnHapusActionPerformed(evt));
        btnKeluar.addActionListener(evt -> btnKeluarActionPerformed(evt));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        hariPertamaLabel = new javax.swing.JLabel();
        hariTerakhirLabel = new javax.swing.JLabel();
        selisihHariLabel = new javax.swing.JLabel();
        hasilJumlahHariLabel = new javax.swing.JLabel();
        bulanComboBox = new javax.swing.JComboBox<>();
        tahunSpinner = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tanggal2Picker = new com.toedter.calendar.JCalendar();
        btnHitung = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(228, 232, 237));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel1.setText("Aplikasi Penghitung Hari");

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        hariPertamaLabel.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        hariPertamaLabel.setText("HARI PERTAMA :");

        hariTerakhirLabel.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        hariTerakhirLabel.setText("HARI TERAKHIR :");

        selisihHariLabel.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        selisihHariLabel.setText("SELISIH HARI :");

        hasilJumlahHariLabel.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        hasilJumlahHariLabel.setText("HASIL JUMLAH HARI :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hasilJumlahHariLabel)
                    .addComponent(selisihHariLabel)
                    .addComponent(hariTerakhirLabel)
                    .addComponent(hariPertamaLabel))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hariPertamaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hariTerakhirLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selisihHariLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hasilJumlahHariLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bulanComboBox.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        bulanComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER" }));

        tahunSpinner.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        tahunSpinner.setModel(new javax.swing.SpinnerNumberModel(2024, 1990, 2030, 1));
        tahunSpinner.setEditor(new javax.swing.JSpinner.NumberEditor(tahunSpinner, "#"));
        tahunSpinner.setInheritsPopupMenu(true);

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel2.setText("MONTH :");

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel3.setText("YEAR :");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        btnHitung.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnKeluar.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHitung)
                        .addGap(26, 26, 26)
                        .addComponent(btnHapus)
                        .addGap(26, 26, 26)
                        .addComponent(btnKeluar)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tanggal2Picker, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tanggal2Picker, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHitung)
                    .addComponent(btnHapus)
                    .addComponent(btnKeluar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bulanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tahunSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(jLabel1)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bulanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tahunSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
         try {
        // Ambil input dari panel Tanggal 1
        String bulan = (String) bulanComboBox.getSelectedItem();
        int tahun = (int) tahunSpinner.getValue();

        // Tentukan hari pertama dan hari terakhir pada bulan dan tahun yang dipilih
        Month month = Month.valueOf(bulan.toUpperCase());
        LocalDate hariPertama = LocalDate.of(tahun, month, 1);
        LocalDate hariTerakhir = hariPertama.withDayOfMonth(hariPertama.lengthOfMonth());

        // Ambil input dari panel Tanggal 2
        if (tanggal2Picker.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Tanggal 2 belum dipilih!");
            return;  // Keluar dari metode jika tanggal tidak dipilih
        }

        // Mengonversi java.util.Date ke LocalDate
        LocalDate tanggal2 = LocalDate.ofInstant(tanggal2Picker.getDate().toInstant(), ZoneId.systemDefault());

        // Hitung jumlah hari dalam rentang bulan tersebut
        long jumlahHari = ChronoUnit.DAYS.between(hariPertama, hariTerakhir) + 1; // +1 untuk inklusif
        long selisihHari = ChronoUnit.DAYS.between(hariPertama, tanggal2);

        // Format untuk menampilkan nama hari
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE");  // "EEEE" untuk nama hari penuh

        // Menampilkan nama hari pertama dan hari terakhir
        String hariPertamaNama = hariPertama.format(formatter);
        String hariTerakhirNama = hariTerakhir.format(formatter);

        // Update label dengan hasil perhitungan
        hasilJumlahHariLabel.setText("HASIL JUMLAH HARI: " + jumlahHari);
        hariPertamaLabel.setText("HARI PERTAMA: " + hariPertamaNama);
        hariTerakhirLabel.setText("HARI TERAKHIR: " + hariTerakhirNama);
        selisihHariLabel.setText("SELISIH HARI: " + selisihHari);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(rootPane, "Input tidak valid! Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        hasilJumlahHariLabel.setText("HASIL JUMLAH HARI: ");
        hariPertamaLabel.setText("HARI PERTAMA: ");
        hariTerakhirLabel.setText("HARI TERAKHIR: ");
        selisihHariLabel.setText("SELISIH HARI: " );
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        String tanya = "Apakah anda yakin akan keluar aplikasi?";
        boolean yakin = JOptionPane.showConfirmDialog(rootPane, tanya)==
        JOptionPane.YES_OPTION;
        if(yakin){
            System.exit(0);
        }
    }//GEN-LAST:event_btnKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(PerhitunganHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerhitunganHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerhitunganHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerhitunganHari.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerhitunganHari().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JComboBox<String> bulanComboBox;
    private javax.swing.JLabel hariPertamaLabel;
    private javax.swing.JLabel hariTerakhirLabel;
    private javax.swing.JLabel hasilJumlahHariLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel selisihHariLabel;
    private javax.swing.JSpinner tahunSpinner;
    private com.toedter.calendar.JCalendar tanggal2Picker;
    // End of variables declaration//GEN-END:variables
}
