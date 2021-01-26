package jackson.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			ObjectMapper mapper=new ObjectMapper();
			Student theStudent=mapper.readValue(new File("data/sample-lite.json"),Student.class);
			System.out.println("First name="+ theStudent.getFirstName());
			System.out.println("Last name="+ theStudent.getLastName());
		}
		catch(Exception exc)
		{
			exc.printStackTrace();
		}
	}

}
