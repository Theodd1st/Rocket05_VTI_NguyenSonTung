USE testingsystem;

-- 1.Tạo và call store nhập tên phòng ban ra các account trong phòng đó 
DROP PROCEDURE IF EXISTS danh_sach_nhan_vien;

DELIMITER $$
CREATE PROCEDURE danh_sach_nhan_vien(IN p_ten_phong_ban NCHAR(20))
BEGIN
	SELECT a.*
    FROM account a
    JOIN department d
    ON d.DepartmentID = a.DepartmentID
    WHERE d.DepartmentName = p_ten_phong_ban;
END $$
DELIMITER ;

CALL danh_sach_nhan_vien('Sale');

-- 2.Tạo và call store in ra số lượng account trong mỗi group
DROP PROCEDURE IF EXISTS so_luong_account;

DELIMITER $$
CREATE PROCEDURE so_luong_account()
BEGIN
	SELECT ga.GroupID, COUNT(a.AccountID) AS so_luong_account
    FROM account a
    JOIN groupaccount ga
    ON ga.AccountID = a.AccountID
    GROUP BY ga.GroupID;
END $$
DELIMITER ;

CALL so_luong_account;

-- 3.Tạo và call store thống kê có bao nhiêu question đc tạo ra qua typequestion trong tháng chỉ định
DROP PROCEDURE IF EXISTS thong_ke_theo_thang;

DELIMITER $$
CREATE PROCEDURE thong_ke_theo_thang(IN p_thang INTEGER)
BEGIN
	SELECT tq.TypeName, COUNT(q.QuestionID)
    FROM question q
    JOIN typequestion tq
    ON tq.TypeID = q.TypeID
    WHERE MONTH(q.CreateDate) = p_thang
    GROUP BY tq.TypeID;
END $$
DELIMITER ;

CALL thong_ke_theo_thang(4);

-- 4.Tạo và call store để trả ra ID typequestion có nhiều question nhất
DROP PROCEDURE IF EXISTS ID_co_nhieu_question_nhat;

DELIMITER $$
CREATE PROCEDURE ID_co_nhieu_question_nhat(OUT p_ID INTEGER)
BEGIN
	SELECT tq.TypeID INTO p_ID
    FROM typequestion tq
    JOIN question q
    ON tq.TypeID = q.TypeID
    GROUP BY tq.TypeID
    HAVING COUNT(q.QuestionID) = 	(SELECT MAX(a)
									FROM	(SELECT COUNT(QuestionID) AS a
											FROM question
											GROUP BY TypeID
                                            ) xxx
									);
END $$
DELIMITER ;

SET @p_ID = 0;
CALL ID_co_nhieu_question_nhat(@p_ID);
SELECT @p_ID;

-- 5.Tìm tên tq từ kết quả ID của câu 4
SELECT TypeName
FROM typequestion
WHERE TypeID = @p_ID;

-- 6.Tạo và call store có khả năng trả ra account khi nhập chuỗi
DROP PROCEDURE IF EXISTS nhap_chuoi;

DELIMITER $$
CREATE PROCEDURE nhap_chuoi(IN in_chuoi VARCHAR(50))
BEGIN
	SELECT GroupName
    FROM `group` 
    WHERE GroupName LIKE CONCAT('%',in_chuoi,'%');
    
    SELECT Username
    FROM `account`
    WHERE Username LIKE CONCAT('%',in_chuoi,'%');
END $$
DELIMITER ;

CALL nhap_chuoi('VTI');

-- 7.Nhập tên và mail
DROP PROCEDURE IF EXISTS nhap_ten_va_mail;

DELIMITER $$
CREATE PROCEDURE nhap_ten_va_mail(IN in_email VARCHAR(50),IN in_fullName NVARCHAR(50))						
BEGIN
	DECLARE Username VARCHAR(50) DEFAULT SUBSTRING_INDEX(in_email,'@',1);
    DECLARE PositionID TINYINT UNSIGNED DEFAULT 1;
    DECLARE DepartmentID TINYINT UNSIGNED DEFAULT 1;
    DECLARE CreateDate DATETIME DEFAULT NOW();
	
	INSERT INTO `Account` 	(Email		,Username, FullName		, DepartmentID,	PositionID,	CreateDate)
    VALUE					(in_email	,Username, in_fullName	, DepartmentID, PositionID, CreateDate);
	
    SELECT 	*
    FROM 	`Account`A
    WHERE	A.Username = Username;
	
END$$
DELIMITER ;

CALL nhap_ten_va_mail('kha2kha@gmail.com', 'Nguyen Xuan Cong');

-- 8.Nhập Essay hoặc MC để ra content dài nhất của nó
DROP PROCEDURE IF EXISTS nhap_essay_hoac_MC;

DELIMITER $$
CREATE PROCEDURE nhap_essay_hoac_MC(IN in_gia_tri VARCHAR(50))
BEGIN
	IF in_gia_tri = 'essay' THEN
		SELECT	Content, CHAR_LENGTH(Content)
		FROM	Question
		WHERE	CHAR_LENGTH(Content) = (SELECT MAX(CHAR_LENGTH(Content))
										FROM Question
										WHERE TypeID = 1);
	ELSEIF (in_gia_tri = 'MC') THEN
		SELECT	Content, CHAR_LENGTH(Content)
		FROM	Question
		WHERE	CHAR_LENGTH(Content) = (SELECT MAX(CHAR_LENGTH(Content))
										FROM Question
										WHERE TypeID = 2);
	END IF;
END$$
DELIMITER ;

CALL nhap_essay_hoac_MC('essay');

-- 9. Xóa exam dựa vào ID
DROP PROCEDURE IF EXISTS nhap_examID;

DELIMITER $$
CREATE PROCEDURE nhap_examID(IN in_examID INTEGER)
BEGIN
	DELETE
    FROM exam
    WHERE ExamID = in_examID;
END$$
DELIMITER ;

CALL nhap_examID('1');

-- 10. Tìm exam tạo ra từ 3 năm trước(2017) và xóa nó đi, in số record bị ảnh hưởng
DROP PROCEDURE IF EXISTS tim_va_xoa;

DELIMITER $$
CREATE PROCEDURE tim_va_xoa()
BEGIN
	CALL nhap_examID(	(SELECT ExamID
						FROM exam
                        WHERE YEAR(CreateDate) = 2017)
    );
    SELECT ROW_COUNT();
END$$
DELIMITER ;

CALL tim_va_xoa;

-- 11. Xóa phòng theo tên, đổi tất cả nhân viên trong phòng ban đó về phòng ban 1(default)
DROP PROCEDURE IF EXISTS xoa_phong_ban_theo_ten;

DELIMITER $$
CREATE PROCEDURE xoa_phong_ban_theo_ten(IN	in_ten_phong_ban NVARCHAR(50))
BEGIN
	UPDATE 	`Account`
    SET		DepartmentID = 1
    WHERE	DepartmentID = (SELECT 	DepartmentID	
							FROM	Department
							WHERE 	DepartmentName = in_ten_phong_ban);
	DELETE 
    FROM	Department
    WHERE	DepartmentName = in_ten_phong_ban;
END$$
DELIMITER ;

CALL xoa_phong_ban_theo_ten('Sale');

-- 12. Thống kê số câu hỏi tạo ra theo tháng
DROP PROCEDURE IF EXISTS thong_ke_theo_thang;

DELIMITER $$
CREATE PROCEDURE thong_ke_theo_thang()
BEGIN
		SELECT EachMonthInYear.MONTH, COUNT(QuestionID) AS COUNT
		FROM
		(	SELECT 1 AS MONTH
			UNION SELECT 2 AS MONTH
			UNION SELECT 3 AS MONTH
			UNION SELECT 4 AS MONTH
			UNION SELECT 5 AS MONTH
			UNION SELECT 6 AS MONTH
			UNION SELECT 7 AS MONTH
			UNION SELECT 8 AS MONTH
			UNION SELECT 9 AS MONTH
			UNION SELECT 10 AS MONTH
			UNION SELECT 11 AS MONTH
			UNION SELECT 12 AS MONTH
        ) AS EachMonthInYear
		LEFT JOIN Question ON EachMonthInYear.MONTH = MONTH(CreateDate)
		GROUP BY EachMonthInYear.MONTH
		ORDER BY EachMonthInYear.MONTH ASC;
END$$
DELIMITER ;

CALL thong_ke_theo_thang;