DROP DATABASE IF EXISTS Management;
CREATE DATABASE Management;
USE Management;

CREATE TABLE Department (
    DepartmentID 	TINYINT AUTO_INCREMENT,
    DepartmentName 	NVARCHAR(50),
    PRIMARY KEY (DepartmentID),
    UNIQUE KEY (DepartmentName)
);

CREATE TABLE `Position` (
    PositionID 		TINYINT AUTO_INCREMENT,
    PositionName 	ENUM('Dev', 'Test', 'Scrum Master', 'PM'),
    PRIMARY KEY (PositionID)
);

CREATE TABLE `Account` (
    AccountID 		TINYINT AUTO_INCREMENT,
    Email 			VARCHAR(50),
    Username 		VARCHAR(50),
    Fullname 		NVARCHAR(50),
    DepartmentID 	TINYINT,
    PositionID 		TINYINT,
    CreateDate 		DATETIME DEFAULT NOW(),
    PRIMARY KEY (AccountID),
    UNIQUE KEY (Username , Email),
    CONSTRAINT PositionFK FOREIGN KEY (PositionID)
        REFERENCES `Position` (PositionID)
        ON DELETE CASCADE,
    CONSTRAINT DepartmentFK FOREIGN KEY (DepartmentID)
        REFERENCES Department (DepartmentID)
        ON DELETE CASCADE
);

CREATE TABLE `Group` (
    GroupID 		TINYINT AUTO_INCREMENT,
    GroupName 		NVARCHAR(50),
    CreatorID 		TINYINT,
    CreatorDate 	DATETIME DEFAULT NOW(),
    PRIMARY KEY (GroupID),
    UNIQUE KEY (GroupName),
    CONSTRAINT CreatorFK1 FOREIGN KEY (CreatorID)
        REFERENCES `Account` (AccountID)
        ON DELETE CASCADE
);

CREATE TABLE GroupAccount (
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

CREATE TABLE TypeQuestion (
    TypeID 			TINYINT AUTO_INCREMENT,
    TypeName 		ENUM('Essay', 'Multiple-Choice'),
    PRIMARY KEY (TypeID)
);

CREATE TABLE CategoryQuestion (
    CategoryID 		TINYINT AUTO_INCREMENT,
    CategoryName 	VARCHAR(50),
    PRIMARY KEY (CategoryID),
    UNIQUE KEY (CategoryName)
);

CREATE TABLE Question (
    QuestionID 		INT AUTO_INCREMENT,
    Content 		NVARCHAR(50),
    CategoryID 		TINYINT,
    TypeID 			TINYINT,
    CreatorID 		TINYINT,
    CreateDate 		DATETIME DEFAULT NOW(),
    PRIMARY KEY (QuestionID),
    CONSTRAINT CategoryFK1 FOREIGN KEY (CategoryID)
        REFERENCES CategoryQuestion (CategoryID)
        ON DELETE CASCADE,
    CONSTRAINT TypeFK FOREIGN KEY (TypeID)
        REFERENCES TypeQuestion (TypeID)
        ON DELETE CASCADE,
    CONSTRAINT CreatorFK2 FOREIGN KEY (CreatorID)
        REFERENCES `Account` (AccountID)
        ON DELETE CASCADE
);

CREATE TABLE Answer (
    AnswerID 		TINYINT AUTO_INCREMENT,
    Content 		NVARCHAR(50),
    QuestionID 		INT,
    isCorrect 		ENUM('Yes', 'No'),
    PRIMARY KEY (AnswerID),
    CONSTRAINT QuestionFK1 FOREIGN KEY (QuestionID)
        REFERENCES Question (QuestionID)
        ON DELETE CASCADE
);

CREATE TABLE Exam (
    ExamID 			INT AUTO_INCREMENT,
    `Code` 			INT,
    Tile 			VARCHAR(50),
    CategoryID 		TINYINT,
    Duration 		TIME NOT NULL,
    CreatorID 		TINYINT,
    CreateDate 		DATETIME DEFAULT NOW(),
    PRIMARY KEY (ExamID),
    UNIQUE KEY (`Code` , Tile),
    CONSTRAINT CategoryFK2 FOREIGN KEY (CategoryID)
        REFERENCES CategoryQuestion (CategoryID)
        ON DELETE CASCADE,
    CONSTRAINT CreatorFK3 FOREIGN KEY (CreatorID)
        REFERENCES `Account` (AccountID)
        ON DELETE CASCADE
);

CREATE TABLE ExamQuestion (
    ExamID 			INT,
    QuestionID 		INT,
    CONSTRAINT ExamFK FOREIGN KEY (ExamID)
        REFERENCES Exam (ExamID)
        ON DELETE CASCADE,
    CONSTRAINT QuestionFK2 FOREIGN KEY (QuestionID)
        REFERENCES Question (QuestionID)
        ON DELETE CASCADE
);
