package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P04 {

    public static void main(String[] args) {

             /* ...Exercise3...
Navigate to  https://testpages.herokuapp.com/styled/index.html
Click on  Calculater under Micro Apps
Type any number in the first input
Type any number in the second input
Click on Calculate
Get the result
Print the result
  */

        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));

        //Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        //Click on  Calculater under Micro Apps
        driver.findElement(By.id("calculatetest")).click();

        //Type any number in the first input
        driver.findElement(By.id("number1")).sendKeys("15");  // By.id de ""  tirnaklar icindeki aliniyor..
        driver.findElement(By.id("number2")).sendKeys("35");
        driver.findElement(By.id("calculate")).click();
        System.out.println("15+35   "   +driver.findElement(By.id("answer")).getText());
        //Type any number in the second input
        //Click on Calculate
        //Get the result
        //Print the result

        driver.close();
    }
}
