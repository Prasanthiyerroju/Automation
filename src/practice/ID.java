package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ID {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.facebook.com");
	//use ID locator
	
	driver.findElement(By.id("email")).sendKeys("apc@akd");
	driver.findElement(By.id("pass")).sendKeys("lfldlij");
	system.out.println("code changed by manager");
}
}
