import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.paulhammant.ngwebdriver.NgWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginTest {
	
	public static void main(String[] args) {
	    
		WebDriver driver1 = null;
		NgWebDriver ngWebDriver;
		JavascriptExecutor jsDriver;
		
		//getting googleChrome driver
		WebDriverManager.firefoxdriver().setup();
	    driver1 = new FirefoxDriver();
	    jsDriver = (JavascriptExecutor)driver1;
		ngWebDriver = new NgWebDriver(jsDriver);
		
		//Opening studentPortal
		driver1.get("https://my.intellimali.co.za/login");
		
		//Opening Account login
		driver1.findElement(By.xpath("//a[contains(text(),'Account Log In')]")).click();
		
		//enter ID number
		WebElement id_no = driver1.findElement(By.xpath("//div[@class='form-group']//input[@type='text']"));
		id_no.sendKeys("0715720105");
		
		
		//clicking next
		//////WebElement click_Next = driver1.findElement(By.xpath("//button[@class='Button-alt2']"));
		///click_Next.click();
		
		//WebElement enter_Pin = driver1.findElement(By.name("password"));
		//////enter_Pin.click();
		/////enter_Pin.sendKeys("95526");
		//ngWebDriver.waitForAngularRequestsToFinish();
		
		
		
		//driver.close();
		//driver.quit();
		
		
	}

}
