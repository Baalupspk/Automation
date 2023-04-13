package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bistrostays {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\saarv\\\\Downloads\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://products.ncryptedprojects.com/bistrostays_v4/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[title='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("buyer.ncrypted@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='submit_btn']")).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
