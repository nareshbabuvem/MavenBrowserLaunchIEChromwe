package naresh.first.framework.FirstMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
 
  
  
  private WebDriver driver;
  
 
@BeforeClass
  public void beforeClass() {

	  
	 // System.setProperty("webdriver.ie.driver", "C:\\Users\\NareshBabu\\Desktop\\IEDriverServer.exe");
	// driver=new InternetExplorerDriver();
	
	
	  System.setProperty("webdriver.chrome.driver", "C:\\Naresh\\WebDriverSeleniumFramework\\WebDriverSelenium\\Drivers\\dd\\13042020\\chromedriver.exe");	
	  driver=new ChromeDriver();
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
	  
  }

  @Test
  public void GoogleExample() {
	  
		
			driver.get("https://www.google.ie/"); 
			
			driver.findElement(By.name("q")).sendKeys("naresh babu vemulapalli");
  }
  
}
