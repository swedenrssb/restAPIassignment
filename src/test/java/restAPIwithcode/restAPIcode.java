package restAPIwithcode;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class restAPIcode {
	@Test(enabled = true)
    public void POST() {
        // Basic details which are given to us Should be kept at global level
        // Make sure that thereis no space in the URL
        RestAssured.baseURI = "http://localhost:3000";
        String Body = "{\r\n" + "        \"name\": \"Sam7\",\r\n" + "        \"Designation\": \"Engineer\"\r\n"
                + "         }";
        // First fetch the response in the response container
        RestAssured.given().log().all().body(Body)
                // Giving header details are important
                .header("Content-Type", "application/json").post("/Worker");
        Response resp2 = RestAssured.get("http://localhost:3000/Worker");
        System.out.println(resp2.asString());
    }
	
	
		
		@Test(enabled = true)
	    public void GET() {
	        // First fetch the response in the response container
	        Response resp = RestAssured.get("http://localhost:3000/Worker/");
	        // change the response in string and print it .
	        System.out.println(resp.asString());
	    }
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
		
		@Test(enabled = true)
	    public void patch() {
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
		@Test(enabled = true)
	    public void Delete() {
	        // First fetch the response in the response container
	        Response resp = RestAssured.given().header("Content-Type", "application/json").when()
	                .delete("http://localhost:3000/Worker/2");
	                
	        // Extract the response code and response message and print it    
	        System.out.println(resp.statusCode());
	        System.out.println(resp.statusLine());
	        
	    }
		@DataProvider(name = "DP1")
		
	    public Object[][] dataProviderMethod()
		{
	     
	        return new Object[][] { { "3" }, { "4" }, { "6" } };
	    }
}
