package d14_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.Random;

public class BootstrapTableTests {

    private WebDriver driver;
    private String baseUrl = "https://s.bootsnipp.com";

   private String firstName;
   private String lastName;
   private String middleName;



    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get(baseUrl);
    }


    @Test (priority = 10)
    public void editRow() {
        driver.get(baseUrl + "/iframe/K5yrx");
        Assert.assertTrue(driver.getTitle().equals("Table with Edit and Update Data - Bootsnipp.com"),
                "[ERROR] Page title does match'");

        driver.findElement(By.className("update btn btn-warning btn-sm")).click();




//        Assert.assertEquals(
//                driver.getTitle(),
//                "Google",
//                "[ERROR] Page title is not valid.");
        String actualSearchType = driver.findElement(By.name("q")).getAttribute("type");

        Assert.assertEquals(
                actualSearchType,
                "text",
                "[ERROR] Input search is not type text.");

    }
    @Test(priority = 20)
    public void googleUrlTest() {

        if (driver.getCurrentUrl().contains("google.com")) {
            System.out.println("OK");
        } else {
            System.out.println("Nije ok.");
        }


    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AFTER METHOD");
    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}