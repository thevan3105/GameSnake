/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Font;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author GCafe
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        rdoBinhthuong.setSelected(true);
        rdoTudo.setSelected(true);
        jComboBox1.setSelectedIndex(1);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnBatdau = new javax.swing.JButton();
        btnHuongdan = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        rdoCham = new javax.swing.JRadioButton();
        rdoNhanh = new javax.swing.JRadioButton();
        rdoBinhthuong = new javax.swing.JRadioButton();
        rdoTudo = new javax.swing.JRadioButton();
        rdoNhatu = new javax.swing.JRadioButton();
        btndiemcao = new javax.swing.JButton();
        btnLoadState = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Snake game Java...!");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font(".Vn3DH", 1, 10)); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(102, 255, 102));
        jPanel1.setName(""); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Bản đồ: ");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Tốc độ: ");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("Chế độ chơi: ");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhà trống", "Vườn rau", "Đường ống" }));

        btnBatdau.setBackground(new java.awt.Color(204, 255, 255));
        btnBatdau.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnBatdau.setText("Bắt đầu ");
        btnBatdau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatdauActionPerformed(evt);
            }
        });

        btnHuongdan.setBackground(new java.awt.Color(204, 255, 255));
        btnHuongdan.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnHuongdan.setText("Hướng dẫn");
        btnHuongdan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuongdanActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(204, 255, 255));
        btnThoat.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        rdoCham.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoCham);
        rdoCham.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        rdoCham.setText("Chậm");

        rdoNhanh.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoNhanh);
        rdoNhanh.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        rdoNhanh.setText("Nhanh");

        rdoBinhthuong.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoBinhthuong);
        rdoBinhthuong.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        rdoBinhthuong.setText("Bình thường");

        rdoTudo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rdoTudo);
        rdoTudo.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        rdoTudo.setText("Tự do");

        rdoNhatu.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rdoNhatu);
        rdoNhatu.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        rdoNhatu.setText("Nhà tù");

        btndiemcao.setBackground(new java.awt.Color(204, 255, 255));
        btndiemcao.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btndiemcao.setText("Điểm cao");
        btndiemcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndiemcaoActionPerformed(evt);
            }
        });

        btnLoadState.setText("Load");
        btnLoadState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadStateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(73, 73, 73)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(195, 195, 195))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdoTudo)
                            .addGap(23, 23, 23)
                            .addComponent(rdoNhatu)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(67, 67, 67)
                        .addComponent(rdoCham)
                        .addGap(4, 4, 4)
                        .addComponent(rdoBinhthuong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoNhanh))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBatdau, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndiemcao, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLoadState, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnHuongdan))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rdoCham)
                    .addComponent(rdoNhanh)
                    .addComponent(rdoBinhthuong))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rdoTudo)
                    .addComponent(rdoNhatu))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnHuongdan, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBatdau, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndiemcao, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoadState))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel4.setBackground(new java.awt.Color(204, 239, 181));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("GAME SNAKE JAVA...!!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnBatdauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatdauActionPerformed
        myThread t = new myThread();
        t.setMap(jComboBox1.getSelectedIndex());
        // thay đổi tốc độ rắn di chuyển
        int speed = 150;
        if (rdoNhanh.isSelected()) {
            speed = 100;
        } else if (rdoCham.isSelected()) {
            speed = 200;
        }
        int chedo = 0;
        if (rdoNhatu.isSelected()) {
            chedo = 1;
        }
        t.setChedo(chedo);
        t.setSpeed(speed);
        System.out.println(speed);
        System.out.println(jComboBox1.getSelectedIndex());
        Thread th = new Thread(t);
        th.start();
    }//GEN-LAST:event_btnBatdauActionPerformed

    private void btnHuongdanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuongdanActionPerformed
        JOptionPane.showMessageDialog(rootPane, ""
                + "=> Nhấn 'Bắt đầu' để chơi game"
                + "\n=> Có thể chọn Tốc đô, bản đồ và chế độ chơi trong game."
                + "\n=> Tránh các vật cản trên đường đi trong chế độ 'tự do'"
                + "\n=> Sử dụng các phím mũi tên để di chuyển rắn ăn mồi"
                + "\n=> Không được đâm vào biên trong chế độ 'nhà tu'"
                + "\n=> Mỗi khi rắn va vào mồi sẽ tự động tăng điểm và chiều dai",
                "Hướng dẫn", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnHuongdanActionPerformed

    private void btndiemcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndiemcaoActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        HighScore r;
        try {
            r = new HighScore();
            r.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btndiemcaoActionPerformed

    private void btnLoadStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadStateActionPerformed
        // TODO add your handling code here:
        Employee e = null;
      try {
         FileInputStream fileIn = new FileInputStream("test.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         e = (Employee) in.readObject();
         in.close();
         fileIn.close();
      } catch (IOException i) {
         i.printStackTrace();
         return;
      } catch (ClassNotFoundException c) {
         System.out.println("Khong tim thay file .ser");
         c.printStackTrace();
         return;
        }
      myThread t = new myThread();
        t.setMap(e.map1);
        t.setChedo(e.chedo1);
        t.setSpeed(e.speed1);
        t.setlenght(e.lenght1);
        t.setScore(e.score1);
        
        
        Thread th = new Thread(t);
        th.start();

    }//GEN-LAST:event_btnLoadStateActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatdau;
    private javax.swing.JButton btnHuongdan;
    private javax.swing.JButton btnLoadState;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btndiemcao;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rdoBinhthuong;
    private javax.swing.JRadioButton rdoCham;
    private javax.swing.JRadioButton rdoNhanh;
    private javax.swing.JRadioButton rdoNhatu;
    private javax.swing.JRadioButton rdoTudo;
    // End of variables declaration//GEN-END:variables
}