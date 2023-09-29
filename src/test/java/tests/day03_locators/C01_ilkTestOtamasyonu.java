package tests.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_ilkTestOtamasyonu {

    public static void main(String[] args) throws InterruptedException {

        // amazon anasayfaya gidin
        // arama kutusuna "Nutella" yazdirip aratin
        // arama sonuclarinin "Nutella" icerdegini test edin.

        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        WebElement aramaKutusu =driver.findElement(By.id("twotabsearchtextbox"));

        /*
        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.submit();
        bu islemi 2 satirda yapmak yerine isterseniz asagidaki gibi yapabilirsiniz
         */

        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        //WebElement aramaSonucElementi = driver.findElement(By.className("sg-col-inner"));
        List<WebElement> elementlerListesi=driver.findElements(By.className("sg-col-inner"));
        String actualAramaSonucu = elementlerListesi.get(0).getText();
        String expectedIcerik = "Nutella";

        if (actualAramaSonucu.contains(expectedIcerik)){
            System.out.println("test PASSED");
        }else{
            System.out.println("test FAILED");
        }














        Thread.sleep(5000);

        driver.close();








    }


}
