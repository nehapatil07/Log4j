package jbkExample;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogDemo {
public static void main(String[] args) {
	Logger logs=Logger.getLogger(LogDemo.class);
	PropertyConfigurator.configure("log4j.properties");
	WebDriver driver=new ChromeDriver();
	logs.info("chrome opened");
	
	driver.manage().window().maximize();
	logs.info("browser maximised");
	driver.get("file:///D:/Offline%20Website/Offline%20Website/index.html");
	logs.info("App Launched");
	
	driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
	
	logs.info("login successful...!");
	String s=driver.getTitle();
	System.out.println("your page title is>> "+s);
}
}
