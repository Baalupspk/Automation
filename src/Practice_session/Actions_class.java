package Practice_session;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_class {

	public static void main(String[] args) throws ElementNotInteractableException, Exception {
		System.setProperty("webdriver.edge.driver","C:\\Users\\saarv\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement a=driver.findElement(By.xpath("//*[@id='navbarSupportedContent']/ul/li[1]/a"));
		WebElement b=driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/div/div/div/div/ul/li[2]"));
		WebElement c=driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/div/div/div/div/ul/li[2]/div/div/h6[2]/a"));
		//act.moveToElement(a).moveToElement(b).moveToElement(c).perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"Form_getForm_Email\"]")).sendKeys("balaji");
		Thread.sleep(3000);
		act.doubleClick(driver.findElement(By.xpath("//*[@id=\"Form_getForm_Email\"]"))).contextClick().perform();
		
	}

}
