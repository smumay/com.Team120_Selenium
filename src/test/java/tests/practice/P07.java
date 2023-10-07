package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P07 {

    public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    ////1. http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");
    ////2. Signin buttonuna tiklayin
        driver.findElement(By.xpath("//button[@id='signin_button']")).click();

    ////3. Login alanine  “username” yazdirin
            WebElement usernameElement = driver.findElement(By.xpath("//input[@id='user_login']"));
            usernameElement.sendKeys("username");

    ////4. Password alanina “password” yazdirin
        WebElement passwordElement = driver.findElement(By.xpath("//input[@id='user_password']"));
        passwordElement.sendKeys("password");
    ////5. Sign in buttonuna tiklayin
        WebElement signIn = driver.findElement(By.xpath("//input[@name='submit']"));
        signIn.click();

    ////6. Back tusu ile sayfaya donun
        driver.navigate().back();


    ////7. Online Banking menusunden Pay Bills sayfasina gidin
            WebElement onlineBankingElement = driver.findElement(By.xpath("//li[@id='onlineBankingMenu']"));
            onlineBankingElement.click();
            WebElement payBillsElement = driver.findElement(By.xpath("//span[@id='pay_bills_link']"));
            payBillsElement.click();

    ////8. amount kismina yatirmak istediginiz herhangi bir miktari yazi
            WebElement amountElement = driver.findElement(By.xpath("//input[@id='sp_amount']"));
            amountElement.sendKeys("200");

    ////9. tarih kismina “2020-09-10” yazdirin
        WebElement tarihElementi = driver.findElement(By.xpath("//input[@id='sp_date']"));
        tarihElementi.sendKeys("2020-09-10");


    ////10. Pay buttonuna tiklayin
                driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();

    ////11. “The payment was successfully submitted.” mesajinin ciktigini test edin
        String expectedYazi = "The payment was successfully submitted.";
        String actualYazi = driver.findElement(By.xpath("//*[text()='The payment was successfully submitted.']")).getText();

        if (actualYazi.equals(expectedYazi)){
            System.out.println("test PASSED");
        }else {
            System.out.println("test FAILED");
        }

        driver.quit();




}
}