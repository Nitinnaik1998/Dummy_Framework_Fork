package Bade;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BossClassTest {
	
	@Test
	public void sampleTest() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://49.249.28.218:8888/index.php?action=index&module=Home");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(3000);
		driver.quit();

		System.out.println("Boss hey Boss");
	}

}
