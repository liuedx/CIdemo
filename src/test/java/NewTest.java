package test.java;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	WebDriver driver = null;
	
	
  @Test
  public void f() {
	  
	  driver.get("http://www.rcanalytics.com");
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
      driver = new FirefoxDriver();
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
	  driver.quit();
  }

}
