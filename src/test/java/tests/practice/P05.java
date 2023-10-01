package tests.practice;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P05 {

    /*
1-Driver oluşturalim
2-Java class'imiza chnomedriver. exetyi tanitalim
3-Driver'in tum ekranı kaplamasini sagu ayalim
4-Driverla sayfanın yuklenmesini 10.809 milisaniye (10 saniye) boyunca beklesini söyleyelim.
 Eger oncesinde sqyfa Yüklenirse, beklemeyi bıraksın.
5-Navigate to http://www.babayigit.net/murat/testpage.html

7-Submit tuşuna bassın.



11- Sayfayı kapatsın
10-8. maddededeki Test sonucunu yazdırsın
 */

    public static void main(String[] args) throws InterruptedException {

         /*
    1-Driver oluşturalim
    2-Java class'imiza chnomedriver. exetyi tanitalim
    3-Driver'in tum ekranı kaplamasini saglayalim
    4-Driverla sayfanın yuklenmesini 10.809 milisaniye (10 saniye) boyunca beklesini söyleyelim.
     Eger oncesinde sqyfa Yüklenirse, beklemeyi bıraksın.
    5-Navigate to http://www.babayigit.net/murat/testpage.html
    6-first name, surname, age, Your Job, Birth Palace, Last graduated school, Number of Children
        alanlarına gerekli bilgileri yazsın
    7-Submit tuşuna bassın.
    8- All information was entered correctly.. yazısının göründüğünü test etsin ve yazan yazıyı yazdırsın
    9- Clear butonu ile tüm alanları temizlesin
    10- Manuel olarak temizlendiğini görecek kadar beklesin
    11- Sayfayı kapatsın

     */


            System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10809));


            driver.get("http://www.babayigit.net/murat/testpage.html");

            driver.findElement(By.id("ad")).sendKeys("Murat");
            driver.findElement(By.id("soyad")).sendKeys("Babayiğit");
            driver.findElement(By.id("yas")).sendKeys("43");
            driver.findElement(By.id("meslek")).sendKeys("Instructor");
            driver.findElement(By.name("dogum_yeri")).sendKeys("Kırıkkale");
            driver.findElement(By.id("mezun_okul")).sendKeys("Uludag University");
            driver.findElement(By.id("cocuk_sayisi")).sendKeys("2");
            driver.findElement(By.xpath("//input[@value='Submit']")).click();

            String expextedResult="All information was entered correctly..";
            String actualResult=driver.findElement(By.xpath("//p[text()='All information was entered correctly..']")).getText();
            if (expextedResult.equals(actualResult)){
                System.out.println("Test PASSED");
            }else{
                System.out.println("Test FAILED");
            }
            driver.findElement(By.xpath("//input[@value='Clear']")).click();
            Thread.sleep(5000);
            driver.close();



        }

}
