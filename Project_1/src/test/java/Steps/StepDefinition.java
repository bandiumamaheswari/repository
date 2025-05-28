package Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.SkillsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	
	
	WebDriver driver;
	
	LoginPage LP;
	SkillsPage SP;
	HomePage HP;
	
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	    
	}
	@Then("user opens URL as {string}")
	public void user_opens_url_as(String TestURL) {
		
		LP = new LoginPage();
		LP.LoginPageDriver(driver);
		LP.openURL(TestURL);
		
		
	    
	}
	@Then("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String USERNAME, String PASSWORD) throws InterruptedException {
		LP.LoginPageDriver(driver);
		LP.LoginDredentials(USERNAME, PASSWORD);
		 
	}
	@Then("go to skills page")
	public void go_to_skills_page() throws InterruptedException {
		
		SP = new SkillsPage();
		SP.SkillsPageDriver(driver);
		SP.gotoSkillsPage();
		
		
		 
	    
	}
	@When("user enters skillname as {string} and skill description as {string}")
	public void user_enters_skillname_as_and_skill_description_as(String SKILLNAME, String SKILLDESC) throws InterruptedException {
		
		SP.SkillsPageDriver(driver);
		SP.SkillDetails(SKILLNAME, SKILLDESC);
	   	 
	   
	}
	@Then("user clicks logout button")
	public void user_clicks_logout_button() {
	    
		HP = new HomePage();
		HP.HomePageDriver(driver);
	}
	@Then("close the browser")
	public void close_the_browser() {
		HP.HomePageDriver(driver);
	    
	}
	
	

}
