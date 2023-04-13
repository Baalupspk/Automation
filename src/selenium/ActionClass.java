package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\saarv\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"username\"]"))
		.sendKeys("saarvabalaji123");
		driver.findElement(By.xpath("//*[@id=\"password\"]"))
		.sendKeys("Baalu@pspk");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		WebElement drp=driver.findElement(By.xpath("//*[@id=\"location\"]"));
		Actions act=new Actions(driver);
		act.moveToElement(drp).click().build().perform();
		WebElement cl=driver.findElement(By.xpath("//*[@id=\"location\"]/option[3]"));
		act.moveToElement(cl).click().build().perform();
		
	}

}
