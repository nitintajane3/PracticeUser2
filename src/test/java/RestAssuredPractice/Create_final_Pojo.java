package RestAssuredPractice;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Pojo.Pojo_Serial_instantwebtools;

public class Create_final_Pojo 
{
//this class use to view your object to json data. here you can view how your object convert into json
	@Test
	public void RunFinalPojo() throws JsonProcessingException
	{
	
		Pojo_Serial_instantwebtools pojo_Serial_instantwebtools = new Pojo_Serial_instantwebtools(499799, "India_2 Airways", "India", 
				"https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/india.png", "From India",
				"Mumbai airport", "www.indiaairways.com", "2022");
	
		ObjectMapper objmap = new ObjectMapper();
		String mydata = objmap.writerWithDefaultPrettyPrinter().writeValueAsString(pojo_Serial_instantwebtools);
		System.out.println(mydata);
	}
}
