package RestAPI.restAPIassignments;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getAPI {
	
	@Test
	public void GET()
	{
	
	Response resp = RestAssured.get("http://localhost:3000/IBM/");
	System.out.println(resp.asPrettyString());
	}

}
