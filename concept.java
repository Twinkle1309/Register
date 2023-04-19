package Learning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class concept extends Connect{
    public static void main(String[] args) {
       WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://demo.nopcommerce.com/");
//Register functionality

        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("gender-female")).click();
driver.findElement(By.id("FirstName")).sendKeys("Twinkle");
driver.findElement(By.id("LastName")).sendKeys("Patel");
//driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")).sendKeys("13");
//driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]")).sendKeys("september");
//driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]")).sendKeys("1996");

        WebElement Day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement Month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement Year = driver.findElement(By.name("DateOfBirthYear"));

        selectValueFromDropDown(Day,"25");
        selectValueFromDropDown(Month,"March");
        selectValueFromDropDown(Year,"1987");





driver.findElement(By.id("Email")).sendKeys("twinklepatel491@gmail.com");
driver.findElement(By.id("Company")).sendKeys("Appmixo");
driver.findElement(By.id("Password")).sendKeys("Twinkle123@");
driver.findElement(By.id("ConfirmPassword")).sendKeys("Twinkle123@");
driver.findElement(By.id("register-button")).click();
//driver.close();

//Login functionality
 driver.findElement(By.linkText("Log in")).click();
 driver.findElement(By.id("Email")).sendKeys("twinklepatel491@gmail.com");
 driver.findElement(By.id("Password")).sendKeys("Twinkle123@");
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
driver.findElement(By.linkText("Log out")).click();
driver.close();

    }



}
