package d13_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        File image = new File("src/main/java/d13_06/back_uros_jovanovic.jpg");


        String url = "https://boomf.com/apps/proxy/boomf-bomb/i-bloody-love-you";
        driver.navigate().to(url);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//img[@alt='image 1']")).click();
        driver.findElement(By.xpath("//img[@alt='+ Add photo']")).click();
        driver.findElement(By.id("imageUpload")).sendKeys(image.getAbsolutePath());


        wait.until(ExpectedConditions
                .numberOfElementsToBe(By.xpath("//*[@class='sc-ftvSup kAzmBp']/div/div/img"),1));

        driver.findElement(By.xpath("//*[@class='sc-ftvSup kAzmBp']/div/div/img")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("sc-iXxrte")));
        driver.findElement(By.xpath("//button[text()='Use One Side Only']")).click();


        driver.findElement(By.xpath("//img[@alt='image 2']")).click();
        driver.findElement(By.xpath("//img[@alt='+ Add photo']")).click();



        driver.findElement(By.xpath("//*[@class='sc-ftvSup kAzmBp']/div/div/img")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("sc-iXxrte")));
        driver.findElement(By.xpath("//button[text()='Use One Side Only']")).click();

        driver.findElement(By.xpath("//img[@alt='image 3']")).click();
        driver.findElement(By.xpath("//img[@alt='+ Add photo']")).click();


        driver.findElement(By.xpath("//*[@class='sc-ftvSup kAzmBp']/div/div/img")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("sc-iXxrte")));
        driver.findElement(By.xpath("//button[text()='Use One Side Only']")).click();

        driver.findElement(By.xpath("//img[@alt='image 4']")).click();
        driver.findElement(By.xpath("//img[@alt='+ Add photo']")).click();


        driver.findElement(By.xpath("//*[@class='sc-ftvSup kAzmBp']/div/div/img")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("sc-iXxrte")));
        driver.findElement(By.xpath("//button[text()='Use One Side Only']")).click();

        driver.findElement(By.name("3")).click();
        driver.findElement(By.xpath("//*[text()='Add to cart ']")).click();

        WebElement error = driver.findElement(By.xpath("//*[@action='error']"));
        if (elementExist(driver, By.xpath("//*[@action='error']"))){
            System.out.println("Error: " + error.getAttribute("innerText"));
        } else {
            System.out.println("Nema greske");

        }
                driver.quit();
    }
    public static boolean elementExist (WebDriver driver, By by){
        boolean elementExist = true;
        try {
            driver.findElement(by);
        }catch (Exception e){
            elementExist = false;
        }
        return elementExist;
    }
}
