package selenium;

import java.net.SocketException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws SocketException, InterruptedException{
		System.setProperty("webdriver.edge.driver","C:\\Users\\saarv\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement srcElm=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement trgElm=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		//act.dragAndDrop(srcElm, trgElm).build().perform();
		act.clickAndHold(srcElm).moveToElement(trgElm).release().build().perform();
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
