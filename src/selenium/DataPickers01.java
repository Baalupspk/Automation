package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class DataPickers01 {

	public static void main(String[] args) throws InterruptedException {
		String month="May 2023";
		String day="25";
		System.setProperty("webdriver.edge.drive", "./Drivers\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://phptravels.net/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"checkin\"]")).click();
		Thread.sleep(3000);
		 while(true) {
			 String text=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[8]/div[1]/table/thead/tr[1]/th[2]")).getText();
			 if(text.equals(month)) {
				 break;
				 
			 }else {
				 driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[8]/div[1]/table/thead/tr[1]/th[3]")).click();
			 }
			 
		 }
		 Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[8]/div[1]/table/tbody/tr/td[contains(text(),"+day+")]")).click();
		
	}

}
