package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.partialLinkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Parimala");
		driver.findElement(By.name("lastname")).sendKeys("H C");
		driver.findElement(By.name("reg_email__")).sendKeys("9884451897");
		driver.findElement(By.name("reg_passwd__")).sendKeys("abcd1234");
		
		Select dateSelect = new Select(driver.findElement(By.name("birthday_day")));
		dateSelect.selectByVisibleText("9");
		
		Select monthSelect = new Select(driver.findElement(By.name("birthday_month")));
		monthSelect.selectByVisibleText("Jul");
		
		Select yearSelect = new Select(driver.findElement(By.name("birthday_year")));
		yearSelect.selectByVisibleText("1991");
		
		driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
		
		

	}

}
