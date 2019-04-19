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


  
  --hàm tăng ID tự động
CREATE FUNCTION AUTO_IDCH()
RETURNS VARCHAR(5)
AS
BEGIN
	DECLARE @ID VARCHAR(5)
	IF (SELECT COUNT(CanHoId) FROM dbo.CanHo) = 0
		SET @ID = '0'
	ELSE
		SELECT @ID = MAX(RIGHT(CanHoId, 3)) FROM dbo.CanHo
		SELECT @ID = CASE
			WHEN @ID >= 0 and @ID < 9 THEN 'CH00' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
			WHEN @ID >= 99 THEN 'CH' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
			WHEN @ID >= 9 THEN 'CH0' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
		END
	RETURN @ID
END
GO 

-- Ham tang tu dong ID Khach Hang


CREATE FUNCTION AUTO_IDKH()
RETURNS VARCHAR(10)
AS
BEGIN
	DECLARE @ID VARCHAR(10)
	IF (SELECT COUNT(KhachHangId) FROM dbo.ThongTinKhachHang) = 0
		SET @ID = '0'
	ELSE
		SELECT @ID = MAX(RIGHT(KhachHangId, 8)) FROM dbo.ThongTinKhachHang
		SELECT @ID = CASE
			WHEN @ID >= 0 and @ID < 9 THEN 'KH0000000' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
			WHEN @ID >= 99 THEN 'KH00000' + CONVERT(CHAR, CONVERT(INT, @id) + 1)
			WHEN @ID >= 999 THEN 'KH0000' + CONVERT(CHAR, CONVERT(INT, @id) + 1)
			WHEN @ID >= 9999 THEN 'KH000' + CONVERT(CHAR, CONVERT(INT, @id) + 1)
			WHEN @ID >= 99999 THEN 'KH00' + CONVERT(CHAR, CONVERT(INT, @id) + 1)
			WHEN @ID >= 999999 THEN 'KH0' + CONVERT(CHAR, CONVERT(INT, @id) + 1)
			WHEN @ID >= 9999999 THEN 'KH' + CONVERT(CHAR, CONVERT(INT, @id) + 1)
			WHEN @ID >= 9 THEN 'KH000000' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
		END
	RETURN @ID
END
GO 

  --hàm tăng ID hóa đơn dịch vụ tự động
CREATE FUNCTION AUTO_IDHDDV()
RETURNS VARCHAR(15)
AS
BEGIN
	DECLARE @ID VARCHAR(15)
	IF (SELECT COUNT(HoaDonDichVuId) FROM dbo.HoaDonDichVu) = 0
		SET @ID = '0'
	ELSE
		SELECT @ID = MAX(RIGHT(HoaDonDichVuId, 13)) FROM dbo.HoaDonDichVu
		SELECT @ID = CASE
			WHEN @ID >= 0 and @ID < 9 THEN 'DV000000000000' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
			WHEN @ID >= 99 THEN 'DV00000000000' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
			WHEN @ID >= 999 THEN 'DV0000000000' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
			WHEN @ID >= 9999 THEN 'DV000000000' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
			WHEN @ID >= 99999 THEN 'DV00000000' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
			WHEN @ID >= 999999 THEN 'DV0000000' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
			WHEN @ID >= 9999999 THEN 'DV000000' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
			WHEN @ID >= 99999999 THEN 'DV00000' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
			WHEN @ID >= 999999999 THEN 'DV0000' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
			WHEN @ID >= 9999999999 THEN 'DV000' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
			WHEN @ID >= 99999999999 THEN 'DV00' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
			WHEN @ID >= 999999999999 THEN 'DV0' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
			WHEN @ID >= 9999999999999 THEN 'DV' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
			WHEN @ID >= 9 THEN 'DV00000000000' + CONVERT(CHAR, CONVERT(INT, @ID) + 1)
		END
	RETURN @ID
END
GO


---------------------------------
CREATE TABLE Users
    (
      UserId VARCHAR(50) NOT NULL
                         PRIMARY KEY ,
      Pass VARCHAR(50) ,
      Ten NVARCHAR(50) ,
      Email NVARCHAR(100) ,
      SoDT NCHAR(10)
    );
  GO

CREATE TABLE CanHo
    (
      CanHoId CHAR(5) NOT NULL
                          PRIMARY KEY CONSTRAINT CanHoId DEFAULT dbo.AUTO_IDCH(),
      MaSoCanHo VARCHAR(10) ,
      KhachHangId CHAR(10),
	  Tang SMALLINT,
	  TinhTrang BIT 
    );
GO 


CREATE TABLE ThongTinKhachHang
    (
      KhachHangId CHAR(10) NOT NULL
                               PRIMARY KEY CONSTRAINT KhachHangId DEFAULT dbo.AUTO_IDKH(),
      CanHoId CHAR(5) ,
      TenKhachHang NVARCHAR(50) ,
      CMND VARCHAR(20) ,
      GioiTinh BIT ,
      SoDT NCHAR(10) ,
      Email NVARCHAR(100) ,
	  TrangThai NVARCHAR(50) ,
      ChuHo BIT
    );
GO 



CREATE TABLE HoaDonSinhHoat
    (
      HoaDonSinhHoatId INT NOT NULL
                                    PRIMARY KEY Identity ,
      CanHoId CHAR(5) ,
      NgayThang DATE ,

	  MaHDDien NVARCHAR(50),
      ChiSoDienBanDau INT ,
      ChiSoDienCuoi INT ,
	  TienDien FLOAT,

	  MaHDNuoc NVARCHAR(50),
      ChiSoNuocBanDau INT ,
      ChiSoNuocCuoi INT ,
      TienNuoc FLOAT, 
    );

GO 

CREATE TABLE HoaDonInternet
    (
      HoaDonInternetId NVARCHAR(50) NOT NULL
                                    PRIMARY KEY ,
      CanHoId CHAR(5) ,
      NgayThang DATE ,
      Tien FLOAT,
    );
GO 

CREATE TABLE HoaDonDichVu
    (
      HoaDonDichVuId NVARCHAR(15) NOT NULL
                                  PRIMARY KEY CONSTRAINT HoaDonDichVuId DEFAULT dbo.AUTO_IDHDDV(),
      CanHoId CHAR(5) ,
      TienDichVuCoBan FLOAT ,
      GuiXeId INT  ,
      TongTien FLOAT ,
      Thang DATE,
	  UserId VARCHAR(50)
   
    );
GO 

CREATE TABLE TienDichVuCoBan
( TienDVCBId INT PRIMARY KEY IDENTITY,
  TienDichVuCoBan FLOAT )
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
      GuiXeId INT NOT NULL
                          PRIMARY KEY IDENTITY ,
	  CanHoId CHAR(5),
      SoLuongXeDap SMALLINT ,
	  TienGuiXeDap FLOAT,
	  SoLuongXeMay SMALLINT ,
	  TienGuiXeMay FLOAT,
	  SoLuongXeHoi SMALLINT ,
	  TienGuiXeHoi FLOAT,
      TongTienGui FLOAT
    );
GO 



--Liên kết User với HoaDonDichVu
ALTER TABLE dbo.HoaDonDichVu ADD CONSTRAINT fk_UserId FOREIGN KEY (UserId) REFERENCES dbo.Users(UserId);
GO 
--Liên kết CanHo với ThongTinKhachHang
ALTER TABLE dbo.ThongTinKhachHang ADD CONSTRAINT fk_CanHoId_KhachHang FOREIGN KEY (CanHoId) REFERENCES dbo.CanHo(CanHoId);
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
--Liên kết CanHo với Guixe
ALTER TABLE dbo.GuiXe ADD CONSTRAINT fk_CanHoID_Guixe FOREIGN KEY (CanHoId) REFERENCES dbo.CanHo(CanHoId);
GO 
--Liên kết Guixe với  HoaDonDichVu
ALTER TABLE dbo.HoaDonDichVu ADD CONSTRAINT fk_GuiXeId_HoaDonDichVu FOREIGN KEY (GuiXeId) REFERENCES dbo.GuiXe(GuiXeId);
GO 


--User
INSERT dbo.Users
        ( UserId, Pass, Ten, Email, SoDT )
VALUES  ( 'quanLy', '123abc', N'Nguyễn Lê Quang', N'anhdung1999fpt@gmail.com', N'0253678394')
GO 


--Can Ho 1 Tang 1
INSERT dbo.CanHo 
   ( MaSoCanHo , KhachHangId , Tang, TinhTrang)
VALUES 
   ( '101','KH00000001',1,1)
GO 
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email , TrangThai ,ChuHo )
VALUES 
   ( 'CH001',N'Lê Ngọc Tâm','000000000001',1,'0908118444','tamlengoc@gmail.com',N'Đang Ở',1)
GO 
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email , TrangThai ,ChuHo )
VALUES 
   ( 'CH001',N'Chi Pu Ciu','000000000002',0,'0900000002','chipu@gmail.com',N'Tạm Vắng',0)
GO
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email , TrangThai ,ChuHo )
VALUES 
   ( 'CH001',N'Nguyễn Anh Dũng','000000000003',1,'0900000003','dungnguyenanh@gmail.com',N'Đang Ở',0)
GO 
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email , TrangThai ,ChuHo )
VALUES 
   ( 'CH001',N'Nguyễn Thiện Minh Quang','000000000004',1,'0900000004','minhquangnguyen@gmail.com',N'Đang Ở',0)
GO 

-- can ho 2 tang 1
INSERT dbo.CanHo 
   ( MaSoCanHo , KhachHangId , Tang,TinhTrang)
VALUES 
   ( '102','KH00000005',1,1)
GO 
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email , TrangThai ,ChuHo )
VALUES 
   ( 'CH002',N'Lê Minh Hùng','000000000005',1,'0900000005','leminhhung@gmail.com',N'Đang Ở',1)
GO 
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email , TrangThai ,ChuHo )
VALUES 
   ( 'CH002',N'Trần Huỳnh Phong','000000000006',1,'0900000006','phonghuynh@gmail.com',N'Đang Ở',0)
GO
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email , TrangThai ,ChuHo )
VALUES 
   ( 'CH002',N'Bùi Văn Tuyển','000000000007',1,'0900000007','tuyenvan@gmail.com',N'Đang Ở',0)
GO 
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email , TrangThai ,ChuHo )
VALUES 
   ( 'CH002',N'Nguyễn Đăng Hưng','000000000008',1,'0900000008','dunghang@gmail.com',N'Đang Ở',0)
GO 



-- can ho 3 tang 1
INSERT dbo.CanHo 
   ( MaSoCanHo , KhachHangId , Tang,TinhTrang)
VALUES 
   ( '103','KH00000009',1,1)
GO 
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email , TrangThai ,ChuHo )
VALUES 
   ( 'CH003',N'Nguyễn Hiếu Nghĩa','000000000009',1,'0900000009','nghianguyen@gmail.com',N'Đang Ở',1)
GO 
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email , TrangThai ,ChuHo )
VALUES 
   ( 'CH003',N'Nguyễn Nhật Thanh','000000000010',0,'0900000010','thanhkute@gmail.com',N'Đang Ở',0)
GO

-- Can ho 4 tang 1
INSERT dbo.CanHo 
   ( MaSoCanHo , KhachHangId , Tang,TinhTrang)
VALUES 
   ( '104','',1,0)
GO 

-- can ho 1 tang 2
INSERT dbo.CanHo 
   ( MaSoCanHo , KhachHangId , Tang,TinhTrang)
VALUES 
   ( '201','KH00000011',2,1)
GO 
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email , TrangThai ,ChuHo )
VALUES 
   ( 'CH005',N'Phạm Ngọc Thiện','000000000011',1,'0900000011','nghianguyen@gmail.com',N'Đang Ở',1)
GO 


-- can ho 2 tang 2
INSERT dbo.CanHo 
   ( MaSoCanHo , KhachHangId , Tang,TinhTrang)
VALUES 
   ( '202','KH00000012',2,1)
GO 

INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email , TrangThai ,ChuHo )
VALUES 
   ( 'CH006',N'Đỗ Bảo Trị','000000000012',0,'0900000012','triiudat@gmail.com',N'Đang Ở',1)
GO
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email , TrangThai ,ChuHo )
VALUES 
   ( 'CH006',N'Nguyễn Tiến Đạt','000000000013',1,'0900000013','datnguyen@gmail.com',N'Đang Ở',0)
GO


-- can ho 3 tang 2
INSERT dbo.CanHo 
   ( MaSoCanHo , KhachHangId , Tang,TinhTrang)
VALUES 
   ( '203','KH00000014',2,1)
GO 

INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email , TrangThai ,ChuHo )
VALUES 
   ( 'CH007',N'Bùi Thị Thơm','000000000014',0,'0900000014','thombui@gmail.com',N'Đang Ở',1)
GO
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email , TrangThai ,ChuHo )
VALUES 
   ( 'CH007',N'Trần Viết Tiến','000000000015',1,'0900000015','tienvk@gmail.com',N'Đang Ở',0)
GO
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email , TrangThai ,ChuHo )
VALUES 
   ( 'CH007',N'Hà Minh Quân','000000000016',1,'0900000016','quanha@gmail.com',N'Đang Ở',0)
GO

--Căn hộ 4 tầng 2
INSERT dbo.CanHo 
   ( MaSoCanHo , KhachHangId , Tang,TinhTrang)
VALUES 
   ( '204','',2,0)
GO 

-- can ho 1 tang 3
INSERT dbo.CanHo 
   ( MaSoCanHo , KhachHangId , Tang,TinhTrang)
VALUES 
   ( '301','KH00000017',3,1)
GO 

INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email , TrangThai ,ChuHo )
VALUES 
   ( 'CH009',N'Phan Bảo Phúc','000000000017',1,'0900000017','phucpb@gmail.com',N'Đang Ở',1)
GO
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email , TrangThai ,ChuHo )
VALUES 
   ( 'CH009',N'Cô Bé Quàng Khăn Đỏ','000000000018',1,'0900000018','bedo@gmail.com',N'Đang Ở',0)
GO
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email , TrangThai ,ChuHo )
VALUES 
   ( 'CH009',N'Sói','000000000019',1,'0900000019','Soi@gmail.com',N'Đang Ở',0)
GO
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email , TrangThai ,ChuHo )
VALUES 
   ( 'CH009',N'Bà Ngoại','000000000020',0,'0900000020','ngoaidj@gmail.com',N'Đang Ở',0)
GO


-- can ho 2 tang 3

INSERT dbo.CanHo 
   ( MaSoCanHo , KhachHangId , Tang,TinhTrang)
VALUES 
   ( '302','KH00000021',3,1)
GO 

INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email , TrangThai ,ChuHo )
VALUES 
   ( 'CH010',N'Trinh Lưu Quảng','000000000021',1,'0900000021','quangtrinh@gmail.com',N'Đang Ở',1)
GO
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email , TrangThai ,ChuHo )
VALUES 
   ( 'CH010',N'Dương Trúc Linh','000000000022',1,'0900000022','linhduong@gmail.com',N'Đang Ở',0)
GO

-- can ho 3 tang 3
INSERT dbo.CanHo 
   ( MaSoCanHo , KhachHangId , Tang,TinhTrang)
VALUES 
   ( '303','KH00000021',3,1)
GO 


INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email , TrangThai ,ChuHo )
VALUES 
   ( 'CH011',N'Hào Nguyễn','000000000023',1,'0900000023','nguyenhao@gmail.com',N'Đang Ở',1)
GO


--Căn hộ 4 tầng 3
INSERT dbo.CanHo 
   ( MaSoCanHo , KhachHangId, Tang,TinhTrang)
VALUES 
   ( '304','',3,0)
GO 


-- Tạo Loại Xe 
INSERT dbo.LoaiXe
   (LoaixeId ,Loai  ,GiaTrongCoi)
VALUES 
   ('XD', N'Xe Đạp',20000),
   ('XM' , N'Xe Máy',50000),
   ('XH', N'Xe Hơi',300000)
GO 

--Tien dichvucoban
INSERT dbo.TienDichVuCoBan
        ( TienDichVuCoBan )
VALUES  ( 200000 )
GO 





--Gửi Xe
--101
INSERT dbo.GuiXe
        ( CanHoId , SoLuongXeDap ,TienGuiXeDap ,SoLuongXeMay ,TienGuiXeMay ,SoLuongXeHoi ,TienGuiXeHoi ,TongTienGui)
VALUES  ( 'CH001' ,0 , 0.0 , 2 , 100000 , 1 , 300000 , 400000  )
GO 


-- 102
INSERT dbo.GuiXe
        ( CanHoId , SoLuongXeDap ,TienGuiXeDap ,SoLuongXeMay ,TienGuiXeMay ,SoLuongXeHoi ,TienGuiXeHoi ,TongTienGui)
VALUES  ( 'CH002' ,0 , 0.0 , 1 , 50000 , 1 , 300000 , 350000  )
GO 


-- 103
INSERT dbo.GuiXe
        ( CanHoId , SoLuongXeDap ,TienGuiXeDap ,SoLuongXeMay ,TienGuiXeMay ,SoLuongXeHoi ,TienGuiXeHoi ,TongTienGui)
VALUES  ( 'CH003' ,1 , 20000 , 2 , 100000 , 0 , 0.0 , 120000  )
GO 

--104
INSERT dbo.GuiXe
        ( CanHoId , SoLuongXeDap ,TienGuiXeDap ,SoLuongXeMay ,TienGuiXeMay ,SoLuongXeHoi ,TienGuiXeHoi ,TongTienGui)
VALUES  ( 'CH004' ,0 , 0 , 0 , 0 , 0 , 0.0 , 0  )
GO 

-- 201
INSERT dbo.GuiXe
        ( CanHoId , SoLuongXeDap ,TienGuiXeDap ,SoLuongXeMay ,TienGuiXeMay ,SoLuongXeHoi ,TienGuiXeHoi ,TongTienGui)
VALUES  ( 'CH005' ,1 , 20000 , 2 , 100000 , 0 , 0.0 , 120000  )
GO 


-- 202
INSERT dbo.GuiXe
        ( CanHoId , SoLuongXeDap ,TienGuiXeDap ,SoLuongXeMay ,TienGuiXeMay ,SoLuongXeHoi ,TienGuiXeHoi ,TongTienGui)
VALUES  ( 'CH006' ,0 , 0 , 1 , 50000 , 0 , 300000.0 , 350000  )
GO 

-- 203
INSERT dbo.GuiXe
        ( CanHoId , SoLuongXeDap ,TienGuiXeDap ,SoLuongXeMay ,TienGuiXeMay ,SoLuongXeHoi ,TienGuiXeHoi ,TongTienGui)
VALUES  ( 'CH007' ,0 , 0 , 1 , 50000 , 1 , 300000.0 , 350000  )
GO 

-- 204
INSERT dbo.GuiXe
        ( CanHoId , SoLuongXeDap ,TienGuiXeDap ,SoLuongXeMay ,TienGuiXeMay ,SoLuongXeHoi ,TienGuiXeHoi ,TongTienGui)
VALUES  ( 'CH008' ,0 , 0 , 0 , 0 , 0 , 0.0 , 0  )
GO

-- 301
INSERT dbo.GuiXe
        ( CanHoId , SoLuongXeDap ,TienGuiXeDap ,SoLuongXeMay ,TienGuiXeMay ,SoLuongXeHoi ,TienGuiXeHoi ,TongTienGui)
VALUES  ( 'CH009' ,0 , 0 , 1 , 50000 , 1 , 300000.0 , 350000  )
GO 


-- 302
INSERT dbo.GuiXe
        ( CanHoId , SoLuongXeDap ,TienGuiXeDap ,SoLuongXeMay ,TienGuiXeMay ,SoLuongXeHoi ,TienGuiXeHoi ,TongTienGui)
VALUES  ( 'CH010' ,0 , 0 , 1 , 50000 , 1 , 300000.0 , 350000  )
GO 


-- 303
INSERT dbo.GuiXe
        ( CanHoId , SoLuongXeDap ,TienGuiXeDap ,SoLuongXeMay ,TienGuiXeMay ,SoLuongXeHoi ,TienGuiXeHoi ,TongTienGui)
VALUES  ( 'CH011' ,0 , 0 , 1 , 50000 , 1 , 300000.0 , 350000  )
GO

-- 304
INSERT dbo.GuiXe
        ( CanHoId , SoLuongXeDap ,TienGuiXeDap ,SoLuongXeMay ,TienGuiXeMay ,SoLuongXeHoi ,TienGuiXeHoi ,TongTienGui)
VALUES  ( 'CH012' ,0 , 0 , 0 , 0 , 0 , 0.0 , 0  )
GO



-- Tạo HD DỊCH VỤ
-- Tháng 01


-- 101
INSERT dbo.HoaDonDichVu
   (CanHoId ,TienDichVuCoBan ,GuiXeId , TongTien , Thang , UserId)
VALUES 
   ('CH001', 200000,1,600000,'01/01/2019','Quanly')
GO

-- 102
INSERT dbo.HoaDonDichVu
   (CanHoId ,TienDichVuCoBan ,GuiXeId , TongTien , Thang , UserId)
VALUES 
   ('CH002', 200000,2,550000,'01/01/2019','Quanly')
go




-- 103
INSERT dbo.HoaDonDichVu
   (CanHoId ,TienDichVuCoBan ,GuiXeId , TongTien , Thang , UserId)
VALUES 
   ('CH003', 200000,3,320000,'01/01/2019','Quanly')
go



-- 201
INSERT dbo.HoaDonDichVu
   (CanHoId ,TienDichVuCoBan ,GuiXeId , TongTien , Thang , UserId)
VALUES 
   ('CH005', 200000,5,320000,'01/01/2019','Quanly')
go




-- 202
INSERT dbo.HoaDonDichVu
   (CanHoId ,TienDichVuCoBan ,GuiXeId , TongTien , Thang , UserId)
VALUES 
   ('CH006', 200000,6,550000,'01/01/2019','Quanly')
go



-- 301
INSERT dbo.HoaDonDichVu
   (CanHoId ,TienDichVuCoBan ,GuiXeId , TongTien , Thang , UserId)
VALUES 
   ('CH009', 200000,9,550000,'01/01/2019','Quanly')
go



-- 302
INSERT dbo.HoaDonDichVu
   (CanHoId ,TienDichVuCoBan ,GuiXeId , TongTien , Thang , UserId)
VALUES 
   ('CH010', 200000,10,550000,'01/01/2019','Quanly')
go



-- Tháng 02
          -- 101
INSERT dbo.HoaDonDichVu
   (CanHoId ,TienDichVuCoBan ,GuiXeId , TongTien , Thang , UserId)
VALUES 
   ('CH001', 200000,1,600000,'02/01/2019','Quanly')
go

-- 102
INSERT dbo.HoaDonDichVu
   (CanHoId ,TienDichVuCoBan ,GuiXeId , TongTien , Thang , UserId)
VALUES 
   ('CH002', 200000,2,550000,'02/01/2019','Quanly')
go



--103
INSERT dbo.HoaDonDichVu
   (CanHoId ,TienDichVuCoBan ,GuiXeId , TongTien , Thang , UserId)
VALUES 
   ('CH003', 200000,3,320000,'02/01/2019','Quanly')
go



-- 201
INSERT dbo.HoaDonDichVu
   (CanHoId ,TienDichVuCoBan ,GuiXeId , TongTien , Thang , UserId)
VALUES 
   ('CH005', 200000,5,320000,'02/01/2019','Quanly')
go



-- 202
INSERT dbo.HoaDonDichVu
   (CanHoId ,TienDichVuCoBan ,GuiXeId , TongTien , Thang , UserId)
VALUES 
   ('CH006', 200000,6,550000,'02/01/2019','Quanly')
go




 -- 203
INSERT dbo.HoaDonDichVu
   (CanHoId ,TienDichVuCoBan ,GuiXeId , TongTien , Thang , UserId)
VALUES 
   ('CH007', 200000,7,550000,'02/01/2019','Quanly')
go


 -- 301
INSERT dbo.HoaDonDichVu
   (CanHoId ,TienDichVuCoBan ,GuiXeId , TongTien , Thang , UserId)
VALUES 
   ('CH009', 200000,9,550000,'02/01/2019','Quanly')
go



 -- 302
INSERT dbo.HoaDonDichVu
   (CanHoId ,TienDichVuCoBan ,GuiXeId , TongTien , Thang , UserId)
VALUES 
   ('CH010', 200000,10,550000,'02/01/2019','Quanly')
go



-- 303
INSERT dbo.HoaDonDichVu
   (CanHoId ,TienDichVuCoBan ,GuiXeId , TongTien , Thang , UserId)
VALUES 
   ('CH011', 200000,11,550000,'02/01/2019','Quanly')
go






-- Tháng 03
-- 101
INSERT dbo.HoaDonDichVu
   (CanHoId ,TienDichVuCoBan ,GuiXeId , TongTien , Thang , UserId)
VALUES 
   ('CH001', 200000,1,600000,'03/01/2019','Quanly')
go

-- 102
INSERT dbo.HoaDonDichVu
   (CanHoId ,TienDichVuCoBan ,GuiXeId , TongTien , Thang , UserId)
VALUES 
   ('CH002', 200000,2,550000,'03/01/2019','Quanly')
go



-- 103
INSERT dbo.HoaDonDichVu
   (CanHoId ,TienDichVuCoBan ,GuiXeId , TongTien , Thang , UserId)
VALUES 
   ('CH003', 200000,3,320000,'03/01/2019','Quanly')
go



-- 201
INSERT dbo.HoaDonDichVu
   (CanHoId ,TienDichVuCoBan ,GuiXeId , TongTien , Thang , UserId)
VALUES 
   ('CH005', 200000,5,320000,'03/01/2019','Quanly')
go



-- 202
INSERT dbo.HoaDonDichVu
   (CanHoId ,TienDichVuCoBan ,GuiXeId , TongTien , Thang , UserId)
VALUES 
   ('CH006', 200000,6,550000,'03/01/2019','Quanly')
go




-- 203
INSERT dbo.HoaDonDichVu
   (CanHoId ,TienDichVuCoBan ,GuiXeId , TongTien , Thang , UserId)
VALUES 
   ('CH007', 200000,7,550000,'03/01/2019','Quanly')
go





 -- 301
INSERT dbo.HoaDonDichVu
   (CanHoId ,TienDichVuCoBan ,GuiXeId , TongTien , Thang , UserId)
VALUES 
   ('CH009', 200000,9,550000,'03/01/2019','Quanly')
go




-- 302
INSERT dbo.HoaDonDichVu
   (CanHoId ,TienDichVuCoBan ,GuiXeId , TongTien , Thang , UserId)
VALUES 
   ('CH010', 200000,10,550000,'03/01/2019','Quanly')
go




-- 303
INSERT dbo.HoaDonDichVu
   (CanHoId ,TienDichVuCoBan ,GuiXeId , TongTien , Thang , UserId)
VALUES 
   ('CH011', 200000,11,550000,'03/01/2019','Quanly')
go

 

-- Tạo Hóa Đơn Internet

INSERT dbo.HoaDonInternet
   (HoaDonInternetId ,CanHoId , NgayThang , Tien)
VALUES 
    -- thang 1 
   (N'0154684249','CH001','01/01/2019',215000),
   (N'0547128654','CH002','01/01/2019',215000),
   (N'5231575495','CH003','01/01/2019',215000),
   (N'2654152156','CH005','01/01/2019',215000),
   (N'5486874654','CH006','01/01/2019',215000),
   (N'5875345615','CH009','01/01/2019',215000),
   (N'2486235485','CH010','01/01/2019',215000),
   -- thang 2
   (N'1478523695','CH001','02/01/2019',215000),
   (N'7418529635','CH002','02/01/2019',215000),
   (N'1597531256','CH003','02/01/2019',215000),
   (N'7536987412','CH005','02/01/2019',215000),
   (N'1236987451','CH006','02/01/2019',215000),
   (N'7569841235','CH007','02/01/2019',215000),
   (N'1486241235','CH009','02/01/2019',215000),
   (N'4869571532','CH010','02/01/2019',215000),
   (N'1253684759','CH011','02/01/2019',215000),
   --thang 3
   (N'1478632595','CH001','03/01/2019',215000),
   (N'1259847536','CH002','03/01/2019',215000),
   (N'4865258478','CH003','03/01/2019',215000),
   (N'9856452521','CH005','03/01/2019',215000),
   (N'1486239713','CH006','03/01/2019',215000),
   (N'1839274862','CH007','03/01/2019',215000),
   (N'1486957548','CH009','03/01/2019',215000),
   (N'2584685231','CH010','03/01/2019',215000),
   (N'1488624686','CH011','03/01/2019',215000) 

Go


INSERT dbo.HoaDonSinhHoat
   (CanHoId , NgayThang , MaHDDien , ChiSoDienBanDau , ChiSoDienCuoi , TienDien , MaHDNuoc , ChiSoNuocBanDau , ChiSoNuocCuoi , TienNuoc)
VALUES 
    -- thang 1 
   ('CH001','01/01/2019',N'02546848',0,525,837450,N'0126458',0,70,555290),
   ('CH002','01/01/2019',N'03546879',0,324,515850,N'0156485',0,21,157900),
   ('CH003','01/01/2019',N'04786548',0,700,1117450,N'0148475',0,11,76800),
   ('CH005','01/01/2019',N'05782154',0,305,485450,N'0147958',0,63,498520),
   ('CH006','01/01/2019',N'06498754',0,340,541450,N'0168498',0,62,490410),
   ('CH009','01/01/2019',N'07123458',0,289,459850,N'0164854',0,33,255220),
   ('CH010','01/01/2019',N'08164875',0,435,693450,N'0144865',0,55,433640),
   -- thang 2
   ('CH001','02/01/2019',N'09156485',525,942,664650,N'0216548',70,145,595840),
   ('CH002','02/01/2019',N'11264856',324,765,703050,N'0216485',21,52,239000),
   ('CH003','02/01/2019',N'21654452',700,1200,797450,N'0214846',11,56,352540),
   ('CH005','02/01/2019',N'16348465',305,610,485450,N'0264856',63,135,571510),
   ('CH006','02/01/2019',N'17564856',340,752,656650,N'0246879',62,118,441750),
   ('CH007','02/01/2019',N'03154685',0,420,669450,N'0214879',0,69,547180),
   ('CH009','02/01/2019',N'09123548',289,623,531850,N'0278468',33,67,263330),
   ('CH010','02/01/2019',N'07845246',435,870,693450,N'0274685',55,105,393090),
   ('CH011','02/01/2019',N'01654845',0,402,640650,N'0246969',0,70,555290),
   -- thang 3
   ('CH001','03/01/2019',N'45831586',942,1345,642250,N'0348795',145,200,433640),
   ('CH002','03/01/2019',N'65432174',765,1065,477450,N'0368695',52,102,393090),
   ('CH003','03/01/2019',N'96548752',1200,1568,586250,N'0314657',56,80,182230),
   ('CH005','03/01/2019',N'35647952',610,987,600650,N'0312468',135,150,109240),
   ('CH006','03/01/2019',N'98642154',752,1035,450250,N'0314785',118,181,498520),
   ('CH007','03/01/2019',N'12546872',420,840,669450,N'0335468',69,130,482300),
   ('CH009','03/01/2019',N'12547523',623,990,584650,N'0369485',67,89,166010),
   ('CH010','03/01/2019',N'12548783',870,1232,576650,N'0314758',55,77,166010),
   ('CH011','03/01/2019',N'35154863',402,735,530250,N'0312546',70,77,48083)
GO

