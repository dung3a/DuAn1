/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan.UI;

import duan.Bean.DanhMucBean;
import duan.Controller.ChuyenManHinhController;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anhdu
 */
public class DichVuJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TienDichVuJPanel
     */
    public DichVuJPanel() {
        initComponents();
        
        ChuyenManHinhController controller = new ChuyenManHinhController(jpn_ViewDichVu);
        controller.setView2(jpn_HoaDon, lbl_HoaDon);
        
        List<DanhMucBean> listItem2 = new ArrayList<>();
         listItem2.add(new DanhMucBean("HoaDon", jpn_HoaDon, lbl_HoaDon));
        listItem2.add(new DanhMucBean("SinhHoat", jpn_SinhHoat, lbl_SinhHoat));
        listItem2.add(new DanhMucBean("Internet", jpn_Internet, lbl_Internet));
        listItem2.add(new DanhMucBean("DichVu2", jpn_DichVu, lbl_DichVu));
        controller.setEvent(listItem2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpn_Menu = new javax.swing.JPanel();
        jpn_SinhHoat = new javax.swing.JPanel();
        lbl_SinhHoat = new javax.swing.JLabel();
        jpn_Internet = new javax.swing.JPanel();
        lbl_Internet = new javax.swing.JLabel();
        jpn_DichVu = new javax.swing.JPanel();
        lbl_DichVu = new javax.swing.JLabel();
        jpn_HoaDon = new javax.swing.JPanel();
        lbl_HoaDon = new javax.swing.JLabel();
        jpn_ViewDichVu = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1040, 660));
        setMinimumSize(new java.awt.Dimension(1040, 660));
        setPreferredSize(new java.awt.Dimension(1040, 660));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpn_Menu.setBackground(new java.awt.Color(0, 102, 102));
        jpn_Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpn_SinhHoat.setBackground(new java.awt.Color(121, 196, 71));
        jpn_SinhHoat.setMaximumSize(new java.awt.Dimension(233, 43));
        jpn_SinhHoat.setMinimumSize(new java.awt.Dimension(233, 43));

        lbl_SinhHoat.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbl_SinhHoat.setForeground(new java.awt.Color(255, 255, 255));
        lbl_SinhHoat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_SinhHoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Elec_Water.png"))); // NOI18N
        lbl_SinhHoat.setText("  Hóa Đơn Sinh Họat");

        javax.swing.GroupLayout jpn_SinhHoatLayout = new javax.swing.GroupLayout(jpn_SinhHoat);
        jpn_SinhHoat.setLayout(jpn_SinhHoatLayout);
        jpn_SinhHoatLayout.setHorizontalGroup(
            jpn_SinhHoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_SinhHoat, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
        );
        jpn_SinhHoatLayout.setVerticalGroup(
            jpn_SinhHoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_SinhHoat, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jpn_Menu.add(jpn_SinhHoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 40));

        jpn_Internet.setBackground(new java.awt.Color(121, 196, 71));
        jpn_Internet.setMaximumSize(new java.awt.Dimension(233, 43));
        jpn_Internet.setMinimumSize(new java.awt.Dimension(233, 43));
        jpn_Internet.setPreferredSize(new java.awt.Dimension(233, 43));

        lbl_Internet.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbl_Internet.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Internet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Internet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Internet.png"))); // NOI18N
        lbl_Internet.setText("    Hóa Đơn Internet");

        javax.swing.GroupLayout jpn_InternetLayout = new javax.swing.GroupLayout(jpn_Internet);
        jpn_Internet.setLayout(jpn_InternetLayout);
        jpn_InternetLayout.setHorizontalGroup(
            jpn_InternetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Internet, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
        );
        jpn_InternetLayout.setVerticalGroup(
            jpn_InternetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Internet, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jpn_Menu.add(jpn_Internet, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, 40));

        jpn_DichVu.setBackground(new java.awt.Color(121, 196, 71));

        lbl_DichVu.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbl_DichVu.setForeground(new java.awt.Color(255, 255, 255));
        lbl_DichVu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_DichVu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Service.png"))); // NOI18N
        lbl_DichVu.setText("   Hóa Đơn Dịch Vụ");

        javax.swing.GroupLayout jpn_DichVuLayout = new javax.swing.GroupLayout(jpn_DichVu);
        jpn_DichVu.setLayout(jpn_DichVuLayout);
        jpn_DichVuLayout.setHorizontalGroup(
            jpn_DichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_DichVu, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        jpn_DichVuLayout.setVerticalGroup(
            jpn_DichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_DichVu, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jpn_Menu.add(jpn_DichVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 240, 40));

        jpn_HoaDon.setBackground(new java.awt.Color(121, 196, 71));

        lbl_HoaDon.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lbl_HoaDon.setForeground(new java.awt.Color(255, 255, 255));
        lbl_HoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_HoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Bill.png"))); // NOI18N
        lbl_HoaDon.setText("    Tiền Dịch Vụ");

        javax.swing.GroupLayout jpn_HoaDonLayout = new javax.swing.GroupLayout(jpn_HoaDon);
        jpn_HoaDon.setLayout(jpn_HoaDonLayout);
        jpn_HoaDonLayout.setHorizontalGroup(
            jpn_HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_HoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
        );
        jpn_HoaDonLayout.setVerticalGroup(
            jpn_HoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn_HoaDonLayout.createSequentialGroup()
                .addComponent(lbl_HoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jpn_Menu.add(jpn_HoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, -1, 40));

        add(jpn_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 60));

        jpn_ViewDichVu.setBackground(new java.awt.Color(255, 255, 255));
        jpn_ViewDichVu.setMaximumSize(new java.awt.Dimension(1040, 610));
        jpn_ViewDichVu.setMinimumSize(new java.awt.Dimension(1040, 610));
        jpn_ViewDichVu.setPreferredSize(new java.awt.Dimension(1040, 660));

        javax.swing.GroupLayout jpn_ViewDichVuLayout = new javax.swing.GroupLayout(jpn_ViewDichVu);
        jpn_ViewDichVu.setLayout(jpn_ViewDichVuLayout);
        jpn_ViewDichVuLayout.setHorizontalGroup(
            jpn_ViewDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        jpn_ViewDichVuLayout.setVerticalGroup(
            jpn_ViewDichVuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        add(jpn_ViewDichVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1040, 610));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jpn_DichVu;
    private javax.swing.JPanel jpn_HoaDon;
    private javax.swing.JPanel jpn_Internet;
    private javax.swing.JPanel jpn_Menu;
    private javax.swing.JPanel jpn_SinhHoat;
    private javax.swing.JPanel jpn_ViewDichVu;
    private javax.swing.JLabel lbl_DichVu;
    private javax.swing.JLabel lbl_HoaDon;
    private javax.swing.JLabel lbl_Internet;
    private javax.swing.JLabel lbl_SinhHoat;
    // End of variables declaration//GEN-END:variables
}
