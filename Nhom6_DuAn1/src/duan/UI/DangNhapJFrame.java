package duan.UI;

import duan.JDBC.JDBC;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author anhdu
 */
public class DangNhapJFrame extends javax.swing.JFrame {

    /**
     * Creates new form dangNhap
     */
    public DangNhapJFrame() {
        initComponents();
        this.Logo();
        this.setTitle("Đăng Nhập");
        this.setLocationRelativeTo(null);
    }
    int Dem = 0;
    int xMouse, yMouse;

    public void Logo() {
        ImageIcon img = new ImageIcon(this.getClass().getResource("/duan/Logo/LOGO.png"));
        this.setIconImage(img.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpn_TongDangNhap = new javax.swing.JPanel();
        lbl_Logo = new javax.swing.JLabel();
        txt_User = new javax.swing.JTextField();
        lbl_TenDangNhap = new javax.swing.JLabel();
        lbl_MatKhau = new javax.swing.JLabel();
        txt_Password = new javax.swing.JPasswordField();
        jbl_Hide = new javax.swing.JLabel();
        jpn_DangNhap = new javax.swing.JPanel();
        lbl_DangNhap = new javax.swing.JLabel();
        jpn_Huy = new javax.swing.JPanel();
        lbl_Huy = new javax.swing.JLabel();
        btn_QuenMK = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btn_Close = new javax.swing.JLabel();
        lbl_Title = new javax.swing.JLabel();
        lbl_Titlebar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jpn_TongDangNhap.setBackground(new java.awt.Color(255, 255, 255));
        jpn_TongDangNhap.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jpn_TongDangNhap.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Logo.setBackground(new java.awt.Color(204, 204, 204));
        lbl_Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/LogodangNhap.png"))); // NOI18N
        jpn_TongDangNhap.add(lbl_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 190, 200));

        txt_User.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_User.setToolTipText("Nhập tên đăng nhập");
        txt_User.setBorder(null);
        jpn_TongDangNhap.add(txt_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 250, 35));

        lbl_TenDangNhap.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        lbl_TenDangNhap.setText("Tên Đăng Nhập");
        jpn_TongDangNhap.add(lbl_TenDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        lbl_MatKhau.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        lbl_MatKhau.setText("Mật Khẩu");
        jpn_TongDangNhap.add(lbl_MatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        txt_Password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_Password.setToolTipText("Nhập mật khẩu");
        txt_Password.setBorder(null);
        txt_Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_PasswordKeyPressed(evt);
            }
        });
        jpn_TongDangNhap.add(txt_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 250, 35));

        jbl_Hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/InvisibleEye.png"))); // NOI18N
        jbl_Hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbl_HideMouseClicked(evt);
            }
        });
        jpn_TongDangNhap.add(jbl_Hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 50, 30));

        jpn_DangNhap.setBackground(new java.awt.Color(255, 255, 255));
        jpn_DangNhap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jpn_DangNhap.setForeground(new java.awt.Color(102, 102, 102));
        jpn_DangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpn_DangNhapMouseClicked(evt);
            }
        });

        lbl_DangNhap.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lbl_DangNhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_DangNhap.setText("Đăng Nhập");

        javax.swing.GroupLayout jpn_DangNhapLayout = new javax.swing.GroupLayout(jpn_DangNhap);
        jpn_DangNhap.setLayout(jpn_DangNhapLayout);
        jpn_DangNhapLayout.setHorizontalGroup(
            jpn_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_DangNhap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );
        jpn_DangNhapLayout.setVerticalGroup(
            jpn_DangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_DangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jpn_TongDangNhap.add(jpn_DangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, 40));

        jpn_Huy.setBackground(new java.awt.Color(255, 255, 255));
        jpn_Huy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jpn_Huy.setForeground(new java.awt.Color(102, 102, 102));
        jpn_Huy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpn_HuyMouseClicked(evt);
            }
        });

        lbl_Huy.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lbl_Huy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Huy.setText("Hủy");

        javax.swing.GroupLayout jpn_HuyLayout = new javax.swing.GroupLayout(jpn_Huy);
        jpn_Huy.setLayout(jpn_HuyLayout);
        jpn_HuyLayout.setHorizontalGroup(
            jpn_HuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Huy, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );
        jpn_HuyLayout.setVerticalGroup(
            jpn_HuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Huy, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jpn_TongDangNhap.add(jpn_Huy, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, -1, 40));

        btn_QuenMK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_QuenMK.setForeground(new java.awt.Color(0, 102, 102));
        btn_QuenMK.setText("Quên Mật Khẩu ?");
        btn_QuenMK.setToolTipText("Click vào đây để lấy lại password !");
        btn_QuenMK.setBorderPainted(false);
        btn_QuenMK.setContentAreaFilled(false);
        btn_QuenMK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_QuenMK.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_QuenMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_QuenMKMouseClicked(evt);
            }
        });
        jpn_TongDangNhap.add(btn_QuenMK, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setToolTipText("");
        jpn_TongDangNhap.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 250, 12));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setToolTipText("");
        jpn_TongDangNhap.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 250, 11));

        btn_Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Close.png"))); // NOI18N
        btn_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CloseMouseClicked(evt);
            }
        });
        jpn_TongDangNhap.add(btn_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, -1, -1));

        lbl_Title.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        lbl_Title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Title.setText("Đăng Nhập");
        jpn_TongDangNhap.add(lbl_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lbl_Titlebar.setBackground(new java.awt.Color(0, 153, 153));
        lbl_Titlebar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Titlebar_background.png"))); // NOI18N
        lbl_Titlebar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lbl_TitlebarMouseDragged(evt);
            }
        });
        lbl_Titlebar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_TitlebarMousePressed(evt);
            }
        });
        jpn_TongDangNhap.add(lbl_Titlebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpn_TongDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpn_TongDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_PasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PasswordKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {

                if (check()) {

                    ResultSet rs = JDBC.executeQuery("SELECT * FROM USERS WHERE UserId = ? ", txt_User.getText());

                    if (rs.next()) {
                        String pass = rs.getString(2);// Lấy Pass
                        if (txt_Password.getText().equals(pass)) {//So sánh Pass

                            JOptionPane.showMessageDialog(rootPane, "Đăng nhập thành công");

                            new mainJFrame().setVisible(true);
                            this.dispose();

                            //Thông báo nếu Pass không trùng khớp
                        } else {
                            JOptionPane.showMessageDialog(this, "Sai mật khẩu !", "Thông Báo", JOptionPane.WARNING_MESSAGE);
                        }
                        //Thông báo nếu Tài khoản không tồn tại
                    } else {
                        JOptionPane.showMessageDialog(this, "Tài khoản không tồn tại !", "Thông Báo", JOptionPane.WARNING_MESSAGE);
                    }

                }

            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }//GEN-LAST:event_txt_PasswordKeyPressed

    private void jbl_HideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbl_HideMouseClicked

        if (Dem == 0) {
            txt_Password.setEchoChar((char) 0);
            jbl_Hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Eye.png")));
            Dem = -1;
        } else {
            txt_Password.setEchoChar('*');
            jbl_Hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/InvisibleEye.png")));
            Dem = 0;
        }
    }//GEN-LAST:event_jbl_HideMouseClicked

    private void jpn_DangNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpn_DangNhapMouseClicked
        try {

            if (check()) {

                ResultSet rs = JDBC.executeQuery("SELECT * FROM USERS WHERE UserId = ? ", txt_User.getText());

                if (rs.next()) {
                    String pass = rs.getString(2);// Lấy Pass
                    if (txt_Password.getText().equals(pass)) {//So sánh Pass

                        JOptionPane.showMessageDialog(rootPane, "Đăng nhập thành công");

                        new mainJFrame().setVisible(true);
                        this.dispose();

                        //Thông báo nếu Pass không trùng khớp
                    } else {
                        JOptionPane.showMessageDialog(this, "Sai mật khẩu !", "Thông Báo", JOptionPane.WARNING_MESSAGE);
                    }
                    //Thông báo nếu Tài khoản không tồn tại
                } else {
                    JOptionPane.showMessageDialog(this, "Tài khoản không tồn tại !", "Thông Báo", JOptionPane.WARNING_MESSAGE);
                }

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jpn_DangNhapMouseClicked

    private void jpn_HuyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpn_HuyMouseClicked
        txt_User.setText("");
        txt_Password.setText("");
    }//GEN-LAST:event_jpn_HuyMouseClicked

    private void btn_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_CloseMouseClicked

    private void lbl_TitlebarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_TitlebarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_lbl_TitlebarMousePressed

    private void lbl_TitlebarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_TitlebarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);

    }//GEN-LAST:event_lbl_TitlebarMouseDragged

    private void btn_QuenMKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_QuenMKMouseClicked
        new QuenMatKhauJFrame().setVisible(true);
    }//GEN-LAST:event_btn_QuenMKMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DangNhapJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhapJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhapJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhapJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhapJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_Close;
    private javax.swing.JButton btn_QuenMK;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jbl_Hide;
    private javax.swing.JPanel jpn_DangNhap;
    private javax.swing.JPanel jpn_Huy;
    private javax.swing.JPanel jpn_TongDangNhap;
    private javax.swing.JLabel lbl_DangNhap;
    private javax.swing.JLabel lbl_Huy;
    private javax.swing.JLabel lbl_Logo;
    private javax.swing.JLabel lbl_MatKhau;
    private javax.swing.JLabel lbl_TenDangNhap;
    private javax.swing.JLabel lbl_Title;
    private javax.swing.JLabel lbl_Titlebar;
    private javax.swing.JPasswordField txt_Password;
    private javax.swing.JTextField txt_User;
    // End of variables declaration//GEN-END:variables

    private boolean check() {
        if (txt_User.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Không để trống Users !");
            return false;
        } else if (txt_Password.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Không để trống Password !");
            return false;
        }
        return true;
    }

}
