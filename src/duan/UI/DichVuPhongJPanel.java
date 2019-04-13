/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan.UI;

import duan.JDBC.JDBC;
import duan.JDBC.XuLy;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author anhdu
 */
public class DichVuPhongJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DichVu_HoaDonJPanel
     */
    public DichVuPhongJPanel() {
        initComponents();
        this.loadYear();
        this.loadTienDV();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_BangDichVu = new javax.swing.JTable();
        jpn_TongDichVu = new javax.swing.JPanel();
        lbl_CanHo = new javax.swing.JLabel();
        txt_CanHo = new javax.swing.JTextField();
        lbl_TienDVCoBan = new javax.swing.JLabel();
        lbl_Tongtien = new javax.swing.JLabel();
        lbl_TienDV = new javax.swing.JLabel();
        jpn_TruyVan = new javax.swing.JPanel();
        cbo_Thang = new javax.swing.JComboBox<>();
        lbl_Thang = new javax.swing.JLabel();
        cbo_Nam = new javax.swing.JComboBox<>();
        lbl_Nam = new javax.swing.JLabel();
        lbl_Tim = new javax.swing.JLabel();
        lbl_TongTien = new javax.swing.JLabel();
        lbl_TaoHDThang = new javax.swing.JLabel();
        lbl_TienGuiXe = new javax.swing.JLabel();
        lbl_TienGX = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1040, 660));
        setMinimumSize(new java.awt.Dimension(1040, 660));
        setPreferredSize(new java.awt.Dimension(1040, 660));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_BangDichVu.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tbl_BangDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Căn Hộ", "Tiền Dịch Vụ Cơ Bản", "Tiền Gửi Xe", "Tổng Tiền"
            }
        ));
        tbl_BangDichVu.setRowHeight(22);
        jScrollPane1.setViewportView(tbl_BangDichVu);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 276, 1016, 310));

        jpn_TongDichVu.setBackground(new java.awt.Color(255, 255, 255));
        jpn_TongDichVu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jpn_TongDichVu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_CanHo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_CanHo.setText("Căn Hộ");
        jpn_TongDichVu.add(lbl_CanHo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        txt_CanHo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jpn_TongDichVu.add(txt_CanHo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 153, -1));

        lbl_TienDVCoBan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_TienDVCoBan.setText("Tiền Dịch Vụ Cơ Bản");
        jpn_TongDichVu.add(lbl_TienDVCoBan, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        lbl_Tongtien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Tongtien.setText("Tổng Tiền");
        jpn_TongDichVu.add(lbl_Tongtien, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        lbl_TienDV.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_TienDV.setForeground(new java.awt.Color(255, 0, 0));
        lbl_TienDV.setText("200,000");
        jpn_TongDichVu.add(lbl_TienDV, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, -1, -1));

        jpn_TruyVan.setBackground(new java.awt.Color(255, 255, 255));
        jpn_TruyVan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hóa Đơn Theo Tháng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 0, 0))); // NOI18N

        cbo_Thang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbo_Thang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cbo_Thang.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbo_Thang.setInheritsPopupMenu(true);

        lbl_Thang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Thang.setText("Tháng");

        cbo_Nam.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        lbl_Nam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Nam.setText("Năm");

        lbl_Tim.setBackground(new java.awt.Color(255, 102, 102));
        lbl_Tim.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Tim.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Tim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Tim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Search_25px.png"))); // NOI18N
        lbl_Tim.setText("Tim");
        lbl_Tim.setOpaque(true);

        javax.swing.GroupLayout jpn_TruyVanLayout = new javax.swing.GroupLayout(jpn_TruyVan);
        jpn_TruyVan.setLayout(jpn_TruyVanLayout);
        jpn_TruyVanLayout.setHorizontalGroup(
            jpn_TruyVanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_TruyVanLayout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addGroup(jpn_TruyVanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_TruyVanLayout.createSequentialGroup()
                        .addComponent(lbl_Thang)
                        .addGap(18, 18, 18)
                        .addComponent(cbo_Thang, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_TruyVanLayout.createSequentialGroup()
                        .addComponent(lbl_Nam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbo_Nam, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_TruyVanLayout.createSequentialGroup()
                        .addComponent(lbl_Tim, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)))
                .addContainerGap())
        );
        jpn_TruyVanLayout.setVerticalGroup(
            jpn_TruyVanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_TruyVanLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jpn_TruyVanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Thang)
                    .addComponent(cbo_Thang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jpn_TruyVanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo_Nam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Nam))
                .addGap(32, 32, 32)
                .addComponent(lbl_Tim, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpn_TongDichVu.add(jpn_TruyVan, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 240, 230));

        lbl_TongTien.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_TongTien.setForeground(new java.awt.Color(255, 0, 0));
        lbl_TongTien.setText("200,000");
        jpn_TongDichVu.add(lbl_TongTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        lbl_TaoHDThang.setBackground(new java.awt.Color(153, 204, 0));
        lbl_TaoHDThang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_TaoHDThang.setForeground(new java.awt.Color(255, 255, 255));
        lbl_TaoHDThang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_TaoHDThang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/New.png"))); // NOI18N
        lbl_TaoHDThang.setText("Nhập Hóa Đơn");
        lbl_TaoHDThang.setOpaque(true);
        jpn_TongDichVu.add(lbl_TaoHDThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 170, 40));

        lbl_TienGuiXe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_TienGuiXe.setText("Tiền Gửi Xe");
        jpn_TongDichVu.add(lbl_TienGuiXe, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

        lbl_TienGX.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_TienGX.setForeground(new java.awt.Color(255, 0, 0));
        lbl_TienGX.setText("200,000");
        jpn_TongDichVu.add(lbl_TienGX, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, -1, -1));

        add(jpn_TongDichVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 260));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbo_Nam;
    private javax.swing.JComboBox<String> cbo_Thang;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpn_TongDichVu;
    private javax.swing.JPanel jpn_TruyVan;
    private javax.swing.JLabel lbl_CanHo;
    private javax.swing.JLabel lbl_Nam;
    private javax.swing.JLabel lbl_TaoHDThang;
    private javax.swing.JLabel lbl_Thang;
    private javax.swing.JLabel lbl_TienDV;
    private javax.swing.JLabel lbl_TienDVCoBan;
    private javax.swing.JLabel lbl_TienGX;
    private javax.swing.JLabel lbl_TienGuiXe;
    private javax.swing.JLabel lbl_Tim;
    private javax.swing.JLabel lbl_TongTien;
    private javax.swing.JLabel lbl_Tongtien;
    private javax.swing.JTable tbl_BangDichVu;
    private javax.swing.JTextField txt_CanHo;
    // End of variables declaration//GEN-END:variables

    ResultSet rs = null;

    private void loadYear() {
        cbo_Nam.removeAllItems();
        rs = JDBC.executeQuery("SELECT DISTINCT  YEAR(Thang) AS Nam FROM dbo.HoaDonDichVu");
        try {
            while (rs.next()) {
                cbo_Nam.addItem(rs.getString("Nam"));
            }
            cbo_Nam.setSelectedItem(1);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void loadTienDV() {
        cbo_Nam.removeAllItems();
        rs = JDBC.executeQuery("SELECT TienDichVuCoBan FROM dbo.TienDichVuCoBan");
        try {
            while (rs.next()) {
                lbl_TienDV.setText(XuLy.xulySo((rs.getString(1))));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
