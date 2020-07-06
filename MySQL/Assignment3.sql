DROP DATABASE IF EXISTS Management;
CREATE DATABASE Management;
USE Management;

CREATE TABLE `Department` (
    DepartmentID 	TINYINT AUTO_INCREMENT,
    DepartmentName 	VARCHAR(50),
    PRIMARY KEY (DepartmentID),
    UNIQUE KEY (DepartmentName)
);

INSERT INTO `Department` (DepartmentName) VALUES
('Sales'),
('Managing'),
('Public work'),
('Health'),
('Agricultural'),
('Education'),
('Marketing'),
('Operations'),
('Finance'),
('Human Resource'),
('Purchase'),
('Production'),
('Research');

CREATE TABLE `Position` (
    PositionID 		TINYINT AUTO_INCREMENT,
    PositionName 	ENUM('Dev', 'Test', 'Scrum Master', 'PM'),
    PRIMARY KEY (PositionID)
);

INSERT INTO `Position` (PositionName) VALUES
('Dev'),
('Test'),
('Scrum Master'),
('PM');

CREATE TABLE `Account` (
    AccountID 		TINYINT AUTO_INCREMENT,
    Email 			VARCHAR(50),
    Username 		VARCHAR(50),
    Fullname 		VARCHAR(50),
    DepartmentID 	TINYINT,
    PositionID 		TINYINT,
    CreateDate 		DATETIME DEFAULT NOW(),
    PRIMARY KEY (AccountID),
    UNIQUE KEY (Username , Email),
    CONSTRAINT PositionFK FOREIGN KEY (PositionID)
        REFERENCES `Position` (PositionID)
        ON DELETE CASCADE,
    CONSTRAINT DepartmentFK FOREIGN KEY (DepartmentID)
        REFERENCES `Department` (DepartmentID)
        ON DELETE CASCADE
);

INSERT INTO `Account` (Email,Username,Fullname,DepartmentID,PositionID) VALUES
('theodd1st@gmail.com','Theodd','Nguyen Son Tung','2','1'),
('thachtu.nguyen@gmail.com','Atus','Nguyen Thach Tui','2','1'),
('TheSlipperyGamer@gmail.com','Titateace','Bhuzum Hein','2','3'),
('oneWastefultrick@gmail.com','Yagiancon','Makrarn Terrafall','1','1'),
('oneKnottytrick@gmail.com','Enseptypt','Dedam Ditsk','2','4'),
('oneStickytrick@gmail.com','Etosibalb','Orber Serpenthelm','4','2'),
('theReadytricker@gmail.com','Eshrocula','Oth Spiritpike','2','2'),
('theInnatetricker@gmail.com','Fistomyce','Jiyao','5','3'),
('Jitterytricker@gmail.com','Wheodd','Diay Qano','3','4'),
('Mistytricker@gmail.com','Theo','Dronzok Dyemergo','7','1'),
('Abackhustle@gmail.com','Wo','Tuntuembe Zimubro','10','3'),
('Secretivehustle@gmail.com','Transer','Frievin Costuviro','1','1'),
('theImaginary@gmail.com','Fatas','Pisho','1','2');

CREATE TABLE `Group` (
    GroupID 		TINYINT AUTO_INCREMENT,
    GroupName 		VARCHAR(50),
    CreatorID 		TINYINT,
    CreatorDate 	DATETIME DEFAULT NOW(),
    PRIMARY KEY (GroupID),
    UNIQUE KEY (GroupName),
    CONSTRAINT CreatorFK1 FOREIGN KEY (CreatorID)
        REFERENCES `Account` (AccountID)
        ON DELETE CASCADE
);

INSERT INTO `Group` (GroupName,CreatorID,CreatorDate) VALUES
('The Uncalled Four','3','2020-07-06 12:34:24'),
('Through Thick and Thin','2','2018-09-29 03:10:32'),
('Birds of a Feather','4','2018-11-29 04:58:22'),
('Flock Together','6','2019-06-01 03:20:44'),
('Dream Team','1','2019-10-05 05:22:13'),
('Pen Pals','5','2020-01-27 05:25:55'),
('Great Mates','7','2019-12-09 08:52:12'),
('The Three Amigos','8','2020-05-26 06:39:52'),
('The Honeymoon Is Over','12','2020-06-11 12:33:34'),
('The Herd','11','2019-03-30 12:40:43'),
('Colony of Weirdos','10','2019-08-16 22:17:23'),
('Walkie Talkies','3','2019-09-24 17:59:41'),
('Like Glue','2','2019-10-12 18:00:01'),
('Different Timezone','1','2020-10-13 19:31:09'),
('Quality Screen Time','6','2020-10-24 04:12:47');

CREATE TABLE `GroupAccount` (
    GroupID 		TINYINT,
    AccountID 		TINYINT,
    JoinDate 		DATETIME DEFAULT NOW(),
    CONSTRAINT GroupFK FOREIGN KEY (GroupID)
        REFERENCES `Group` (GroupID)
        ON DELETE CASCADE,
    CONSTRAINT AccountFK FOREIGN KEY (AccountID)
        REFERENCES `Account` (AccountID)
        ON DELETE CASCADE
);

INSERT INTO `GroupAccount` (GroupID,AccountID) VALUES
('1','2'),
('2','3'),
('1','4'),
('3','5'),
('5','1'),
('6','2'),
('5','2'),
('3','11'),
('11','9'),
('10','6'),
('9','7'),
('1','8'),
('6','1'),
('7','6'),
('9','11'),
('12','10'),
('4','1');

CREATE TABLE `TypeQuestion` (
    TypeID 			TINYINT AUTO_INCREMENT,
    TypeName 		ENUM('Essay','Multiple-Choice'),
    PRIMARY KEY (TypeID)
);

INSERT INTO `TypeQuestion` (TypeName) VALUES
('Essay'),
('Multiple-Choice');

CREATE TABLE `CategoryQuestion` (
    CategoryID 		TINYINT AUTO_INCREMENT,
    CategoryName 	VARCHAR(50),
    PRIMARY KEY (CategoryID),
    UNIQUE KEY (CategoryName)
);

INSERT INTO `CategoryQuestion` (CategoryName) VALUES
('The Dichotomous'),
('Rank Order Scaling'),
('Text Slider'),
('Likert Scale'),
('Semantic Differential Scale'),
('Stapel Scale'),
('Constant Sum'),
('Comment Box Open Ended Question'),
('Text'),
('Demographic'),
('Matrix Table');

CREATE TABLE `Question` (
    QuestionID 		INT AUTO_INCREMENT,
    Content 		VARCHAR(50),
    CategoryID 		TINYINT,
    TypeID 			TINYINT,
    CreatorID 		TINYINT,
    CreateDate 		DATETIME DEFAULT NOW(),
    PRIMARY KEY (QuestionID),
    CONSTRAINT CategoryFK1 FOREIGN KEY (CategoryID)
        REFERENCES `CategoryQuestion` (CategoryID)
        ON DELETE CASCADE,
    CONSTRAINT TypeFK FOREIGN KEY (TypeID)
        REFERENCES `TypeQuestion` (TypeID)
        ON DELETE CASCADE,
    CONSTRAINT CreatorFK2 FOREIGN KEY (CreatorID)
        REFERENCES `Account` (AccountID)
        ON DELETE CASCADE
);

INSERT INTO `Question` (Content,CategoryID,TypeID,CreatorID,CreateDate) VALUES
('Cau hoi ve tien te?','3','1','3','2020-07-27'),
('Cau hoi ve kinh doanh?','2','2','11','2020-07-27'),
('Cau hoi lien quan den bong ro?','3','2','10','2020-07-27'),
('Tien la gi?','5','1','5','2020-08-31'),
('Cau hoi ve ban than?','4','1','7','2020-08-31'),
('VTI?','3','1','6','2020-08-31'),
('Cai gi the nay?','5','2','6','2020-08-31'),
('Cau hoi ve mot cai gi do?','6','1','3','2017-09-13'),
('Doan xem?','7','2','2','2017-09-13'),
('Ban bao nhieu tuoi?','1','2','1','2017-09-13'),
('Cau hoi ve kien thuc IT co ban?','2','1','5','2017-09-13'),
('Nen hoc IT khong?','1','2','6','2017-09-13'),
('Cau hoi lien quan den cong ty?','1','2','1','2019-01-09'),
('Cau hoi khong lien quan gi ca?','2','1','3','2019-01-09'),
('Lam gi bay gio','4','2','4','2019-01-09'),
('1 + 1 = ?','6','1','6','2019-01-09');

CREATE TABLE `Answer` (
    AnswerID 		TINYINT AUTO_INCREMENT,
    Content 		VARCHAR(50),
    QuestionID 		INT,
    isCorrect 		ENUM('Yes', 'No'),
    PRIMARY KEY (AnswerID),
    CONSTRAINT QuestionFK1 FOREIGN KEY (QuestionID)
        REFERENCES `Question` (QuestionID)
        ON DELETE CASCADE
);

INSERT INTO `Answer` (Content,QuestionID,isCorrect) VALUES
('Tra loi ne','3','Yes'),
('Dap an','1','Yes'),
('Bla bla','5','No'),
('Chac la sai','1','Yes'),
('Thoi bo di','4','No'),
('Dota khong','1','Yes'),
('Lam bai di','6','No'),
('Het thu de nghi roi','1','Yes'),
('Het that roi','8','Yes'),
('Chac la bo thoi','1','No'),
('22','4','Yes'),
('Hum','5','Yes'),
('UHHHHHHHHHHH','6','No'),
('Sap het roi','2','Yes'),
('Yes','1','No'),
('Het that roi','2','No'),
('Het that roi','4','Yes'),
('Het that roi','2','Yes'),
('Het that roi','6','Yes'),
('Het that roi','2','No'),
('Het that roi','4','Yes'),
('Het that roi','5','Yes'),
('Het that roi','2','No'),
('Het that roi','3','Yes');

CREATE TABLE `Exam` (
    ExamID 			INT AUTO_INCREMENT,
    `Code` 			TINYINT,
    Tile 			VARCHAR(50),
    CategoryID 		TINYINT,
    Duration 		TIME NOT NULL,
    CreatorID 		TINYINT,
    CreateDate 		DATETIME DEFAULT NOW(),
    PRIMARY KEY (ExamID),
    UNIQUE KEY (`Code`),
    CONSTRAINT CategoryFK2 FOREIGN KEY (CategoryID)
        REFERENCES `CategoryQuestion` (CategoryID)
        ON DELETE CASCADE,
    CONSTRAINT CreatorFK3 FOREIGN KEY (CreatorID)
        REFERENCES `Account` (AccountID)
        ON DELETE CASCADE
);

INSERT INTO `Exam` (`Code`,Tile,CategoryID,Duration,CreatorID,CreateDate) VALUES
('11','First','2','01:00:00','4','2019-01-09'),
('12','Last','2','01:30:00','2','2019-01-09'),
('13','First','1','01:20:00','1','2019-01-09'),
('14','First','3','00:45:00','1','2019-01-09'),
('15','Last','4','00:40:00','5','2020-03-18'),
('16','Pop Quiz','1','01:20:00','2','2020-03-18'),
('17','Last','5','02:50:00','3','2020-03-18'),
('18','Pop Quiz','6','01:50:00','4','2020-03-18'),
('19','Last','7','00:30:00','7','2020-03-18'),
('20','Last','8','00:40:00','11','2020-06-30'),
('21','Pop Quiz','5','00:45:00','1','2020-06-30'),
('22','Pop Quiz','6','01:30:00','2','2020-06-30');

CREATE TABLE `ExamQuestion` (
    ExamID 			INT,
    QuestionID 		INT,
    CONSTRAINT ExamFK FOREIGN KEY (ExamID)
        REFERENCES Exam (ExamID)
        ON DELETE CASCADE,
    CONSTRAINT QuestionFK2 FOREIGN KEY (QuestionID)
        REFERENCES `Question` (QuestionID)
        ON DELETE CASCADE
);

INSERT INTO `ExamQuestion` (ExamID,QuestionID) VALUES
('1','2'),
('2','3'),
('1','4'),
('3','5'),
('5','1'),
('6','2'),
('5','5'),
('10','6'),
('9','7'),
('1','8'),
('5','4'),
('6','5'),
('7','6'),
('4','1');

/*2.Lấy ra tất cả phòng ban*/  
SELECT
	*
FROM
	`Department`
ORDER BY 
	DepartmentID;

/*3.Lấy ra ID của phòng ban Sales*/  
SELECT
	DepartmentID
FROM
	`Department`
WHERE
	DepartmentName = 'Sales';

/*4.Sắp xếp account theo Fullname giảm dần*/  
SELECT
	*,CHAR_LENGTH(Fullname)
FROM
	`Account`
WHERE
	CHAR_LENGTH(Fullname) = (SELECT 
								MAX(CHAR_LENGTH(Fullname))
							FROM 
								`Account`)
ORDER BY 
	CHAR_LENGTH(Fullname) DESC;

/*5.Lấy ra thông tin của account có Fullname dài nhất thuộc phòng ban có ID = 3*/  	
SELECT
	*,CHAR_LENGTH(Fullname)
FROM
	`Account`
WHERE
	CHAR_LENGTH(Fullname) = (SELECT 
								MAX(CHAR_LENGTH(Fullname))
							FROM 
								`Account`
							WHERE
								DepartmentID = 3)
ORDER BY 
	CHAR_LENGTH(Fullname) ;

/*6.Lấy ra tên các group gia nhập trước ngày 2019-12-20*/  
SELECT
	Groupname,CreatorDate
FROM
	`Group`
WHERE
	CreatorDate < '2019-12-20';

/*7.Lấy ra ID của Question có >= 4 câu trả lời*/      
SELECT
	QuestionID, Count(*)
FROM
	`Answer`
GROUP BY
	QuestionID
HAVING
	Count(*) >= 4;
    
/*8.Lấy ra code exam có thời gian thi >= 60 phút và tạo trước ngày 2019-12-20*/
SELECT
	`Code`
FROM
	`Exam`
WHERE
	Duration >= '1:00:00' AND CreateDate < '2019-12-20';

/*9.Lấy ra 5 group được tạo ra gần nhất*/      
SELECT
	Groupname,CreatorDate
FROM
	`Group`
ORDER BY 
	CreatorDate DESC
LIMIT
	5;

/*10.Lấy ra số nhân viên trong phòng ban có ID = 2*/      
SELECT
	Count(*)
FROM
	`Account`
WHERE
	DepartmentID = 2;

/*11.Lấy ra tên nhân viên bắt đầu bằng chữ D và kết thúc bằng chữ o*/      
SELECT
	*
FROM
	`Account`
WHERE
	Fullname LIKE 'D%o';

/*12.Xóa các exam tạo trước ngày 2019-12-20*/      
DELETE
FROM
	`Exam`
WHERE
	CreateDate < '2019-12-20';
    
SELECT
	*
FROM 
	`Exam`;

/*13.Xóa các question bắt đầu bằng "Cau hoi"*/      
DELETE
FROM
	`Question`
WHERE
	Content LIKE 'Cau hoi%';
    
SELECT
	*
FROM 
	`Question`;
    
    
/*14.Update email và tên account có ID = 5*/
UPDATE
	`Account`
SET
	Email = 'loc.nguyenba@vti.com.vn',
    Fullname = 'Nguyen Ba Loc'
WHERE
	AccountID = 5;
    
SELECT
	*
FROM 
	`Account`
WHERE 
	AccountID = 5;
  
/*15.Update groupID cho account có ID = 5*/ 
UPDATE
	`GroupAccount`
SET
	GroupID = 4
WHERE
	AccountID = 5;
    
SELECT
	*
FROM 
	`GroupAccount`
WHERE 
	AccountID = 5;
    
	
