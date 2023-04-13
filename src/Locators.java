import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\saarv\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//ID
	String txt=driver.findElement(By.id("glow-ingress-line1")).getText();
	System.out.println(txt);
	//name
	driver.findElement(By.name("field-keywords")).sendKeys("mobiles");
	//tagName
	List<WebElement> el=driver.findElements(By.tagName("input"));
	System.out.println(el.size());
	//ClassName
//	List<WebElement> el1=driver.findElements(By.className("nav-input nav-progressive-attribute"));
//	System.out.println(el1.size());
	//Linktext
	driver.findElement(By.linkText("New Releases")).click();
	driver.navigate().back();
	//Partial Linktext
	driver.findElement(By.partialLinkText("Releases")).click();
	driver.navigate().back();
	//CssSelector
	driver.findElement(By.cssSelector(".nav-a[href='/gp/new-releases/?ref_=nav_cs_newreleases']")).click();
	String t=driver.getTitle();
	System.out.println(t);
	driver.navigate().back();
	//Xpath
	driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[10]")).click();
	
	driver.close();

	}

}
