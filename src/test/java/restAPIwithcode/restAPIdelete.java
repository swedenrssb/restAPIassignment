package restAPIwithcode;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class restAPIdelete {
	@Test(enabled = true)
    public void Delete() {
        // First fetch the response in the response container
        Response resp = RestAssured.given().header("Content-Type", "application/json").when()
                .delete("http://localhost:3000/Worker/2");
                
        // Extract the response code and response message and print it    
        System.out.println(resp.statusCode());
        System.out.println(resp.statusLine());
        
    }
}
