package StepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetBranchidRequest {
	Response res;
	 ValidatableResponse validate;
	 @When("User want to fetch data  of branch from database by using id {string}")
	 public void user_want_to_fetch_data_of_branch_from_database_by_using_id(String url) {
	    res=RestAssured.get(url);
	 }

	 @Then("User want to verify statusline {string} of branchid")
	 public void user_want_to_verify_statusline_of_branchid(String string) {
	     validate =res.then();
	 }

	 @Then("User want to verify status code {int} of branchid")
	 public void user_want_to_verify_status_code_of_branchid(Integer code) {
	     validate.assertThat().statusCode(code)
	     .log().all();
	 }	   
	

}
