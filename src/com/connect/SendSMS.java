package com.connect;

import java.sql.ResultSet;
import java.sql.SQLException;


class SendSMS {
     DatabaseConnection db;
     ResultSet rs;
     TwilioTest tt;
     
     public SendSMS ()
     {
    	 db=new DatabaseConnection();
    	 tt=new TwilioTest();
     }
     
     public boolean checkFrom(String unkid, String from, String sub) {
    	 
    	 //String query="select * from client_service where clientunkid="+unkid+" and required_email in ('"+from+"'";
    	 
    	 String query="select * from client_service JOIN client_master on client_service.clientunkid=client_master.clientunkid where client_master.clientunkid="+unkid+"  and required_email like '%"+from+"%'";

    	 System.out.println(query);
    	 
    	 try {
			rs=db.selectDb(query);
			
			if(rs.next()) {
				System.out.println("inside if of send");
				tt.send(rs.getString("phoneno"),from, sub);
				return true;
			}
			else{
				String query_reject="select * from client_service JOIN client_master on client_service.clientunkid=client_master.clientunkid where client_master.clientunkid="+unkid+"  and blocked_email like '%"+from+"%'";

		    	System.out.println(query_reject);
		    	 
		    	
				rs=db.selectDb(query_reject);
					
				if(rs.next()) {
					System.out.println("inside else of send");
					System.out.println("mail rejected");
					//tt.send(rs.getString("phoneno"),from, sub);
					return true;
				}
				else
					return false;
			} 
    	}	
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
     }
    
     
     public void runCheckSend(String unid, String content) {
    	 
    	 
    	 
     }
}