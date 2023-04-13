package Practice_session;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigations {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.drive", "./Drivers\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().to("https://www.youtube.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.close();
	}

}
