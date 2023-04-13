package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.drive", "./Drivers\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://demoqa.com/date-picker");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"dateAndTimePickerInput\"]")).clear();
		WebElement month=driver.findElement(By.xpath("//*[@id=\"dateAndTimePicker\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div"));
		System.out.println(month.getSize());
		Select a=new Select(month);
		a.selectByVisibleText("April");
	}

}
