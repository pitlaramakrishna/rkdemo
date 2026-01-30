package seleniumproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {
	@Test(priority=0,groups= {"sanity"})
	public void chrome()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println("Title: "+ driver.getTitle());
		driver.close();
		
	}
	@Test(priority=2, groups= {"sanity"})
	public void firefox() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		System.out.println("Title: " + driver.getTitle());
		driver.close();
		
	}
	@Test(priority=1)
	public void edge() throws InterruptedException, IOException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		Thread.sleep(10000);
	    TakesScreenshot ts= (TakesScreenshot)driver;
	    File srcFile=ts.getScreenshotAs(OutputType.FILE);
	    File targetFile=new File(System.getProperty("user.dir")
	            + "//seleniumproject//ScreenShot//screenshot.png");
	    FileUtils.copyFile(srcFile, targetFile);
	    
		System.out.println("Title: " + driver.getTitle());
		
		driver.close();
		
		
	}
}
