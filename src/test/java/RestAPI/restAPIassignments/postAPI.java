package RestAPI.restAPIassignments;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class postAPI {
	
	

	@Test
	public void post()
	{
	
	Response resp = RestAssured.get("http://localhost:3000/IBM/8");
	System.out.println(resp.asPrettyString());
	}

}
