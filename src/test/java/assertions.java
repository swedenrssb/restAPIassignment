import static org.junit.Assert.assertNotNull;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class assertions {
	
	 @Test(enabled = true)
     public void Assertions() {
         Response resp = RestAssured.given()
                 .queryParam("id", "12")
                 .header("Content-Type", "application/json")
                 .when()        
                 .get("http://localhost:3000/Worker");
                 
         // Extract the response code and response message and print it
         System.out.println("********************************************************************");
         System.out.println("The status Code is :"+resp.statusCode());
         System.out.println("The status response line s :"+resp.statusLine());
         assertEquals(200, resp.statusCode());
         assertNotNull( resp.statusCode());
         System.out.println("********************************************************************");
         Response resp2 = RestAssured.get("http://localhost:3000/Worker/12");
         System.out.println(resp2.asString());    
     }

}
