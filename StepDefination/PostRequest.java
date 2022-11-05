package StepDefination;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostRequest {
	RequestSpecification req ;
	Response res;
	ValidatableResponse validate;
	@Given("User want to pass the data into database")
	public void user_want_to_pass_the_data_into_database() {
		JSONObject Object = new JSONObject();
		Object.put("Banglore", "Suuny");
		Object.put("Goa", "Om");
		 req = RestAssured.given()
		 .body(Object)
		 .contentType(ContentType.JSON);
		
	    
	}

	@When("User want to pass the data by using URI {string}")
	public void user_want_to_pass_the_data_by_using_uri(String url) {
		 res=req.post(url);
	    
	}

	@Then("User want to validate status line {string}")
	public void user_want_to_validate_status_line(String string) {
		 validate = res.then().statusLine(string);
		
	}

	@Then("User want to validate status code {int}")
	public void user_want_to_validate_status_code(Integer code) {
		validate.assertThat().statusCode(code);
	    
	}

}
