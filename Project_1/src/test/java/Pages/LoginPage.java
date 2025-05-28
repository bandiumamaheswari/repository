package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public void LoginPageDriver(WebDriver driver1) {

		this.driver = driver1;

	}

	public void openURL(String TestURL) {

		driver.get(TestURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	public void LoginDredentials(String USERNAME, String PASSWORD) throws InterruptedException {

		driver.findElement(By.name("username")).sendKeys(USERNAME);
		Thread.sleep(2000);

		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(2000);
	}

}
