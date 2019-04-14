/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan.UI;

import duan.DAO.QuanLyXeDAO;
import duan.DAO.ThongTinKhachHangDAO;
import duan.JDBC.JDBC;
import duan.JDBC.XuLy;
import duan.model.QuanLyXe;
import duan.model.ThongTinKhachHang;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Tam Fat
 */
public class QuanLyXeJFrame extends javax.swing.JFrame {

    public QuanLyXeJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Quản Lý Xe");
        this.load_Xe();
        this.loadTienTrongCoiHT();

    }

    int check = 1;
    int index = 0;
    int xMouse, yMouse;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        lblMinimize = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblQuanLyNguoi = new javax.swing.JLabel();
        lbl_Titlebar = new javax.swing.JLabel();
        sclGuiXe = new javax.swing.JScrollPane();
        tblQuanLyXe = new javax.swing.JTable();
        lbl_xuatexcel = new javax.swing.JLabel();
        lblCanHo = new javax.swing.JLabel();
        lblHoTen = new javax.swing.JLabel();
        lblSLxeDap = new javax.swing.JLabel();
        lblSLXemay = new javax.swing.JLabel();
        lblSLXeHoi = new javax.swing.JLabel();
        lblTienGuiXe = new javax.swing.JLabel();
        lbl_maCanHo = new javax.swing.JLabel();
        lbl_HoTenChuHo = new javax.swing.JLabel();
        txt_soluongXeDap = new javax.swing.JTextField();
        txt_soLuongxeMay = new javax.swing.JTextField();
        txt_soluongXehoi = new javax.swing.JTextField();
        lblTienGui = new javax.swing.JLabel();
        lbl_CapNhat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        lblQuanLyNguoi.setText("Quản Lý Xe");
        pnlMain.add(lblQuanLyNguoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 11, 128, -1));

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

        sclGuiXe.setBorder(null);

        tblQuanLyXe.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tblQuanLyXe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Số Căn Hộ", "Họ Tên Chủ Hộ", "Số Lượng Xe Đạp", "Số Lượng Xe Máy", "Số Lượng Xe Hơi", "Tiền Gửi Xe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblQuanLyXe.setMaximumSize(new java.awt.Dimension(300, 64));
        tblQuanLyXe.setMinimumSize(new java.awt.Dimension(300, 64));
        tblQuanLyXe.setRowHeight(20);
        tblQuanLyXe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQuanLyXeMouseClicked(evt);
            }
        });
        sclGuiXe.setViewportView(tblQuanLyXe);

        pnlMain.add(sclGuiXe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 1000, 200));

        lbl_xuatexcel.setBackground(new java.awt.Color(153, 204, 0));
        lbl_xuatexcel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_xuatexcel.setForeground(new java.awt.Color(255, 255, 255));
        lbl_xuatexcel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_xuatexcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Excel_25px.png"))); // NOI18N
        lbl_xuatexcel.setText("  Xuất Excel");
        lbl_xuatexcel.setOpaque(true);
        lbl_xuatexcel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_xuatexcelMousePressed(evt);
            }
        });
        pnlMain.add(lbl_xuatexcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, 150, 40));

        lblCanHo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblCanHo.setText("Căn Hộ");
        pnlMain.add(lblCanHo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        lblHoTen.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblHoTen.setText("Họ Tên Chủ Hộ");
        pnlMain.add(lblHoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        lblSLxeDap.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblSLxeDap.setText("Số Lượng Xe Đạp");
        pnlMain.add(lblSLxeDap, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, -1));

        lblSLXemay.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblSLXemay.setText("Số Lượng Xe Máy");
        pnlMain.add(lblSLXemay, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, -1));

        lblSLXeHoi.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblSLXeHoi.setText("Số Lượng Xe Hơi");
        pnlMain.add(lblSLXeHoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        lblTienGuiXe.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTienGuiXe.setText("Tiền Gửi Xe ");
        pnlMain.add(lblTienGuiXe, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 110, -1, -1));

        lbl_maCanHo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_maCanHo.setForeground(new java.awt.Color(255, 0, 0));
        pnlMain.add(lbl_maCanHo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 260, 20));

        lbl_HoTenChuHo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbl_HoTenChuHo.setForeground(new java.awt.Color(255, 0, 0));
        pnlMain.add(lbl_HoTenChuHo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 250, 20));

        txt_soluongXeDap.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        pnlMain.add(txt_soluongXeDap, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 80, -1));

        txt_soLuongxeMay.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        pnlMain.add(txt_soLuongxeMay, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 80, -1));

        txt_soluongXehoi.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        pnlMain.add(txt_soluongXehoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 80, -1));

        lblTienGui.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTienGui.setForeground(new java.awt.Color(255, 0, 0));
        lblTienGui.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pnlMain.add(lblTienGui, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 150, 130, 20));

        lbl_CapNhat.setBackground(new java.awt.Color(255, 153, 0));
        lbl_CapNhat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_CapNhat.setForeground(new java.awt.Color(255, 255, 255));
        lbl_CapNhat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_CapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Updates_25px.png"))); // NOI18N
        lbl_CapNhat.setText("Cập Nhật");
        lbl_CapNhat.setOpaque(true);
        lbl_CapNhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_CapNhatMousePressed(evt);
            }
        });
        pnlMain.add(lbl_CapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblQuanLyXeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuanLyXeMouseClicked
        index = tblQuanLyXe.getSelectedRow();
        this.edit_HD();

    }//GEN-LAST:event_tblQuanLyXeMouseClicked

    private void lbl_TitlebarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_TitlebarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_lbl_TitlebarMousePressed

    private void lbl_TitlebarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_TitlebarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_lbl_TitlebarMouseDragged

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseClicked

    private void lbl_xuatexcelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_xuatexcelMousePressed
        try {
            int Traloi = JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn xuất File ?", "Thông Báo", JOptionPane.YES_NO_OPTION);
            if (Traloi == 0) {
                ExportExcel();
                JOptionPane.showMessageDialog(this, "Xuất file Excel Thành Công");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi ! Xuất File Excel Thất Bại");
            System.err.println(e);
        }
    }//GEN-LAST:event_lbl_xuatexcelMousePressed

    private void lbl_CapNhatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CapNhatMousePressed
        this.updateSoLuongXe();
    }//GEN-LAST:event_lbl_CapNhatMousePressed

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
            java.util.logging.Logger.getLogger(QuanLyXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyXeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCanHo;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblQuanLyNguoi;
    private javax.swing.JLabel lblSLXeHoi;
    private javax.swing.JLabel lblSLXemay;
    private javax.swing.JLabel lblSLxeDap;
    private javax.swing.JLabel lblTienGui;
    private javax.swing.JLabel lblTienGuiXe;
    private javax.swing.JLabel lbl_CapNhat;
    private javax.swing.JLabel lbl_HoTenChuHo;
    private javax.swing.JLabel lbl_Titlebar;
    private javax.swing.JLabel lbl_maCanHo;
    private javax.swing.JLabel lbl_xuatexcel;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JScrollPane sclGuiXe;
    private javax.swing.JTable tblQuanLyXe;
    private javax.swing.JTextField txt_soLuongxeMay;
    private javax.swing.JTextField txt_soluongXeDap;
    private javax.swing.JTextField txt_soluongXehoi;
    // End of variables declaration//GEN-END:variables

    QuanLyXeDAO qlxDAO = new QuanLyXeDAO();
    ResultSet rs = null;
    float TienGuiXeDap, TienGuiXeMay, TienGuiXeHoi;

    void loadTienTrongCoiHT() {
        ResultSet rs1 = JDBC.executeQuery("SELECT GiaTrongCoi FROM dbo.LoaiXe WHERE LoaixeId = 'XD'");
        ResultSet rs2 = JDBC.executeQuery("SELECT GiaTrongCoi FROM dbo.LoaiXe WHERE LoaixeId = 'XM'");
        ResultSet rs3 = JDBC.executeQuery("SELECT GiaTrongCoi FROM dbo.LoaiXe WHERE LoaixeId = 'XH'");
        try {
            if (rs1.next()) {
                TienGuiXeDap = rs1.getFloat(1);
                System.err.println(TienGuiXeDap);
            }
            if (rs2.next()) {
                TienGuiXeMay = rs2.getFloat(1);
                System.err.println(TienGuiXeMay);
            }
            if (rs3.next()) {
                TienGuiXeHoi = rs3.getFloat(1);
                System.err.println(TienGuiXeHoi);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    void load_Xe() {
        DefaultTableModel model = (DefaultTableModel) tblQuanLyXe.getModel();
        model.setRowCount(0);
        try {
            List<QuanLyXe> list_Xe = qlxDAO.selectQuanLyXe();
            for (QuanLyXe Xe : list_Xe) {   //Tạo vong lặp for 

                Object[] row = {
                    Xe.getCanHoID(),
                    Xe.getTenKhachHang(),
                    Xe.getSoLuongXeDap(),
                    Xe.getSoLuongXeMay(),
                    Xe.getSoLuongXeHoi(),
                    XuLy.xulySo(String.valueOf(Xe.getTongTienGui()))};
                model.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi truy vấn dữ liệu !");
            System.err.println(e);
        }
    }

    void setModel_HD(QuanLyXe model) {
        lbl_maCanHo.setText(model.getCanHoID());
        lbl_HoTenChuHo.setText(model.getTenKhachHang());
        txt_soluongXeDap.setText(String.valueOf(model.getSoLuongXeDap()));
        txt_soLuongxeMay.setText(String.valueOf(model.getSoLuongXeMay()));
        txt_soluongXehoi.setText(String.valueOf(model.getSoLuongXeHoi()));
        lblTienGui.setText(XuLy.xulySo(String.valueOf(model.getTongTienGui())));
    }

    void edit_HD() {
        try {
            String maCh = (String) tblQuanLyXe.getValueAt(index, 0);
            QuanLyXe model = qlxDAO.selectGuiXe(maCh);
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
        rs = JDBC.executeQuery("SELECT CanHoId FROM dbo.CanHo WHERE MaSoCanHo = ?", lbl_maCanHo.getText());
        try {
            while (rs.next()) {
                CanHoID = rs.getString(1);
            }
        } catch (Exception e) {
        }
        return CanHoID;
    }

    QuanLyXe getModel_KH() {
        int XeMay = Integer.parseInt(txt_soLuongxeMay.getText());
        int XeDap = Integer.parseInt(txt_soluongXeDap.getText());
        int XeHoi = Integer.parseInt(txt_soluongXehoi.getText());
        QuanLyXe model = new QuanLyXe();
        model.setCanHoID(CanhoId());
        model.setSoLuongXeDap(Integer.parseInt(txt_soluongXeDap.getText()));
        model.setTienGuiXeDap(TienGuiXeDap);
        model.setSoLuongXeMay(Integer.parseInt(txt_soLuongxeMay.getText()));
        model.setTienGuiXeDap(TienGuiXeMay);
        model.setSoLuongXeHoi(Integer.parseInt(txt_soluongXehoi.getText()));
        model.setTienGuiXeDap(TienGuiXeHoi);
        model.setTongTienGui(XeDap * TienGuiXeDap + XeMay * TienGuiXeMay + XeHoi * TienGuiXeHoi);
        return model;
    }

    void updateSoLuongXe() {
        QuanLyXe model = getModel_KH();
        try {
            qlxDAO.updateXe(model);
            JOptionPane.showMessageDialog(this, "Cập nhật số lượng xe căn hộ " + lbl_maCanHo.getText() + " thành công!");
            this.load_Xe();
            this.edit_HD();
        } catch (ExceptionInInitializerError e) {
            JOptionPane.showMessageDialog(this, "Cập nhật số lượng xe  thất bại!");
            System.err.println(e);
        }
    }

    void newmodel() {
        lbl_maCanHo.setText("");
        lbl_HoTenChuHo.setText("");
        txt_soLuongxeMay.setText("");
        txt_soluongXeDap.setText("");
        txt_soluongXehoi.setText("");
        lblTienGui.setText("");
    }

    // export Excel
    public void ExportExcel() {
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet spreadsheet = workbook.createSheet("Danh Sách Số Lượng Xe ");

            XSSFRow row = null;
            Cell cell = null;

            row = spreadsheet.createRow((short) 2);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("DANH SÁCH SỐ LƯỢNG XE");

            row = spreadsheet.createRow((short) 3);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("STT");

            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Căn Hộ");
            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Họ Và Tên ");
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue(" Xe Đạp ");
            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue(" Xe Máy");
            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue(" Xe Hơi");
            cell = row.createCell(6, CellType.STRING);
            cell.setCellValue("Tổng Tiền");

            QuanLyXe QLX = new QuanLyXe();

            List<QuanLyXe> list = new QuanLyXeDAO().selectQuanLyXe();

            for (int i = 0; i < list.size(); i++) {
                QuanLyXe qlx = list.get(i);
                row = spreadsheet.createRow((short) 4 + i);
                row.setHeight((short) 400);
                row.createCell(0).setCellValue(i + 1);
                row.createCell(1).setCellValue(qlx.getCanHoID());
                row.createCell(2).setCellValue(qlx.getTenKhachHang());
                row.createCell(3).setCellValue(qlx.getSoLuongXeDap());
                row.createCell(4).setCellValue(qlx.getSoLuongXeMay());
                row.createCell(5).setCellValue(qlx.getSoLuongXeHoi());
                row.createCell(6).setCellValue(qlx.getTongTienGui());

            }

            FileOutputStream out = new FileOutputStream(new File("D:/Quản Lý Xe.xlsx"));
            workbook.write(out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
