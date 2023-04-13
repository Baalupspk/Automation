package selenium;

import java.net.SocketException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class windowshandle {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver","C:\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.getTitle();
		driver.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(3000);
		String parent=driver.getWindowHandle();
		Set<String> child=driver.getWindowHandles();
		
		for(String handle :child ) {
			System.out.println(handle);
			if(!handle.equals(parent)) {
				driver.switchTo().window(handle);
				driver.findElement(By.id("firstName")).sendKeys("Balaji");
				System.out.println(driver.getTitle());
				driver.close();
			}
			
		}
		driver.quit();
		
	}

}
