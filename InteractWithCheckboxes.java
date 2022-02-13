package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractWithCheckboxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//div[text()='Java']/input")).click();
		driver.findElement(By.xpath("//div[text()='SQL']/input")).click();
		System.out.println("Confirm Selenium is checked: "
				+ driver.findElement(By.xpath("//div[text()='Selenium']/input")).isSelected());

		driver.findElement(By.xpath("//div[text()='I am Selected']/input")).click();

		driver.findElement(By.xpath("//div[text()='Option 1']/input")).click();
		driver.findElement(By.xpath("//div[text()='Option 2']/input")).click();
		driver.findElement(By.xpath("//div[text()='Option 3']/input")).click();
		driver.findElement(By.xpath("//div[text()='Option 4']/input")).click();
		driver.findElement(By.xpath("//div[text()='Option 5']/input")).click();

	}

}
