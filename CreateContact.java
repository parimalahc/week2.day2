package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();

		driver.findElement(By.id("firstNameField")).sendKeys("Parimala");
		driver.findElement(By.id("lastNameField")).sendKeys("Pawankumar");
		
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Parimala");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Pawankumar");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Hi this is Parimala H C");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("parihc@gmail.com");
		
		Select select1 = new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
		select1.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Hi this is Parimala H C");
		
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		System.out.println(driver.getTitle());
		

	}

}
