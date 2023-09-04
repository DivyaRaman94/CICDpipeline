package sample.demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test {
	
	public static WebDriver driver;
	@BeforeMethod
	public void launchdriver()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sakth\\OneDrive\\Documents\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	@Test
	public void test1()
	{
		driver.get("https://www.udemy.com/");
		System.out.println("test1 title:"+driver.getTitle());
	}
	
	@Test
	public void test2()
	{
		
		driver.get("https://www.udemy.com/");
		System.out.println("test2 title:"+driver.getTitle());
	}
	@Test
	public void test3()
	{
		driver.get("https://www.udemy.com");
		System.out.println("test3 title:"+driver.getTitle());
	}
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}

}
