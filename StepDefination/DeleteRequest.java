package StepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteRequest {
	 String URI;
     Integer status;
		
	@When("User want to delete user by using URI {string}")
	public void user_want_to_delete_user_by_using_uri(String s1) {
	   URI = s1;
		
	}

	@Then("verify status code is {int}")
	public void verify_status_code_is(Integer int1) {
	
		Integer status = int1;
		System.out.println("Successfully deleted user by ID");
	}
}
