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

public static void main(String[]args) throws TwilioRestException { 
	TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN); 

	 // Build the parameters 
	 List<NameValuePair> params = new ArrayList<NameValuePair>(); 
	 params.add(new BasicNameValuePair("To", "6692546309")); 
	 params.add(new BasicNameValuePair("From", "+14796897300")); 
	 params.add(new BasicNameValuePair("Body", "You are awesome..!!!"));   

	 MessageFactory messageFactory = client.getAccount().getMessageFactory(); 
	 Message message = messageFactory.create(params); 
	 System.out.println(message.getSid()); 
	} 
}