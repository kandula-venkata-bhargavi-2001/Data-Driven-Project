
package stepDefinition;

import commonFunction.FunctionLibrary;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class ERPSteps {
	
	@Given("launch browser {string}")
	public void launch_browser(String name) throws Throwable {
	    FunctionLibrary.startBrowser(name);
	}

	
	@io.cucumber.java.en.When("Launch url")
	public void launch_url() {
	   FunctionLibrary.openUrl();
	}
	
	@When("Wait for username with {string} and {string} and {string}")
	public void wait_for_username_with_and_and(String Ltype, String Lvalue, String myWait) {
		FunctionLibrary.WaitForElement(Ltype, Lvalue, myWait);
	}
	
	@When("Enter username with {string} and {string} and {string}")
	public void enter_username_with_and_and(String Ltype, String Lvalue, String TestData) {
		 FunctionLibrary.typeAction(Ltype, Lvalue, TestData);
	}

	@When("Enter password with {string} and {string} and {string}")
	public void enter_password_with_and_and(String Ltype, String Lvalue, String TestData) {
		FunctionLibrary.typeAction(Ltype, Lvalue, TestData);
	}

	@When("click login button with {string} and {string}")
	public void click_login_button_with_and(String Ltype, String Lvalue) throws Throwable {
		 FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@When("wait for Supplier link {string} and {string} and {string}")
	public void wait_for_Supplier_link_and_and(String Ltype, String Lvalue, String myWait) {
		FunctionLibrary.WaitForElement(Ltype, Lvalue, myWait);
	}	   

	@When("click Supplier link with {string} and {string}")
	public void click_Supplier_link_with_and(String Ltype, String Lvalue) throws Throwable {
		 FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@When("wait  for AddIcon with {string}  and {string} and {string}")
	public void wait_for_AddIcon_with_and_and(String Ltype, String Lvalue, String myWait) {
		 FunctionLibrary.WaitForElement(Ltype, Lvalue, myWait);
	}

	@When("click Addicon button with {string} and {string}")
	public void click_Addicon_button_with_and(String Ltype, String Lvalue) throws Throwable {
		 FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@When("wait for supplier number with {string} and {string} and {string}")
	public void wait_for_supplier_number_with_and_and(String Ltype, String Lvalue, String myWait) {	
		FunctionLibrary.WaitForElement(Ltype, Lvalue, myWait);
	}
	@When("Capture supplier number with {string} and {string}")
	public void capture_supplier_number_with_and(String Ltype, String Lvalue) throws Throwable {
	   FunctionLibrary.capturesupp(Ltype, Lvalue);
	}

	@When("click Add button with {string} and {string}")
	public void click_Add_button_with_and(String Ltype, String Lvalue) throws Throwable {
		 FunctionLibrary.clickAction(Ltype, Lvalue);
	}
	
	@When("Enter in {string} with {string} and {string}")
	public void enter_in_with_and(String TestData, String Ltype, String Lvalue) {
		FunctionLibrary.typeAction(Ltype, Lvalue, TestData);
	}
	
	@When("for ConfirmOk button with {string} and {string} and {string}")
	public void for_ConfirmOk_button_with_and_and(String Ltype, String Lvalue, String myWait) {
		  FunctionLibrary.WaitForElement(Ltype, Lvalue, myWait);
	}

	@When("click confirm ok button with {string} and {string}")
	public void click_confirm_ok_button_with_and(String Ltype, String Lvalue) throws Throwable {
		 FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@When("wait for Alert ok button with {string} and {string} and {string}")
	public void wait_for_Alert_ok_button_with_and_and(String Ltype, String Lvalue, String myWait) {
		FunctionLibrary.WaitForElement(Ltype, Lvalue, myWait);
	}

	@When("click Alert ok button with {string} and {string}")
	public void click_Alert_ok_button_with_and(String Ltype, String Lvalue) throws Throwable {
	    FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@When("verify supplierNumber")
	public void verify_supplierNumber() throws Throwable {
	   FunctionLibrary.supplierTable();
	}

	@When("click logout link with {string} and {string}")
	public void click_logout_link_with_and(String Ltype, String Lvalue) throws Throwable {
	    FunctionLibrary.clickAction(Ltype, Lvalue);
	}

	@When("close browser")
	public void close_browser() {
	    FunctionLibrary.closebrowser();
	}
	
	
	@When("wait for Customer link {string} and {string} and {string}")
	public void wait_for_customer_link_and_and(String Ltype, String Lvalue, String mywait) {
	    FunctionLibrary.WaitForElement(Ltype, Lvalue, mywait);
	}
	@When("click Customer link with {string} and {string}")
	public void click_customer_link_with_and(String Ltype, String Lvalue) throws Throwable {
	    FunctionLibrary.clickAction(Ltype, Lvalue);
	}
	@When("wait for Customer number with {string} and {string} and {string}")
	public void wait_for_customer_number_with_and_and(String Ltype, String Lvalue, String mywait) {
		FunctionLibrary.WaitForElement(Ltype, Lvalue, mywait);
	}
	@When("Capture Customer number with {string} and {string}")
	public void capture_customer_number_with_and(String Ltype, String Lvalue) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    FunctionLibrary.captureCusto(Ltype, Lvalue);
	}
	@When("verify CustomerNumber")
	public void verify_customer_number() throws Throwable {
	   FunctionLibrary.CustomerTable();
	}


}
