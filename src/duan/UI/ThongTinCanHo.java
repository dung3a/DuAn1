/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan.UI;

/**
 *
 * @author anhdu
 */
public class ThongTinCanHo extends javax.swing.JFrame {

    /**
     * Creates new form ThongTInCanHo
     */
    String canho;
    public ThongTinCanHo( String canho) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.canho = canho;
        this.setTitle("Thông Tin Căn Hộ " + canho);
        lbl_Title.setText("Thông Tin Căn Hộ " + canho);
    }
    int xMouse, yMouse;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgGioiTinh = new javax.swing.ButtonGroup();
        jpn_Close = new javax.swing.JLabel();
        jpn_Minimize = new javax.swing.JLabel();
        lbl_Title = new javax.swing.JLabel();
        lbl_Titlebar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        sclKhachhang = new javax.swing.JScrollPane();
        tblKhachhang = new javax.swing.JTable();
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
        btnSua = new javax.swing.JPanel();
        lblSua = new javax.swing.JLabel();
        btnThem = new javax.swing.JPanel();
        lblThem = new javax.swing.JLabel();
        btnXoa = new javax.swing.JPanel();
        lblXoa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 530));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpn_Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Close.png"))); // NOI18N
        jpn_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpn_CloseMouseClicked(evt);
            }
        });
        getContentPane().add(jpn_Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, -1, -1));

        jpn_Minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Minimize.png"))); // NOI18N
        jpn_Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpn_MinimizeMouseClicked(evt);
            }
        });
        getContentPane().add(jpn_Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, -1));

        lbl_Title.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        lbl_Title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Title.setText("Thông Tin Căn Hộ");
        getContentPane().add(lbl_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

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
        getContentPane().add(lbl_Titlebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(102, 102, 102)));
        jPanel1.setMaximumSize(new java.awt.Dimension(550, 490));
        jPanel1.setMinimumSize(new java.awt.Dimension(550, 490));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblKhachhang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblKhachhang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Tên Khách Hàng", "CMND", "Giới Tính", "Số ĐT", "Email", "Chủ Hộ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhachhang.setAlignmentX(1.0F);
        tblKhachhang.setAlignmentY(1.0F);
        tblKhachhang.setMaximumSize(new java.awt.Dimension(450, 64));
        tblKhachhang.setMinimumSize(new java.awt.Dimension(450, 64));
        sclKhachhang.setViewportView(tblKhachhang);

        jPanel1.add(sclKhachhang, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 277, 798, 212));

        lblTenKH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTenKH.setText("Tên Khách Hàng");
        jPanel1.add(lblTenKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 45, -1, -1));

        lblCMND.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCMND.setText("CMND");
        jPanel1.add(lblCMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 96, -1, -1));

        lblGioiTinh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGioiTinh.setText("Giới Tính");
        jPanel1.add(lblGioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 156, -1, -1));

        lblSoDT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSoDT.setText("Số ĐT");
        jPanel1.add(lblSoDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 45, -1, -1));

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEmail.setText("Email");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 96, -1, -1));

        lblChuHo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblChuHo.setText("Chủ Hộ ");
        jPanel1.add(lblChuHo, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 153, -1, 20));

        txtTenKH.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txtTenKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 252, -1));

        txtCMND.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txtCMND, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 252, -1));

        txtSoDT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txtSoDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 42, 255, -1));

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 93, 255, -1));

        rdoNam.setBackground(new java.awt.Color(255, 255, 255));
        btgGioiTinh.add(rdoNam);
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");
        jPanel1.add(rdoNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        rdoNu.setBackground(new java.awt.Color(255, 255, 255));
        btgGioiTinh.add(rdoNu);
        rdoNu.setText("Nữ");
        jPanel1.add(rdoNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, -1));

        cboCo.setBackground(new java.awt.Color(255, 255, 255));
        cboCo.setText(" ");
        jPanel1.add(cboCo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 155, -1, 20));

        btnSua.setBackground(new java.awt.Color(255, 102, 102));
        btnSua.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblSua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSua.setForeground(new java.awt.Color(255, 255, 255));
        lblSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Wite.png"))); // NOI18N
        lblSua.setText("   Sửa");

        javax.swing.GroupLayout btnSuaLayout = new javax.swing.GroupLayout(btnSua);
        btnSua.setLayout(btnSuaLayout);
        btnSuaLayout.setHorizontalGroup(
            btnSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSuaLayout.createSequentialGroup()
                .addComponent(lblSua, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnSuaLayout.setVerticalGroup(
            btnSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSua, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jPanel1.add(btnSua, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        btnThem.setBackground(new java.awt.Color(255, 102, 102));
        btnThem.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        jPanel1.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        btnXoa.setBackground(new java.awt.Color(255, 102, 102));
        btnXoa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblXoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblXoa.setForeground(new java.awt.Color(255, 255, 255));
        lblXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duan/Logo/Trash_25px.png"))); // NOI18N
        lblXoa.setText("  Xóa");

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

        jPanel1.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 800, -1));

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
            java.util.logging.Logger.getLogger(ThongTinCanHo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongTinCanHo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongTinCanHo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongTinCanHo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongTinCanHo("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgGioiTinh;
    private javax.swing.JPanel btnSua;
    private javax.swing.JPanel btnThem;
    private javax.swing.JPanel btnXoa;
    private javax.swing.JCheckBox cboCo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jpn_Close;
    private javax.swing.JLabel jpn_Minimize;
    private javax.swing.JLabel lblCMND;
    private javax.swing.JLabel lblChuHo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblSoDT;
    private javax.swing.JLabel lblSua;
    private javax.swing.JLabel lblTenKH;
    private javax.swing.JLabel lblThem;
    private javax.swing.JLabel lblXoa;
    private javax.swing.JLabel lbl_Title;
    private javax.swing.JLabel lbl_Titlebar;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JScrollPane sclKhachhang;
    private javax.swing.JTable tblKhachhang;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtSoDT;
    private javax.swing.JTextField txtTenKH;
    // End of variables declaration//GEN-END:variables
}
