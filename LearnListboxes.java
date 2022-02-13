package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnListboxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Select select1 = new Select(driver.findElement(By.id("dropdown1")));
		select1.selectByIndex(1);
		
		Select select2 = new Select(driver.findElement(By.name("dropdown2")));
		select2.selectByVisibleText("Selenium");
		
		Select select3 = new Select(driver.findElement(By.id("dropdown3")));
		select3.selectByValue("1");
		
		Select select4 = new Select(driver.findElement(By.className("dropdown")));
		List<WebElement> options = select4.getOptions();
		System.out.println("Dropdown options size: "+options.size());
		
		driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']/..")).sendKeys("Selenium");
		
		Select select5 = new Select(driver.findElement(By.xpath("//option[text()='Select your programs']/..")));
		select5.selectByVisibleText("Selenium");
		select5.selectByIndex(3);
		select5.selectByValue("2");
		
		
		

	}

}
