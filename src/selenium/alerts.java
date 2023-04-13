package selenium;

import java.net.SocketException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class alerts {

	public static void main(String[] args) throws SocketException{
		System.setProperty("webdriver.edge.drive", "./Drivers\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		//simple alert
		driver.findElement(By.id("alertBox")).click();
		Alert alt=driver.switchTo().alert();
		String msg=driver.switchTo().alert().getText();
		System.out.println(msg);
		alt.accept();
		//Thread.sleep(2000);
		//conformation alerts
		
		driver.findElement(By.id("confirmBox")).click();
		Alert alt1=driver.switchTo().alert();
		String msg1=driver.switchTo().alert().getText();
		System.out.println(msg1);
		alt1.accept();
		//Thread.sleep(2000);
		//Prompt alerts
		
		driver.findElement(By.id("promptBox")).click();
		Alert alt2=driver.switchTo().alert();
		String msg2=driver.switchTo().alert().getText();
		System.out.println(msg2);
		alt2.sendKeys("Saarva Balaji");
		alt2.accept();
		//Thread.sleep(2000);
		driver.close();
		
		
		
		
		
	}

}
