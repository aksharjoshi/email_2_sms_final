package com.connect;

import java.sql.*;



public class DatabaseConnection {
	
	Connection con = null;
	ResultSet rs,rs1;
    Statement stmt = null,stmt2=null;
	
	public DatabaseConnection(){		
		try {			
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				//con = DriverManager.getConnection("jdbc:mysql://10.189.74.87:3306/dhvani_test","root","");
				con = DriverManager.getConnection("jdbc:mysql://us-cdbr-iron-east-02.cleardb.net:3306/ad_8450c6a268b54de","bf076a1488c6b3","3dc63386");
				stmt = con.createStatement();
				stmt2 = con.createStatement();
				
				if(!con.isClosed())
					System.out.println("Successfully Connected!!!");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public String signUp(String firstname, String lastname, String emailid, String pwd){
		String result = "";
		int rowcount;
		try {
			System.out.println("Inside DATABASE Signup");
			String query = "Insert into client_master (firstname, lastname, username, password) values ('" + firstname + "', '" + lastname + "', '"+emailid+"', '"+pwd+"')";
			PreparedStatement ps=con.prepareStatement(query);
			
			rowcount=ps.executeUpdate();
			
			if(rowcount > 0){
				result="true";
				System.out.println("Insert Successful");
			}
			else{
				result="false: The data could not be inserted in the database.";
			}
			
			//ps.close();
			//con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	public Client signIn(String username, String password) {
		Client clientObj = null;
		String firstname, lastname, email=null;
		int userunkid=0;
		
		try {
			String query = "select * from client_master where username='"+ username + "' and password='"+password+"'";
			rs = stmt2.executeQuery(query);
			
			if (rs.next()) {
				
				String q="select * from client_service where clientunkid="+rs.getInt("clientunkid");
				System.out.println(q);
				rs1=stmt.executeQuery(q);
				
				firstname = rs.getString("firstname");
				lastname = rs.getString("lastname");
				
				if(rs1.next()) {
					email = rs1.getString("email_address");
					userunkid = rs1.getInt("clientunkid");
				}
				
				System.out.println(firstname+"/n"+lastname+"/n"+email+"/n"+userunkid);
				
				clientObj = new Client(firstname, lastname, email, userunkid);
				System.out.println("Fetch Successfully for login");
				System.out.println("added now");
				
			} else {
				System.out.println("Fetch not Successfull for login");
			}
			
			//rs.close();
			//con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clientObj;
	}
	/*public String sigIn_old(String userName, String pwd){
		String result = "";
		int rowcount;
		try {
			String query = "Select userunkid FROM client_master WHERE username = "+userName+" AND password = "+pwd;
			//rowcount=stmt.executeQuery(query);
			ResultSet rs = stmt.executeQuery(query);
			
			 // iterate through the java resultset
			 if(rs.next()) 
				 result = "true";
			 else
				 result = "false";
			 
			 return result;
		      
		      
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}*/
	
	public ResultSet selectDb(String query) throws SQLException {
		
		rs=stmt.executeQuery(query);
		//rs.close();
		return rs;
	}
	
	public int count(String query){
		int count=0;
		try {
			ResultSet rs = stmt.executeQuery(query);
			
			System.out.println(query);
			
			//System.out.println(rs.getString(1));
			
					//Integer.parseInt(rs.getString("CNT"));
			
			if(rs.next()){
				count=rs.getInt(1);
			}
			
			System.out.println("count in db is: "+count);
			
			//rs.close();
			//con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

}
