/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan.UI;

/**
 *
 * @author anhdu
 */
public class QuanLyNhanKhauJFrame extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyNguoiJFrame
     */
    public QuanLyNhanKhauJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    int xMouse, yMouse;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_Minimize = new javax.swing.JLabel();
        btn_Close = new javax.swing.JLabel();
        lblQuanLyNguoi = new javax.swing.JLabel();
        lbl_Titlebar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 700));
        setMinimumSize(new java.awt.Dimension(900, 700));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(900, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));
        jPanel1.setMaximumSize(new java.awt.Dimension(900, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(900, 700));
        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Minimize.png"))); // NOI18N
        btn_Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_MinimizeMouseClicked(evt);
            }
        });
        jPanel1.add(btn_Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, -1, -1));

        btn_Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Close.png"))); // NOI18N
        btn_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CloseMouseClicked(evt);
            }
        });
        jPanel1.add(btn_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, -1, -1));

        lblQuanLyNguoi.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        lblQuanLyNguoi.setForeground(new java.awt.Color(255, 255, 255));
        lblQuanLyNguoi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuanLyNguoi.setText("Quản Lý Nhân Khẩu");
        jPanel1.add(lblQuanLyNguoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lbl_Titlebar.setBackground(new java.awt.Color(0, 153, 153));
        lbl_Titlebar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Titlebar_background2.png"))); // NOI18N
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
        jPanel1.add(lbl_Titlebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

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
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_TitlebarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_TitlebarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_lbl_TitlebarMouseDragged

    private void lbl_TitlebarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_TitlebarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_lbl_TitlebarMousePressed

    private void btn_MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MinimizeMouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_btn_MinimizeMouseClicked

    private void btn_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CloseMouseClicked
        this.dispose();
    }//GEN-LAST:event_btn_CloseMouseClicked

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
            java.util.logging.Logger.getLogger(QuanLyNhanKhauJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanKhauJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanKhauJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanKhauJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyNhanKhauJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_Close;
    private javax.swing.JLabel btn_Minimize;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblQuanLyNguoi;
    private javax.swing.JLabel lbl_Titlebar;
    // End of variables declaration//GEN-END:variables
}
