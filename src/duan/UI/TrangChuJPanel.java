/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan.UI;

import duan.JDBC.JDBC;
import java.sql.ResultSet;

/**
 *
 * @author anhdu
 */
public class TrangChuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TranChuJPanel
     */
    public TrangChuJPanel() {
        initComponents();
        this.soNguoi();
        this.soCanHo();
        this.soXe();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_SoPhongDangQuanLy = new javax.swing.JPanel();
        lbl_IconHome = new javax.swing.JLabel();
        lbl_TongSoCanHo = new javax.swing.JLabel();
        lbl_CanHo = new javax.swing.JLabel();
        pnl_SoNhanKhau = new javax.swing.JPanel();
        lbl_IconHuman = new javax.swing.JLabel();
        lbl_Nguoi = new javax.swing.JLabel();
        lbl_TongSoNguoi = new javax.swing.JLabel();
        pnl_SoNhanKhau1 = new javax.swing.JPanel();
        lbl_IconBike = new javax.swing.JLabel();
        lbl_PhuongTien = new javax.swing.JLabel();
        lbl_TongSoPhuongTien = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1040, 660));
        setMinimumSize(new java.awt.Dimension(1040, 660));
        setPreferredSize(new java.awt.Dimension(1040, 660));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_SoPhongDangQuanLy.setBackground(new java.awt.Color(255, 85, 85));
        pnl_SoPhongDangQuanLy.setMaximumSize(new java.awt.Dimension(330, 230));
        pnl_SoPhongDangQuanLy.setMinimumSize(new java.awt.Dimension(330, 230));

        lbl_IconHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Home.png"))); // NOI18N

        lbl_TongSoCanHo.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lbl_TongSoCanHo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_TongSoCanHo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_TongSoCanHo.setText("100");

        lbl_CanHo.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lbl_CanHo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_CanHo.setText("Căn Hộ");

        javax.swing.GroupLayout pnl_SoPhongDangQuanLyLayout = new javax.swing.GroupLayout(pnl_SoPhongDangQuanLy);
        pnl_SoPhongDangQuanLy.setLayout(pnl_SoPhongDangQuanLyLayout);
        pnl_SoPhongDangQuanLyLayout.setHorizontalGroup(
            pnl_SoPhongDangQuanLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_SoPhongDangQuanLyLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbl_IconHome)
                .addGroup(pnl_SoPhongDangQuanLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_SoPhongDangQuanLyLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lbl_CanHo))
                    .addGroup(pnl_SoPhongDangQuanLyLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lbl_TongSoCanHo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pnl_SoPhongDangQuanLyLayout.setVerticalGroup(
            pnl_SoPhongDangQuanLyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_SoPhongDangQuanLyLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lbl_TongSoCanHo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(lbl_CanHo)
                .addGap(43, 43, 43))
            .addGroup(pnl_SoPhongDangQuanLyLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(lbl_IconHome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(pnl_SoPhongDangQuanLy, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        pnl_SoNhanKhau.setBackground(new java.awt.Color(255, 204, 51));
        pnl_SoNhanKhau.setToolTipText("Click vào để quản lý nhân khẩu");
        pnl_SoNhanKhau.setMaximumSize(new java.awt.Dimension(330, 230));
        pnl_SoNhanKhau.setMinimumSize(new java.awt.Dimension(330, 230));
        pnl_SoNhanKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_SoNhanKhauMouseClicked(evt);
            }
        });

        lbl_IconHuman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Human_100px.png"))); // NOI18N

        lbl_Nguoi.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lbl_Nguoi.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Nguoi.setText("Người");

        lbl_TongSoNguoi.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lbl_TongSoNguoi.setForeground(new java.awt.Color(255, 255, 255));
        lbl_TongSoNguoi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_TongSoNguoi.setText("100");

        javax.swing.GroupLayout pnl_SoNhanKhauLayout = new javax.swing.GroupLayout(pnl_SoNhanKhau);
        pnl_SoNhanKhau.setLayout(pnl_SoNhanKhauLayout);
        pnl_SoNhanKhauLayout.setHorizontalGroup(
            pnl_SoNhanKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_SoNhanKhauLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbl_IconHuman)
                .addGroup(pnl_SoNhanKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_SoNhanKhauLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(lbl_Nguoi, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_SoNhanKhauLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(lbl_TongSoNguoi, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        pnl_SoNhanKhauLayout.setVerticalGroup(
            pnl_SoNhanKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_SoNhanKhauLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lbl_TongSoNguoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_Nguoi)
                .addGap(41, 41, 41))
            .addGroup(pnl_SoNhanKhauLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(lbl_IconHuman)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        add(pnl_SoNhanKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        pnl_SoNhanKhau1.setBackground(new java.awt.Color(121, 196, 71));
        pnl_SoNhanKhau1.setMaximumSize(new java.awt.Dimension(330, 230));
        pnl_SoNhanKhau1.setMinimumSize(new java.awt.Dimension(330, 230));

        lbl_IconBike.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Motorcycle.png"))); // NOI18N

        lbl_PhuongTien.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        lbl_PhuongTien.setForeground(new java.awt.Color(255, 255, 255));
        lbl_PhuongTien.setText("Phương Tiện");

        lbl_TongSoPhuongTien.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lbl_TongSoPhuongTien.setForeground(new java.awt.Color(255, 255, 255));
        lbl_TongSoPhuongTien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_TongSoPhuongTien.setText("100");

        javax.swing.GroupLayout pnl_SoNhanKhau1Layout = new javax.swing.GroupLayout(pnl_SoNhanKhau1);
        pnl_SoNhanKhau1.setLayout(pnl_SoNhanKhau1Layout);
        pnl_SoNhanKhau1Layout.setHorizontalGroup(
            pnl_SoNhanKhau1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_SoNhanKhau1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbl_IconBike)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_SoNhanKhau1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_TongSoPhuongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_PhuongTien))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnl_SoNhanKhau1Layout.setVerticalGroup(
            pnl_SoNhanKhau1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_SoNhanKhau1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lbl_TongSoPhuongTien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_PhuongTien)
                .addGap(43, 43, 43))
            .addGroup(pnl_SoNhanKhau1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(lbl_IconBike)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        add(pnl_SoNhanKhau1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void pnl_SoNhanKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_SoNhanKhauMouseClicked
        new QuanLyNhanKhauJFrame().setVisible(true);
    }//GEN-LAST:event_pnl_SoNhanKhauMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_CanHo;
    private javax.swing.JLabel lbl_IconBike;
    private javax.swing.JLabel lbl_IconHome;
    private javax.swing.JLabel lbl_IconHuman;
    private javax.swing.JLabel lbl_Nguoi;
    private javax.swing.JLabel lbl_PhuongTien;
    private javax.swing.JLabel lbl_TongSoCanHo;
    private javax.swing.JLabel lbl_TongSoNguoi;
    private javax.swing.JLabel lbl_TongSoPhuongTien;
    private javax.swing.JPanel pnl_SoNhanKhau;
    private javax.swing.JPanel pnl_SoNhanKhau1;
    private javax.swing.JPanel pnl_SoPhongDangQuanLy;
    // End of variables declaration//GEN-END:variables

private void soNguoi(){
    try {
        ResultSet rs = JDBC.executeQuery("SELECT COUNT(KhachHangId) FROM dbo.ThongTinKhachHang");
    if (rs.next()) {
        lbl_TongSoNguoi.setText(rs.getString(1));
    }
    } catch (Exception e) {
    }   
}

private void soCanHo(){
    try {
        ResultSet rs = JDBC.executeQuery("SELECT COUNT(CanHoId) FROM dbo.CanHo");
    if (rs.next()) {
        lbl_TongSoCanHo.setText(rs.getString(1));
    }
    } catch (Exception e) {
    }   
}

private void soXe(){
    try {
        ResultSet rs = JDBC.executeQuery("SELECT SUM(SoLuong) FROM dbo.GuiXe");
    if (rs.next()) {
        lbl_TongSoPhuongTien.setText(rs.getString(1));
    }
    } catch (Exception e) {
    }   
}
}
