package RestAPI.restAPIassignments;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class putAPI {
	@Test
	public void put()
	{
	
	Response resp = RestAssured.get("http://localhost:3000/IBM//7");
	System.out.println(resp.asPrettyString());
	}

}
