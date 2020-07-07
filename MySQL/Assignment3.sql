DROP DATABASE IF EXISTS management;
CREATE DATABASE management;
USE management;

CREATE TABLE `department` (
    department_ID 		TINYINT AUTO_INCREMENT,
    department_name 	VARCHAR(50),
    PRIMARY KEY (department_ID),
    UNIQUE KEY (department_name)
);

INSERT INTO `department`(department_name) VALUES
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

CREATE TABLE `position` (
    position_ID 		TINYINT AUTO_INCREMENT,
    position_name 		ENUM('Dev', 'Test', 'Scrum Master', 'PM'),
    PRIMARY KEY (position_ID)
);

INSERT INTO `position` 	(position_name) VALUES
						('Dev'),
						('Test'),
						('Scrum Master'),
						('PM');

CREATE TABLE `account` (
    account_ID 			TINYINT AUTO_INCREMENT,
    email 				VARCHAR(50),
    user_name 			VARCHAR(50),
    full_name 			VARCHAR(50),
    department_ID 		TINYINT,
    position_ID 		TINYINT,
    create_date 		DATETIME DEFAULT NOW(),
    PRIMARY KEY (account_ID),
    UNIQUE KEY (user_name,email),
    CONSTRAINT position_FK FOREIGN KEY (position_ID)
        REFERENCES `position` (position_ID)
        ON DELETE CASCADE,
    CONSTRAINT department_FK FOREIGN KEY (department_ID)
        REFERENCES `department` (department_ID)
        ON DELETE CASCADE
);

INSERT INTO `account`	(email,							user_name,		full_name,				department_ID,		position_ID) VALUES
						('theodd1st@gmail.com',			'Theodd',		'Nguyen Son Tung',		'2',				'1'),
						('thachtu.nguyen@gmail.com',	'Atus',			'Nguyen Thach Tui',		'2',				'1'),
						('TheSlipperyGamer@gmail.com',	'Titateace',	'Bhuzum Hein',			'2',				'3'),
						('oneWastefultrick@gmail.com',	'Yagiancon',	'Makrarn Terrafall',	'1',				'1'),
						('oneKnottytrick@gmail.com',	'Enseptypt',	'Dedam Ditsk',			'2',				'4'),
						('oneStickytrick@gmail.com',	'Etosibalb',	'Orber Serpenthelm',	'4',				'2'),
						('theReadytricker@gmail.com',	'Eshrocula',	'Oth Spiritpike',		'2',				'2'),
						('theInnatetricker@gmail.com',	'Fistomyce',	'Jiyao',				'5',				'3'),
						('Jitterytricker@gmail.com',	'Wheodd',		'Diay Qano',			'3',				'4'),
						('Mistytricker@gmail.com',		'Theo',			'Dronzok Dyemergo',		'7',				'1'),
						('Abackhustle@gmail.com',		'Wo',			'Tuntuembe Zimubro',	'10',				'3'),
						('Secretivehustle@gmail.com',	'Transer',		'Frievin Costuviro',	'1',				'1'),
						('theImaginary@gmail.com',		'Fatas',		'Pisho',				'1',				'2');

CREATE TABLE `group` (
    group_ID 			TINYINT AUTO_INCREMENT,
    group_name 			VARCHAR(50),
    creator_ID 			TINYINT,
    creator_date 		DATETIME DEFAULT NOW(),
    PRIMARY KEY (group_ID),
    UNIQUE KEY (group_name),
    CONSTRAINT creator_FK1 FOREIGN KEY (creator_ID)
        REFERENCES `Account` (account_ID)
        ON DELETE CASCADE
);

INSERT INTO `group` (group_name,				creator_ID,		creator_date) VALUES
					('The Uncalled Four',		'3',			'2020-07-06 12:34:24'),
					('Through Thick and Thin',	'2',			'2018-09-29 03:10:32'),
					('Birds of a Feather',		'4',			'2018-11-29 04:58:22'),
					('Flock Together',			'6',			'2019-06-01 03:20:44'),
					('Dream Team',				'1',			'2019-10-05 05:22:13'),
					('Pen Pals',				'5',			'2020-01-27 05:25:55'),
					('Great Mates',				'7',			'2019-12-09 08:52:12'),
					('The Three Amigos',		'8',			'2020-05-26 06:39:52'),
					('The Honeymoon Is Over',	'12',			'2020-06-11 12:33:34'),
					('The Herd',				'11',			'2019-03-30 12:40:43'),
					('Colony of Weirdos',		'10',			'2019-08-16 22:17:23'),
					('Walkie Talkies',			'3',			'2019-09-24 17:59:41'),
					('Like Glue',				'2',			'2019-10-12 18:00:01'),
					('Different Timezone',		'1',			'2020-10-13 19:31:09'),
					('Quality Screen Time',		'6',			'2020-10-24 04:12:47');

CREATE TABLE `group_account` (
    group_ID 			TINYINT,
    account_ID 			TINYINT,
    join_date 			DATETIME DEFAULT NOW(),
    CONSTRAINT group_FK FOREIGN KEY (group_ID)
        REFERENCES `group` (group_ID)
        ON DELETE CASCADE,
    CONSTRAINT account_FK FOREIGN KEY (account_ID)
        REFERENCES `account` (account_ID)
        ON DELETE CASCADE
);

INSERT INTO `group_account` (group_ID,	account_ID) VALUES
							('1',		'2'),
							('2',		'3'),
							('1',		'4'),
							('3',		'5'),
							('5',		'1'),
							('6',		'2'),
							('5',		'2'),
							('3',		'11'),
							('11',		'9'),
							('10',		'6'),
							('9',		'7'),
							('1',		'8'),
							('6',		'1'),
							('7',		'6'),
							('9',		'11'),
							('12',		'10'),
							('4',		'1');

CREATE TABLE `type_question` (
    type_ID 			TINYINT AUTO_INCREMENT,
    type_Name 			ENUM('Essay','Multiple-Choice'),
    PRIMARY KEY (type_ID)
);

INSERT INTO `type_question` (type_name) VALUES
							('Essay'),
							('Multiple-Choice');

CREATE TABLE `category_question` (
    category_ID 		TINYINT AUTO_INCREMENT,
    category_name 		VARCHAR(50),
    PRIMARY KEY (category_ID),
    UNIQUE KEY (category_name)
);

INSERT INTO `category_question`	(category_name) VALUES
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

CREATE TABLE `question` (
    question_ID			INT AUTO_INCREMENT,
    content 			VARCHAR(50),
    category_ID			TINYINT,
    type_ID 			TINYINT,
    creator_ID 			TINYINT,
    create_date			DATETIME DEFAULT NOW(),
    PRIMARY KEY (question_ID),
    CONSTRAINT category_FK1 FOREIGN KEY (category_ID)
        REFERENCES `category_question` (category_ID)
        ON DELETE CASCADE,
    CONSTRAINT type_FK FOREIGN KEY (type_ID)
        REFERENCES `type_question` (type_ID)
        ON DELETE CASCADE,
    CONSTRAINT creator_FK2 FOREIGN KEY (creator_ID)
        REFERENCES `account` (account_ID)
        ON DELETE CASCADE
);

INSERT INTO `question` 	(content,							category_ID,	type_ID,	creator_ID,		create_date) VALUES
						('Cau hoi ve tien te?',				'3',			'1',		'3',			'2020-07-27'),
						('Cau hoi ve kinh doanh?',			'2',			'2',		'11',			'2020-07-27'),
						('Cau hoi lien quan den bong ro?',	'3',			'2',		'10',			'2020-07-27'),
						('Tien la gi?',						'5',			'1',		'5',			'2020-08-31'),
						('Cau hoi ve ban than?',			'4',			'1',		'7',			'2020-08-31'),
						('VTI?',							'3',			'1',		'6',			'2020-08-31'),
						('Cai gi the nay?',					'5',			'2',		'6',			'2020-08-31'),
						('Cau hoi ve mot cai gi do?',		'6',			'1',		'3',			'2017-09-13'),
						('Doan xem?',						'7',			'2',		'2',			'2017-09-13'),
						('Ban bao nhieu tuoi?',				'1',			'2',		'1',			'2017-09-13'),
						('Cau hoi ve kien thuc IT co ban?',	'2',			'1',		'5',			'2017-09-13'),
						('Nen hoc IT khong?',				'1',			'2',		'6',			'2017-09-13'),
						('Cau hoi lien quan den cong ty?',	'1',			'2',		'1',			'2019-01-09'),
						('Cau hoi khong lien quan gi ca?',	'2',			'1',		'3',			'2019-01-09'),
						('Lam gi bay gio',					'4',			'2',		'4',			'2019-01-09'),
						('1 + 1 = ?',						'6',			'1',		'6',			'2019-01-09');

CREATE TABLE `answer` (
    answer_ID 			TINYINT AUTO_INCREMENT,
    content 			VARCHAR(50),
    question_ID 		INT,
    is_correct 			ENUM('Yes','No'),
    PRIMARY KEY (answer_ID),
    CONSTRAINT question_FK1 FOREIGN KEY (question_ID)
        REFERENCES `question` (question_ID)
        ON DELETE CASCADE
);

INSERT INTO `answer`	(content,				question_ID,	is_correct) VALUES
						('Tra loi ne',			'3',			'Yes'),
						('Dap an',				'1',			'Yes'),
						('Bla bla',				'5',			'No'),
						('Chac la sai',			'1',			'Yes'),
						('Thoi bo di',			'4',			'No'),
						('Dota khong',			'1',			'Yes'),
						('Lam bai di',			'6',			'No'),
						('Nghi roi',			'1',			'Yes'),
						('Het that roi',		'8',			'Yes'),
						('Chac la bo thoi',		'1',			'No'),
						('22',					'4',			'Yes'),
						('Hum',					'5',			'Yes'),
						('UHHHHHHHHHHH',		'6',			'No'),
						('Sap het roi',			'2',			'Yes'),
						('Yes',					'1',			'No'),
						('Het that roi',		'4',			'Yes'),
						('Sua xong roi',		'2',			'Yes'),
						('Het bai roi',			'6',			'Yes'),
						('Lam xong that roi',	'2',			'No'),
						('Het tien roi',		'4',			'Yes'),
						('Nghi he roi',			'5',			'Yes'),
						('Ngoi chan nhi',		'2',			'No'),
						('Sua not di',			'3',			'Yes');

CREATE TABLE `exam` (
    exam_ID 			INT AUTO_INCREMENT,
    codes				TINYINT,
    tile 				VARCHAR(50),
    category_ID 		TINYINT,
    duration 			TIME NOT NULL,
    creator_ID 			TINYINT,
    create_date			DATETIME DEFAULT NOW(),
    PRIMARY KEY (exam_ID),
    UNIQUE KEY (codes),
    CONSTRAINT category_FK2 FOREIGN KEY (category_ID)
        REFERENCES `category_question` (category_ID)
        ON DELETE CASCADE,
    CONSTRAINT creator_FK3 FOREIGN KEY (creator_ID)
        REFERENCES `account` (account_ID)
        ON DELETE CASCADE
);

INSERT INTO `exam`  (codes,		tile,			category_ID,		duration,		creator_ID,		create_date) VALUES
					('11',		'First',		'2',				'01:00:00',		'4',			'2019-01-09'),
					('12',		'Last',			'2',				'01:30:00',		'2',			'2019-01-09'),
					('13',		'First',		'1',				'01:20:00',		'1',			'2019-01-09'),
					('14',		'First',		'3',				'00:45:00',		'1',			'2019-01-09'),
					('15',		'Last',			'4',				'00:40:00',		'5',			'2020-03-18'),
					('16',		'Pop Quiz',		'1',				'01:20:00',		'2',			'2020-03-18'),
					('17',		'Last',			'5',				'02:50:00',		'3',			'2020-03-18'),
					('18',		'Pop Quiz',		'6',				'01:50:00',		'4',			'2020-03-18'),
					('19',		'Last',			'7',				'00:30:00',		'7',			'2020-03-18'),
					('20',		'Last',			'8',				'00:40:00',		'11',			'2020-06-30'),
					('21',		'Pop Quiz',		'5',				'00:45:00',		'1',			'2020-06-30'),
					('22',		'Pop Quiz',		'6',				'01:30:00',		'2',			'2020-06-30');

CREATE TABLE `exam_question` (
    exam_ID 			INT,
    question_ID			INT,
    CONSTRAINT exam_FK FOREIGN KEY (exam_ID)
        REFERENCES `exam` (exam_ID)
        ON DELETE CASCADE,
    CONSTRAINT question_FK2 FOREIGN KEY (question_ID)
        REFERENCES `question` (question_ID)
        ON DELETE CASCADE
);

INSERT INTO `exam_question` (exam_ID,	question_ID) VALUES
							('1',		'2'),
							('2',		'3'),
							('1',		'4'),
							('3',		'5'),
							('5',		'1'),
							('6',		'2'),
							('5',		'5'),
							('10',		'6'),
							('9',		'7'),
							('1',		'8'),
							('5',		'4'),
							('6',		'5'),
							('7',		'6'),
							('4',		'1');

-- /*2.Lấy ra tất cả phòng ban*/  
-- SELECT *
-- FROM `department`
-- ORDER BY department_ID;

-- /*3.Lấy ra ID của phòng ban Sales*/  
-- SELECT department_ID
-- FROM `department`
-- WHERE department_name = 'Sales';

-- /*4.Sắp xếp account theo Fullname giảm dần*/  
-- SELECT *,CHAR_LENGTH(full_name) AS name_length
-- FROM `account`
-- WHERE CHAR_LENGTH(full_name) = (SELECT MAX(CHAR_LENGTH(full_name))
-- 								FROM `account`)
-- ORDER BY CHAR_LENGTH(full_name) DESC;

-- /*5.Lấy ra thông tin của account có Fullname dài nhất thuộc phòng ban có ID = 3*/  	
-- SELECT *,CHAR_LENGTH(full_name) AS name_length
-- FROM `account`
-- WHERE CHAR_LENGTH(full_name) = (SELECT MAX(CHAR_LENGTH(full_name))
-- 								FROM `account`
-- 								WHERE department_ID = 3)
-- ORDER BY CHAR_LENGTH(full_name) ;

-- /*6.Lấy ra tên các group gia nhập trước ngày 2019-12-20*/  
-- SELECT group_name,creator_date
-- FROM `group`
-- WHERE creator_date < '2019-12-20';

-- /*7.Lấy ra ID của Question có >= 4 câu trả lời*/      
-- SELECT question_ID, COUNT(*) AS number_of_answers
-- FROM `answer`
-- GROUP BY question_ID
-- HAVING COUNT(*) >= 4;
--     
-- /*8.Lấy ra code exam có thời gian thi >= 60 phút và tạo trước ngày 2019-12-20*/
-- SELECT `code`
-- FROM `exam`
-- WHERE duration >= '1:00:00' AND create_date < '2019-12-20';

-- /*9.Lấy ra 5 group được tạo ra gần nhất*/      
-- SELECT group_name,creator_date
-- FROM `group`
-- ORDER BY creator_date DESC
-- LIMIT 5;

-- /*10.Lấy ra số nhân viên trong phòng ban có ID = 2*/      
-- SELECT COUNT(*) AS number_of_accounts
-- FROM `account`
-- WHERE department_ID = 2;

-- /*11.Lấy ra tên nhân viên bắt đầu bằng chữ D và kết thúc bằng chữ o*/      
-- SELECT *
-- FROM `account`
-- WHERE full_name LIKE 'D%o';

-- /*12.Xóa các exam tạo trước ngày 2019-12-20*/      
-- DELETE
-- FROM `exam`
-- WHERE create_date < '2019-12-20';
--     
-- SELECT *
-- FROM `exam`;

-- /*13.Xóa các question bắt đầu bằng "Cau hoi"*/      
-- DELETE
-- FROM `question`
-- WHERE content LIKE 'Cau hoi%';
--     
-- SELECT *
-- FROM `question`;
--     
-- /*14.Update email và tên account có ID = 5*/
-- UPDATE `account`
-- SET email = 'loc.nguyenba@vti.com.vn',
--     full_name = 'Nguyen Ba Loc'
-- WHERE account_ID = 5;
--     
-- SELECT *
-- FROM `account`
-- WHERE account_ID = 5;
--   
-- /*15.Update groupID cho account có ID = 5*/ 
-- UPDATE `group_account`
-- SET	group_ID = 4
-- WHERE account_ID = 5;
--     
-- SELECT *
-- FROM `group_account`
-- WHERE account_ID = 5;

    
	
