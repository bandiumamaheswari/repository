package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SkillsPage {
	WebDriver driver;

	public void SkillsPageDriver(WebDriver driver1) {

		this.driver = driver1;

	}

	public void gotoSkillsPage() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")).click();
		Thread.sleep(2000);

	}

	public void SkillDetails(String SKILLNAME, String SKILLDESC)
			throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"))
				.sendKeys(SKILLNAME);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea"))
				.sendKeys(SKILLDESC);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();

	}

}
