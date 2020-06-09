package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	
	
  @Test
  public void f() {
	  System.out.println("welcome to jenkins");
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\eclipse-workspace\\chromedriver.exe");

	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.online.citibank.co.in");
	  System.out.println(driver.getTitle());
	  driver.quit();

	  
  }
}
