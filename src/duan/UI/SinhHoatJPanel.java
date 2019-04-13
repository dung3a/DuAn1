/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan.UI;

import duan.DAO.HoaDonSinhHoatDAO;
import duan.JDBC.JDBC;
import duan.JDBC.XuLy;
import duan.model.HoaDonSinhHoat;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anhdu
 */
public class SinhHoatJPanel extends javax.swing.JPanel {

    LocalDate today = LocalDate.now();
    int month = today.getMonthValue(), year = today.getYear();

    public SinhHoatJPanel() {
        initComponents();
        this.loadYear();
        this.load_HoaDon(month, year);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpn_ThanhCongCu = new javax.swing.JPanel();
        jpn_TruyVan = new javax.swing.JPanel();
        lblThang = new javax.swing.JLabel();
        cbo_Thang = new javax.swing.JComboBox<>();
        lblNam = new javax.swing.JLabel();
        cbo_Nam = new javax.swing.JComboBox<>();
        pnlTim = new javax.swing.JLabel();
        lbl_CanHo = new javax.swing.JLabel();
        lbl_ChiSoDienDau = new javax.swing.JLabel();
        lbl_ChiSoNuocDau = new javax.swing.JLabel();
        lbl_ChiSoDienCuoi = new javax.swing.JLabel();
        lbl_ChiSoNuocCuoi = new javax.swing.JLabel();
        lbl_TienDien = new javax.swing.JLabel();
        lbl_TienNuoc = new javax.swing.JLabel();
        txt_CanHo = new javax.swing.JTextField();
        txt_MaHoaDonDien = new javax.swing.JTextField();
        txt_ChiSoDienCuoi = new javax.swing.JTextField();
        txt_ChiSoNuocCuoi = new javax.swing.JTextField();
        txt_ChiSoNuocDau = new javax.swing.JTextField();
        lblNhapHoaDon = new javax.swing.JLabel();
        lblSua = new javax.swing.JLabel();
        txt_ChiSoDienDau = new javax.swing.JTextField();
        lbl_ChiSoDienDau1 = new javax.swing.JLabel();
        lbl_ChiSoNuocDau1 = new javax.swing.JLabel();
        txt_maHoaDonNuoc = new javax.swing.JTextField();
        txt_TienDien = new javax.swing.JTextField();
        txt_TienNuoc = new javax.swing.JTextField();
        tbl_BangThongKe = new javax.swing.JScrollPane();
        tbl_ThongKe = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1040, 610));
        setMinimumSize(new java.awt.Dimension(1040, 610));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpn_ThanhCongCu.setBackground(new java.awt.Color(255, 255, 255));
        jpn_ThanhCongCu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jpn_ThanhCongCu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpn_TruyVan.setBackground(new java.awt.Color(255, 255, 255));
        jpn_TruyVan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hóa Đơn Theo Tháng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(255, 0, 0))); // NOI18N

        lblThang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblThang.setText("Tháng");

        cbo_Thang.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cbo_Thang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        lblNam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNam.setText("Năm");

        cbo_Nam.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        pnlTim.setBackground(new java.awt.Color(255, 102, 102));
        pnlTim.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pnlTim.setForeground(new java.awt.Color(255, 255, 255));
        pnlTim.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Search_25px.png"))); // NOI18N
        pnlTim.setText("Tìm");
        pnlTim.setOpaque(true);
        pnlTim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlTimMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jpn_TruyVanLayout = new javax.swing.GroupLayout(jpn_TruyVan);
        jpn_TruyVan.setLayout(jpn_TruyVanLayout);
        jpn_TruyVanLayout.setHorizontalGroup(
            jpn_TruyVanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_TruyVanLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jpn_TruyVanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbo_Nam, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblThang)
                    .addComponent(cbo_Thang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNam)
                    .addComponent(pnlTim, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jpn_TruyVanLayout.setVerticalGroup(
            jpn_TruyVanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_TruyVanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblThang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbo_Thang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbo_Nam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlTim, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpn_ThanhCongCu.add(jpn_TruyVan, new org.netbeans.lib.awtextra.AbsoluteConstraints(778, 27, 220, -1));

        lbl_CanHo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_CanHo.setText("Căn Hộ");
        jpn_ThanhCongCu.add(lbl_CanHo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        lbl_ChiSoDienDau.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_ChiSoDienDau.setText("Mã Hóa Đơn Điện");
        jpn_ThanhCongCu.add(lbl_ChiSoDienDau, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        lbl_ChiSoNuocDau.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_ChiSoNuocDau.setText("Chỉ Số Nước Đầu");
        jpn_ThanhCongCu.add(lbl_ChiSoNuocDau, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        lbl_ChiSoDienCuoi.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_ChiSoDienCuoi.setText("Chỉ Số Điện Cuối");
        jpn_ThanhCongCu.add(lbl_ChiSoDienCuoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        lbl_ChiSoNuocCuoi.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_ChiSoNuocCuoi.setText("Chỉ Số Nước Cuối");
        jpn_ThanhCongCu.add(lbl_ChiSoNuocCuoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        lbl_TienDien.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_TienDien.setText("Tiền Điện");
        jpn_ThanhCongCu.add(lbl_TienDien, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        lbl_TienNuoc.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_TienNuoc.setText("Tiền Nước");
        jpn_ThanhCongCu.add(lbl_TienNuoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));

        txt_CanHo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpn_ThanhCongCu.add(txt_CanHo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 132, -1));

        txt_MaHoaDonDien.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpn_ThanhCongCu.add(txt_MaHoaDonDien, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 190, -1));

        txt_ChiSoDienCuoi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpn_ThanhCongCu.add(txt_ChiSoDienCuoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 190, -1));

        txt_ChiSoNuocCuoi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpn_ThanhCongCu.add(txt_ChiSoNuocCuoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 190, -1));

        txt_ChiSoNuocDau.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpn_ThanhCongCu.add(txt_ChiSoNuocDau, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 190, -1));

        lblNhapHoaDon.setBackground(new java.awt.Color(153, 204, 0));
        lblNhapHoaDon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNhapHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        lblNhapHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNhapHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/New.png"))); // NOI18N
        lblNhapHoaDon.setText("Nhập Hóa Đơn ");
        lblNhapHoaDon.setOpaque(true);
        lblNhapHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblNhapHoaDonMousePressed(evt);
            }
        });
        jpn_ThanhCongCu.add(lblNhapHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 160, 40));

        lblSua.setBackground(new java.awt.Color(255, 153, 0));
        lblSua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSua.setForeground(new java.awt.Color(255, 255, 255));
        lblSua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Updates_25px.png"))); // NOI18N
        lblSua.setText("Cập Nhật");
        lblSua.setOpaque(true);
        lblSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSuaMousePressed(evt);
            }
        });
        jpn_ThanhCongCu.add(lblSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 110, 40));

        txt_ChiSoDienDau.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpn_ThanhCongCu.add(txt_ChiSoDienDau, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 190, -1));

        lbl_ChiSoDienDau1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_ChiSoDienDau1.setText("Chỉ Số Điện Đầu");
        jpn_ThanhCongCu.add(lbl_ChiSoDienDau1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        lbl_ChiSoNuocDau1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_ChiSoNuocDau1.setText("Mã Hóa Đơn Nước");
        jpn_ThanhCongCu.add(lbl_ChiSoNuocDau1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        txt_maHoaDonNuoc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpn_ThanhCongCu.add(txt_maHoaDonNuoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 190, -1));

        txt_TienDien.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpn_ThanhCongCu.add(txt_TienDien, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 190, -1));

        txt_TienNuoc.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpn_ThanhCongCu.add(txt_TienNuoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, 190, -1));

        add(jpn_ThanhCongCu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 300));

        tbl_ThongKe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Căn Hộ", "Mã Hóa Đơn Điện", "Chỉ Số Điện Đầu", "Chỉ Số Điện Cuối", "Tiền Điện", "Mã Hóa Đơn Nước", "Chỉ Số Nước Đầu", "Chỉ Số Nước Cuối", "Tiền Nước"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_ThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ThongKeMouseClicked(evt);
            }
        });
        tbl_BangThongKe.setViewportView(tbl_ThongKe);

        add(tbl_BangThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 312, 1016, 270));
    }// </editor-fold>//GEN-END:initComponents

    private void pnlTimMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTimMousePressed
        int Month = Integer.parseInt((String) cbo_Thang.getSelectedItem());
        int Year = Integer.parseInt((String) cbo_Nam.getSelectedItem());
        this.load_HoaDon(Month, Year);
        check = 1;
    }//GEN-LAST:event_pnlTimMousePressed

    private void tbl_ThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ThongKeMouseClicked
        index = tbl_ThongKe.getSelectedRow();
        txt_CanHo.disable();
        moi = 1;
        if (check != 0) {
            int Month = Integer.parseInt((String) cbo_Thang.getSelectedItem());
            int Year = Integer.parseInt((String) cbo_Nam.getSelectedItem());
            this.edit_HD(Month, Year);
        } else {
            this.edit_HD(month, year);
        }
    }//GEN-LAST:event_tbl_ThongKeMouseClicked

    private void lblNhapHoaDonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNhapHoaDonMousePressed
        if (moi == 1) {
            this.newmodel();
            moi = 0;
            check = 0;
        } else if (checkDaCo(month, year)) {
            this.checkTonTaiCanHo();
            this.newmodel();
            check = 0;
        }

    }//GEN-LAST:event_lblNhapHoaDonMousePressed

    private void lblSuaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSuaMousePressed
        if (check != 0) {
            int Month = Integer.parseInt((String) cbo_Thang.getSelectedItem());
            int Year = Integer.parseInt((String) cbo_Nam.getSelectedItem());
            this.update_HD(Month, Year);
            this.newmodel();
            moi = 0;
        } else {
            this.update_HD(month, year);
            this.newmodel();
            moi = 0;
        }
    }//GEN-LAST:event_lblSuaMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbo_Nam;
    private javax.swing.JComboBox<String> cbo_Thang;
    private javax.swing.JPanel jpn_ThanhCongCu;
    private javax.swing.JPanel jpn_TruyVan;
    private javax.swing.JLabel lblNam;
    private javax.swing.JLabel lblNhapHoaDon;
    private javax.swing.JLabel lblSua;
    private javax.swing.JLabel lblThang;
    private javax.swing.JLabel lbl_CanHo;
    private javax.swing.JLabel lbl_ChiSoDienCuoi;
    private javax.swing.JLabel lbl_ChiSoDienDau;
    private javax.swing.JLabel lbl_ChiSoDienDau1;
    private javax.swing.JLabel lbl_ChiSoNuocCuoi;
    private javax.swing.JLabel lbl_ChiSoNuocDau;
    private javax.swing.JLabel lbl_ChiSoNuocDau1;
    private javax.swing.JLabel lbl_TienDien;
    private javax.swing.JLabel lbl_TienNuoc;
    private javax.swing.JLabel pnlTim;
    private javax.swing.JScrollPane tbl_BangThongKe;
    private javax.swing.JTable tbl_ThongKe;
    private javax.swing.JTextField txt_CanHo;
    private javax.swing.JTextField txt_ChiSoDienCuoi;
    private javax.swing.JTextField txt_ChiSoDienDau;
    private javax.swing.JTextField txt_ChiSoNuocCuoi;
    private javax.swing.JTextField txt_ChiSoNuocDau;
    private javax.swing.JTextField txt_MaHoaDonDien;
    private javax.swing.JTextField txt_TienDien;
    private javax.swing.JTextField txt_TienNuoc;
    private javax.swing.JTextField txt_maHoaDonNuoc;
    // End of variables declaration//GEN-END:variables

    ResultSet rs = null;
    int index = 0, check = 0, moi = 1;
    HoaDonSinhHoatDAO hoaDonSinhHoatDAO = new HoaDonSinhHoatDAO();

    private void loadYear() {
        cbo_Nam.removeAllItems();
        rs = JDBC.executeQuery("SELECT DISTINCT  YEAR(NgayThang) AS Nam FROM dbo.HoaDonInternet");
        try {
            while (rs.next()) {
                cbo_Nam.addItem(rs.getString("Nam"));
            }
            cbo_Nam.setSelectedItem(1);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    void load_HoaDon(int Thang, int Nam) {
        DefaultTableModel model = (DefaultTableModel) tbl_ThongKe.getModel();
        model.setRowCount(0);
        try {
            List<HoaDonSinhHoat> list_SP = hoaDonSinhHoatDAO.selectHoaDon(Thang, Nam);
            for (HoaDonSinhHoat HD : list_SP) {   //Tạo vong lặp for 

                Object[] row = {
                    HD.getCanHoid(),
                    HD.getMaHDDien(),
                    HD.getChiSoDienBanDau(),
                    HD.getChiSoDienCuoi(),
                    XuLy.xulySo(String.valueOf(HD.getTienDien())),
                    HD.getMaHDNuoc(),
                    HD.getChiSoNuocBanDau(),
                    HD.getChiSoNuocCuoi(),
                    XuLy.xulySo(String.valueOf(HD.getTienNuoc()))
                };
                model.addRow(row);
            }
        } catch (ExceptionInInitializerError e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu !");
            System.err.println(e);
        }
    }

    void setModel_HD(HoaDonSinhHoat model) {
        txt_CanHo.setText(model.getCanHoid());
        txt_MaHoaDonDien.setText(model.getMaHDDien());
        txt_ChiSoDienDau.setText(String.valueOf(model.getChiSoDienBanDau()));
        txt_ChiSoDienCuoi.setText(String.valueOf(model.getChiSoDienCuoi()));
        txt_TienDien.setText(String.valueOf(model.getTienDien()));
        txt_maHoaDonNuoc.setText(model.getMaHDNuoc());
        txt_ChiSoNuocDau.setText(String.valueOf(model.getChiSoNuocBanDau()));
        txt_ChiSoNuocCuoi.setText(String.valueOf(model.getChiSoNuocCuoi()));
        txt_TienNuoc.setText(String.valueOf(model.getTienNuoc()));
    }

    void edit_HD(int Month, int Year) {
        try {
            String makh = (String) tbl_ThongKe.getValueAt(index, 0);
            HoaDonSinhHoat model = hoaDonSinhHoatDAO.selectHoaDonIdCH(makh, Month, Year);
            if (model != null) {
                this.setModel_HD(model);
            }
        } catch (ExceptionInInitializerError e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu!");
            System.err.println(e);
        }
    }

    public String CanhoId() {
        String CanHoID = "";
        rs = JDBC.executeQuery("SELECT CanHoId FROM dbo.CanHo WHERE MaSoCanHo = ?", txt_CanHo.getText());
        try {
            while (rs.next()) {
                CanHoID = rs.getString(1);
            }
        } catch (Exception e) {
        }
        return CanHoID;
    }

    HoaDonSinhHoat getModel_KH() {
        HoaDonSinhHoat model = new HoaDonSinhHoat();
        model.setCanHoid(CanhoId());
        if (txt_MaHoaDonDien.getText().trim().equals("")) {
            model.setMaHDDien("");
        } else {
            model.setMaHDDien(txt_MaHoaDonDien.getText());
        }
        if (txt_ChiSoDienDau.getText().trim().equals("")) {
            model.setChiSoDienBanDau(0);
        } else {
            model.setChiSoDienBanDau(Integer.parseInt(txt_ChiSoDienDau.getText()));
        }
        if (txt_ChiSoDienCuoi.getText().trim().equals("")) {
            model.setChiSoDienCuoi(0);
        } else {
            model.setChiSoDienCuoi(Integer.parseInt(txt_ChiSoDienCuoi.getText()));
        }
        if (txt_TienDien.getText().trim().equals("")) {
            model.setTienDien(0);
        } else {
            model.setTienDien(Integer.parseInt(txt_TienDien.getText()));
        }
        if (txt_maHoaDonNuoc.getText().trim().equals("")) {
            model.setMaHDNuoc("");
        } else {
            model.setMaHDNuoc(txt_maHoaDonNuoc.getText());
        }
        if (txt_ChiSoNuocDau.getText().trim().equals("")) {
            model.setChiSoNuocBanDau(0);
        } else {
            model.setChiSoNuocBanDau(Integer.parseInt(txt_ChiSoNuocDau.getText()));
        }
        if (txt_ChiSoNuocCuoi.getText().trim().equals("")) {
            model.setChiSoNuocCuoi(0);
        } else {
            model.setChiSoNuocCuoi(Integer.parseInt(txt_ChiSoNuocCuoi.getText()));
        }
        if (txt_TienNuoc.getText().trim().equals("")) {
            model.setTienNuoc(0);
        } else {
            model.setTienNuoc(Integer.parseInt(txt_TienNuoc.getText()));
        }
        return model;
    }

    void insert_HD() {
        HoaDonSinhHoat model = getModel_KH();
        try {
            hoaDonSinhHoatDAO.insertHoaDon(model);
            this.load_HoaDon(month, year);
            JOptionPane.showMessageDialog(this, "Thêm hóa đơn căn hộ " + txt_CanHo.getText() + " thành công!");
        } catch (ExceptionInInitializerError e) {
            JOptionPane.showMessageDialog(this, "Thêm hóa đơn thất bại!");
            System.err.println(e);
        }
    }

    void update_HD(int Month, int Year) {
        HoaDonSinhHoat model = getModel_KH();
        try {
            hoaDonSinhHoatDAO.updateHoaDon(model, Month, Year);
            this.load_HoaDon(month, year);
            JOptionPane.showMessageDialog(this, "Cập nhật hóa đơn căn hộ " + txt_CanHo.getText() + " thành công!");
        } catch (ExceptionInInitializerError e) {
            JOptionPane.showMessageDialog(this, "Cập nhật hóa đơn thất bại!");
            System.err.println(e);
        }
    }

    void checkTonTaiCanHo() {
        rs = JDBC.executeQuery("SELECT MaSoCanHo FROM dbo.CanHo WHERE MaSoCanHo = ? ", txt_CanHo.getText());
        try {
            if (rs.next()) {
                String CHID = rs.getString(1);
                if (CHID != null) {
                    insert_HD();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Sai mã căn hộ hoặc không tồn tại căn hộ này");
                txt_CanHo.setText("");
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    boolean checkDaCo(int Month, int Year) {
        rs = JDBC.executeQuery("SELECT CanHoId FROM dbo.HoaDonSinhHoat"
                + " WHERE CanHoId = ? AND MONTH(NgayThang) = ? AND YEAR(NgayThang) = ?",
                CanhoId(), Month, Year);
        try {
            while (rs.next()) {
                String CHID = rs.getString(1);
                System.err.println(CHID);
                if (CHID.equals(CanhoId())) {
                    JOptionPane.showMessageDialog(this, "Căn hộ " + txt_CanHo.getText() + " đã có hóa đơn tháng này");
                    return false;
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return true;
    }

    void newmodel() {
        txt_CanHo.enable();
        txt_CanHo.setText("");
        txt_ChiSoDienCuoi.setText("");
        txt_ChiSoDienDau.setText("");
        txt_ChiSoNuocCuoi.setText("");
        txt_ChiSoNuocDau.setText("");
        txt_MaHoaDonDien.setText("");
        txt_TienDien.setText("");
        txt_TienNuoc.setText("");
        txt_maHoaDonNuoc.setText("");
    }

}
