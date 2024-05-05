package webdrivermethods;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class minimize {
public static void main(String[] args)throws Throwable {
	WebDriver driver=new EdgeDriver();
    driver.get("https://www.amazon.com");
    driver.manage().window().minimize();
    Thread.sleep(5000);
    
}
}

