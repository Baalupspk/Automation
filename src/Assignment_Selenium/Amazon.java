package Assignment_Selenium;

import java.net.SocketException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class Amazon {

	public static void main(String[] args) throws SocketException{
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\saarv\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement bk= driver.findElement(By.cssSelector("#searchDropdownBox"));
		List<WebElement>bk1=bk.findElements(By.tagName("option"));
		System.out.println(bk1.size());
		for(int i=0;i<bk1.size();i++) {
			System.out.println(bk1.get(i).getText());
		}
		bk.sendKeys("Books");
		WebElement ser= driver.findElement(By.id("twotabsearchtextbox"));
		ser.sendKeys("Harry poter books");
		WebElement cl= driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		cl.click();
		String t=driver.getTitle();
		System.out.println(t);
		driver.navigate().back();
		String t1=driver.getCurrentUrl();
		System.out.println(t1);
		driver.navigate().forward();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
	
	
	}

}
