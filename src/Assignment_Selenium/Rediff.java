package Assignment_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {
	public static void main(String[] args) throws InterruptedException{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\saarv\\Downloads\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//u[normalize-space()='Create a new account']")).click();
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("Koteshwara rao kondari");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("krk.naidu14");
		//driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"newpasswd\"]")).sendKeys("Janasena@1");
		driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]")).sendKeys("Janasena@1");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[2]/td[3]/select")).sendKeys("What is your favourite food?");
		driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[4]/td[3]/input")).sendKeys("biriyani");
		driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[6]/td[3]/input")).sendKeys("laksmi");
		driver.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys("8297821665");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]")).sendKeys("14");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]")).sendKeys("March");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]")).sendKeys("1999");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys("India");
		driver.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select")).sendKeys("Hyderabad");
		Thread.sleep(10000);	
		driver.findElement(By.xpath("//*[@id=\"Register\"]")).click();
	}



}
