import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BmiCalculatorTest {
    @Test
    public void Underweight() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://healthunify.com/bmicalculator/");
        browser.findElement(By.name("wg")).sendKeys("50");
        browser.findElement(By.name("ht")).sendKeys("175");
        browser.findElement(By.name("cc")).click();
        String categoty = browser.findElement(By.name("desc")).getAttribute("value");
        assertEquals(categoty, "Your category is Underweight", "Категория неверная!!!");
        browser.quit();
    }

    @Test
    public void Normal() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.get("https://healthunify.com/bmicalculator/");
        browser.findElement(By.name("wg")).sendKeys("60");
        browser.findElement(By.name("ht")).sendKeys("175");
        browser.findElement(By.name("cc")).click();
        String categoty = browser.findElement(By.name("desc")).getAttribute("value");
        assertEquals(categoty, "Your category is Normal", "Категория неверная!!!");
        browser.quit();
    }
}
