package CommonFunctions;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	
	public static WebDriver driver;
	public static Properties prop;
	
public BaseTest(){
		
		try {
			prop = new Properties();
			FileInputStream io = new FileInputStream("Config.properties");
			prop.load(io);
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public static void initialization(){
		String browserName = prop.getProperty("Browser");
		String url=prop.getProperty("URL");
		
		if(browserName.equals("Chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if (browserName.equals("Firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(url);
	
	}
	
	
		
	public static WebDriver getDriver() {
		return driver;
		
	}
	
	
	
	
}