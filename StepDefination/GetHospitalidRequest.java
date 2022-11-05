package StepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetHospitalidRequest {
	 Response res ;
	 ValidatableResponse validate;
	@When("User want to fetch the data of hospital from database by using id {string}")
	public void user_want_to_fetch_the_data_of_hospital_from_database_by_using_id(String url) {
	    res = RestAssured.get(url);
	}

	@Then("User want to verify the statusline {string} of hospitalid")
	public void user_want_to_verify_the_statusline_of_hospitalid(String string) {
	    validate = res.then();
	}

	@Then("User want to verify the status code {int} of hospitalid")
	public void user_want_to_verify_the_status_code_of_hospitalid(Integer code) {
	  validate.assertThat().statusCode(code)
	  .log().all();
	}

}
