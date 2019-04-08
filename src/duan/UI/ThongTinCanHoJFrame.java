/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan.UI;

import duan.DAO.ThongTinKhachHangDAO;
import duan.JDBC.JDBC;
import duan.model.ThongTinKhachHang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anhdu
 */
public class ThongTinCanHoJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ThongTInCanHo
     */
    String masocanho, canhoID;

    public ThongTinCanHoJFrame(String masocanho, String canhoID) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.masocanho = masocanho;
        this.setTitle("Thông Tin Căn Hộ " + masocanho);
        lbl_Title.setText("Thông Tin Căn Hộ " + masocanho);
        this.canhoID = canhoID;
        this.loadThanhVien();
        this.loadChuHo();
        System.err.println(masocanho);
        System.err.println(canhoID);
    }
    int xMouse, yMouse;
    String TenChuHoMoi;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgGioiTinh = new javax.swing.ButtonGroup();
        pnlMain = new javax.swing.JPanel();
        sclKhachhang = new javax.swing.JScrollPane();
        tblKhachhang = new javax.swing.JTable();
        lbl_Title = new javax.swing.JLabel();
        jpn_Minimize = new javax.swing.JLabel();
        jpn_Close = new javax.swing.JLabel();
        lbl_Titlebar = new javax.swing.JLabel();
        pnlMainTab = new javax.swing.JTabbedPane();
        pnlThongTin = new javax.swing.JPanel();
        lblTenKH = new javax.swing.JLabel();
        lblCMND = new javax.swing.JLabel();
        lblGioiTinh = new javax.swing.JLabel();
        lblSoDT = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblChuHo = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        txtCMND = new javax.swing.JTextField();
        txtSoDT = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        cboCo = new javax.swing.JCheckBox();
        btnThem = new javax.swing.JPanel();
        lblThem = new javax.swing.JLabel();
        btnXoa = new javax.swing.JPanel();
        lblXoa = new javax.swing.JLabel();
        lblMaKhachHang = new javax.swing.JLabel();
        txtmaKhachhang = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblTu = new javax.swing.JLabel();
        lblTenChuHo = new javax.swing.JLabel();
        lblDen = new javax.swing.JLabel();
        cboChuHoMoi = new javax.swing.JComboBox<>();
        pnlChuyen = new javax.swing.JPanel();
        lblChuyen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 530));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlMain.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));
        pnlMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sclKhachhang.setToolTipText("Người trong căn hộ");
        sclKhachhang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        tblKhachhang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblKhachhang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Khách Hàng", "Tên Khách Hàng", "CMND", "Giới Tính", "Số ĐT", "Email", "CH"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhachhang.setToolTipText("Người Trong Căn Hộ");
        tblKhachhang.setMaximumSize(new java.awt.Dimension(450, 64));
        tblKhachhang.setMinimumSize(new java.awt.Dimension(450, 64));
        tblKhachhang.setRowHeight(20);
        tblKhachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhachhangMouseClicked(evt);
            }
        });
        sclKhachhang.setViewportView(tblKhachhang);
        if (tblKhachhang.getColumnModel().getColumnCount() > 0) {
            tblKhachhang.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblKhachhang.getColumnModel().getColumn(0).setMaxWidth(100);
            tblKhachhang.getColumnModel().getColumn(1).setPreferredWidth(170);
            tblKhachhang.getColumnModel().getColumn(1).setMaxWidth(200);
            tblKhachhang.getColumnModel().getColumn(2).setPreferredWidth(110);
            tblKhachhang.getColumnModel().getColumn(2).setMaxWidth(110);
            tblKhachhang.getColumnModel().getColumn(3).setPreferredWidth(70);
            tblKhachhang.getColumnModel().getColumn(3).setMaxWidth(70);
            tblKhachhang.getColumnModel().getColumn(4).setPreferredWidth(110);
            tblKhachhang.getColumnModel().getColumn(4).setMaxWidth(110);
            tblKhachhang.getColumnModel().getColumn(6).setMinWidth(30);
            tblKhachhang.getColumnModel().getColumn(6).setPreferredWidth(30);
            tblKhachhang.getColumnModel().getColumn(6).setMaxWidth(30);
        }

        pnlMain.add(sclKhachhang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 810, 200));

        lbl_Title.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        lbl_Title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Title.setText("Thông Tin Căn Hộ");
        pnlMain.add(lbl_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jpn_Minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Minimize.png"))); // NOI18N
        jpn_Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpn_MinimizeMouseClicked(evt);
            }
        });
        pnlMain.add(jpn_Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, -1, -1));

        jpn_Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Close.png"))); // NOI18N
        jpn_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpn_CloseMouseClicked(evt);
            }
        });
        pnlMain.add(jpn_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, -1, -1));

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
        pnlMain.add(lbl_Titlebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 40));

        pnlMainTab.setBackground(new java.awt.Color(255, 255, 255));
        pnlMainTab.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 1, new java.awt.Color(102, 102, 102)));

        pnlThongTin.setBackground(new java.awt.Color(255, 255, 255));
        pnlThongTin.setMaximumSize(new java.awt.Dimension(803, 260));
        pnlThongTin.setMinimumSize(new java.awt.Dimension(803, 260));
        pnlThongTin.setPreferredSize(new java.awt.Dimension(803, 260));
        pnlThongTin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTenKH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTenKH.setText("Tên Khách Hàng");
        pnlThongTin.add(lblTenKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        lblCMND.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCMND.setText("CMND");
        pnlThongTin.add(lblCMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        lblGioiTinh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGioiTinh.setText("Giới Tính");
        pnlThongTin.add(lblGioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        lblSoDT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSoDT.setText("Số ĐT");
        pnlThongTin.add(lblSoDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEmail.setText("Email");
        pnlThongTin.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        lblChuHo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblChuHo.setText("Chủ Hộ ");
        pnlThongTin.add(lblChuHo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, 20));

        txtTenKH.setEditable(false);
        txtTenKH.setBackground(new java.awt.Color(255, 255, 255));
        txtTenKH.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        pnlThongTin.add(txtTenKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 252, -1));

        txtCMND.setEditable(false);
        txtCMND.setBackground(new java.awt.Color(255, 255, 255));
        txtCMND.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        pnlThongTin.add(txtCMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 252, -1));

        txtSoDT.setEditable(false);
        txtSoDT.setBackground(new java.awt.Color(255, 255, 255));
        txtSoDT.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        pnlThongTin.add(txtSoDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 255, -1));

        txtEmail.setEditable(false);
        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        pnlThongTin.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 255, -1));

        rdoNam.setBackground(new java.awt.Color(255, 255, 255));
        btgGioiTinh.add(rdoNam);
        rdoNam.setText("Nam");
        rdoNam.setEnabled(false);
        pnlThongTin.add(rdoNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        rdoNu.setBackground(new java.awt.Color(255, 255, 255));
        btgGioiTinh.add(rdoNu);
        rdoNu.setText("Nữ");
        rdoNu.setEnabled(false);
        pnlThongTin.add(rdoNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        cboCo.setBackground(new java.awt.Color(255, 255, 255));
        cboCo.setText(" ");
        cboCo.setEnabled(false);
        pnlThongTin.add(cboCo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, 20));

        btnThem.setBackground(new java.awt.Color(153, 204, 0));
        btnThem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnThem.setToolTipText("Thêm người vào căn hộ");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });

        lblThem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblThem.setForeground(new java.awt.Color(255, 255, 255));
        lblThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/New.png"))); // NOI18N
        lblThem.setText("Thêm");

        javax.swing.GroupLayout btnThemLayout = new javax.swing.GroupLayout(btnThem);
        btnThem.setLayout(btnThemLayout);
        btnThemLayout.setHorizontalGroup(
            btnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnThemLayout.createSequentialGroup()
                .addComponent(lblThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnThemLayout.setVerticalGroup(
            btnThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblThem, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        pnlThongTin.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        btnXoa.setBackground(new java.awt.Color(255, 102, 102));
        btnXoa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXoa.setToolTipText("Loại bỏ người trong căn hộ");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        lblXoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblXoa.setForeground(new java.awt.Color(255, 255, 255));
        lblXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Trash_25px.png"))); // NOI18N
        lblXoa.setText("Loại Bỏ");

        javax.swing.GroupLayout btnXoaLayout = new javax.swing.GroupLayout(btnXoa);
        btnXoa.setLayout(btnXoaLayout);
        btnXoaLayout.setHorizontalGroup(
            btnXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnXoaLayout.createSequentialGroup()
                .addComponent(lblXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnXoaLayout.setVerticalGroup(
            btnXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblXoa, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        pnlThongTin.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));

        lblMaKhachHang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMaKhachHang.setText("Mã Khách Hàng");
        pnlThongTin.add(lblMaKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        txtmaKhachhang.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        pnlThongTin.add(txtmaKhachhang, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 250, -1));

        pnlMainTab.addTab("Thông Tin", pnlThongTin);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(803, 260));
        jPanel1.setMinimumSize(new java.awt.Dimension(803, 260));

        lblTu.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTu.setText("Từ");

        lblTenChuHo.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        lblTenChuHo.setForeground(new java.awt.Color(255, 0, 0));
        lblTenChuHo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTenChuHo.setText("Chủ Hộ cũ");

        lblDen.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblDen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDen.setText("Đến");

        cboChuHoMoi.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cboChuHoMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboChuHoMoiActionPerformed(evt);
            }
        });

        pnlChuyen.setBackground(new java.awt.Color(255, 153, 0));
        pnlChuyen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlChuyenMouseClicked(evt);
            }
        });

        lblChuyen.setBackground(new java.awt.Color(255, 255, 255));
        lblChuyen.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblChuyen.setForeground(new java.awt.Color(255, 255, 255));
        lblChuyen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblChuyen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Change_User_25px.png"))); // NOI18N
        lblChuyen.setText("Chuyển");

        javax.swing.GroupLayout pnlChuyenLayout = new javax.swing.GroupLayout(pnlChuyen);
        pnlChuyen.setLayout(pnlChuyenLayout);
        pnlChuyenLayout.setHorizontalGroup(
            pnlChuyenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChuyenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlChuyenLayout.setVerticalGroup(
            pnlChuyenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblChuyen, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 803, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(190, 190, 190)
                            .addComponent(lblTu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblTenChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(190, 190, 190)
                            .addComponent(lblDen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(cboChuHoMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addComponent(pnlChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblTu)
                    .addGap(20, 20, 20)
                    .addComponent(lblTenChuHo)
                    .addGap(20, 20, 20)
                    .addComponent(lblDen)
                    .addGap(10, 10, 10)
                    .addComponent(cboChuHoMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(14, 14, 14)
                    .addComponent(pnlChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pnlMainTab.addTab("Chuyển Chủ Hộ", jPanel1);

        pnlMain.add(pnlMainTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 810, 290));

        getContentPane().add(pnlMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 530));

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

    private void jpn_MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpn_MinimizeMouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jpn_MinimizeMouseClicked

    private void jpn_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpn_CloseMouseClicked
        this.dispose();
    }//GEN-LAST:event_jpn_CloseMouseClicked

    private void tblKhachhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachhangMouseClicked
        index = tblKhachhang.getSelectedRow();
        this.edit_KH();
    }//GEN-LAST:event_tblKhachhangMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.load_KhachHang();
    }//GEN-LAST:event_formWindowOpened

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        if (check()) {
            this.CheckNguoi(txtmaKhachhang.getText());
        }
        this.newmodel();
    }//GEN-LAST:event_btnThemMouseClicked

    private void pnlChuyenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlChuyenMouseClicked
        this.chuyenChuHo(TenChuHoMoi);
        this.load_KhachHang();
        this.loadChuHo();
    }//GEN-LAST:event_pnlChuyenMouseClicked

    private void cboChuHoMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboChuHoMoiActionPerformed
        TenChuHoMoi = (String) cboChuHoMoi.getSelectedItem();

        System.err.println(TenChuHoMoi);
    }//GEN-LAST:event_cboChuHoMoiActionPerformed

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        this.loaibo();
    }//GEN-LAST:event_btnXoaMouseClicked

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
            java.util.logging.Logger.getLogger(ThongTinCanHoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongTinCanHoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongTinCanHoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongTinCanHoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongTinCanHoJFrame("", "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgGioiTinh;
    private javax.swing.JPanel btnThem;
    private javax.swing.JPanel btnXoa;
    private javax.swing.JComboBox<String> cboChuHoMoi;
    private javax.swing.JCheckBox cboCo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jpn_Close;
    private javax.swing.JLabel jpn_Minimize;
    private javax.swing.JLabel lblCMND;
    private javax.swing.JLabel lblChuHo;
    private javax.swing.JLabel lblChuyen;
    private javax.swing.JLabel lblDen;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblMaKhachHang;
    private javax.swing.JLabel lblSoDT;
    private javax.swing.JLabel lblTenChuHo;
    private javax.swing.JLabel lblTenKH;
    private javax.swing.JLabel lblThem;
    private javax.swing.JLabel lblTu;
    private javax.swing.JLabel lblXoa;
    private javax.swing.JLabel lbl_Title;
    private javax.swing.JLabel lbl_Titlebar;
    private javax.swing.JPanel pnlChuyen;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JTabbedPane pnlMainTab;
    private javax.swing.JPanel pnlThongTin;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JScrollPane sclKhachhang;
    private javax.swing.JTable tblKhachhang;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtSoDT;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtmaKhachhang;
    // End of variables declaration//GEN-END:variables

    ThongTinKhachHangDAO khachHangDAO = new ThongTinKhachHangDAO();
    int index = 0;

    void loadChuHo() {
        try {
            ResultSet rs = JDBC.executeQuery(" SELECT TT.* FROM  dbo.CanHo CH JOIN dbo.ThongTinKhachHang TT "
                    + "ON CH.KhachHangId = TT.KhachHangId WHERE CH.CanHoId = ?", canhoID);
            if (rs.next()) {
                String Ten = rs.getString(3);
                lblTenChuHo.setText(Ten);
            }
        } catch (SQLException e) {
        }
    }

    void loadThanhVien() {
        ResultSet rs = JDBC.executeQuery("SELECT TT.* FROM dbo.ThongTinKhachHang AS TT JOIN dbo.CanHo AS CH "
                + "ON CH.KhachHangId = TT.KhachHangId OR CH.CanHoId = TT.CanHoId WHERE CH.CanHoId = ? ", canhoID);
        try {
            while (rs.next()) {
                cboChuHoMoi.addItem(rs.getString(3));

            }
            cboChuHoMoi.setSelectedItem(1);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    void load_KhachHang() {
        DefaultTableModel model = (DefaultTableModel) tblKhachhang.getModel();
        model.setRowCount(0);
        try {
            List<ThongTinKhachHang> list_SP = khachHangDAO.selectByIdCH(canhoID);
            for (ThongTinKhachHang KhachHang : list_SP) {   //Tạo vong lặp for 

                Object[] row = {
                    KhachHang.getKhachHangid(),
                    KhachHang.getTenKhachHang(),
                    KhachHang.getCMND(),
                    KhachHang.getGioiTinh() ? "Nam" : "Nữ",
                    KhachHang.getSodt(),
                    KhachHang.getEmail(),
                    KhachHang.isChuHo() ? "X" : "",};
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu !");
            System.err.println(e);
        }
    }

    void setModel_KH(ThongTinKhachHang model) {
        txtmaKhachhang.setText(model.getKhachHangid());
        txtTenKH.setText(model.getTenKhachHang());
        txtCMND.setText(model.getCMND());
        txtSoDT.setText(model.getSodt());
        txtEmail.setText(model.getEmail());
        if (model.getGioiTinh()) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }
        if (model.isChuHo()) {
            cboCo.setSelected(true);
        } else {
            cboCo.setSelected(false);
        }
    }

    ThongTinKhachHang getModel_KH() {
        ThongTinKhachHang model = new ThongTinKhachHang();
        model.setKhachHangid(txtmaKhachhang.getText());
        model.setCanHoid(canhoID);

        return model;
    }

    void edit_KH() {
        try {
            String makh = (String) tblKhachhang.getValueAt(index, 0);
            ThongTinKhachHang model = khachHangDAO.selectByIdKH(makh);
            if (model != null) {
                this.setModel_KH(model);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu!");
            System.err.println(e);
        }
    }

    void them() {
        ThongTinKhachHang model = getModel_KH();
        try {
            khachHangDAO.updateCanHo(model);
            this.load_KhachHang();
        } catch (Exception e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(this, "Thêm khách hàng vào căn hộ thất bại!");
        }
    }

    private boolean check() {
        if (txtmaKhachhang.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Không để trống mã khách hàng!");
            return false;
        }
        return true;
    }

    void CheckNguoi(String MaKH) {
        try {
            ResultSet rs = JDBC.executeQuery(" SELECT KhachHangId FROM dbo.ThongTinKhachHang WHERE KhachHangId = ?", MaKH);
            if (rs.next()) {
                String KHID = rs.getString(1);

                if (txtmaKhachhang.getText().equals(KHID)) {
                    this.them();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Không tồn tại khách hàng này!");
                newmodel();
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    void chuyenChuHo(String Ten) {
        try {
            khachHangDAO.updateChuHo(Ten, canhoID);
            JOptionPane.showMessageDialog(this, "Chuyển chủ hộ thành công");
        } catch (Exception e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(this, "Chuyển chủ hộ thất bại");
        }
    }

    void newmodel() {
        txtCMND.setText("");
        txtEmail.setText("");
        txtSoDT.setText("");
        txtTenKH.setText("");
        txtmaKhachhang.setText("");
        rdoNam.setSelected(true);
    }

    void loaibo() {
        try {
            if (cboCo.isSelected()) {
                JOptionPane.showMessageDialog(this, "Không thể loại bỏ chủ hộ! \n Vui lòng chuyển giao chủ hộ trước khi muốn loại bỏ thành viên này!");
                newmodel();
            } else {
                khachHangDAO.updateLoaiBo(txtmaKhachhang.getText());
                JOptionPane.showMessageDialog(this, "Đã loại bỏ thành viên ra khỏi căn hộ");
                this.load_KhachHang();
                newmodel();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Loại bỏ thành viên thất bại");
            System.err.println(e);
            newmodel();
        }
    }
}
