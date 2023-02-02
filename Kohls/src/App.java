import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindAll.FindByBuilder;

import net.bytebuddy.asm.Advice.Return;
import net.bytebuddy.build.Plugin.Engine.Dispatcher.Materializable.ForRetainedElement;
import net.bytebuddy.dynamic.TypeResolutionStrategy.Active;


public class App {
    private static final String Webdriver = null;

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        // set property for chrome
        System.setProperty("webdriver.chrome.driver",("/Users/rudrasharma/Desktop/Selenium Code/Kohls"));

        WebDriver driver = new WebDriver();


        // driver.get("https://www.nike.com");

        // WebElement search_button= driver.findElement(By.name("search")); 
        // search_button.sendKeys("Long Sleeves");0
        // search_button.sendKeys(Keys.RETURN);
        // search_button.sendKeys(Keys.RETURN);

        // driver.get("https://accounts.google.com/");
        // driver.findElement(By.name("identifier")).sendKeys("rudra4ever@gmail.com");
        // driver.findElements(By.xpath("//span[normalize-space()='Next']")).get(0).click();


        // driver.findElement(By.id("identifier")).sendKeys("rudra4ever@gmail.com");
        // driver.get("https://amazon.com/");
        // WebElement Search = driver.findElement(By.id("twotabsearchtextbox"));
        // Search.sendKeys("Krishna Poster");
        // WebElement search_button = driver.findElement(By.id("nav-search-submit-button"));
        // search_button.click();
        // WebElement Drop_Down = driver.findElement(By.xpath("/html/body/div[1]/div[2]/span/div/h1/div/div[2]/div/div/form/span/span/span/span/span[2]"));
        // Drop_Down.click();
        // WebElement Price_low = driver.findElement(By.id("s-result-sort-select_1"));
        // Price_low.click();
        

        driver.get("https://www.kohls.com");
        //To Navigate the Brower

        Thread.sleep(4000, 0);
        //Brower Timing set

        WebElement Login = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[3]/div/div[1]/div/div[2]/ul"));
        Login.click();
        //Clicking on the Login Button

        WebElement Sign_In = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[3]/div/div[1]/div/div[2]/ul/li/div/div[1]/a/div"));
        Sign_In.click();
        //To Sign in 

        WebElement User_Name = driver.findElement(By.name("loginEmail"));
        User_Name.sendKeys("rudra4ever@gmail.com");
        Thread.sleep(2000);
        // To input Username
        
        WebElement Password = driver.findElement(By.name("loginPassword"));
        Password.sendKeys("Chitwan@1");
        Thread.sleep(2000);
        //To Input Password

        WebElement Save_Password = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div/form[1]/div/div[1]/div/div[8]/label"));
        Save_Password.click();









        
        WebElement Login_Button = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div/form[1]/div/div[1]/div/input[4]"));
        Login_Button.click();
        
        //To Click Log In Button
        






        // // // Thread.sleep(4000);
        // WebElement Search_Box = driver.findElement(By.name("Search"));
        // Search_Box.sendKeys("Addidas Clerances");


        // driver.manage().window().maximize();
        // WebElement Close_Btn = driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
        // Close_Btn.click();

        // WebElement Search_Button = driver.findElement(By.name("q"));
        // Search_Button.sendKeys("Iphone");
        // Search_Button.sendKeys(Keys.RETURN);
        // WebElement Check_Box = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[7]/div[2]/div/div/div/label/div[1]"));
        // Check_Box.click();
    






        




        






        
       














        
        




        // // Thread.sleep(4000);
        // WebElement Search_Text = driver.findElement(By.name("search_query"));
        // // Thread.sleep(4000);
        // Search_Text.sendKeys("Prasaison Entertainment");
        // // Thread.sleep(4000);
        // WebElement Search_Button = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[3]/div[2]/ytd-searchbox/button/yt-icon"));
        // Search_Button.click();
        // WebElement Link_Text = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-shelf-renderer[1]/div[1]/div[2]/ytd-vertical-list-renderer/div[1]/ytd-video-renderer[1]/div[1]/div/div[1]/div/h3/a/yt-formatted-string"));
        // Link_Text.click();





















        







        
        
        


    

        




        




        


        
















    }
}