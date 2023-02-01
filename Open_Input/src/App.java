import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver");

        // Read input file containing email and password
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("src/input.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.exit(0);
        }

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] credentials = line.split(",");
            String email = credentials[0];
            String password = credentials[1];

            // Load the websi
            driver.get("http://demo.t3-framework.org/joomla30/index.php/en/joomla-pages/sample-page-2/login-page");
            Thread.sleep(500);
            // Enter email and password
            driver.findElement(By.id("username")).sendKeys(email);
            driver.findElement(By.id("password")).sendKeys(password);

            // Submit the form
            driver.findElement(
                    By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/div[1]/form/fieldset/div[4]/div/button")).click();
            Thread.sleep(500);

            driver.findElement(By.id("username")).clear();
            driver.findElement(By.id("password")).clear();

        }
        driver.quit();
        scanner.close();
    }
}