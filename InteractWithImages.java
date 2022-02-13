package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractWithImages {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//label[@for='home']/following-sibling::img")).click();
		driver.navigate().back();
		String imgUrl = driver.findElement(By.xpath("//label[text()='Am I Broken Image?']/following-sibling::img")).getAttribute("src");
		driver.get(imgUrl);
		if (driver.getTitle().contains("404 – Not Found")) {
			System.out.println("It is a broken image");
		} else {
			System.out.println("It is not a broken image");
		}
		driver.navigate().back();
		driver.findElement(By.xpath("//label[text()='Click me using Keyboard or Mouse']/following-sibling::img"))
				.click();

	}

}
