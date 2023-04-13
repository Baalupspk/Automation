package selenium;

import java.net.SocketException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class frames {

	public static void main(String[] args) throws SocketException, InterruptedException{
		System.setProperty("webdriver.edge.driver","C:\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.switchTo().frame("frm1");
		driver.findElement(By.id("selectnav1")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frm2");
		driver.findElement(By.id("firstName")).sendKeys("Balaji");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.getTitle();
		driver.close();

	}

}
