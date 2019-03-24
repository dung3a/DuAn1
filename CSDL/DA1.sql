USE master
GO

IF EXISTS ( SELECT  *
            FROM    sys.databases
            WHERE   name = 'DuAn1' )
    DROP DATABASE DuAn1
GO 

CREATE DATABASE DuAn1
GO

USE DuAn1
GO

CREATE TABLE Users
    (
      UserId VARCHAR(50) NOT NULL
                         PRIMARY KEY ,
      Pass VARCHAR(50) ,
      Ten NVARCHAR(50) ,
      Email NVARCHAR(100) ,
      SoDT NCHAR(15)
    );
  GO
  


CREATE TABLE CanHo
    (
      CanHoId VARCHAR(50) NOT NULL
                          PRIMARY KEY ,
      MaSoCanHo VARCHAR(10) ,
      KhachHangId VARCHAR(50),
	  Tang SMALLINT
    );
GO 


CREATE TABLE ThongTinKhachHang
    (
      KhachHangId NVARCHAR(50) NOT NULL
                               PRIMARY KEY ,
      CanHoId VARCHAR(50) ,
      TenKhachHang NVARCHAR(50) ,
      CMND VARCHAR(20) ,
      GioiTinh BIT ,
      SoDT NCHAR(15) ,
      Email NVARCHAR(100) ,
      ChuHo BIT
    );
GO 



CREATE TABLE HoaDon
    (
      HoaDonId NVARCHAR(50) NOT NULL
                            PRIMARY KEY ,
      CanHoId VARCHAR(50) ,
      NgayLap DATE ,
      TongTien FLOAT,
	  UserId VARCHAR(50),
	  Ten NVARCHAR(50) , 
    );
GO 


CREATE TABLE HoaDonSinhHoat
    (
      HoaDonSinhHoatId NVARCHAR(50) NOT NULL
                                    PRIMARY KEY ,
      HoaDonId NVARCHAR(50) ,
      CanHoId VARCHAR(50) ,
      NgayThang DATE ,

      ChiSoDienBanDau INT ,
      ChiSoDienCuoi INT ,
	  TienDien FLOAT,

      ChiSoNuocBanDau INT ,
      ChiSoNuocCuoi INT ,
      TienNuoc FLOAT, 
    );

GO 

CREATE TABLE HoaDonInternet
    (
      HoaDonInternetId NVARCHAR(50) NOT NULL
                                    PRIMARY KEY ,
      HoaDonId NVARCHAR(50) ,
      CanHoId VARCHAR(50) ,
      NgayThang DATE ,
      Tien FLOAT,
  
    );
GO 

CREATE TABLE HoaDonDichVu
    (
      HoaDonDichVuId NVARCHAR(10) NOT NULL
                                  PRIMARY KEY ,
      HoaDonId NVARCHAR(50) ,
      CanHoId VARCHAR(50) ,
      TienDichVuCoBan FLOAT ,
      TienGuiXe FLOAT ,
      TongTien FLOAT ,
      Thang DATE,
   
    );
GO 

CREATE TABLE LoaiXe
    (
      LoaixeId VARCHAR(10) NOT NULL
                           PRIMARY KEY ,
      Loai NVARCHAR(50) ,
      GiaTrongCoi FLOAT
    );
GO 

CREATE TABLE GuiXe
    (
      GuiXeId VARCHAR(50) NOT NULL
                          PRIMARY KEY ,
      HoaDonDichVuId NVARCHAR(10) ,
      LoaixeId VARCHAR(10) ,
      SoLuong SMALLINT ,
      TienGuiXe FLOAT
    );
GO 



--Liên kết User với HoaDon
ALTER TABLE dbo.HoaDon ADD CONSTRAINT fk_UserId FOREIGN KEY (UserId) REFERENCES dbo.Users(UserId);
GO 

--Liên kết CanHo với ThongTinKhachHang
ALTER TABLE dbo.ThongTinKhachHang ADD CONSTRAINT fk_CanHoId_KhachHang FOREIGN KEY (CanHoId) REFERENCES dbo.CanHo(CanHoId);
GO 


--Liên kết CanHo với HoaDon
ALTER TABLE dbo.HoaDon ADD CONSTRAINT fk_CanHoId_vs_HoaDon FOREIGN KEY (CanHoId) REFERENCES dbo.CanHo(CanHoId);
GO 


--Liên kết CanHo với HoaDonSinhHoat
ALTER TABLE dbo.HoaDonSinhHoat ADD CONSTRAINT fk_CanHoId_vs_HoaDonSinhHoat FOREIGN KEY (CanHoId) REFERENCES dbo.CanHo(CanHoId);
GO 


--Liên kiết CanHo voi HoaDonInternet
ALTER TABLE dbo.HoaDonInternet ADD CONSTRAINT fk_CanHoId_HoaDonInternet FOREIGN KEY (CanHoId) REFERENCES dbo.CanHo(CanHoId);
GO 

--Liên kết CanHo với HoaDonDichVu
ALTER TABLE dbo.HoaDonDichVu ADD CONSTRAINT fk_CanHoID_HoaDonDichVu FOREIGN KEY (CanHoId) REFERENCES dbo.CanHo(CanHoId);
GO 

--Liên kết HoaDon với HoaDonDichVu
ALTER TABLE dbo.HoaDonDichVu ADD CONSTRAINT fk_HoaDonId_HoaDonDichVu FOREIGN KEY (HoaDonId) REFERENCES dbo.HoaDon(HoaDonId);
GO 

--Liên kết HoaDon với HoaDonSinhHoat
ALTER TABLE dbo.HoaDonSinhHoat ADD CONSTRAINT fk_HoaDonId_vs_HoaDonSinhHoat FOREIGN KEY (HoaDonId) REFERENCES dbo.HoaDon(HoaDonId);
GO 


--Liên kêt HoaDon với HoaDonInternet
ALTER TABLE dbo.HoaDonInternet ADD CONSTRAINT fk_HoaDonId_HoaDonInternet FOREIGN KEY (HoaDonId) REFERENCES dbo.HoaDon(HoaDonId);
GO 


--Liên kết HoaDonDichVu với Guixe
ALTER TABLE dbo.GuiXe ADD CONSTRAINT fk_HoaDonDichVuId_GuiXe FOREIGN KEY (HoaDonDichVuId) REFERENCES dbo.HoaDonDichVu(HoaDonDichVuId);
GO 

--Liên kết LoaiXe với GuiXe
ALTER TABLE dbo.GuiXe ADD CONSTRAINT fk_LoaixeId_GuiXe FOREIGN KEY (LoaixeId) REFERENCES dbo.LoaiXe(LoaixeId);
GO 