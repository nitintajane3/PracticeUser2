package RestAssuredPractice;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pojo.Pojo_Serial_instantwebtools;

import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class SerializationTest 
{

	@BeforeMethod
	public void BaseUrl()
	{
		RestAssured.baseURI = "https://api.instantwebtools.net/";
	}
	
	@Test(priority=0,enabled=true)
	public void TestPostRequest()
	{
		
		// in pojo field name like id is not case sensetive for example
		//in json data having field name is id and if you set in pojo as Id this case work no issue
		
		//serialization use when your json is same for everytime its not changing frequently in this we should use pojo
		//means you need to use json data mutliple time
		// and what ever data you are passing if you want use same data in get request in that case you can use
		Pojo_Serial_instantwebtools pojoPost = new Pojo_Serial_instantwebtools(499799, "India_2 Airways", "India", 
				"https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/india.png", "From India",
				"Mumbai airport", "www.indiaairways.com", "2022");
		
        RequestSpecification request = RestAssured.given().log().all().header("Content-Type","application/json").body(pojoPost);
		
		Response response = request.log().all().post("v1/airlines");
		
		ResponseBody printbody = response.getBody();
		
		System.out.println(printbody.asString());
		
		System.out.println("get id :  " + pojoPost.getId());
		
		System.out.println("get name :   " + pojoPost.getName());
		
		System.out.println("get country :  " + pojoPost.getCountry());
		
	}
}

