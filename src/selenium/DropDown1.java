package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"username\"]"))
		.sendKeys("saarvabalaji123");
		driver.findElement(By.xpath("//*[@id=\"password\"]"))
		.sendKeys("Baalu@pspk");
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		
		WebElement l=driver.findElement(By.xpath("//*[@id=\"location\"]"));
		List<WebElement> list=l.findElements(By.tagName("options"));
		Select st=new Select(l);
//		st.selectByIndex(2);
//		Thread.sleep(2000);
//		st.selectByVisibleText("Brisbane");
//		Thread.sleep(2000);
//		st.selectByValue("London");
//		Thread.sleep(2000);
	int a=	st.getOptions().size();
	
	for(int i=0;i<a;i++) {
		st.selectByIndex(i);
		Thread.sleep(2000);
		//System.out.println(list.get(i).getText());
	}
		
		
		
		
		
		
		
	}

}
