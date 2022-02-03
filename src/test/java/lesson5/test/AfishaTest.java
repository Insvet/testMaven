package lesson5.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AfishaTest {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;
    private final static String AFISHA_URL = "https://afisha.ru";

    @BeforeAll
    static void registerDriver(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeEach
    void initDriver(){
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get(AFISHA_URL);
    }
    @Test
    void hoverMenuTest(){
        actions.moveToElement(driver.findElement(By.xpath("//div[@DATA-TEST='PAGE-SECTION-HEADER']//h2[.='Сегодня в кино']"))).click()
        .build()
        .perform();
//        driver.findElement(By.xpath("//div[@DATA-TEST='SUGGEST']//a[.='Афиша концертов']")).click();
//        Assertions.assertTrue(driver.getCurrentUrl().contains("schedule_concert"));

    }
//    @AfterEach
//    void tearDown(){
//        driver.quit();
//    }
}
