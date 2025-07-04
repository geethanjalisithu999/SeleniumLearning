package geethanjali.testcomponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Amazon{
	 public WebDriver driver;
	 	@Test(alwaysRun=false)
	    public void dropDown() throws InterruptedException {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.amazon.in/");
	        WebElement dp=driver.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]"));
	        dp.click();
	        Thread.sleep(2000);
	        Select select=new Select(dp);
	        Thread.sleep(2000);
	        select.selectByVisibleText("Baby");
	        Thread.sleep(2000);
	        List<WebElement> options=select.getOptions();
	        System.out.println(options);
	        WebElement search=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
	        search.sendKeys("Polo tshirt");
	        Thread.sleep(2000);
	        WebElement sicon=driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
	        sicon.click();
	        List<WebElement> tshirt=driver.findElements(By.xpath("//span [contains(text(), 'U.S. POLO ASSN.')]"));
	        int count=tshirt.size();
	        System.out.println(count);
	        for(WebElement e:tshirt) {
	        	System.out.println(e.getText());
	        }
	        driver.quit();  	        
}
	 	@Test
	 	public void totalSearch() throws InterruptedException {
	 		 driver = new ChromeDriver();
		     driver.manage().window().maximize();
		     driver.get("https://www.amazon.in/");
		     WebElement search=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		        search.sendKeys("Polo tshirt");
		        Thread.sleep(2000);
		        WebElement sicon=driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]"));
		        sicon.click();
		        List<WebElement> tshirt=driver.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base']"));
		        int count=tshirt.size();
		        System.out.println(count);
		        for(WebElement e:tshirt) {
		        	System.out.println(e.getText());
		        }
		        driver.quit();  	        
	}
		     
	 	}


