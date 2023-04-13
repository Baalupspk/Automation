package selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class ScreenShot {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\saarv\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();


		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		WebElement link=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
		List<WebElement>links=link.findElements(By.tagName("a"));
		System.out.println(links.size());//7
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			
		}
		//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src,new File("D://test2.png"));
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		//File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
	//	FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");




			}

	


}
