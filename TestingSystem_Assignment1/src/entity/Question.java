package entity;

import java.util.Date;

public class Question {
	byte questionId;
	String content;
	CategoryQuestion category;
	TypeQuestion type;
	Account creator;
	Date createDate;
}
