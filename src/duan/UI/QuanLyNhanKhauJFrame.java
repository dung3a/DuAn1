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
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

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
        this.Logo();
    }
    int xMouse, yMouse;
    int check = 1;

    public void Logo() {
        ImageIcon img = new ImageIcon("src\\duan\\Logo\\LOGO.png");
        this.setIconImage(img.getImage());
    }

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
        lblXuatExcel = new javax.swing.JLabel();
        lbl_Nhap = new javax.swing.JLabel();
        lblCapNhat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setUndecorated(true);

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlMain.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));
        pnlMain.setMaximumSize(new java.awt.Dimension(1000, 700));
        pnlMain.setMinimumSize(new java.awt.Dimension(1000, 700));
        pnlMain.setName(""); // NOI18N
        pnlMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Minimize.png"))); // NOI18N
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseClicked(evt);
            }
        });
        pnlMain.add(lblMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(921, 1, -1, -1));

        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Close.png"))); // NOI18N
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        pnlMain.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(961, 1, -1, -1));

        lblQuanLyNguoi.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        lblQuanLyNguoi.setForeground(new java.awt.Color(255, 255, 255));
        lblQuanLyNguoi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuanLyNguoi.setText("Quản Lý Nhân Khẩu");
        pnlMain.add(lblQuanLyNguoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 11, -1, -1));

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
        pnlMain.add(lbl_Titlebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 1000, 40));

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

        pnlMain.add(sclNhanKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 358, 1000, 280));

        lblMaKH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMaKH.setText("Mã Khách Hàng");
        pnlMain.add(lblMaKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 117, -1, -1));

        lblCanHo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCanHo.setText(" Mã Căn Hộ");
        pnlMain.add(lblCanHo, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 169, -1, -1));

        lblHoTen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblHoTen.setText("Họ Tên");
        pnlMain.add(lblHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 219, -1, -1));

        lblCMND.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCMND.setText("CMND");
        pnlMain.add(lblCMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 268, -1, -1));

        lblGioiTinh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGioiTinh.setText("Giới Tính");
        pnlMain.add(lblGioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 268, -1, -1));

        lblSoDienThoai.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSoDienThoai.setText("Số Điện Thoại");
        pnlMain.add(lblSoDienThoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 121, -1, -1));

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEmail.setText("Email");
        pnlMain.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 168, -1, -1));

        lblTrangThai.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTrangThai.setText("Trạng Thái");
        pnlMain.add(lblTrangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 215, -1, -1));

        lblMaKhachHangShow.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        lblMaKhachHangShow.setForeground(new java.awt.Color(255, 51, 0));
        pnlMain.add(lblMaKhachHangShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 117, 272, 25));

        lblMaCanHoShow.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        lblMaCanHoShow.setForeground(new java.awt.Color(255, 51, 0));
        pnlMain.add(lblMaCanHoShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 164, 272, 22));

        txtHoTen.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtHoTen.setMaximumSize(new java.awt.Dimension(75, 25));
        txtHoTen.setMinimumSize(new java.awt.Dimension(75, 25));
        pnlMain.add(txtHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 215, 272, -1));

        txtCMND.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtCMND.setMaximumSize(new java.awt.Dimension(75, 25));
        txtCMND.setMinimumSize(new java.awt.Dimension(75, 25));
        pnlMain.add(txtCMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 264, 272, -1));

        txtSoDienThoai.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txtSoDienThoai.setMaximumSize(new java.awt.Dimension(75, 25));
        txtSoDienThoai.setMinimumSize(new java.awt.Dimension(75, 25));
        pnlMain.add(txtSoDienThoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 117, 265, -1));

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        pnlMain.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 164, 265, -1));

        rdoNam.setBackground(new java.awt.Color(255, 255, 255));
        rdoGioiTinh.add(rdoNam);
        rdoNam.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        rdoNam.setText("Nam");
        pnlMain.add(rdoNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 264, -1, -1));

        rdoNu.setBackground(new java.awt.Color(255, 255, 255));
        rdoGioiTinh.add(rdoNu);
        rdoNu.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        rdoNu.setText("Nữ");
        pnlMain.add(rdoNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 264, -1, -1));

        cboTrangThai.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cboTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang Ở", "Tạm Vắng", "Đã Rời Đi" }));
        pnlMain.add(cboTrangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 212, 265, -1));

        txtTimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTimKiem.setToolTipText("Nhập mã khách hàng hoặc tên khách hàng");
        pnlMain.add(txtTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 48, 287, 31));

        lblTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Search_35px_Black.png"))); // NOI18N
        lblTim.setToolTipText("Tìm Kiếm");
        lblTim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTimMouseClicked(evt);
            }
        });
        pnlMain.add(lblTim, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 48, -1, -1));

        lblXuatExcel.setBackground(new java.awt.Color(153, 204, 0));
        lblXuatExcel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblXuatExcel.setForeground(new java.awt.Color(255, 255, 255));
        lblXuatExcel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblXuatExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Excel_25px.png"))); // NOI18N
        lblXuatExcel.setText("Xuất Excel");
        lblXuatExcel.setOpaque(true);
        lblXuatExcel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblXuatExcelMousePressed(evt);
            }
        });
        pnlMain.add(lblXuatExcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 650, 130, 36));

        lbl_Nhap.setBackground(new java.awt.Color(153, 204, 0));
        lbl_Nhap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Nhap.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Nhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Nhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Wite.png"))); // NOI18N
        lbl_Nhap.setText("Nhập ");
        lbl_Nhap.setOpaque(true);
        lbl_Nhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_NhapMousePressed(evt);
            }
        });
        pnlMain.add(lbl_Nhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 100, 36));

        lblCapNhat.setBackground(new java.awt.Color(255, 153, 0));
        lblCapNhat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCapNhat.setForeground(new java.awt.Color(255, 255, 255));
        lblCapNhat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Updates_25px.png"))); // NOI18N
        lblCapNhat.setText("Cập Nhật");
        lblCapNhat.setOpaque(true);
        lblCapNhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCapNhatMousePressed(evt);
            }
        });
        pnlMain.add(lblCapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 110, 36));

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

    private void lblTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTimMouseClicked
        this.newModel();
        this.load_KhachHangByID();
        txtTimKiem.setText("");
    }//GEN-LAST:event_lblTimMouseClicked

    private void lblXuatExcelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXuatExcelMousePressed
        ExportExcel();
    }//GEN-LAST:event_lblXuatExcelMousePressed

    private void lblCapNhatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCapNhatMousePressed
        check = 1;

        if (checkTT()) {
            this.update_KH();
            this.load_KhachHang();
            this.newModel();
        }
    }//GEN-LAST:event_lblCapNhatMousePressed

    private void lbl_NhapMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_NhapMousePressed
        if (checkTT() && check == 1) {
            this.insert_KH();
            this.load_KhachHang();
            this.newModel();
        }
    }//GEN-LAST:event_lbl_NhapMousePressed

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
    private javax.swing.JLabel lblCMND;
    private javax.swing.JLabel lblCanHo;
    private javax.swing.JLabel lblCapNhat;
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
    private javax.swing.JLabel lblXuatExcel;
    private javax.swing.JLabel lbl_Nhap;
    private javax.swing.JLabel lbl_Titlebar;
    private javax.swing.JPanel pnlMain;
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
        } else if (!txtSoDienThoai.getText().trim().substring(0, 2).equals("09")
                && !txtSoDienThoai.getText().trim().substring(0, 2).equals("08")
                && !txtSoDienThoai.getText().trim().substring(0, 2).equals("03")
                && !txtSoDienThoai.getText().trim().substring(0, 2).equals("05")
                && !txtSoDienThoai.getText().trim().substring(0, 2).equals("07")) {
            JOptionPane.showMessageDialog(this, "Đầu Số Bắt Đầu Bằng 09 | 08 | 07 | 05 | 03 !");
            return false;
        }
        return true;
    }

    public void ExportExcel() {
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

            JFileChooser fs = new JFileChooser(new File("D:\\"));
            fs.setDialogTitle("Lưu File");
            fs.setFileFilter(new FileNameExtensionFilter(" Microsoft Excel", ".xlsx"));
            int result = fs.showSaveDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                String name = fs.getSelectedFile().getAbsolutePath();
                if (!name.toLowerCase().endsWith(".xlsx")) {
                    name += ".xlsx";
                }
                FileOutputStream out = new FileOutputStream(name);
                workbook.write(out);
                out.close();
                JOptionPane.showMessageDialog(this, "Lưu Thành Công!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
