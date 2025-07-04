package geethanjali.testcomponents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import geethanjali.testcomponents.;
//import org.example.BaseTest;
//import java.util.List;
//import org.testng.annotations.Test;

public class FlipkartDropdown{
    public WebDriver driver;

    public void dropDown() {
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        WebElement mobiledp = driver.findElement(By.xpath("//img[@alt='Fashion']/ancestor::div[@class='YBLJE4']"));
        Select select = new Select(mobiledp);
        select.selectByVisibleText("Women Ethnic");
//        List<WebElement> list = select.getOptions();
//        for (WebElement s : list) {
//            select.deselectByValue(String.valueOf(s));
//            System.out.println(s);
//        }
    }

    public static void main(String[] args) {
        FlipkartDropdown fp=new FlipkartDropdown();
        fp.dropDown();
    }
}