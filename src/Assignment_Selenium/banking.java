package Assignment_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class banking {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver","C:\\Users\\saarv\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/Agile_Project/Agi_V1/");
		driver.manage().window().maximize();
		driver.findElement(By.name("uid")).sendKeys("mngr26593");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("Atharv@12");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		String t=driver.getTitle();
		System.out.println(t);
		//driver.navigate().back();
		//driver.close();

	}

}
