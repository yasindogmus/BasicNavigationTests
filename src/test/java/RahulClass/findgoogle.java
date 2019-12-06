package RahulClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findgoogle {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
     //   driver.findElement(By.xpath("////*[@id=\"tsf\']/div[2]/div[1]/div[1]/div/div[2]/input')).sendKeys("hello google naber naptin");

driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("youtube"+ Keys.ENTER);







    }




}
