package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithEditFields {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("parimala@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("avalue" + Keys.TAB);
		System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		driver.findElement(By.xpath("//label[contains(text(),'Confirm that')]/following::input"))
				.getAttribute("disabled").equals("true");

	}

}
