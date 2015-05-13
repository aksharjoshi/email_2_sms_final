package com.connect;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ObjectCreation {

	DatabaseConnection conn;
	static int num;

	public ObjectCreation() {
		// TODO Auto-generated constructor stub
		conn=new DatabaseConnection();
		conn.createConnection();
		//num=conn.count("Select count(client_master.clientunkid) as CNT from email_2_sms.client_master");
		//num=0;
	}

	int getNum(){
		return num;
	}
	
	public void createObject(){

		//int num=0;

		num=conn.count("Select count(client_master.clientunkid) as CNT from email_2_sms.client_master");

		System.out.println("Count is : "+ num);
		
		if(num==0){
			System.out.println("No records...");
		}

		//ResultSet r=null;
		
		MailConnect ob[]=new MailConnect[num];
		//ob[1].connect();

		for(int i=0; i<num; i++){
			//String nm;
			try {
				ResultSet r=conn.selectDb("select email_address,service_password,serviceunkid,clientunkid from email_2_sms.client_service where email_address is not null");
				
				while(r.next())
				{
					System.out.println(r.getString("email_address"));
					
					ob[i]=new MailConnect(r.getString("email_address"),r.getString("service_password"),r.getString("serviceunkid"),r.getString("clientunkid"),num);
					ob[i].start();
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
	}

	public static void main(String args[]){
		ObjectCreation oc=new ObjectCreation();
		oc.createObject();
	}
}
