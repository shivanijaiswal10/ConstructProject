package generics;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
//	This is my parent class
	protected WebDriver driver;
	protected String srh;
	
	@BeforeClass
	public void setup() throws IOException {
		driver = new ChromeDriver();
		Properties pr = new Properties();
		FileInputStream  fis = new FileInputStream("C:\\Users\\shiva\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\POM\\src\\test\\java\\config.Properties");
		
		pr.load(fis);
		
		String url = pr.getProperty("url");
		srh = pr.getProperty("search");
		
		driver.get(url);
		driver.manage().window().maximize();
		
		
		
		
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
	
	

}
