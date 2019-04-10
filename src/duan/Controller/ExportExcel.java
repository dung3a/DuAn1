/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duan.Controller;


import duan.DAO.ThongTinKhachHangDAO;
import duan.model.ThongTinKhachHang;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



/**
 *
 * @author Tam Fat
 */
public class ExportExcel {
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
            cell.setCellValue("Mã Khách Hàng");
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Họ Và Tên ");
            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Căn Hộ ");
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("CMND");
            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("Giới tính");
            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue("Số điện thoại");
            cell = row.createCell(6, CellType.STRING);
            cell.setCellValue("Email");
            cell = row.createCell(7, CellType.STRING);
            cell.setCellValue("Trạng Thái");
            cell = row.createCell(8, CellType.STRING);
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
 
            FileOutputStream out = new FileOutputStream(new File("D:/hv.xlsx"));
            workbook.write(out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

 

} 

    

