package RestAssuredPractice;

import org.json.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class PostRequestNewAPI
{
	
	//following url for serialization
	//http://www.eliasnogueira.com/the-best-way-to-add-a-request-body-to-a-post-request-using-rest-assured/
	// some API request
	//https://devqa.io/rest-assured-api-requests-examples/
	static int id;
	
	@BeforeMethod
	public void BaseUrl()
	{
		RestAssured.baseURI = "https://api.instantwebtools.net/";
	}
	
	@Test(priority=0,enabled=false)
	public void TestPostRequest()
	{
		JSONObject json = new JSONObject();
		json.put("id", "19979");
		json.put("name", "India Airways");
		json.put("country", "India");
		json.put("logo", "https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png");
		json.put("slogan", "From India");
		json.put("head_quaters", "Katunayake, Sri Lanka");
		json.put("website", "www.srilankaairways.com");
		json.put("established", "2022");
		// we need to write toString into body as body(json.toString()) if you want to use it JSONObject
		
	
		HashMap<String, Object> test = new HashMap<>();
		test.put("id", "199799");
		test.put("name", "India Airways");
		test.put("country", "India");
		test.put("logo", "https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png");
		test.put("slogan", "From India");
		test.put("head_quaters", "Katunayake, Sri Lanka");
		test.put("website", "www.srilankaairways.com");
		test.put("established", "2022");
		
		
		
		RequestSpecification request = RestAssured.given().log().all().header("Content-Type","application/json").body(test);
		
		Response response = request.log().all().post("v1/airlines");
		
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
		// different id 12244,199799,19979
		//Response response = request.get("v1/airlines/"+id+""); 
		Response response = request.get("v1/airlines/199799"); 
		ResponseBody printbody = response.getBody();
		System.out.println("$$$$$$$$$$********Print the responce from get request*********$$$$$$$$$$$$");
		System.out.println(printbody.asString());
	}
}
