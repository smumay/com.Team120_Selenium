package tests.day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_ByClassNameLocator {

    public static void main(String[] args) {

        //1- Bir test class’i olusturun ilgili ayarlari yapin


        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //2- https://www.automationexercise.com/ adresine gidin

        driver.get("https://www.automationexercise.com/");

        //3- Category bolumundeki elementleri locate edin

        List<WebElement> categoryList = driver.findElements(By.className("panel-title"));

        //4- Category bolumunde 3 element oldugunu test edin

        int expectedCategorySayisi = 3;
        int actualCategorySayisi = categoryList.size();
        if (actualCategorySayisi== expectedCategorySayisi){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED");
        }

        //5- Category isimlerini yazdirin

        for (WebElement each:categoryList
             ) {
            System.out.println(each.getText());
        }

        //6- Sayfayi kapatin


        driver.close();







    }
}
