package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P06 {

    public static void main(String[] args) {





 /*
    1. Launch browser
    2. Navigate to url 'http://automationexercise.com'
    3. Verify that home page is visible successfully
    4. Click on 'Signup / Login' button
    5. Verify 'New User Signup!' is visible
    6. Enter name and email address
    7. Click 'Signup' button
    8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
    9. Fill details: Title, Name, Email, Password, Date of birth
    10. Select checkbox 'Sign up for our newsletter!'
    11. Select checkbox 'Receive special offers from our partners!'
    12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    13. Click 'Create Account button'
    14. Verify that 'ACCOUNT CREATED!' is visible
    15. Click 'Continue' button
    16. Verify that 'Logged in as username' is visible
    17. Click 'Delete Account' button
    18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
     */
        System.setProperty("webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://automationexercise.com");
        String expectedTitle="Automation Exercise";
        String actualTitle= driver.getTitle();
        if (expectedTitle.equals(actualTitle)){
            System.out.println("Anasayfa Görüntülendi");
        }else{
            System.out.println("Anasayfaya ulaşılamadı");
        }
        driver.findElement(By.xpath("//a[@href='/login']")).click();
        String expectedMessage="New User Signup!";
        String actualMessage= driver.findElement(By.xpath("//*[text()='New User Signup!']")).getText();
        if (expectedMessage.equals(actualMessage)){
            System.out.println("Yeni Kayıt Bölümü Görüntülendi");
        }else{
            System.out.println("Yeni Kayıt Bölümüne ulaşılamadı");
        }
        driver.findElement(By.xpath("//*[@data-qa='signup-name']")).sendKeys("Murat");
        driver.findElement(By.xpath("//*[@data-qa='signup-email']")).sendKeys("murat3@murat.com");
        driver.findElement(By.xpath("//*[@data-qa='signup-button']")).click();
        String expectedMessage2="Enter Account Information";
        String actualMessage2=driver.findElement(By.xpath("//*[text()='Enter Account Information']")).getText();
        if (expectedMessage2.equals(actualMessage2)){
            System.out.println("Information Bölümü Görüntülendi");
        }else{
            System.out.println("Information ulaşılamadı");
        }
        driver.findElement(By.xpath("//*[@id='id_gender1']")).click();
        driver.findElement(By.xpath("//input[@data-qa='password']")).sendKeys("M1234b.");
        driver.findElement(By.xpath("//select[@data-qa='days']")).sendKeys("7");
        driver.findElement(By.xpath("//select[@data-qa='months']")).sendKeys("MAY");
        driver.findElement(By.xpath("//select[@data-qa='years']")).sendKeys("1979");
        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.xpath("//*[@id='optin']")).click();
        driver.findElement(By.xpath("//*[@data-qa='first_name']")).sendKeys("Murat");
        driver.findElement(By.xpath("//*[@data-qa='last_name']")).sendKeys("Babayiğit");
        driver.findElement(By.xpath("//*[@data-qa='address']")).sendKeys("Uskudar");
        driver.findElement(By.xpath("//*[@data-qa='country']")).sendKeys("Canada");
        driver.findElement(By.xpath("//*[@data-qa='state']")).sendKeys("Non USA");
        driver.findElement(By.xpath("//*[@data-qa='city']")).sendKeys("Istanbul");
        driver.findElement(By.xpath("//*[@data-qa='zipcode']")).sendKeys("34647");
        driver.findElement(By.xpath("//*[@data-qa='mobile_number']")).sendKeys("903334445566");
        driver.findElement(By.xpath("//*[@data-qa='create-account']")).click();
        String expectedMessage3="Account Created!";
        String actualMessage3=driver.findElement(By.xpath("//*[text()='Account Created!']")).getText();
        if (expectedMessage3.equals(actualMessage3)){
            System.out.println("Hesap başarıyla oluşturuldu");
        }else{
            System.out.println("Hesap oluşturulamadı");
        }
        driver.findElement(By.xpath("//*[@data-qa='continue-button']")).click();
        driver.findElement(By.xpath("//div[@id='dismiss-button']")).click();
    }
}
