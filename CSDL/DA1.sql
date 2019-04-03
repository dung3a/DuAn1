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
	  Tang SMALLINT
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
      SoDT NCHAR(15) ,
      Email NVARCHAR(100) ,
      ChuHo BIT
    );
GO 








CREATE TABLE HoaDonSinhHoat
    (
      HoaDonSinhHoatId NVARCHAR(50) NOT NULL
                                    PRIMARY KEY ,
      HoaDonId NVARCHAR(50) ,
      CanHoId CHAR(5) ,
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
      CanHoId CHAR(5) ,
      NgayThang DATE ,
      Tien FLOAT,
  
    );
GO 

CREATE TABLE HoaDonDichVu
    (
      HoaDonDichVuId NVARCHAR(10) NOT NULL
                                  PRIMARY KEY CONSTRAINT HoaDonDichVuId DEFAULT dbo.AUTO_IDHDDV(),
      HoaDonId NVARCHAR(50) ,
      CanHoId CHAR(5) ,
      TienDichVuCoBan FLOAT ,
      TienGuiXe FLOAT ,
      TongTien FLOAT ,
      Thang DATE,
	  UserId VARCHAR(50)
   
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
--Liên kết HoaDonDichVu với Guixe
ALTER TABLE dbo.GuiXe ADD CONSTRAINT fk_HoaDonDichVuId_GuiXe FOREIGN KEY (HoaDonDichVuId) REFERENCES dbo.HoaDonDichVu(HoaDonDichVuId);
GO 
--Liên kết LoaiXe với GuiXe
ALTER TABLE dbo.GuiXe ADD CONSTRAINT fk_LoaixeId_GuiXe FOREIGN KEY (LoaixeId) REFERENCES dbo.LoaiXe(LoaixeId);
GO 


--User
INSERT dbo.Users
        ( UserId, Pass, Ten, Email, SoDT )
VALUES  ( 'QuanLy', '123abc', N'Nguyễn Lê Quang', N'anhdung1999fpt@gmail.com', N'0253678394')
GO 



INSERT dbo.CanHo 
   ( MaSoCanHo , KhachHangId , Tang)
VALUES 
   ( '101','KH00000001',1)
GO 
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email  ,ChuHo )
VALUES 
   ( 'CH001',N'Lê Ngọc Tâm','000000000001',1,'0908118444','tamlengoc@gmail.com',1)
GO 
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email  ,ChuHo )
VALUES 
   ( 'CH001',N'Chi Pu Ciu','000000000002',0,'0900000002','chipu@gmail.com',0)
GO
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email  ,ChuHo )
VALUES 
   ( 'CH001',N'Nguyễn Anh Dũng','000000000003',1,'0900000003','dungnguyenanh@gmail.com',0)
GO 
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email  ,ChuHo )
VALUES 
   ( 'CH001',N'Nguyễn Thiện Minh Quang','000000000004',1,'0900000004','minhquangnguyen@gmail.com',0)
GO 

-- can ho 2 tang 1
INSERT dbo.CanHo 
   ( MaSoCanHo , KhachHangId , Tang)
VALUES 
   ( '102','KH00000005',1)
GO 
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email  ,ChuHo )
VALUES 
   ( 'CH002',N'Lê Minh Hùng','000000000005',1,'0900000005','leminhhung@gmail.com',1)
GO 
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email  ,ChuHo )
VALUES 
   ( 'CH002',N'Trần Huỳnh Phong','000000000006',1,'0900000006','phonghuynh@gmail.com',0)
GO
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email  ,ChuHo )
VALUES 
   ( 'CH002',N'Bùi Văn Tuyển','000000000007',1,'0900000007','tuyenvan@gmail.com',0)
GO 
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email  ,ChuHo )
VALUES 
   ( 'CH002',N'Nguyễn Đăng Hưng','000000000008',1,'0900000008','dunghang@gmail.com',0)
GO 



-- can ho 3 tang 1
INSERT dbo.CanHo 
   ( MaSoCanHo , KhachHangId , Tang)
VALUES 
   ( '103','KH00000009',1)
GO 
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email  ,ChuHo )
VALUES 
   ( 'CH003',N'Nguyễn Hiếu Nghĩa','000000000009',1,'0900000009','nghianguyen@gmail.com',1)
GO 
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email  ,ChuHo )
VALUES 
   ( 'CH003',N'Nguyễn Nhật Thanh','000000000010',0,'0900000010','thanhkute@gmail.com',0)
GO


-- can ho 1 tang 2
INSERT dbo.CanHo 
   ( MaSoCanHo , KhachHangId , Tang)
VALUES 
   ( '201','KH00000011',2)
GO 
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email  ,ChuHo )
VALUES 
   ( 'CH004',N'Phạm Ngọc Thiện','000000000011',1,'0900000011','nghianguyen@gmail.com',1)
GO 


-- can ho 2 tang 2
INSERT dbo.CanHo 
   ( MaSoCanHo , KhachHangId , Tang)
VALUES 
   ( '202','KH00000012',2)
GO 

INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email  ,ChuHo )
VALUES 
   ( 'CH005',N'Đỗ Bảo Trị','000000000012',0,'0900000012','triiudat@gmail.com',1)
GO
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email  ,ChuHo )
VALUES 
   ( 'CH005',N'Nguyễn Tiến Đạt','000000000013',1,'0900000013','datnguyen@gmail.com',0)
GO


-- can ho 3 tang 2
INSERT dbo.CanHo 
   ( MaSoCanHo , KhachHangId , Tang)
VALUES 
   ( '203','KH00000014',2)
GO 

INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email  ,ChuHo )
VALUES 
   ( 'CH006',N'Bùi Thị Thơm','000000000014',0,'0900000014','thombui@gmail.com',1)
GO
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email  ,ChuHo )
VALUES 
   ( 'CH006',N'Trần Viết Tiến','000000000015',1,'0900000015','tienvk@gmail.com',0)
GO
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email  ,ChuHo )
VALUES 
   ( 'CH006',N'Hà Minh Quân','000000000016',1,'0900000016','quanha@gmail.com',0)
GO


-- can ho 1 tang 3
INSERT dbo.CanHo 
   ( MaSoCanHo , KhachHangId , Tang)
VALUES 
   ( '301','KH00000017',3)
GO 

INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email  ,ChuHo )
VALUES 
   ( 'CH007',N'Phan Bảo Phúc','000000000017',1,'0900000017','phucpb@gmail.com',1)
GO
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email  ,ChuHo )
VALUES 
   ( 'CH007',N'Cô Bé Quàng Khăn Đỏ','000000000018',1,'0900000018','bedo@gmail.com',0)
GO
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email  ,ChuHo )
VALUES 
   ( 'CH007',N'Sói','000000000019',1,'0900000019','Soi@gmail.com',0)
GO
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email  ,ChuHo )
VALUES 
   ( 'CH007',N'Bà Ngoại','000000000020',0,'0900000020','ngoaidj@gmail.com',0)
GO


-- can ho 2 tang 3
INSERT dbo.CanHo 
   ( MaSoCanHo , KhachHangId , Tang)
VALUES 
   ( '302','KH00000021',3)
GO 

INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email  ,ChuHo )
VALUES 
   ( 'CH008',N'Trinh Lưu Quảng','000000000021',1,'0900000021','quangtrinh@gmail.com',1)
GO
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email  ,ChuHo )
VALUES 
   ( 'CH008',N'Dương Trúc Linh','000000000022',1,'0900000022','linhduong@gmail.com',0)
GO

-- can ho 3 tang 3
INSERT dbo.CanHo 
   ( MaSoCanHo , KhachHangId , Tang)
VALUES 
   ( '303','KH00000021',3)
GO 

INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email  ,ChuHo )
VALUES 
   ( 'CH009',N'Trinh Lưu Quảng','000000000021',1,'0900000021','quangtrinh@gmail.com',1)
GO
INSERT dbo.ThongTinKhachHang 
   (CanHoId ,TenKhachHang  ,CMND  ,GioiTinh  ,SoDT  ,Email  ,ChuHo )
VALUES 
   ( 'CH009',N'Hào Nguyễn','000000000023',1,'0900000023','nguyenhao@gmail.com',0)
GO


-- Tạo Loại Xe 
INSERT dbo.LoaiXe
   (LoaixeId ,Loai  ,GiaTrongCoi)
VALUES 
   ('XD', N'Xe Đạp','50000000'),
   ('XM' , N'Xe Máy','100000000'),
   ('XPKL', N'Xe Phân Khối Lớn','200000000'),
   ('XH', N'Xe Hơi','300000000')
GO 





  




select * from ThongTinKhachHang