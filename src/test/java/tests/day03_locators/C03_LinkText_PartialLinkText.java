package tests.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_LinkText_PartialLinkText {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        // Gift Cards linkine tiklayin

        //driver.findElement(By.linkText("Geschenkkarten ")).click();

        // linkin bizi Gift Cards sayfasina yonlendirdigini test edin



        Thread.sleep(5000);
        driver.close();
    }
}
