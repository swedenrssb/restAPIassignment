package dataProviderMethod;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class dataProviderMethod {
	
	@Test(enabled = true ,dataProvider = "DP1")
    public void PATCHUsingDataProvider(String ID) {
        // For PUT request , we always have to provide the ID for which you wants to do the changes
        String Body = "{\r\n"
                + "     \r\n"
                + "        \"name\": \"Patch2\"\r\n"
                + "        \r\n"
                + "         }";
        // First fetch the response in the response container
        Response resp = RestAssured.given()
                .header("Content-Type", "application/json")
                .body(Body)
                .when()        
                .patch("http://localhost:3000/Worker/"+ID);
                
        // Extract the response code and response message and print it
        System.out.println("********************************************************************");
        System.out.println("The status Code is :"+resp.statusCode());
        System.out.println("The status response line s :"+resp.statusLine());
        System.out.println("******************************************************************");

Response resp2 = RestAssured.get("http://localhost:3000/Worker/"+ID);
        System.out.println(resp2.asString());    
        
    }
}
