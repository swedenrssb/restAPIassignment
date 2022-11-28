package restAPIwithcode;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class restAPIget {
	
	@Test(enabled = true)
    public void GET() {
        // First fetch the response in the response container
        Response resp = RestAssured.get("http://localhost:3000/Worker/");
        // change the response in string and print it .
        System.out.println(resp.asString());
    }
	
}
