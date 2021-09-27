package entity;

import java.util.Date;

public class Group {
	byte groupId;
	String groupName;
	Account creator;
	Date createDate;
	Account[] accounts;
}
