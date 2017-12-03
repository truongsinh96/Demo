package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest {

	@Test
	public void checkTitle(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8080/Demo/");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Insert title here");
		driver.quit();
	}
}
