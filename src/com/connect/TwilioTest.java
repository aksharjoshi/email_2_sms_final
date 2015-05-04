package com.connect;

//You may want to be more specific in your imports 
import java.util.*; 

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.twilio.sdk.*; 
import com.twilio.sdk.resource.factory.*; 
import com.twilio.sdk.resource.instance.*; 

public class TwilioTest { 
	// Find your Account Sid and Token at twilio.com/user/account 
	public static final String ACCOUNT_SID = "ACe33b0be574a5495670805a6ea16c0624"; 
	public static final String AUTH_TOKEN = "c85c1004907abc038c8d11d7aa7ef49d"; 
	
	TwilioRestClient client;
	List<NameValuePair> params;
	
	TwilioTest() {
		client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
		params = new ArrayList<NameValuePair>(); 
	}
	
	public void send(String to_num,String email_from, String sub) {
		// Build the parameters 		
		params.add(new BasicNameValuePair("To", to_num)); 
		params.add(new BasicNameValuePair("From", "+14796897300")); 
		params.add(new BasicNameValuePair("Body", "You have a new mail from"+email_from+". Kindly check"));
		
		MessageFactory messageFactory = client.getAccount().getMessageFactory(); 
		Message message = null;
		
		try {
			message = messageFactory.create(params);
		} catch (TwilioRestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.out.println(message.getSid()); 
		
	}
}