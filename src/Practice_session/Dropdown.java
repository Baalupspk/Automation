package Practice_session;

import java.net.SocketException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws SocketException, InterruptedException {
		System.setProperty("webdriver.edge.driver","./Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"username\"]"))
		.sendKeys("saarvabalaji123");
		driver.findElement(By.xpath("//*[@id=\"password\"]"))
		.sendKeys("Baalu@pspk");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		WebElement drp=driver.findElement(By.xpath("//*[@id=\"location\"]"));
		//System.out.println(drp.getSize());
		Select a=new Select(drp);
//		a.selectByIndex(4);
//		Thread.sleep(2000);
//		a.selectByValue("New York");
//		Thread.sleep(2000);
//		a.selectByVisibleText("Los Angeles");
//		Thread.sleep(2000);
	List<WebElement> list=a.getOptions();
	System.out.println(list);
	int b;
	b=a.getOptions().size();
	for(int i=1;i<=b;i++) {
		
		if(i==3) {
			a.selectByIndex(i);
			Thread.sleep(2000);
			break;
		}
		System.out.println(list.get(i).getText());
	}
	
	driver.close();
		
	}

}
