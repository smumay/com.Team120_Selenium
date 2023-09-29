package tests.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P03 {

    public static void main(String[] args) {

        //1) Browser açın
        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));

        //2) “http://practice.automationtesting.in/” adresine gidin
        driver.get("http://practice.automationtesting.in/");
        //3) Sİtenin başlığını alıp yazdırın
        System.out.println(driver.getTitle());
        //4) Sitenin url adresini alıp yazdırın
        System.out.println(driver.getCurrentUrl());
        //5) Başlığın Practice ve Url'in  ise practice içerip içermediğini test edin
        if (driver.getTitle().contains("Practice")){
            System.out.println("Baslik icerisinde Practice kelimesi vardir. Test PASSED");
        }else {
            System.out.println("Baslik icerisinde Practice kelimesi yoktur. Test FAILED");
        }

        if (driver.getCurrentUrl().contains("practice")){
            System.out.println("URL Test PASSED");
        }else{
            System.out.println("URL Test FAILED");
        }


        //6) Pencereyi kapatın

        driver.close();


    }
}
