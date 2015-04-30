package com.connect;

import com.connect.DatabaseConnection;


public class Service {

	DatabaseConnection db = new DatabaseConnection();
	//private String gets[];

	public int signUp(String firstname, String lastname, String username, String password) {
		System.out.println("Inside Signup");
		int result=1;

		String query="insert into table client_master values ('"+firstname+"','"+lastname+"','"+username+"','"+password+"';";
		System.out.println(query);
		// result=db.update(query);
		
		return result;
	}
	
	
	public Client signIn(String username, String password) {
		System.out.println("Inside Signin");
		
		Client clientObj;
		
		String query="SELECT * from ad_8450c6a268b54de.client_master where username='"+username+"' and password='"+password+"';";
		
		System.out.println("Before select");
		System.out.println(query);
		
		clientObj = db.signIn(username,password);
		
		System.out.println(clientObj);
		
		//String res=clientObj.toString();
		
		System.out.println("after select call");

		return clientObj;

	}

		/*gets = null;
		int i=0;
		
		while(clientObj.next()) {
			gets[i]=clientObj.getNString("username");
			gets[i+1]=clientObj.getNString("password");
		//i++;
		return "ok";*/
}
