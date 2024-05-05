package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Maximize {
	public static void main(String[] args)throws Throwable {
 System.setProperty("webdriver,chrome.driver", "C:\\Users\\prashanthi\\eclipse-workspace\\Saibaba\\chrome\\chromedriver.exe");


 WebDriver driver=new EdgeDriver();
	driver.get("https://www.amazon.com");
	//maximize the browser
	driver.manage().window().maximize();
}
}
