package Steps1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition1 {
	
	WebDriver driver;
	
	
	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
	   
		driver = new ChromeDriver();
		
		driver .manage().window().maximize();
		
	}
	@Then("user opens URL as {string}")
	public void user_opens_url_as(String URL) {
		
		driver.get(URL);
	    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Then("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String USERNAME, String PASSWORD) throws InterruptedException {
		
		driver.findElement(By.name("username")).sendKeys(USERNAME);
		Thread.sleep(2000);
		 
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		 Thread.sleep(2000);
		 
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		 Thread.sleep(2000);
	    
	}
	@Then("go to jobs page")
	public void go_to_jobs_page() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
		 Thread.sleep(2000);
		 
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		Thread.sleep(2000);
	    
	}
	@When("user enters jobname as {string}  and job description as {string}")
	public void user_enters_jobname_as_and_job_description_as(String JobName, String JobDesc) throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(JobName);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(JobDesc);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")).click();
		Thread.sleep(2000);
	}
	@Then("user clicks logout button")
	public void user_clicks_logout_button() {
	    
	}
	@Then("close the browser")
	public void close_the_browser() {
	    
	}

}
