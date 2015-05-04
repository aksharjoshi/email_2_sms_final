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
    	 
    	 String query="select * from client_service JOIN client_master on client_service.clientunkid=client_master.clientunkid where client_master.clientunkid=2  and required_email like '%"+from+"%'";

    	 try {
			rs=db.selectDb(query);
			
			if(rs.next()) {
				tt.send(rs.getString("phoneno"),from, sub);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 return true;
     }
    
     public boolean checkBlock(String unkid) {
    	 
    	 return true;
     }
     
     public void runCheckSend(String unid) {
    	 
     }
}