import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class App {
    public static void main(String[] args) throws Exception {

        // set property for chrome
        System.setProperty("webdriver.chrome.driver",("/Users/rudrasharma/Desktop/Selenium Code/1st_Project/src/driver/chromedriver"));
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.kohls.com/");
        

        
    }
}

    
