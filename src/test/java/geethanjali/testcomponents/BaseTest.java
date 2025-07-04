package geethanjali.testcomponents;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.safari.SafariDriver;

public class BaseTest extends FlipkartDropdown {
    public WebDriver driver;
    public WebDriver initializeBrowser(String browserName){
        if(browserName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
        } else if (browserName.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
        } else if (browserName.equalsIgnoreCase("safari")) {
            WebDriverManager.safaridriver().setup();
        } else{
            System.out.println(browserName+ " :No Such Browser");
        }
        return driver;
    }

    public WebDriver tearDown(WebDriver driver){
        if(driver!=null){
            driver.quit();
        }
        return driver;
    }
    
    public void loginTest() {
    	driver.get("https://www.redbus.com/");
    	WebElement mainLogin=driver.findElement(By.id("signin-block"));
    	mainLogin.click();
    	WebElement login=driver.findElement(By.xpath("//input[@data-cy='userName']"));
    	login.clear();
   // 	login.sendKeys(null)
//    	JavascriptExecutor js = (JavascriptExecutor) driver;
//    	WebElement signupbox=driver.findElement(By.id("signInLink"));
//  	js.executeScript(windows.movetoElement(signupbox).click());
//    	
//    	WebElement sign=driver.findElement(By.xpath("//div[@class='nsm7Bb-HzV7m-LgbsSe-bN97Pc-sM5MNb ']"));
//    	sign.click();
//    	
//    	List<String> wind=(List<String>) driver.getWindowHandles(); 
//    	String org="Sign in - Google accounts";
//    	for(String s:wind) {
//    		driver.switchTo().window(s);
//    		String title=driver.getTitle();
//    		
//    		if(title.equals(org)) {
//    			driver.findElement(By.xpath(s));
//    		}
//    	}
//    	
    }

    public static void main(String[] args) {
        BaseTest bt=new BaseTest();
        bt.initializeBrowser("chrome");
    }
}

