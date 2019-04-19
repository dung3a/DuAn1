/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan.UI;

import duan.DAO.LoaiXeDAO;
import duan.JDBC.JDBC;
import static duan.JDBC.XuLy.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author anhdu
 */
public class TienDichVuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DichVu_HoaDonJPanel
     */
    public TienDichVuJPanel() {
        initComponents();
        this.loadTienTrongCoiHT();
        this.loadTienDVCBHT();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sptDV = new javax.swing.JSeparator();
        lblTienGuiXe = new javax.swing.JLabel();
        lblTienDichVu = new javax.swing.JLabel();
        lblTienGuiXeHT = new javax.swing.JLabel();
        lblTienDVHienTai = new javax.swing.JLabel();
        lblDoiGX = new javax.swing.JLabel();
        lblDoiDV = new javax.swing.JLabel();
        lblXeDap = new javax.swing.JLabel();
        lblXemay = new javax.swing.JLabel();
        lblHoi = new javax.swing.JLabel();
        lblPhiXeDapHT = new javax.swing.JLabel();
        lblPhiXeMayHT = new javax.swing.JLabel();
        lblPhiXeHoiHT = new javax.swing.JLabel();
        txtTienGuiXeDapMoi = new javax.swing.JTextField();
        txtTienGuiXeMayMoi = new javax.swing.JTextField();
        txtTienGuiXeHoiMoi = new javax.swing.JTextField();
        lblTienDVHT = new javax.swing.JLabel();
        txtTienDichVuMoi = new javax.swing.JTextField();
        lblCapNhaTienGuiXe = new javax.swing.JLabel();
        lblCapNhatTienDV = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1014, 541));
        setMinimumSize(new java.awt.Dimension(1014, 541));
        setPreferredSize(new java.awt.Dimension(1014, 541));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sptDV.setBackground(new java.awt.Color(0, 0, 0));
        sptDV.setForeground(new java.awt.Color(0, 0, 0));
        sptDV.setMaximumSize(new java.awt.Dimension(50, 10));
        add(sptDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 298, 1014, 10));

        lblTienGuiXe.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTienGuiXe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTienGuiXe.setText("TIỀN GỬI XE");
        add(lblTienGuiXe, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 990, -1));

        lblTienDichVu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTienDichVu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTienDichVu.setText("TIỀN DỊCH VỤ");
        add(lblTienDichVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 990, -1));

        lblTienGuiXeHT.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTienGuiXeHT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTienGuiXeHT.setText("Tiền Gửi Xe Hiện Tại");
        add(lblTienGuiXeHT, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 68, -1, -1));

        lblTienDVHienTai.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTienDVHienTai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTienDVHienTai.setText("Tiền Dịch Vụ Hiện Tại");
        add(lblTienDVHienTai, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, -1, -1));

        lblDoiGX.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblDoiGX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDoiGX.setText("Đổi ");
        add(lblDoiGX, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 170, -1, -1));

        lblDoiDV.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblDoiDV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDoiDV.setText("Đổi");
        add(lblDoiDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, -1, -1));

        lblXeDap.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblXeDap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblXeDap.setText("Xe Đạp");
        add(lblXeDap, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        lblXemay.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblXemay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblXemay.setText("Xe Gắn Máy");
        add(lblXemay, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 130, -1, -1));

        lblHoi.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblHoi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHoi.setText("Xe Hơi");
        add(lblHoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(815, 130, -1, -1));

        lblPhiXeDapHT.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblPhiXeDapHT.setForeground(new java.awt.Color(255, 0, 0));
        lblPhiXeDapHT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhiXeDapHT.setText("0");
        add(lblPhiXeDapHT, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 68, 160, -1));

        lblPhiXeMayHT.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblPhiXeMayHT.setForeground(new java.awt.Color(255, 0, 0));
        lblPhiXeMayHT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhiXeMayHT.setText("0");
        add(lblPhiXeMayHT, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 68, 150, -1));

        lblPhiXeHoiHT.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblPhiXeHoiHT.setForeground(new java.awt.Color(255, 0, 0));
        lblPhiXeHoiHT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhiXeHoiHT.setText("0");
        add(lblPhiXeHoiHT, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, 160, -1));

        txtTienGuiXeDapMoi.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtTienGuiXeDapMoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTienGuiXeDapMoiMouseClicked(evt);
            }
        });
        add(txtTienGuiXeDapMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 168, 159, -1));

        txtTienGuiXeMayMoi.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtTienGuiXeMayMoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTienGuiXeMayMoiMouseClicked(evt);
            }
        });
        add(txtTienGuiXeMayMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 168, 159, -1));

        txtTienGuiXeHoiMoi.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtTienGuiXeHoiMoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTienGuiXeHoiMoiMouseClicked(evt);
            }
        });
        add(txtTienGuiXeHoiMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(761, 172, 159, -1));

        lblTienDVHT.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTienDVHT.setForeground(new java.awt.Color(255, 0, 0));
        lblTienDVHT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTienDVHT.setText("0");
        add(lblTienDVHT, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 260, -1));

        txtTienDichVuMoi.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        add(txtTienDichVuMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 264, -1));

        lblCapNhaTienGuiXe.setBackground(new java.awt.Color(255, 153, 0));
        lblCapNhaTienGuiXe.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblCapNhaTienGuiXe.setForeground(new java.awt.Color(255, 255, 255));
        lblCapNhaTienGuiXe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCapNhaTienGuiXe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Updates_25px.png"))); // NOI18N
        lblCapNhaTienGuiXe.setText(" Cập Nhật");
        lblCapNhaTienGuiXe.setOpaque(true);
        lblCapNhaTienGuiXe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCapNhaTienGuiXeMousePressed(evt);
            }
        });
        add(lblCapNhaTienGuiXe, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 238, 125, 40));

        lblCapNhatTienDV.setBackground(new java.awt.Color(255, 153, 0));
        lblCapNhatTienDV.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblCapNhatTienDV.setForeground(new java.awt.Color(255, 255, 255));
        lblCapNhatTienDV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCapNhatTienDV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Updates_25px.png"))); // NOI18N
        lblCapNhatTienDV.setText(" Cập Nhật");
        lblCapNhatTienDV.setOpaque(true);
        lblCapNhatTienDV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCapNhatTienDVMousePressed(evt);
            }
        });
        add(lblCapNhatTienDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, 125, 47));
    }// </editor-fold>//GEN-END:initComponents

    private void lblCapNhaTienGuiXeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCapNhaTienGuiXeMousePressed
        if (CapNhatGuiXe == 0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập tiền gửi xe mới");
        } else {
            if (checkTienXD() || checkTienXH() || checkTienXM()) {
                this.updateTienTrongCoi();
            }
        }
        CapNhatGuiXe = 0;
    }//GEN-LAST:event_lblCapNhaTienGuiXeMousePressed

    private void lblCapNhatTienDVMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCapNhatTienDVMousePressed
        if (txtTienDichVuMoi.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập tiền dịch vụ mới");
        } else {
            if (checkTienDV()) {
                this.updateTienDV();
            }
        }
    }//GEN-LAST:event_lblCapNhatTienDVMousePressed

    private void txtTienGuiXeDapMoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTienGuiXeDapMoiMouseClicked
        CapNhatGuiXe = 1;
    }//GEN-LAST:event_txtTienGuiXeDapMoiMouseClicked

    private void txtTienGuiXeMayMoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTienGuiXeMayMoiMouseClicked
        CapNhatGuiXe = 1;
    }//GEN-LAST:event_txtTienGuiXeMayMoiMouseClicked

    private void txtTienGuiXeHoiMoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTienGuiXeHoiMoiMouseClicked
        CapNhatGuiXe = 1;
    }//GEN-LAST:event_txtTienGuiXeHoiMoiMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCapNhaTienGuiXe;
    private javax.swing.JLabel lblCapNhatTienDV;
    private javax.swing.JLabel lblDoiDV;
    private javax.swing.JLabel lblDoiGX;
    private javax.swing.JLabel lblHoi;
    private javax.swing.JLabel lblPhiXeDapHT;
    private javax.swing.JLabel lblPhiXeHoiHT;
    private javax.swing.JLabel lblPhiXeMayHT;
    private javax.swing.JLabel lblTienDVHT;
    private javax.swing.JLabel lblTienDVHienTai;
    private javax.swing.JLabel lblTienDichVu;
    private javax.swing.JLabel lblTienGuiXe;
    private javax.swing.JLabel lblTienGuiXeHT;
    private javax.swing.JLabel lblXeDap;
    private javax.swing.JLabel lblXemay;
    private javax.swing.JSeparator sptDV;
    private javax.swing.JTextField txtTienDichVuMoi;
    private javax.swing.JTextField txtTienGuiXeDapMoi;
    private javax.swing.JTextField txtTienGuiXeHoiMoi;
    private javax.swing.JTextField txtTienGuiXeMayMoi;
    // End of variables declaration//GEN-END:variables

    LoaiXeDAO loaiXeDAO = new LoaiXeDAO();
    int CapNhatGuiXe = 0;

    void loadTienTrongCoiHT() {
        ResultSet rs1 = JDBC.executeQuery("SELECT GiaTrongCoi FROM dbo.LoaiXe WHERE LoaixeId = 'XD'");
        ResultSet rs2 = JDBC.executeQuery("SELECT GiaTrongCoi FROM dbo.LoaiXe WHERE LoaixeId = 'XM'");
        ResultSet rs3 = JDBC.executeQuery("SELECT GiaTrongCoi FROM dbo.LoaiXe WHERE LoaixeId = 'XH'");
        try {
            if (rs1.next()) {
                lblPhiXeDapHT.setText(xulySo(rs1.getString(1)));
            }
            if (rs2.next()) {
                lblPhiXeMayHT.setText(xulySo(rs2.getString(1)));
            }
            if (rs3.next()) {
                lblPhiXeHoiHT.setText(xulySo(rs3.getString(1)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    void loadTienDVCBHT() {
        ResultSet rs = JDBC.executeQuery("SELECT * FROM  dbo.TienDichVuCoBan ");
        try {
            if (rs.next()) {
                lblTienDVHT.setText(xulySo(rs.getString(2)));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    void updateTienTrongCoi() {
        try {
            if (!txtTienGuiXeDapMoi.getText().trim().equals("")) {
                loaiXeDAO.updateXeDap(Float.parseFloat(loaiboKhoangTrang(txtTienGuiXeDapMoi.getText())));
                txtTienGuiXeDapMoi.setText("");
                this.loadTienTrongCoiHT();
            }
            if (!txtTienGuiXeMayMoi.getText().trim().equals("")) {
                loaiXeDAO.updateXeMay(Float.parseFloat(loaiboKhoangTrang(txtTienGuiXeMayMoi.getText())));
                txtTienGuiXeMayMoi.setText("");
                this.loadTienTrongCoiHT();
            }
            if (!txtTienGuiXeHoiMoi.getText().trim().equals("")) {
                loaiXeDAO.updateXeHoi(Float.parseFloat(loaiboKhoangTrang(txtTienGuiXeHoiMoi.getText())));
                txtTienGuiXeHoiMoi.setText("");
                this.loadTienTrongCoiHT();
            }
            JOptionPane.showMessageDialog(this, "Cập nhật tiền gửi xe mới thành công");
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    void updateTienDV() {
        try {
            if (!txtTienDichVuMoi.getText().trim().equals("")) {
                loaiXeDAO.updateDichVu(Float.parseFloat(loaiboKhoangTrang(txtTienDichVuMoi.getText())));
                txtTienDichVuMoi.setText("");
                JOptionPane.showMessageDialog(this, "Cập nhật tiền dịch vụ mới thành công");
                this.loadTienDVCBHT();
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    boolean checkTienXD() {
        if (!loaiboKhoangTrang(txtTienGuiXeDapMoi.getText() + "0").matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Tiền gửi xe không được chứa kí tự");
            txtTienGuiXeDapMoi.setText("");
            return false;
        }
        return true;
    }

    boolean checkTienXM() {
        if (!loaiboKhoangTrang(txtTienGuiXeMayMoi.getText()).matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Tiền gửi xe không được chứa kí tự");
            txtTienGuiXeMayMoi.setText("");
            return false;
        }
        return true;
    }

    boolean checkTienXH() {
        if (!loaiboKhoangTrang(txtTienGuiXeHoiMoi.getText()).matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Tiền gửi xe không được chứa kí tự");
            txtTienGuiXeHoiMoi.setText("");
            return false;
        }
        return true;
    }

    boolean checkTienDV() {
        if (!loaiboKhoangTrang(txtTienDichVuMoi.getText()).matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Tiền dịch vụ không được chứa kí tự");
            txtTienDichVuMoi.setText("");
            return false;
        }
        return true;
    }

}
