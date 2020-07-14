USE testingsystem;


-- 1.Tạo và xem view danh sách nhân viên phòng Sale 
CREATE OR REPLACE VIEW v_nhan_vien_sales AS
	(SELECT *
    FROM account
    WHERE DepartmentID = 2
    );
    
SELECT * FROM v_nhan_vien_sales;

-- 2.Tạo và xem view thông tin account vào nhiều group nhất 
CREATE OR REPLACE VIEW v_nhan_vien_vao_nhieu_group AS
	(SELECT a.*,COUNT(a.AccountID) AS so_group_tham_gia
    FROM account a
    JOIN groupaccount ga
    ON ga.AccountID = a.AccountID
    GROUP BY a.AccountID
    HAVING COUNT(a.AccountID) = 	(SELECT MAX(total)
										FROM	(SELECT AccountID,COUNT(AccountID) AS total
												FROM groupaccount
												GROUP BY AccountID
                                                ) xxx
										)
    );
    
SELECT * FROM v_nhan_vien_vao_nhieu_group;
    
-- 3.Tạo và xem view những câu chứa quá 3 từ
CREATE OR REPLACE VIEW v_cau_hoi_qua_dai AS
	(SELECT *
    FROM question
    WHERE LENGTH(Content) - LENGTH(REPLACE(Content,' ','')) + 1 > 3
    );

SELECT * FROM v_cau_hoi_qua_dai;

-- 4.Tạo và xem view danh sách các phòng ban có nhiều nhân viên nhất
CREATE OR REPLACE VIEW v_depart_nhieu_nhan_vien_nhat AS
	(SELECT d.*, COUNT(d.DepartmentID) AS so_nhan_vien
    FROM department d
    JOIN account a
    ON d.DepartmentID = a.DepartmentID
    GROUP BY d.DepartmentID
    HAVING COUNT(d.DepartmentID) = (SELECT MAX(total)
											FROM	(SELECT AccountID,COUNT(AccountID) AS total
													FROM account
													GROUP BY DepartmentID
													) xxx	
											)
    );

SELECT * FROM v_depart_nhieu_nhan_vien_nhat;

-- 5.Tạo và xem view danh sách câu hỏi tạo bởi người họ Nguyễn
CREATE OR REPLACE VIEW v_cau_hoi_tao_boi_ho_Nguyen AS
	(SELECT q.*, a.Fullname
    FROM account a
    JOIN question q
    ON q.CreatorID = a.AccountID
    WHERE a.FullName LIKE 'Nguyen%'
    );
    
SELECT * FROM v_cau_hoi_tao_boi_ho_Nguyen;