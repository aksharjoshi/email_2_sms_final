package com.connect;

public class Client {

	String firstname;
	String lastname;
	String email;
	int userunkid;

	public Client() {
		firstname=null;
		lastname=null;
		email=null;
		userunkid=0;
	}

	public Client(String firstname, String lastname, String email, int userunkid) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.userunkid = userunkid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailid() {
		return email;
	}

	public void setEmailid(String email) {
		this.email = email;
	}

	public int getUserid() {
		return userunkid;
	}

	public void setUserid(int userunkid) {
		this.userunkid = userunkid;
	}
}
