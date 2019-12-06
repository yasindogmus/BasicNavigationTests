package RahulClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class DropDown {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get(("http://spicejet.com"));

       //a[@value='BLR']

      driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

      driver.findElement(By.xpath("//a[@value='BLR']")).click();
      Thread.sleep(2000);


     // driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

      driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();

     // driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();

        System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());

      driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
      //    ctl00_mainContent_chk_friendsandfamily
        System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        Thread.sleep(4000);
        driver.quit();


    }

}
