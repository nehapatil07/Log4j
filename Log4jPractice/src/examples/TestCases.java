package examples;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCases {
	static Logger logs=Logger.getLogger(TestCases.class);
  @Test
  public void login() {
	  System.setProperty("webdriver.driver.chrome","chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("file:///D:/Offline%20Website/Offline%20Website/index.html");
	  logs.info("Webpage is opened...!");
	  driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	  logs.info("user id entered..!");
	  
  }
}
