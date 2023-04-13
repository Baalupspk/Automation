package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyBoard_Actions {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.edge.driver", "./Drivers\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.amazon.in/");
	WebElement txt=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	Actions act=new Actions(driver);
	act.click(txt).perform();
	Thread.sleep(2000);
	txt.sendKeys("Mobiles");
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ENTER)
	.build().perform();
	
	
	}

}
