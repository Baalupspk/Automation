package selenium;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.http.ConnectionFailedException;

public class dropdown {

	public static void main(String[] args) throws ConnectionFailedException, IOException{
	//System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	driver.manage().window().maximize();
	WebElement el=driver.findElement(By.name("country"));
	List<WebElement>el1=el.findElements(By.tagName("option"));
	System.out.println(el1.size());
	for(int i=0;i<el1.size();i++) {
		System.out.println(el1.get(i).getText());
	}

	}

}
