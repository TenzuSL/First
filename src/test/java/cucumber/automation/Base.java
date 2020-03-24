package cucumber.automation;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Base {
	public static WebDriver driver;
	public static Properties prop;
	public static WebDriver intitatedriver() throws IOException
	{
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Hi\\eclipse-workspace\\automation\\src\\test\\java\\cucumber\\automation\\Global.properties");
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Hi\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

}
