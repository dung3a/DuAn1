package duan.Controller;

import duan.Bean.DanhMucBean;
import duan.UI.TrangChuJPanel;
import duan.UI.CanHoJPanel;
import duan.UI.DichVuJPanel;
import duan.UI.DichVuPhongJPanel;
import duan.UI.TienDichVuJPanel;
import duan.UI.InternetJPanel;
import duan.UI.MailThongBaoJPanel;
import duan.UI.SinhHoatJPanel;
import duan.UI.TienDichVuJPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author TVD
 */
public class ChuyenManHinhController {

    private JPanel root;
    private String kindSelected = "";

    private List<DanhMucBean> listItem = null;

    public ChuyenManHinhController(JPanel jpnRoot) {
        this.root = jpnRoot;
    }

    public void setView(JPanel jpnItem, JLabel jlbItem) {
        kindSelected = "TrangChu";
        jpnItem.setBackground(new Color(255, 85, 85));
        jlbItem.setBackground(new Color(255, 85, 85));

        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new TrangChuJPanel());
        root.validate();
        root.repaint();
    }

    public void setView2(JPanel jpnItem, JLabel jlbItem) {
        kindSelected = "TrangChu";
        jpnItem.setBackground(new Color(255, 85, 85));
        jlbItem.setBackground(new Color(255, 85, 85));

        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new TienDichVuJPanel());
        root.validate();
        root.repaint();
    }

    public void setEvent(List<DanhMucBean> listItem) {
        this.listItem = listItem;
        for (DanhMucBean item : listItem) {
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }

    class LabelEvent implements MouseListener {

        private JPanel node;

        private String kind;
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "TrangChu":
                    node = new TrangChuJPanel();
                    break;
                case "CanHo":
                    node = new CanHoJPanel();
                    break;
                case "DichVu":
                    node = new DichVuJPanel();
                    break;
                case "HoaDon":
                    node = new TienDichVuJPanel();
                    break;
                case "MailThongBao":
                    node = new MailThongBaoJPanel();
                    break;
                case "SinhHoat":
                    node = new SinhHoatJPanel();
                    break;
                case "Internet":
                    node = new InternetJPanel();
                    break;
                case "DichVu2":
                    node = new DichVuPhongJPanel();
                    break;
                // more ...
                default:
                    node = new TrangChuJPanel();
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackgroud(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            jpnItem.setBackground(new Color(255, 85, 85));
            jlbItem.setBackground(new Color(255, 85, 85));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(255, 85, 85));
            jlbItem.setBackground(new Color(255, 85, 85));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (!kindSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(121, 196, 71));//
                jlbItem.setBackground(new Color(121, 196, 71));//
            }
        }

    }

    private void setChangeBackgroud(String kind) {
        for (DanhMucBean item : listItem) {
            if (item.getKind().equalsIgnoreCase(kind)) {
                item.getJpn().setBackground(new Color(255, 85, 85));
                item.getJlb().setBackground(new Color(255, 85, 85));
            } else {
                item.getJpn().setBackground(new Color(121, 196, 71));//121,196,71
                item.getJlb().setBackground(new Color(121, 196, 71));//
            }
        }
    }

}
