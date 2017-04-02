/*
Read a CSV containing: name, phone number, provider (t-mobile, at&t, sprint, verizon, etc)
Read a CSV containing inspirational quotes and messages.
Send out personalized texts to the users containing a random inspirational message.
After this, send one every 30 seconds.
*/
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class csvfilewriter
{
	private static final String HEADERS = "first name, last name, phone number, provider";
	public static void main(String[] args)
	{
		writeCsvFile("test.csv");
	}

    public static void writeCsvFile(String fileName) 
    {
    	//Create new students objects
        Student student1 = new Student("Ahmed", "Mohamed", "0123456789", "att");
        Student student2 = new Student("Sara", "Said", "0123456789", "tmobile");
        Student student3 = new Student("Ali", "Hassan", "0123456789", "sprint");
        Student student4 = new Student("Sama", "Karim", "0123456789", "verizon");
        Student student5 = new Student("Khaled", "Mohamed", "0123456789", "metropcs");
        Student student6 = new Student("Ghada", "Sarhan", "0123456789", "cricket");
         
        //Create a new list of student objects
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        try (PrintWriter output = new PrintWriter(fileName))
        {
        	output.println(HEADERS);
        	for (Student student : students)
        	{
        		output.println(student.toCSVFormat());
        	}
        } 
        catch (FileNotFoundException e) 
        {
        	System.err.println("Could not find file. " + e.getMessage());
        }
        
    }
}