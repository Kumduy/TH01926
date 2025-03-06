//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//public class gitHubTest {
//    WebDriver chromeDriver;
//
//    @BeforeEach
//    public void setUp() {
//        WebDriverManager.chromedriver().setup();
//
//        ChromeOptions options = new ChromeOptions();
//
//
//        chromeDriver = new ChromeDriver(options);
//    }
//
////    @AfterEach
////    public void tearDown() {
////        if (chromeDriver != null) {
////            chromeDriver.quit();
////        }
////    }
//
//    @Test
//    public void dangky() throws InterruptedException {
//        chromeDriver.get("https://github.com/signup?source=login");
//        chromeDriver.findElement(By.xpath("//input[@id='email']")).sendKeys("TH01926@gmail.com");
//        chromeDriver.findElement(By.xpath("//input[@id='password']")).sendKeys("TH01926duy");
//        chromeDriver.findElement(By.xpath("//input[@id='login']")).sendKeys("TH01926duy");
//        chromeDriver.findElement(By.xpath("//button[@class='js-octocaptcha-load-captcha signup-form-fields__button Button--primary Button--medium Button Button--fullWidth']")).click();
//        Thread.sleep(3000);
//
//    }
//
//    @Test
//    public void dangNhap() throws InterruptedException {
//        chromeDriver.get("https://github.com/login");
//        chromeDriver.findElement(By.xpath("//input[@id='login_field']")).sendKeys("anhduy.tran160106@gmail.com");
//        chromeDriver.findElement(By.xpath("//input[@id='password']")).sendKeys("Kum16012006");
//        chromeDriver.findElement(By.xpath("//input[@name='commit']")).click();
//        Thread.sleep(3000);
//        Assertions.assertTrue(chromeDriver.getCurrentUrl().contains("https://github.com/"));
//    }
//}
