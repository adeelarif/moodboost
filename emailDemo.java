public class emailDemo
{
	public static void main(String [] args)
	{
		public static boolean sendMail(String from, String password, String message, String ) 
		{
			String host = "smtp.gmail.com";
			Properties props = System.getProperties();
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", host);
			props.put("mail.smtp.user", from);
			props.put("mail.smtp.password", passoword);
			props.put("mail.smtp.port", 587);
			props.put("mail.smtp.auth", "true");
			Session session = Session.getDefaultInstance(props, null);

			return false;
		}

	}
}
