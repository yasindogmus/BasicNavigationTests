package RahulClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class DropDown2 {



    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get(("http://spicejet.com"));
      driver.findElement(By.xpath("//*[@id=\"divpaxinfo\"]")).click();

      driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Adult\"]")).click();
      driver.findElement(By.xpath("//*[@id=\"divpaxinfo\"]")).getText();

        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());


        //*[@id="divpaxinfo"]
        //*[@id="ctl00_mainContent_ddl_Adult"]
    }
}
