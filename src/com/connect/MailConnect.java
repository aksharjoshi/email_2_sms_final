package com.connect;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.mail.*;
import javax.mail.search.FlagTerm;

public class MailConnect extends Thread{
	
	Properties props=null;
	Session session=null;
	Store store=null;
	Folder folder=null;
	String mailService="imap-mail.outlook.com";
	String username;
	DatabaseConnection db;

	public MailConnect() {
		// TODO Auto-generated constructor stub
		db=new DatabaseConnection();
		props = new Properties();
		username=null;
		
		props.setProperty("mail.store.protocol", "imaps");
		session = Session.getInstance(props, null);
        try {
			store = session.getStore();
		} catch (NoSuchProviderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	public void run(){
		ScheduledExecutorService executor =
			    Executors.newSingleThreadScheduledExecutor();

			Runnable periodicTask = new Runnable() {
			    public void run() {
			        // Invoke method(s) to do the work
			    	connect();
			    }
			};
			executor.scheduleAtFixedRate(periodicTask, 0, 60, TimeUnit.SECONDS);
	}

	public void selectService() {
        System.out.println("in select service");
        
        String query="select serviceunkid from service_service where clientunkid in (select clientunkid from client_master where username='akshar');";

       /*
        try {
         	System.out.println("Before session");
            session = Session.getInstance(props, null);
            store = session.getStore();
            System.out.println("here");
        }
        catch(Exception e){
        	e.printStackTrace();
        } */
        
	}
	
	public void connect() {
		props = new Properties();
        System.out.println("here before prop");

        props.setProperty("mail.store.protocol", "imaps");
        try {
        	/*System.out.println("Before session");
            session = Session.getInstance(props, null);
            store = session.getStore();
            System.out.println("here");
            */
        	store.connect(mailService, "aksharj@outlook.com", "Navy4242");
            System.out.println("connected");
            folder = store.getFolder("INBOX");
            folder.open(Folder.READ_ONLY);
            System.out.println("read");
            
            FlagTerm ft = new FlagTerm(new Flags(Flags.Flag.SEEN), false);
            Message[] UNReadmessages = folder.search(ft);
            
            System.out.println("unread: "+(folder.getMessageCount()-UNReadmessages.length));

            Message msg = folder.getMessage(folder.getMessageCount());
            System.out.println("count is : "+folder.getMessageCount());
            
            Address[] in = msg.getFrom();
            for (Address address : in) {
                System.out.println("FROM:" + address.toString());
            }
            Multipart mp = (Multipart) msg.getContent();
            
            BodyPart bp = mp.getBodyPart(0);
            System.out.println("SENT DATE:" + msg.getSentDate());
            System.out.println("SUBJECT:" + msg.getSubject());
            System.out.println("CONTENT:" + bp.getContent());
            
            folder.close(false);
          //  inbox.close();
        } catch (Exception mex) {
            mex.printStackTrace();
        }
	}
}