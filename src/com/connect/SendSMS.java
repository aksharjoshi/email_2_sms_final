package com.connect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.sql.ResultSet;
import java.sql.SQLException;

<<<<<<< HEAD
=======
//import com.aliasi.tokenizer.PorterStemmerTokenizerFactory;
//import com.aliasi.tokenizer.Tokenizer;
//import com.aliasi.tokenizer.TokenizerFactory;
>>>>>>> origin/master
//import org.apache.lucene.analysis.PorterStemmer;

//import org.apache.lucene.analysis;

class SendSMS {
     DatabaseConnection db;
     ResultSet rs;
     TwilioTest tt;
     String inputLine="";
     
     public SendSMS ()
     {
    	 db=new DatabaseConnection();
    	 db.createConnection();
    	 tt=new TwilioTest();
     }
     
     public boolean checkFrom(String unkid, String from, String sub, String cont) {
    	 
    	 //String query="select * from client_service where clientunkid="+unkid+" and required_email in ('"+from+"'";
    	 
    	 String query="select * from email_2_sms.client_service JOIN email_2_sms.client_master on client_service.clientunkid=client_master.clientunkid where client_master.clientunkid="+unkid+"  and required_email like '%"+from+"%'";

    	 System.out.println(query+"for user "+unkid);
    	 
    	 try {
			rs=db.selectDb(query);
			
			if(rs.next()) {
				System.out.println("inside if of send");
				tt.send(rs.getString("phoneno"),from, sub,cont);
				return true;
			}
			else{
				String query_reject="select * from email_2_sms.client_service JOIN email_2_sms.client_master on client_service.clientunkid=client_master.clientunkid where client_master.clientunkid="+unkid+"  and blocked_email like '%"+from+"%'";

		    	System.out.println(query_reject);
		    	 
		    	
				rs=db.selectDb(query_reject);
					
				if(rs.next()) {
					System.out.println("inside else of send");
					System.out.println("mail rejected");
					//tt.send(rs.getString("phoneno"),from, sub);\
					db.close();
					return true;
				}
				else {
					return false;
				}
			} 
    	}	
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
    	 finally{
    		 db.close();
    	 }
     }
    
     
     public void runCheckSend(String unid, String content) {
    	 System.out.println("main logic of algorithm");	
    	 connect(content);
     }
     
    public void connect(String content) {
    	URL url;
    	URLConnection yc;
    	BufferedReader in;
		try {
			url = new URL("https://api.sentigem.com/external/get-sentiment?api-key=119bfe4f980ef05cdc80f69ee189b586qUeHfwWmDTgFZ67rc_V0h-KIkvR42JYu&text="+
					URLEncoder.encode(content));
			
			yc = url.openConnection();
			
		    in = new BufferedReader(new InputStreamReader(
                    yc.getInputStream()));
		    
		    String array[] = null;
		    
	        while ((inputLine = in.readLine()) != null) 
	        {
	            System.out.println(inputLine);
	            array = inputLine.split(",");
	        }
	        for(int i=0; i<array.length; i++)
	        {
	        	System.out.println(array[i]);
	        }
	        
	        String polarity=array[4];
	        
	        System.out.println(polarity);
	        
	        String polar[]=polarity.split(":");
	        
	        String polarity_final=polar[1];
	        System.out.println(polarity_final);
	        polarity_final=polarity_final.substring(polarity_final.indexOf('"')+1, polarity_final.lastIndexOf('"'));
	        
	        System.out.println(polarity_final);
	        
	        in.close();
		    
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    

    public String to_num(String unkid) {
    	String query="Select phoneno from email_2_sms.client_master where clientunkid="+unkid;
    	String to=null;
    	db.createConnection();
    	//ResultSet rs1=null;
    	try {
			rs=db.selectDb(query);
			
			if(rs.next())
				to=rs.getString("phoneno");
			//return to_num;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
    	finally{
    		db.close();
    	}
		return to;
    }

	public boolean checkWords(String unkid, String from, String sub, String cont) {
	
		String res="";
		String query="Select distinct keyword from email_2_sms.imp_lexicon_set order by keyword;";
   	 System.out.println(query+"for user "+unkid);
   	 
   	db.createConnection();
   	 
   	 try {
			rs=db.selectDb(query);
		
			while(rs.next()) {
				System.out.println("inside while if of send");
				//tt.send(rs.getString("phoneno"),from, sub,cont);
				
				if(cont.contains(rs.getString("keyword"))) {
					
					System.out.println(cont.length()+" is th length..////////////");
					if(cont.length()>1400) {
						cont=cont.substring(0, 1400);
						System.out.println(cont.length()+" is the length..////////////");
					}
					String to=to_num(unkid);
					
					if(to != null) {
						tt.send(to_num(unkid), from, sub, cont);
						return true;
					}
					else {
						System.out.println("Problem fetching phone number for user: "+unkid);
						System.out.println("Phone number fetched was: "+to);
						return false;
					}
					//break;
				}
				//System.out.println("number 2");
				System.out.println(res+".......@@@@@@@@@@@@@@@");
				//return true;
			}
			return false;
   	 	}	
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
   	 finally{
   		 db.close();
   	 }
	}
	
	/*public static void main(String args[]){
		SendSMS s=new SendSMS();
		
		if(s.checkWords("12", "akshar.joshi91@gmail.com", "Danger","danger is danger"))
			System.out.println("success");
	}*/
}