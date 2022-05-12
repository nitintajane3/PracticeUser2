package RestAssuredPractice;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RestAssuredPojo 
{
	
//https://www.instantwebtools.net/fake-rest-api#put-passenger
	
	@Test(enabled=false)
	public void test1()
	{
		
		RestAssured.baseURI = "http://dummy.restapiexample.com/";
		
		Response response = given().log().all().header("Content-Type","application/json").
				
				when().get("api/v1/employee/719").then().log().all().extract().response();
		
		// below code will print the complete body from responce
		ResponseBody printbody = response.getBody();
		System.out.println(printbody.asString());
		
			
	}
	
	@Test(enabled=false)
	public void getResponceBody()
	{
		RestAssured.baseURI = "http://dummy.restapiexample.com/";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get("api/v1/employee/719");
		int statusCode = response.getStatusCode();
		System.out.println("Responce code is : " + statusCode);
	}
	
	@Test(enabled=true)
	public void getResponceBodyDifferentWay()
	{
		RestAssured.baseURI = "http://dummy.restapiexample.com/";
		String message = given().when().get("api/v1/employee/719").then().assertThat().
				statusCode(200).extract().path("message");
		System.out.println("print message : " +message);
	}
}
