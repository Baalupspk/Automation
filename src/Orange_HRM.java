import java.net.SocketException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Orange_HRM {

	public static void main(String[] args) throws InterruptedException,SocketException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\saarv\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[type='submit']"))
		.click();
		String t=driver.getTitle();
		System.out.println(t);
		Thread.sleep(4000);
		
		driver.close();
	
	}

}
