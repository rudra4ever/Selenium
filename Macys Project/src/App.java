import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {

        // set property for chrome
        System.setProperty("webdriver.chrome.driver",("src/driver/chromedriver"));
        WebDriver driver = new ChromeDriver();
        //To Lauch Chrome Browser
        

        driver.get("https://www.amazon.com/");
        //To Navigate the Browser

        JavascriptExecutor js = (JavascriptExecutor) driver;
        //To Scroll the Page Horizontally and Vertically

        driver.manage().window().maximize();
        //To Maximize the Browser

        WebElement Search_Box = driver.findElement(By.id("twotabsearchtextbox"));
        Search_Box.sendKeys("Iphone11");
        //To Search the Text in Search Box

        Thread.sleep(4000);
        //To Set Interval Timing 

        WebElement Search_Icon = driver.findElement(By.id("nav-search-submit-button"));
        Search_Icon.click();
        //To Clock on Search Button

        WebElement GB = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div[3]/span/div[1]/div/div/div[8]/div[4]"));

        js.executeScript("arguments[0].scrollIntoView(true);", GB);
        //To Scroll Horizontally the Page
        // Thread.sleep(3000);

        
       
        




        
    }
}

    
