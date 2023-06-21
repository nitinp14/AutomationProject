package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization {
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		driver.findElement(By.id("logoutLink")).click();
		
		
		driver.quit();
	}
}
