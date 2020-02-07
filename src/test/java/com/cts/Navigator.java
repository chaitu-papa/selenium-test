package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class Navigator {
	static WebDriver driver;
	static Select select=null;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//driver//chromedriver.exe");
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--start-maximized");
		//capabilities.setCapability(ChromeOptions.CAPABILITY, options);	
		driver = new ChromeDriver(capabilities);
		driver.get("http://sampleapp.tricentis.com/101/app.php");	
		System.out.println("Opened the page --> http://sampleapp.tricentis.com/101/app.php");
		Thread.sleep(2000);
		Executor.enterValues();		
		driver.quit();		
		System.out.println("Closing Browser");		
		System.out.println("End of Test");
	}
	
	
	
	

}
