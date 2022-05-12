package RestAssuredPractice;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class PostRequestNewAPI2
{
	static int id;
	
	@BeforeMethod
	public void BaseUrl()
	{
		RestAssured.baseURI = "https://api.instantwebtools.net/";
	}
	
	@Test(priority=0,enabled=true)
	public void TestPostRequest()
	{
	
		RequestSpecification request = RestAssured.given().header("Content-Type","application/json").body("{\r\n" + 
				"    \"id\": 19244,\r\n" + 
				"    \"name\": \"India Airways\",\r\n" + 
				"    \"country\": \"India\",\r\n" + 
				"    \"logo\": \"https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png\",\r\n" + 
				"    \"slogan\": \"From India\",\r\n" + 
				"    \"head_quaters\": \"Katunayake, Sri Lanka\",\r\n" + 
				"    \"website\": \"www.srilankaairways.com\",\r\n" + 
				"    \"established\": \"1990\"\r\n" + 
				"}");
		
		Response response = request.post("v1/airlines");
		
		ResponseBody printbody = response.getBody();
		
		System.out.println(printbody.asString());
		String teString = response.asString();
		JsonPath path =  new JsonPath(teString);
		id = path.getInt("id");
		System.out.println("print the responce id : " + id);
		
	}

	@Test(priority=1)
	public void getRequestArlineData()
	{
		RequestSpecification request = RestAssured.given().header("Content-Type","application/json");
		// different id 12244,
		Response response = request.get("v1/airlines/"+id+""); 
		
		ResponseBody printbody = response.getBody();
		System.out.println("Print the responce from get request");
		System.out.println(printbody.asString());
	}
}
