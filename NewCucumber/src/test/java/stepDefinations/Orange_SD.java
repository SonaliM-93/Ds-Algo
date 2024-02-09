package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Orange_SD
{
public static WebDriver driver;
String URL = "https://juice-shop.herokuapp.com/#/register";

By dismissBtn = By.xpath("//button//span[text()='Dismiss']");
By emailID = By.id("emailControl");
By passwordTxt = By.id("passwordControl");
By confirmPassword = By.id("repeatPasswordControl");
By secQnBox = By.xpath("//div[@id='mat-select-value-1']/span");
By secQn = By.xpath("//span[text()=' Your eldest siblings middle name? ']");
By secQnAns = By.id("securityAnswerControl");


	@Given("user is login to Orange HRM application")
	 
		public void user_is_login_to_orange_hrm_application() {
		    
			driver = new ChromeDriver();
			driver.get(URL);
			driver.findElement(dismissBtn).click();
			driver.findElement(emailID).sendKeys("vijay@gmail.com");
			driver.findElement(passwordTxt).sendKeys("bharathi@123");
		}
	 

	@When("user navigates to Leave meanu in Orange HRM application")
	public void user_navigates_to_leave_meanu_in_orange_hrm_application() {
			driver.findElement(confirmPassword).sendKeys("bharathi.1234");
			driver.findElement(secQnBox).click();
			driver.findElement(secQn).click();
			driver.findElement(secQnAns).sendKeys("vijay");
		   
		}
	    
	@When("user clicks apply link in leave screen of Orange HRM application")
	public void user_clicks_apply_link_in_leave_screen_of_orange_hrm_application() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should able to view Apply Leave screen in Orange HRM application")
	public void user_should_able_to_view_apply_leave_screen_in_orange_hrm_application() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user selects personal leave in leave screen of Orange HRM application")
	public void user_selects_personal_leave_in_leave_screen_of_orange_hrm_application() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user is able to view leave balance in leave screen of Orange HRM application")
	public void user_is_able_to_view_leave_balance_in_leave_screen_of_orange_hrm_application() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user selects from and to dates in leave screen of Orange HRM application")
	public void user_selects_from_and_to_dates_in_leave_screen_of_orange_hrm_application() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters comments in leave screen of Orange HRM application")
	public void user_enters_comments_in_leave_screen_of_orange_hrm_application() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks Apply button in leave screen of Orange HRM application")
	public void user_clicks_apply_button_in_leave_screen_of_orange_hrm_application() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user is able to view success message in leave screen of Orange HRM application")
	public void user_is_able_to_view_success_message_in_leave_screen_of_orange_hrm_application() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	
	
	
}
