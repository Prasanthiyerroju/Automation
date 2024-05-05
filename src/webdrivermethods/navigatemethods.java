package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class navigatemethods {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new EdgeDriver();
	driver.navigate().to("https://www.google.com");//app1
	Thread.sleep(5000);
	
	driver.navigate().to("https://www.facebook.com");//app2
	Thread.sleep(5000);
	//go back
	
	driver.navigate().back();//google
	Thread.sleep(5000);
	//go forward
	driver.navigate().forward();//facebook
	//refresh the page
	driver.navigate().refresh();
}
}
