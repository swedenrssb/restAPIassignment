package restAPIwithcode;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class restAPIput {

	@Test(enabled = true)
    public void PUT() {
        // For PUT request , we always have to provide the ID fr which you wants to do the changes
        String Body = "{\r\n" + "        \"name\": \"Sam33\",\r\n" + "        \"Designation\": \"Engineer\"\r\n"
                + "         }";
        // First fetch the response in the response container
        Response resp = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(Body)
                .when()        
                .put("http://localhost:3000/Worker/3");
                
        // Extract the response code and response message and print it
        System.out.println("********************************************************************");
        System.out.println("The status Code is :"+resp.statusCode());
        System.out.println("The status response line s :"+resp.statusLine());
        System.out.println("********************************************************************");
}
}