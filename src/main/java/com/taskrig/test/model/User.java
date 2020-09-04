package com.taskrig.test.model;

public class User {
	
	private int userId;
	private String userNo;
    private String userName;
    private String userposition;       
    
	public User() {
		
	}
	
	public User(int userId, String userNo, String userName, String userposition) {
		super();
		this.userId = userId;
		this.userNo = userNo;
		this.userName = userName;
		this.userposition = userposition;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserNo() {
		return userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserposition() {
		return userposition;
	}
	public void setUserposition(String userposition) {
		this.userposition = userposition;
	}
        

}
