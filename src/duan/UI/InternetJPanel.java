/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan.UI;

import duan.DAO.HoaDonInternetDAO;
import duan.JDBC.JDBC;
import duan.JDBC.XuLy;
import duan.model.HoaDonInternet;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InternetJPanel extends javax.swing.JPanel {

    LocalDate today = LocalDate.now();
    int month = today.getMonthValue(), year = today.getYear();

    public InternetJPanel() {
        initComponents();
        this.loadYear();
        this.load_HoaDonInternet(month, year);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbl_BangInternet = new javax.swing.JScrollPane();
        tbl_ChiTietInternet = new javax.swing.JTable();
        jpn_TacVu = new javax.swing.JPanel();
        lbl_CanHo = new javax.swing.JLabel();
        lbl_TienInternet = new javax.swing.JLabel();
        jpn_TruyVan = new javax.swing.JPanel();
        cbo_Nam = new javax.swing.JComboBox<>();
        lbl_Nam = new javax.swing.JLabel();
        lbl_Thang = new javax.swing.JLabel();
        cbo_Thang = new javax.swing.JComboBox<>();
        lbl_TruyVan = new javax.swing.JLabel();
        txt_TienInternet = new javax.swing.JTextField();
        lbl_TaoHDThang = new javax.swing.JLabel();
        lbl_Sua = new javax.swing.JLabel();
        lbl_MaHoaDon = new javax.swing.JLabel();
        txt_MaHoaDon = new javax.swing.JTextField();
        txt_MaCH = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1040, 660));
        setMinimumSize(new java.awt.Dimension(1040, 660));
        setPreferredSize(new java.awt.Dimension(1040, 660));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_ChiTietInternet.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tbl_ChiTietInternet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Căn Hộ", "Mã Hóa Đơn Internet", "Tiền Internet"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_ChiTietInternet.setRowHeight(22);
        tbl_ChiTietInternet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ChiTietInternetMouseClicked(evt);
            }
        });
        tbl_BangInternet.setViewportView(tbl_ChiTietInternet);

        add(tbl_BangInternet, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 246, 1020, 340));

        jpn_TacVu.setBackground(new java.awt.Color(255, 255, 255));
        jpn_TacVu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        lbl_CanHo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_CanHo.setText("Căn Hộ");

        lbl_TienInternet.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_TienInternet.setText("Tiền Internet");

        jpn_TruyVan.setBackground(new java.awt.Color(255, 255, 255));
        jpn_TruyVan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hóa Đơn Theo Tháng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 0, 0))); // NOI18N

        cbo_Nam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        lbl_Nam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Nam.setText("Năm");

        lbl_Thang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Thang.setText("Tháng");

        cbo_Thang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbo_Thang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        lbl_TruyVan.setBackground(new java.awt.Color(255, 102, 102));
        lbl_TruyVan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_TruyVan.setForeground(new java.awt.Color(255, 255, 255));
        lbl_TruyVan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_TruyVan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Search.png"))); // NOI18N
        lbl_TruyVan.setText("   Tìm");
        lbl_TruyVan.setOpaque(true);
        lbl_TruyVan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_TruyVanMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jpn_TruyVanLayout = new javax.swing.GroupLayout(jpn_TruyVan);
        jpn_TruyVan.setLayout(jpn_TruyVanLayout);
        jpn_TruyVanLayout.setHorizontalGroup(
            jpn_TruyVanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_TruyVanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpn_TruyVanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Thang)
                    .addComponent(lbl_Nam))
                .addGap(18, 18, 18)
                .addGroup(jpn_TruyVanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbo_Nam, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpn_TruyVanLayout.createSequentialGroup()
                        .addComponent(cbo_Thang, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_TruyVan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jpn_TruyVanLayout.setVerticalGroup(
            jpn_TruyVanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_TruyVanLayout.createSequentialGroup()
                .addGroup(jpn_TruyVanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpn_TruyVanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpn_TruyVanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Thang)
                            .addComponent(cbo_Thang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE))
                    .addGroup(jpn_TruyVanLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lbl_TruyVan, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jpn_TruyVanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Nam)
                    .addComponent(cbo_Nam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        txt_TienInternet.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbl_TaoHDThang.setBackground(new java.awt.Color(153, 204, 0));
        lbl_TaoHDThang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_TaoHDThang.setForeground(new java.awt.Color(255, 255, 255));
        lbl_TaoHDThang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_TaoHDThang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/New.png"))); // NOI18N
        lbl_TaoHDThang.setText("  Nhập Hóa Đơn");
        lbl_TaoHDThang.setOpaque(true);
        lbl_TaoHDThang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_TaoHDThangMousePressed(evt);
            }
        });

        lbl_Sua.setBackground(new java.awt.Color(255, 153, 0));
        lbl_Sua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Sua.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Sua.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Updates_25px.png"))); // NOI18N
        lbl_Sua.setText("Cập Nhật");
        lbl_Sua.setOpaque(true);
        lbl_Sua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_SuaMousePressed(evt);
            }
        });

        lbl_MaHoaDon.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_MaHoaDon.setText("Mã Hóa Đơn ");

        txt_MaHoaDon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_MaCH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jpn_TacVuLayout = new javax.swing.GroupLayout(jpn_TacVu);
        jpn_TacVu.setLayout(jpn_TacVuLayout);
        jpn_TacVuLayout.setHorizontalGroup(
            jpn_TacVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_TacVuLayout.createSequentialGroup()
                .addGroup(jpn_TacVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpn_TacVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jpn_TacVuLayout.createSequentialGroup()
                            .addGap(68, 68, 68)
                            .addComponent(lbl_CanHo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_MaCH, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpn_TacVuLayout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addGroup(jpn_TacVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jpn_TacVuLayout.createSequentialGroup()
                                    .addGap(0, 3, Short.MAX_VALUE)
                                    .addComponent(lbl_MaHoaDon)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_MaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jpn_TacVuLayout.createSequentialGroup()
                                    .addComponent(lbl_TienInternet)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_TienInternet)))))
                    .addGroup(jpn_TacVuLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(lbl_TaoHDThang, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(jpn_TruyVan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jpn_TacVuLayout.setVerticalGroup(
            jpn_TacVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn_TacVuLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jpn_TacVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpn_TruyVan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpn_TacVuLayout.createSequentialGroup()
                        .addGroup(jpn_TacVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_CanHo)
                            .addComponent(txt_MaCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpn_TacVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_MaHoaDon)
                            .addComponent(txt_MaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jpn_TacVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_TienInternet)
                            .addComponent(txt_TienInternet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jpn_TacVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_TaoHDThang, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        add(jpn_TacVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_TruyVanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_TruyVanMousePressed
        int Month = Integer.parseInt((String) cbo_Thang.getSelectedItem());
        int Year = Integer.parseInt((String) cbo_Nam.getSelectedItem());
        this.load_HoaDonInternet(Month, Year);
        check = 1;
    }//GEN-LAST:event_lbl_TruyVanMousePressed

    private void tbl_ChiTietInternetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ChiTietInternetMouseClicked
        index = tbl_ChiTietInternet.getSelectedRow();
        txt_MaCH.disable();
        if (check != 0) {
            int Month = Integer.parseInt((String) cbo_Thang.getSelectedItem());
            int Year = Integer.parseInt((String) cbo_Nam.getSelectedItem());
            this.edit_HD(Month, Year);
        } else {
            this.edit_HD(month, year);
        }
        moi = 0;
    }//GEN-LAST:event_tbl_ChiTietInternetMouseClicked

    private void lbl_TaoHDThangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_TaoHDThangMousePressed
        if (moi == 0) {
            this.newModel();
            moi = 1;
        } else if (checkDaCo(month, year) && checkTrong() && checkNguoiO()) {
            this.checkTonTaiCanHo();
            check = 0;
            this.newModel();
            this.load_HoaDonInternet(year, year);
        }
    }//GEN-LAST:event_lbl_TaoHDThangMousePressed

    private void lbl_SuaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_SuaMousePressed
        if (checkTrong()) {
            if (check != 0) {
                int Month = Integer.parseInt((String) cbo_Thang.getSelectedItem());
                int Year = Integer.parseInt((String) cbo_Nam.getSelectedItem());
                this.update_HD(Month, Year);
            } else {
                this.update_HD(month, year);
            }
        }
        moi = 0;
    }//GEN-LAST:event_lbl_SuaMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbo_Nam;
    private javax.swing.JComboBox<String> cbo_Thang;
    private javax.swing.JPanel jpn_TacVu;
    private javax.swing.JPanel jpn_TruyVan;
    private javax.swing.JLabel lbl_CanHo;
    private javax.swing.JLabel lbl_MaHoaDon;
    private javax.swing.JLabel lbl_Nam;
    private javax.swing.JLabel lbl_Sua;
    private javax.swing.JLabel lbl_TaoHDThang;
    private javax.swing.JLabel lbl_Thang;
    private javax.swing.JLabel lbl_TienInternet;
    private javax.swing.JLabel lbl_TruyVan;
    private javax.swing.JScrollPane tbl_BangInternet;
    private javax.swing.JTable tbl_ChiTietInternet;
    private javax.swing.JTextField txt_MaCH;
    private javax.swing.JTextField txt_MaHoaDon;
    private javax.swing.JTextField txt_TienInternet;
    // End of variables declaration//GEN-END:variables
    ResultSet rs = null;
    int index = 0, check = 0, moi = 1;
    HoaDonInternetDAO hoaDonInternetDAO = new HoaDonInternetDAO();

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

    void load_HoaDonInternet(int Thang, int Nam) {
        DefaultTableModel model = (DefaultTableModel) tbl_ChiTietInternet.getModel();
        model.setRowCount(0);
        try {
            List<HoaDonInternet> list_SP = hoaDonInternetDAO.selectHoaDon(Thang, Nam);
            for (HoaDonInternet HD : list_SP) {   //Tạo vong lặp for 

                Object[] row = {
                    HD.getCanHoid(),
                    HD.getHoaDonInternetid(),
                    XuLy.xulySo(String.valueOf(HD.getTien()))};
                model.addRow(row);
            }
        } catch (ExceptionInInitializerError e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu !");
            System.err.println(e);
        }
    }

    void setModel_HD(HoaDonInternet model) {
        txt_MaCH.setText(model.getCanHoid());
        txt_MaHoaDon.setText(model.getHoaDonInternetid());
        txt_TienInternet.setText(String.valueOf(model.getTien()));
    }

    void edit_HD(int Month, int Year) {
        try {
            String makh = (String) tbl_ChiTietInternet.getValueAt(index, 0);
            HoaDonInternet model = hoaDonInternetDAO.selectHoaDonIdCH(makh, Month, Year);
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
        rs = JDBC.executeQuery("SELECT CanHoId FROM dbo.CanHo WHERE MaSoCanHo = ?", txt_MaCH.getText());
        try {
            while (rs.next()) {
                CanHoID = rs.getString(1);
            }
        } catch (Exception e) {
        }
        return CanHoID;
    }

    HoaDonInternet getModel_KH() {
        HoaDonInternet model = new HoaDonInternet();
        model.setHoaDonInternetid(txt_MaHoaDon.getText());
        model.setCanHoid(CanhoId());
        model.setTien(Integer.parseInt(txt_TienInternet.getText()));
        return model;
    }

    void newModel() {
        txt_MaCH.enable();
        txt_MaCH.setText("");
        txt_MaHoaDon.setText("");
        txt_TienInternet.setText("");
    }

    void insert_HD() {
        HoaDonInternet model = getModel_KH();
        try {

            hoaDonInternetDAO.insertHoaDon(model);
            this.load_HoaDonInternet(month, year);
            JOptionPane.showMessageDialog(this, "Thêm hóa đơn căn hộ " + txt_MaCH.getText() + " thành công!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Thêm hóa đơn thất bại!");
            System.err.println(e);
        }
    }

    void update_HD(int Month, int Year) {
        HoaDonInternet model = getModel_KH();
        try {
            hoaDonInternetDAO.updateHoaDon(model, Month, Year);
            this.load_HoaDonInternet(Month, Year);
            this.newModel();
            JOptionPane.showMessageDialog(this, "Cập nhật hóa đơn căn hộ" + txt_MaCH.getText() + " thành công!");
        } catch (Exception e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(this, "Cập nhật hóa đơn thất bại!");
        }
    }

    void checkTonTaiCanHo() {
        rs = JDBC.executeQuery("SELECT MaSoCanHo FROM dbo.CanHo WHERE MaSoCanHo = ? ", txt_MaCH.getText());
        try {
            if (rs.next()) {
                String CHID = rs.getString(1);
                if (CHID != null) {
                    insert_HD();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Sai mã căn hộ hoặc không tồn tại căn hộ này");
                txt_MaCH.setText("");
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    boolean checkDaCo(int Month, int Year) {
        rs = JDBC.executeQuery("SELECT CanHoId FROM dbo.HoaDonInternet"
                + " WHERE CanHoId = ? AND MONTH(NgayThang) = ? AND YEAR(NgayThang) = ?",
                CanhoId(), Month, Year);
        try {
            while (rs.next()) {
                String CHID = rs.getString(1);
                System.err.println(CHID);
                if (CHID.equals(CanhoId())) {
                    JOptionPane.showMessageDialog(this, "Căn hộ " + txt_MaCH.getText() + " đã có hóa đơn tháng này");
                    return false;
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return true;
    }

     boolean checkNguoiO() {
        rs = JDBC.executeQuery("SELECT COUNT(KH.KhachHangId) FROM dbo.ThongTinKhachHang KH JOIN dbo.CanHo "
                + "CH ON CH.CanHoId = KH.CanHoId WHERE CH.MaSoCanHo = ? ", txt_MaCH.getText());
        try {
            if (rs.next()) {
                int SL = rs.getInt(1);
                if (SL == 0) {
                    JOptionPane.showMessageDialog(this, "Căn hộ này không có người ở");
                    txt_MaCH.setText("");
                    return false;
                }
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
        return true;
    }
    boolean checkTrong() {
        if (txt_MaCH.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Không để trống mã căn hộ ");
            txt_MaCH.setVisible(true);
            return false;
        } else if (txt_MaHoaDon.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Không để trống mã hóa đơn");
            txt_MaHoaDon.setVisible(true);
            return false;
        } else if (txt_TienInternet.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Không để trống số tiền phí");
            txt_TienInternet.setVisible(true);
            return false;
        }
        return true;
    }
}
