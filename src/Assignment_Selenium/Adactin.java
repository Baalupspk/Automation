package Assignment_Selenium;

import java.net.SocketException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Adactin {

	public static void main(String[] args) throws SocketException, InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\saarv\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"username\"]"))
		.sendKeys("saarvabalaji123");
		driver.findElement(By.xpath("//*[@id=\"password\"]"))
		.sendKeys("Baalu@pspk");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//select[@id='location']")).sendKeys("Sydney");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='hotels']")).sendKeys("Hotel Sunshine");
		driver.findElement(By.xpath("//select[@id='room_type']")).sendKeys("Standard");
		driver.findElement(By.xpath("//select[@id='room_nos']")).sendKeys("3 - Three");
		driver.findElement(By.xpath("//select[@id='adult_room']")).sendKeys("2 - Two");
		driver.findElement(By.xpath("//select[@id='child_room']")).sendKeys("1 - One");
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		System.out.println(driver.getTitle());
		
		driver.close();

	}

}
