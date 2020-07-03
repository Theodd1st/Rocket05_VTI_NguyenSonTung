DROP DATABASE IF EXISTS Management;
CREATE DATABASE Management;
USE Management;

CREATE TABLE Department(
	DepartmentID	INT,
    DepartmentName	VARCHAR(50),
	PRIMARY KEY (DepartmentID),
    UNIQUE KEY (DepartmentName)
);

CREATE TABLE `Position`(
	PositionID		INT,
    PositionName	ENUM('Dev','Test','Scrum Master','PM'),
    PRIMARY KEY (PositionID)
);

CREATE TABLE `Account`(
	AccountID		INT,
    Email			VARCHAR(50),
    Username		VARCHAR(50),
    Fullname		VARCHAR(50),
    DepartmentID	INT,
    PositionID		INT,
    CreateDate		DATE,
    PRIMARY KEY (AccountID),
    UNIQUE KEY (Username,Email),
    CONSTRAINT PositionFK FOREIGN KEY (PositionID) REFERENCES `Position` (PositionID) ON DELETE CASCADE,
    CONSTRAINT DepartmentFK FOREIGN KEY (DepartmentID) REFERENCES Department (DepartmentID) ON DELETE CASCADE
);

CREATE TABLE `Group`(
	GroupID			INT,
    GroupName		VARCHAR(50),
	CreatorID		INT,
	CreatorDate		DATE,
    PRIMARY KEY (GroupID),
    UNIQUE KEY (GroupName),
    CONSTRAINT CreatorFK1 FOREIGN KEY (CreatorID) REFERENCES `Account` (AccountID) ON DELETE CASCADE
);

CREATE TABLE GroupAccount(
	GroupID			INT,
    AccountID		INT,
    JoinDate		DATE,
    CONSTRAINT GroupFK FOREIGN KEY (GroupID) REFERENCES `Group` (GroupID) ON DELETE CASCADE,
    CONSTRAINT AccountFK FOREIGN KEY (AccountID) REFERENCES `Account` (AccountID) ON DELETE CASCADE
);

CREATE TABLE TypeQuestion(
	TypeID			INT,
    TypeName		ENUM('Essay','Multiple-Choice'),
    PRIMARY KEY (TypeID)
);

CREATE TABLE CategoryQuestion(
	CategoryID		INT,
    CategoryName	VARCHAR(50),
    PRIMARY KEY (CategoryID),
    UNIQUE KEY (CategoryName)
);

CREATE TABLE Question(
	QuestionID		INT,
    Content			VARCHAR(50),
    CategoryID		INT,
	TypeID			INT,
 	CreatorID		INT,   
    CreateDate		DATE,
    PRIMARY KEY (QuestionID),
    CONSTRAINT CategoryFK1 FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion (CategoryID) ON DELETE CASCADE,
    CONSTRAINT TypeFK FOREIGN KEY (TypeID) REFERENCES TypeQuestion (TypeID) ON DELETE CASCADE,
    CONSTRAINT CreatorFK2 FOREIGN KEY (CreatorID) REFERENCES `Account` (AccountID) ON DELETE CASCADE
);

CREATE TABLE Answer(
	AnswerID		INT,
    Content			VARCHAR(50),
 	QuestionID		INT,
	isCorrect		ENUM('Yes','No'),
    PRIMARY KEY (AnswerID),
    CONSTRAINT QuestionFK1 FOREIGN KEY (QuestionID) REFERENCES Question (QuestionID) ON DELETE CASCADE
);

CREATE TABLE Exam(
	ExamID			INT,
    `Code`			INT, 
    Tile			VARCHAR(50),
    CategoryID		INT,
    Duration		TIME,
 	CreatorID		INT,
    CreateDate		DATE,
    PRIMARY KEY (ExamID),
    UNIQUE KEY (`Code`,Tile),
    CONSTRAINT CategoryFK2 FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion (CategoryID) ON DELETE CASCADE,
    CONSTRAINT CreatorFK3 FOREIGN KEY (CreatorID) REFERENCES `Account` (AccountID) ON DELETE CASCADE
);

CREATE TABLE ExamQuestion(
	ExamID			INT,
	QuestionID		INT,
    CONSTRAINT ExamFK FOREIGN KEY (ExamID) REFERENCES Exam (ExamID) ON DELETE CASCADE,
	CONSTRAINT QuestionFK2 FOREIGN KEY (QuestionID) REFERENCES Question (QuestionID) ON DELETE CASCADE
);
