package Assignment_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/slider");
		driver.manage().window().maximize();
		WebElement src=driver.findElement(By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span/input"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(src, 500, 0).perform();
	
	
	}

}
