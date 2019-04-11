/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan.UI;


import duan.DAO.ThongTinKhachHangDAO;
import duan.DAO.ThongTinKhachHangDAO2;
import static duan.JDBC.XuLy.loaiboKhoangTrang;
import duan.model.ThongTinKhachHang;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileOutputStream;


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
        this.setTitle("Quản Lý Nhân Khẩu");
        this.load_KhachHang();
        this.newModel();
    }
    int xMouse, yMouse;
    int check = 1;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdoGioiTinh = new javax.swing.ButtonGroup();
        pnlMain = new javax.swing.JPanel();
        lblMinimize = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblQuanLyNguoi = new javax.swing.JLabel();
        lbl_Titlebar = new javax.swing.JLabel();
        sclNhanKhau = new javax.swing.JScrollPane();
        tblQuanLyNhanKhau = new javax.swing.JTable();
        lblMaKH = new javax.swing.JLabel();
        lblCanHo = new javax.swing.JLabel();
        lblHoTen = new javax.swing.JLabel();
        lblCMND = new javax.swing.JLabel();
        lblGioiTinh = new javax.swing.JLabel();
        lblSoDienThoai = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblTrangThai = new javax.swing.JLabel();
        lblMaKhachHangShow = new javax.swing.JLabel();
        lblMaCanHoShow = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        txtCMND = new javax.swing.JTextField();
        txtSoDienThoai = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        cboTrangThai = new javax.swing.JComboBox<>();
        txtTimKiem = new javax.swing.JTextField();
        lblTim = new javax.swing.JLabel();
        pnlSua = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        pnlNhap = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        pnlNhap1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setUndecorated(true);

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlMain.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));
        pnlMain.setMaximumSize(new java.awt.Dimension(1000, 700));
        pnlMain.setMinimumSize(new java.awt.Dimension(1000, 700));
        pnlMain.setName(""); // NOI18N

        lblMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Minimize.png"))); // NOI18N
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
        });

        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Close.png"))); // NOI18N
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });

        lblQuanLyNguoi.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        lblQuanLyNguoi.setForeground(new java.awt.Color(255, 255, 255));
        lblQuanLyNguoi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuanLyNguoi.setText("Quản Lý Nhân Khẩu");

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

        sclNhanKhau.setBorder(null);

        tblQuanLyNhanKhau.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tblQuanLyNhanKhau.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Khách Hàng", "Mã Căn Hộ", "Họ Tên", "CMND", "Giới Tính", "Số Điện Thoại", "Email", "Trạng Thái"
            }
        ));
        tblQuanLyNhanKhau.setMaximumSize(new java.awt.Dimension(300, 64));
        tblQuanLyNhanKhau.setMinimumSize(new java.awt.Dimension(300, 64));
        tblQuanLyNhanKhau.setRowHeight(20);
        tblQuanLyNhanKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQuanLyNhanKhauMouseClicked(evt);
            }
        });
        sclNhanKhau.setViewportView(tblQuanLyNhanKhau);

        lblMaKH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMaKH.setText("Mã Khách Hàng");

        lblCanHo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCanHo.setText(" Mã Căn Hộ");

        lblHoTen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblHoTen.setText("Họ Tên");

        lblCMND.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCMND.setText("CMND");

        lblGioiTinh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGioiTinh.setText("Giới Tính");

        lblSoDienThoai.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSoDienThoai.setText("Số Điện Thoại");

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEmail.setText("Email");

        lblTrangThai.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTrangThai.setText("Trạng Thái");

        lblMaKhachHangShow.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        lblMaKhachHangShow.setForeground(new java.awt.Color(255, 51, 0));

        lblMaCanHoShow.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        lblMaCanHoShow.setForeground(new java.awt.Color(255, 51, 0));

        txtHoTen.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtHoTen.setMaximumSize(new java.awt.Dimension(75, 25));
        txtHoTen.setMinimumSize(new java.awt.Dimension(75, 25));

        txtCMND.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtCMND.setMaximumSize(new java.awt.Dimension(75, 25));
        txtCMND.setMinimumSize(new java.awt.Dimension(75, 25));

        txtSoDienThoai.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtSoDienThoai.setMaximumSize(new java.awt.Dimension(75, 25));
        txtSoDienThoai.setMinimumSize(new java.awt.Dimension(75, 25));

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N

        rdoNam.setBackground(new java.awt.Color(255, 255, 255));
        rdoGioiTinh.add(rdoNam);
        rdoNam.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        rdoNam.setText("Nam");

        rdoNu.setBackground(new java.awt.Color(255, 255, 255));
        rdoGioiTinh.add(rdoNu);
        rdoNu.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        rdoNu.setText("Nữ");

        cboTrangThai.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cboTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang Ở", "Tạm Vắng", "Đã Rời Đi" }));

        txtTimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTimKiem.setToolTipText("Nhập mã khách hàng hoặc tên khách hàng");

        lblTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Search_35px_Black.png"))); // NOI18N
        lblTim.setToolTipText("Tìm Kiếm");
        lblTim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTimMouseClicked(evt);
            }
        });

        pnlSua.setBackground(new java.awt.Color(153, 204, 0));
        pnlSua.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlSuaMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Maintenance.png"))); // NOI18N
        jLabel11.setText("Sửa");

        javax.swing.GroupLayout pnlSuaLayout = new javax.swing.GroupLayout(pnlSua);
        pnlSua.setLayout(pnlSuaLayout);
        pnlSuaLayout.setHorizontalGroup(
            pnlSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSuaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlSuaLayout.setVerticalGroup(
            pnlSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlNhap.setBackground(new java.awt.Color(153, 204, 0));
        pnlNhap.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlNhapMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Wite.png"))); // NOI18N
        jLabel12.setText("Nhập ");

        javax.swing.GroupLayout pnlNhapLayout = new javax.swing.GroupLayout(pnlNhap);
        pnlNhap.setLayout(pnlNhapLayout);
        pnlNhapLayout.setHorizontalGroup(
            pnlNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
        );
        pnlNhapLayout.setVerticalGroup(
            pnlNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        pnlNhap1.setBackground(new java.awt.Color(153, 204, 0));
        pnlNhap1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlNhap1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlNhap1MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Wite.png"))); // NOI18N
        jLabel13.setText("Nhập ");

        javax.swing.GroupLayout pnlNhap1Layout = new javax.swing.GroupLayout(pnlNhap1);
        pnlNhap1.setLayout(pnlNhap1Layout);
        pnlNhap1Layout.setHorizontalGroup(
            pnlNhap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNhap1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
        );
        pnlNhap1Layout.setVerticalGroup(
            pnlNhap1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sclNhanKhau, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblQuanLyNguoi))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(960, 960, 960)
                        .addComponent(lblClose))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(920, 920, 920)
                        .addComponent(lblMinimize))
                    .addComponent(lbl_Titlebar, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaKH)
                            .addComponent(lblCanHo)
                            .addComponent(lblHoTen)
                            .addComponent(lblCMND))
                        .addGap(38, 38, 38)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCMND, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMaCanHoShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMaKhachHangShow, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSoDienThoai)
                            .addComponent(lblEmail)
                            .addComponent(lblTrangThai)
                            .addComponent(lblGioiTinh)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addComponent(rdoNam)
                                .addGap(18, 18, 18)
                                .addComponent(rdoNu))
                            .addComponent(txtSoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEmail)
                            .addComponent(cboTrangThai, 0, 265, Short.MAX_VALUE)))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblTim)))
                .addGap(90, 90, 90))
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(pnlNhap1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(pnlNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(pnlSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblQuanLyNguoi))
                    .addComponent(lblClose)
                    .addComponent(lblMinimize)
                    .addComponent(lbl_Titlebar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTim))
                .addGap(34, 34, 34)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addComponent(lblMaKH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(lblCanHo))
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addComponent(lblMaKhachHangShow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(22, 22, 22)
                                .addComponent(lblMaCanHoShow, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHoTen)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCMND)
                            .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGioiTinh)
                            .addComponent(rdoNam)
                            .addComponent(rdoNu)))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSoDienThoai)
                            .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTrangThai)
                            .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlNhap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlSua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlNhap1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addComponent(sclNhanKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblCloseMouseClicked

    private void tblQuanLyNhanKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuanLyNhanKhauMouseClicked
        index = tblQuanLyNhanKhau.getSelectedRow();
        check = 2;
        this.edit_KH();
    }//GEN-LAST:event_tblQuanLyNhanKhauMouseClicked

    private void pnlNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNhapMouseClicked
        if (checkTT() && check == 1) {
            this.insert_KH();
            this.load_KhachHang();
            this.newModel();
        }
    }//GEN-LAST:event_pnlNhapMouseClicked

    private void pnlSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSuaMouseClicked
        check = 1;
        if (checkTT()) {
            this.update_KH();
            this.load_KhachHang();
            this.newModel();
        }

    }//GEN-LAST:event_pnlSuaMouseClicked

    private void lblTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTimMouseClicked
        this.newModel();     
        this.load_KhachHangByID();
        txtTimKiem.setText("");
    }//GEN-LAST:event_lblTimMouseClicked

    private void pnlNhap1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlNhap1MouseClicked
        ExportExcel();
    }//GEN-LAST:event_pnlNhap1MouseClicked

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
    private javax.swing.JComboBox<String> cboTrangThai;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel lblCMND;
    private javax.swing.JLabel lblCanHo;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblMaCanHoShow;
    private javax.swing.JLabel lblMaKH;
    private javax.swing.JLabel lblMaKhachHangShow;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblQuanLyNguoi;
    private javax.swing.JLabel lblSoDienThoai;
    private javax.swing.JLabel lblTim;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JLabel lbl_Titlebar;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlNhap;
    private javax.swing.JPanel pnlNhap1;
    private javax.swing.JPanel pnlSua;
    private javax.swing.ButtonGroup rdoGioiTinh;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JScrollPane sclNhanKhau;
    private javax.swing.JTable tblQuanLyNhanKhau;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    ThongTinKhachHangDAO2 khachHangDAO = new ThongTinKhachHangDAO2();
    int index = 0;
    

    void loadcboTrangThai() {
        if (check == 1) {
            cboTrangThai.removeAllItems();
            cboTrangThai.addItem("Đang Ở");
        } else {
            cboTrangThai.removeAllItems();
            cboTrangThai.addItem("Đang Ở");
            cboTrangThai.addItem("Tạm Vắng");
            cboTrangThai.addItem("Đã Rời Đi");
        }

    }

    void load_KhachHang() {
        DefaultTableModel model = (DefaultTableModel) tblQuanLyNhanKhau.getModel();
        model.setRowCount(0);
        try {
            List<ThongTinKhachHang> list_SP = khachHangDAO.selectQuanLy("");
            for (ThongTinKhachHang KhachHang : list_SP) {   //Tạo vong lặp for 

                Object[] row = {
                    KhachHang.getKhachHangid(),
                    KhachHang.getCanHoid(),
                    KhachHang.getTenKhachHang(),
                    KhachHang.getCMND(),
                    KhachHang.getGioiTinh() ? "Nam" : "Nữ",
                    KhachHang.getSodt(),
                    KhachHang.getEmail(),
                    KhachHang.getTrangThai()};
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu !");
            System.err.println(e);
        }
    }

    void load_KhachHangByID() {
        DefaultTableModel model = (DefaultTableModel) tblQuanLyNhanKhau.getModel();
        model.setRowCount(0);
        try {
            String MaOrName = txtTimKiem.getText();
            List<ThongTinKhachHang> list_SP = khachHangDAO.selectByKeyword(MaOrName);
            for (ThongTinKhachHang KhachHang : list_SP) {   //Tạo vong lặp for 
                Object[] row = {
                    KhachHang.getKhachHangid(),
                    KhachHang.getCanHoid(),
                    KhachHang.getTenKhachHang(),
                    KhachHang.getCMND(),
                    KhachHang.getGioiTinh() ? "Nam" : "Nữ",
                    KhachHang.getSodt(),
                    KhachHang.getEmail(),
                    KhachHang.getTrangThai()};
                model.addRow(row);
            }
        } catch (ExceptionInInitializerError e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu !");
            System.err.println(e);
        }
    }

    void setModel_KH(ThongTinKhachHang model) {
        lblMaKhachHangShow.setText(model.getKhachHangid());
        lblMaCanHoShow.setText(model.getCanHoid());
        txtHoTen.setText(model.getTenKhachHang());
        txtCMND.setText(loaiboKhoangTrang(model.getCMND()));
        txtSoDienThoai.setText(loaiboKhoangTrang(model.getSodt()));
        txtEmail.setText(model.getEmail());
        cboTrangThai.setSelectedItem(model.getTrangThai());
        if (model.getGioiTinh()) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }

    }

    void edit_KH() {
        try {
            String makh = (String) tblQuanLyNhanKhau.getValueAt(index, 0);
            ThongTinKhachHang model = khachHangDAO.selectQuanLyByIdKH(makh);
            if (model != null) {
                this.setModel_KH(model);
            }
        } catch (ExceptionInInitializerError e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu!");
            System.err.println(e);
        }
    }

    ThongTinKhachHang getModel_KH() {
        ThongTinKhachHang model = new ThongTinKhachHang();
        model.setKhachHangid(lblMaKhachHangShow.getText());
        model.setTenKhachHang(txtHoTen.getText());
        model.setCMND(loaiboKhoangTrang(txtCMND.getText()));
        if (rdoNam.isSelected()) {
            model.setGioiTinh(true);
        } else {
            model.setGioiTinh(false);
        }
        model.setSodt(loaiboKhoangTrang(txtSoDienThoai.getText()));
        model.setEmail(txtEmail.getText());
        model.setTrangThai(String.valueOf(cboTrangThai.getSelectedItem()));

        return model;
    }

    void insert_KH() {
        ThongTinKhachHang model = getModel_KH();
        try {

            khachHangDAO.insertQuanLy(model);
            this.load_KhachHang();
            //Hiển thị thông báo
            JOptionPane.showMessageDialog(this, "Thêm khách hàng thành công!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Thêm Khách hàng thất bại!");
            System.err.println(e);
        }
    }

    void update_KH() {
        ThongTinKhachHang model = getModel_KH();
        try {

            khachHangDAO.updateQuanLy(model);
            JOptionPane.showMessageDialog(this, "Cập nhật thông tin khách hàng thành công!");
        } catch (Exception e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(this, "Cập nhật thông tin khách hàng  thất bại!");
        }
    }

    void newModel() {
        txtCMND.setText("");
        txtEmail.setText("");
        txtHoTen.setText("");
        txtSoDienThoai.setText("");
        lblMaCanHoShow.setText("");
        lblMaKhachHangShow.setText("");
        cboTrangThai.setSelectedItem("Đang ở");
        rdoNam.setSelected(true);
    }

    private boolean checkTT() {
        if (txtHoTen.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Không để trống tên của khách hàng!");
            return false;
        } else if (txtSoDienThoai.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Không để trống số điện thoại của khách hàng!");
            return false;
        } else if (txtCMND.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Không để trống CMND của khách hàng!");
            return false;
        } else if (!loaiboKhoangTrang(txtCMND.getText().trim()).matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Số CMND không được chứa kí tự!");
            return false;
        } else if (!txtHoTen.getText().matches("[A-Za-zÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĂăĐđĨĩŨũƠơƯưẠ-ỹ\\s]{1,}")) {
            JOptionPane.showMessageDialog(this, "Tên khách hàng không được chứa kí tự đặc biệt!");
            return false;
        } else if (!txtEmail.getText().matches("^[\\w-_\\.]+\\@[\\w&&[^0-9]]+\\.[\\w&&[^0-9]]+$")) {
            JOptionPane.showMessageDialog(this, "Định dạng email của khách hàng không đúng!");
            return false;
        } else if (!loaiboKhoangTrang(txtSoDienThoai.getText().trim()).matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không được chứa kí tự!");
            return false;

        } else if (loaiboKhoangTrang(txtSoDienThoai.getText()).length() > 10) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không quá 10 số!");
            return false;
        } else if (txtSoDienThoai.getText().length() < 8) {
            JOptionPane.showMessageDialog(this, "Số điện thoại không dưới 8 số!");
            return false;
        } else if (!txtSoDienThoai.getText().substring(0,2).equals("09") 
                || !txtSoDienThoai.getText().substring(0,2).equals("08")
                || !txtSoDienThoai.getText().substring(0,2).equals("03")
                || !txtSoDienThoai.getText().substring(0,2).equals("05")
                || !txtSoDienThoai.getText().substring(0,2).equals("07") ){
            JOptionPane.showMessageDialog(this, "Đầu Số Bắt Đầu Bằng 09 | 08 | 07 | 05 | 03 !");
            return false;
        }
        return true;
    }
    
    
    
    public void ExportExcel(){
         try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet spreadsheet = workbook.createSheet("Danh Sách Khách Hàng");
 
            XSSFRow row = null;
            Cell cell = null;
 
            row = spreadsheet.createRow((short) 2);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("DANH SÁCH KHÁCH HÀNG");
 
            row = spreadsheet.createRow((short) 3);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("STT");
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Mã Khách Hàng");
            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Họ Và Tên ");
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("Căn Hộ ");
            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("CMND");
            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue("Giới tính");
            cell = row.createCell(6, CellType.STRING);
            cell.setCellValue("Số điện thoại");
            cell = row.createCell(7, CellType.STRING);
            cell.setCellValue("Email");
            cell = row.createCell(8, CellType.STRING);
            cell.setCellValue("Trạng Thái");
            cell = row.createCell(9, CellType.STRING);
            cell.setCellValue("Chủ Hộ");
            
            ThongTinKhachHang TTKH = new ThongTinKhachHang();
 
            List<ThongTinKhachHang> list = new ThongTinKhachHangDAO().listTTKH();
 
            for (int i = 0; i < list.size(); i++) {
                ThongTinKhachHang ttkh = list.get(i);
                row = spreadsheet.createRow((short) 4 + i);
                row.setHeight((short) 400);
                row.createCell(0).setCellValue(i + 1);
                row.createCell(1).setCellValue(ttkh.getKhachHangid());
                row.createCell(2).setCellValue(ttkh.getTenKhachHang());
                row.createCell(3).setCellValue(ttkh.getCanHoid());
                row.createCell(4).setCellValue(ttkh.getCMND());
                row.createCell(5).setCellValue(ttkh.getGioiTinh() ? "Nam" : "Nữ");
                row.createCell(6).setCellValue(ttkh.getSodt());
                row.createCell(7).setCellValue(ttkh.getEmail());
                row.createCell(8).setCellValue(ttkh.getTrangThai());
                row.createCell(9).setCellValue(ttkh.isChuHo() ? "X" : " ");
            }
 
            FileOutputStream out = new FileOutputStream(new File("D:/Khách Hàng.xlsx"));
            workbook.write(out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
