/*import javax.mail.internet.*;
import java.util.*;

public class EmailSender
{

	public static void main(String[] args)
	{
		sendMail("");	
	}
	public static boolean sendMail(String from, String password, String message, String to) 
	{
		String host = "smtp.gmail.com";
		Properties props = System.getProperties();
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.user", from);
		props.put("mail.smtp.password", passoword);
		props.put("mail.smtp.port", 587);
		props.put("mail.smtp.auth", "true");
		Session session = Session.getDefaultInstance(pjajrops, null);
		MimeMessage mimeMessage = new MimeMessage(session);
		try
		{
			mimeMessage.setFrom(new InternetAddress(from));
			InternetAddress[] toAdress = new InternetAddress[to.length];
			for(int i=0; i<to.length; i++)
			{
				toAddress[i] = new InternetAddress(to[i]);
			}
			for(int i=0; i<toAddress.length; i++)
			{
				mimeMessage.setRecipient(RecipientType.TO, toAddress[i]);		
			}
			mimeMessage.setSubject("mail using javamail api ");
			mimeMessage.setText(message);
			Transport transport = session.getTransport("smtp");
			transport.connect(host,from,password);
			transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
			transport.close();
			return true;
		}
		catch(MessagingException me)
		{
			me, printStackTrace();
		}
		return false;
	}
}
*/
/* Author: Luigi Vincent
	* An example of how to send Mail with Java
	* Requires the Mail API: https://java.net/projects/javamail/pages/Home#Download_JavaMail_Release
	*/

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailSender {
public static void main(String[] args) {
	// Recipient's email
	String recipient = "example@gmail.com";

	// Sender information
	String sender = "example@gmail.com";
	String username = "user@gmail.com";
	String password = "password";

	String host = "smtp.gmail.com";

	Properties properties = new Properties();
	properties.put("mail.smtp.auth", "true");
	properties.put("mail.smtp.socketFactory.port", "465");
	properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory"); // Using SSL
	properties.put("mail.smtp.host", host);
	properties.put("mail.smtp.port", "25");

	// Get the Session object.
	Session session = Session.getInstance(properties,
		new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		}

	try {
		// Create the message and fields
		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(sender));
		message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
		message.setSubject("Testing Subject");
		message.setText("Testing the email capability using JavaMailAPI");

		// Send message
		Transport.send(message);
		System.out.println("Sent message successfully....");
	} catch (MessagingException e) {
		System.err.println("Email sending failed");
		throw new RuntimeException(e);
	}
}
}
