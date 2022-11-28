package RestAPI.restAPIassignments;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class deleteAPI {
	
	@Test
	public void delete()
	{
	
	Response resp = RestAssured.get("http://localhost:3000/IBM//1");
	System.out.println(resp.asPrettyString());
	}

}
