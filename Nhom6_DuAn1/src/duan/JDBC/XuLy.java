/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan.JDBC;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;

/**
 *
 * @author anhdu
 */
public class XuLy {
      public static String convertDate(String date) {
        try {
            SimpleDateFormat dateSQL = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat dateVN = new SimpleDateFormat("dd/MM/yyyy");
            return dateVN.format(dateSQL.parse(date));
        } catch (ParseException e) {
        }
        return "";

    }
      
      public static String xulySo(String chuoi) {
        double amount = Double.parseDouble(chuoi);
        DecimalFormat formatter = new DecimalFormat("#,### vnđ");
        return formatter.format(amount);
    }


    public static String chuanHoa(String str) {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        return str;
    }

    public static String loaiboKhoangTrang(String str) {
        str = chuanHoa(str);
        String temp[] = str.split(" ");
        str = "";
        for (int i = 0; i < temp.length; i++) {
            str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1) {
                str += "";
            }
        }
        return str;
    }
    
    
}
