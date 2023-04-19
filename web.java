package Learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class web {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\software\\Driver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
        driver.manage().window().maximize();
        driver.close();
    }
}
