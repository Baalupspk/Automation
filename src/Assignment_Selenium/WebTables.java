package Assignment_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		
		String a="//*[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[";
		String b="]/div/div[";
		String c="]";
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=6;j++) {
			String ab=driver.findElement(By.xpath(a+i+b+j+c)).getText();
			System.out.println(ab);
			}
			
		}
		driver.close();

	}

}
