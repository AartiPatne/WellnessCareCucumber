package StepDefination;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutRequest {
	
	  RequestSpecification req;
	  
	@When("User wantto pass the data by using URI {string}")
	public void user_wantto_pass_the_data_by_using_uri(String s3) {
		
	   JSONObject Object = new JSONObject();
	   Object.put("address", "Satara");
	   Object.put("name", "Machha");
	    req = RestAssured.given()
	    		.body(Object)
	    		.contentType(ContentType.JSON);
	    
	}

	@Then("User want to validate the statusline {string}")
	public void user_want_to_validate_the_statusline(String String) {
		 
				 
	}
	

	@Then("User want to status code {int}")
	public void user_want_to_status_code(Integer url) {
		
		 
		 
	   	}

}
