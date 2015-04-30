package com.connect;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ObjectCreation {

	DatabaseConnection conn;

	public ObjectCreation() {
		// TODO Auto-generated constructor stub
		conn=new DatabaseConnection();
	}

	public void createObject(){

		int num=0;

		num=conn.count("Select count(client_master.clientunkid) as CNT from client_master");

		System.out.println("Count is : "+ num);
		
		if(num==0){
			System.out.println("No records...");
		}

		MailConnect ob[]=new MailConnect[num];
		//ob[1].connect();

		for(int i=0; i<num; i++){
			String nm;
			try {
				ResultSet r=conn.selectDb("select username from client_master");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ob[i]=new MailConnect();
			ob[i].start();
		}	
	}

	public static void main(String args[]){
		ObjectCreation oc=new ObjectCreation();
		oc.createObject();
	}
}
