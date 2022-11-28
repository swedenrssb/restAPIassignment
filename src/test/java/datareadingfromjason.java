import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class datareadingfromjason {
	private static final String ID = null;

	@Test(enabled = true)
	public void POST() {
		// Basic details which are given to us Should be kept at global level
		// Make sure that thereis no space in the URL
		RestAssured.baseURI = "http://localhost:3000";
		String Body = "{\r\n" + "    \"name\": \"Patch2\",\r\n" + "    \"Designation\": \"Engineer\",\r\n"
				+ "    \"id\": 3\r\n" + "  }";
		// First fetch the response in the response container
		RestAssured.given().log().all().body(Body)
				// Giving header details are important
				.header("Content-Type", "application/json").post("/Worker");
		Response resp2 = RestAssured.get("http://localhost:3000/Worker");
		System.out.println(resp2.asString());

    }
	
}
 
	