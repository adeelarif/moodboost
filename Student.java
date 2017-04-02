/*
Read a CSV containing: name, phone number, provider (t-mobile, at&t, sprint, verizon, etc)
Read a CSV containing inspirational quotes and messages.
Send out personalized texts to the users containing a random inspirational message.
After this, send one every 30 seconds.
*/
public class Student
{
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String provider;

	public Student (String firstName, String lastName, String phoneNumber, String provider)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.provider = provider;
	}

	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;	
	}
	public String getLastName()
	{
		return lastName;	
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	public String getProvider()
	{
		return provider;
	}
	public void setProvider(String provider)
	{
		this.provider = provider;
	}
	public String toCSVFormat()
	{
		return String.format("%s,%s,%s,%s", firstName, lastName, phoneNumber, provider);             
	}
}
