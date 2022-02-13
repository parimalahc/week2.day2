package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlayWithHyperLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().back();
		System.out.println(driver.findElement(By.partialLinkText("Find where am")).getAttribute("href"));
		driver.findElement(By.linkText("Verify am I broken?")).click();
		if (driver.getTitle().contains("404 – Not Found")) {
			System.out.println("It is a broken link");
		} else {
			System.out.println("It is not a broken link");
		}
		driver.navigate().back();

		driver.findElement(By.xpath("//label/preceding-sibling::a")).click();
		driver.navigate().back();

		List<WebElement> noOfLinks = driver.findElements(By.tagName("a"));
		System.out.println(noOfLinks.size());

	}

}
